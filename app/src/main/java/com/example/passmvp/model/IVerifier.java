package com.example.passmvp.model;

public interface IVerifier {

    boolean evaluateLength(String password);
    boolean evaluateUpper(String password);

}
