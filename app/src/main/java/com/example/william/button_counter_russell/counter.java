package com.example.william.button_counter_russell;

/**
 * Created by william on 2/7/17.
 */

public class counter {

    public counter(){

    }

    float total;

    public float add(){
        total++;
        return total;
    }

    public float subtract(){
        total--;
        return total;
    }

    public float clear(){
        total = 0;
        return total;
    }
}