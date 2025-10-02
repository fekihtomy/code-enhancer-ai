package com.example.enhancer.persistence;

import com.example.enhancer.utils.EnhancerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalFileStorage {
    private static final Logger logger = LoggerFactory.getLogger(LocalFileStorage.class);
    private static final String PROMPTS_FILE = "prompts.txt";
    private static final String RESPONSES_FILE = "responses.txt";
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public void savePrompt(String prompt) throws EnhancerException {
        saveToFile(PROMPTS_FILE, prompt);
    }

    public void saveResponse(String response) throws EnhancerException {
        saveToFile(RESPONSES_FILE, response);
    }

    private void saveToFile(String filename, String content) throws EnhancerException {
        String timestamp = LocalDateTime.now().format(formatter);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write("----- " + timestamp + " -----\n");
            writer.write(content + "\n\n");
        } catch (IOException e) {
            logger.error("Erreur d'écriture dans le fichier {}: {}", filename, e.getMessage());
            throw new EnhancerException("Erreur d'écriture dans le fichier " + filename, e);
        }
    }
}
