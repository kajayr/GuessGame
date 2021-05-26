package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class isStringTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void getMessage() {
        assertEquals("Hello", "Hell", "Test #1 has failed");
    }
}