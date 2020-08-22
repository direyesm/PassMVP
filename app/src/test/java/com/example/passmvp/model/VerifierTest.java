package com.example.passmvp.model;

import org.junit.Before;
import org.junit.Test;

import static com.example.passmvp.model.Verifier.MEDIUM;
import static com.example.passmvp.model.Verifier.STRONG;
import static com.example.passmvp.model.Verifier.WEAK;
import static com.google.common.truth.Truth.assertThat;

public class VerifierTest {

    private Verifier verifier;

    @Before
    public void setUp() {
        verifier = new Verifier();
    }

    @Test
    public void verifierWeak() {
        //given
        String password = "pass";


        //when
        int option = verifier.evaluatePass(password);

        //then

        assertThat(option).isEqualTo(WEAK);

    }

    @Test
    public void verifierMedium() {
        //given
        String password = "passaaa";
        //when
        int option = verifier.evaluatePass(password);
        //then
        assertThat(option).isEqualTo(MEDIUM);
    }

    @Test
    public void verifierStrong() {
        //given
        String password = "PassaaaaaaAAa";
        //when
        int option = verifier.evaluatePass(password);
        //then
        assertThat(option).isEqualTo(STRONG);
    }
}
