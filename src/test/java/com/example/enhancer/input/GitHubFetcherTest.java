package com.example.enhancer.input;

import com.example.enhancer.utils.EnhancerException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GitHubFetcherTest {
    @Test
    void fetchCode_validUrl_returnsNonEmpty() throws Exception {
        GitHubFetcher f = new GitHubFetcher();
        String code = f.fetchCode("https://github.com/example/repo");
        assertNotNull(code);
        assertFalse(code.isBlank());
    }

    @Test
    void fetchCode_nullOrBlank_throwsException() {
        GitHubFetcher f = new GitHubFetcher();
        assertThrows(EnhancerException.class, () -> f.fetchCode(null));
        assertThrows(EnhancerException.class, () -> f.fetchCode(""));
        assertThrows(EnhancerException.class, () -> f.fetchCode("   "));
    }
}
