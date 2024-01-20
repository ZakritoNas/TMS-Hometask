package com.example.lesson50;

import com.example.lesson50.service.TextService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TextServiceTest {

    @Test
    public void testCongruence() {
        //Given
        TextService service = new TextService();
        String value1 = "Pencil";
        String value2 = "pen";
        //When
        int result = service.compare(value1, value2);
        //Then
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testNonCongruence() {
        //Given
        TextService service = new TextService();
        String value1 = "Pencil";
        String value2 = "draw";
        //When
        int result = service.compare(value1, value2);
        //Then
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void testRegister() {
        //Given
        TextService service = new TextService();
        String value1 = "Pencil";
        String value2 = "pen";
        //When + Then
        Assertions.assertEquals(0, service.compare(value1.toUpperCase(), value2));
    }

}