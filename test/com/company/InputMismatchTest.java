package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.DoubleSummaryStatistics;

import static org.junit.jupiter.api.Assertions.*;

class InputMismatchTest {


    @Test
    void getCount() {
        InputMismatch inputMismatch = new InputMismatch();
        assertEquals(0, inputMismatch.getCount(), "The count value should be assigned 0");
    }

}