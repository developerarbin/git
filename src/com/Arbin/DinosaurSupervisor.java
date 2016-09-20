package com.Arbin;

/**
 * Created by Arbin Rai on 9/20/2016.
 */
public class DinosaurSupervisor {
    public static void main (String[] args){
        Dinosaur t_rex = new Dinosaur();
        Dinosaur velociraptor=new Dinosaur();
        //added new object using dinosaur class
        Dinosaur diplodous=new Dinosaur();

        t_rex.roar();
        velociraptor.roar();
        diplodous.roar();

    }
}
