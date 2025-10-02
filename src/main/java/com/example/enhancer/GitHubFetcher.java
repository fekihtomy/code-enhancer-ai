package com.example.enhancer.input;

import com.example.enhancer.utils.EnhancerException;

public class GitHubFetcher {
    public String fetchCode(String gitHubUrl) throws EnhancerException {
        if (gitHubUrl == null || gitHubUrl.isBlank()) {
            throw new EnhancerException("URL GitHub invalide");
        }
        // Simuler fetch pour test
        return "public class HelloWorld {\n    public static void main(String[] args) {\n        System.out.println(\"Hello World!\");\n    }\n}";
    }
}
