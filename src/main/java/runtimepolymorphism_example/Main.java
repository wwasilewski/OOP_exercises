package runtimepolymorphism_example;

/**
 * @author Wojciech Wasilewski
 * @date Created on 06.07.2019
 */
public class Main {

    public static void main(String[] args) {

        Bike bike = new Honda();

        //runtime polymorphism can't be achieved by data members!
        System.out.println(bike.speedlimit); //90
    }
}
