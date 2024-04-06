package com.projecta.Junit;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SampleTest {


    @BeforeEach
    public void first(){
        System.out.println("BeforeEach");
    }

    @Test
    public void test(){
        System.out.println("Test");
    }
}
