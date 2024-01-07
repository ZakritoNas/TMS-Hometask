package com.example.lesson50.service;

public class TextService {
    public int compare(String value1, String value2){
        if(value1.toLowerCase().contains(value2.toLowerCase())){
            return value1.toLowerCase().indexOf(value2.toLowerCase());
        }
        return -1;
    }
}
