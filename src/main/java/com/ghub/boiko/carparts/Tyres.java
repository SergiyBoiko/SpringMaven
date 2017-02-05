package com.ghub.boiko.carparts;

import org.springframework.beans.factory.annotation.Value;

public class Tyres {

    @Value("${tyresSize}")
    private String size;
    @Value("${tyresName}")
    private String name;

    public Tyres(){}

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tyres{" +
                "size='" + size + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
