package com.devops.ott;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MovieControllerTest {

    @Test
    public void testMovieName() {

        String movie = "Bahubali";

        assertEquals("Bahubali", movie);
    }
}
