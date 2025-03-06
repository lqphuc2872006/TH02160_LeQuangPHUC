package com.example.th02160_LeQuangPhuc.Test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Chiahetcho5Test {
    Chiahetcho5 chiahetcho5 = new Chiahetcho5();
    List<Integer> list = chiahetcho5.Chiahetcho5("");
    @Test
    public void SS(){

        assertTrue( list.contains(1), "Gia tri bien 1!");
    }
    @Test
    public void SS2(){
        assertTrue( list.contains(99), "Gia tri bien 99");
    }
    @Test
    public void SS3(){
        assertFalse( list.contains(5), "bo qua cac so chia het cho 5)");
    }
    @Test
    public void SS4(){

        assertFalse( list.contains(100), "bo qua cac so chia het cho 5");
    }
    @Test
    public void CheckNull(){
        Exception exp = assertThrows(IllegalArgumentException.class, () -> list.contains(""));
        assertEquals("check null",exp.getMessage());
    }


}