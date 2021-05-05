package com.company;

public class InputMismatch extends Exception{
    @Override
    public String getMessage(){
        return "Your input should be a number";
    }
}
