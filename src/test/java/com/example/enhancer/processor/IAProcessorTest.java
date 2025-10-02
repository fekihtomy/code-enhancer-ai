package com.example.enhancer.processor;

import com.example.enhancer.utils.EnhancerException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IAProcessorTest {
    @Test
    void improveCode_validPrompt_modifiesCorrectly() throws Exception {
        IAProcessor p = new IAProcessor();
        String prompt = "Hello World!";
        String improved = p.improveCode(prompt);
        assertTrue(improved.contains("Hello Enhanced World"));
    }

    @Test
    void improveCode_nullOrBlank_throwsException() {
        IAProcessor p = new IAProcessor();
        assertThrows(EnhancerException.class, () -> p.improveCode(null));
        assertThrows(EnhancerException.class, () -> p.improveCode("   "));
    }
}
