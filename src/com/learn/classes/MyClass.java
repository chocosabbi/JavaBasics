package com.learn.classes;

/*
    using a class to turn a blueprint into an object with attributes
    using attributes of microphone (give customisation to microphone)
    using methods for microphone (actions to use like turning on a microphone)
 */

public class MyClass {

    public static void main(String[] args) {
        //you can instantiate the microphone class into this class
        //this instantiation is called from the empty constructor microphone method
        Microphone microphone = new Microphone();
        //we are accessing something from the object microphone
        //this is directly called from Microphone() class
        //it does not work anymore because they have been set to private
//        microphone.colour = "Blue";
//        microphone.name = "Blue Yeti";
//        microphone.model = 144328;
        //we will have to retrieve values from getters and setters for it to be more secure
        microphone.setModel(498023);
        microphone.setName("Blue Yeti 2");
        microphone.setColour("Blue");
        System.out.println("New mic: " + microphone.getModel());

        //another way to call microphone is to use the parameters in the constructor
        //it also saves us from repeating lines of code
        Microphone anotherMic = new Microphone("Green Grape", "Green", 43215);
        System.out.println(anotherMic);
        System.out.println(anotherMic.showDescription());

        //creating a new type of mic
        //we're creating a space in memory of its own, independent to microphone
        Microphone ghMic = new Microphone();
        // takes the same properties of microphone as it was assigned above
//        ghMic.model = 345698;
//        ghMic.name = "Red Whale";
//        ghMic.colour = "Red";
        ghMic.setModel(345698);
        ghMic.setName("Red Whale");
        ghMic.setColour("Red");

        Microphone lnMic = new Microphone();
//        lnMic.model = 786321;
//        lnMic.name = "Orange Orangutan";
//        lnMic.colour = "Orange";
        lnMic.setModel(786321);
        lnMic.setName("Orange Orangutan");
        lnMic.setColour("Orange");


        //prints the access in memory location
        System.out.println(microphone);
        //holds a different location in memory
        //even though they come from the same class
        System.out.println(ghMic);
        //another example is
        System.out.println(lnMic);
        //we want the access model and colour of the first mic
//        System.out.println(microphone.model);
//        System.out.println(microphone.colour);
//        //we want the second mic attributes
//        System.out.println(ghMic.model);
//        System.out.println(ghMic.colour);
//        //last attributes of lnMic
//        System.out.println(lnMic.colour);
//        System.out.println(lnMic.name);

        //calling methods from the microphone class
        microphone.turnOn();
        microphone.setVolume();
        microphone.turnOff();
        System.out.println(microphone.showDescription());

        //can be used on all variables instantiated
        ghMic.turnOn();
        ghMic.setVolume();
        ghMic.turnOff();
        System.out.println(ghMic.showDescription());
    }

}
