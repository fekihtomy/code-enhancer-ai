package com.example.enhancer.processor;

import com.example.enhancer.utils.EnhancerException;

public class IAProcessor {
    public String improveCode(String prompt) throws EnhancerException {
        if (prompt == null || prompt.isBlank()) {
            throw new EnhancerException("Prompt vide");
        }
        return prompt.replace("Hello World!", "Hello Enhanced World!");
    }
}
