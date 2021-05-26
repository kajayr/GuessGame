package com.company;

public class InputMismatch extends Exception{
     private int count = 0;
     public InputMismatch(){

     }

    public int getCount() {
        return this.count;
    }

    @Override
    public String getMessage(){
        return "Your input should be a number";
    }

}
