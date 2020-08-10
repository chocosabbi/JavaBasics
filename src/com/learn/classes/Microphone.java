package com.learn.classes;
/*
    classes can be seen as blueprints
    creating attributes of microphone (give customisation to microphone)
    creating methods for microphone (actions to make)
 */
public class Microphone {
    //instance variables/ properties/ fields
    //it is better to secure the attributes so they cannot be directly called in another class
    private String name;
    private String colour;
    private int model;

    public Microphone() { //empty constructor
        //creates a memory for us so we leave it empty
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour(String blue) {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    //takes parameters in the constructor
    public Microphone(String name, String colour, int model) {
        this.name = name;
        this.colour = colour;
        this.model = model;
    }

    //action methods
    public void turnOff() {
        System.out.println(this.name + " Turning off");
    }

    public void turnOn() {
        System.out.println(this.name + " Turning on");
    }

    public void setVolume() {
        //using this allows you to get this specific access name
        System.out.println(this.name + " Setting volume");
    }

    public String showDescription() {
        return "Microphone name " + this.name +
                " with colour: " + this.colour +
                " and its model is " + this.model;
    }

}
