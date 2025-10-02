package com.example.enhancer;

import com.example.enhancer.input.GitHubFetcher;
import com.example.enhancer.output.PackageGenerator;
import com.example.enhancer.persistence.LocalFileStorage;
import com.example.enhancer.processor.IAProcessor;
import com.example.enhancer.utils.EnhancerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnhancerApp {
    private static final Logger logger = LoggerFactory.getLogger(EnhancerApp.class);

    public static void main(String[] args) {
        logger.info("Démarrage de Code Enhancer v1.0.2");

        if (args.length != 1) {
            logger.error("Usage : java -jar code-enhancer-ai.jar <GitHub-URL>");
            System.out.println("Usage : java -jar code-enhancer-ai.jar <GitHub-URL>");
            System.exit(1);
        }

        String gitHubUrl = args[0];
        try {
            GitHubFetcher fetcher = new GitHubFetcher();
            String rawCode = fetcher.fetchCode(gitHubUrl);

            IAProcessor processor = new IAProcessor();
            String prompt = "Améliore ce code Java:\n" + rawCode;
            String improvedCode = processor.improveCode(prompt);

            LocalFileStorage storage = new LocalFileStorage();
            storage.savePrompt(prompt);
            storage.saveResponse(improvedCode);

            PackageGenerator generator = new PackageGenerator();
            generator.generatePackage(improvedCode);

            logger.info("Traitement terminé avec succès. Vérifiez le dossier 'output'.");
            System.out.println("✅ Traitement terminé avec succès. Vérifiez le dossier 'output'.");

        } catch (EnhancerException e) {
            logger.error("Erreur dans le traitement: {}", e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            logger.error("Erreur inattendue : ", e);
            e.printStackTrace();
        }
    }
}
