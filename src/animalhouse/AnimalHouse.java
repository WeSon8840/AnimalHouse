/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package animalhouse;
import javax.swing.*;

/**
 *
 * @author glSon8840
 */
public class AnimalHouse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create an array of mammals
        Mammal theArray[] = new Mammal[5];

        String choice;

        //Fill the array
        for (int i = 0; i < 5; i++) {
            choice = JOptionPane.showInputDialog("Mammal #" + (i + 1) + "\n"
                + "1 - Dog\n"
                + "2 - Cat\n"
                + "3 - Horse\n"
                + "4 - Pig");
        if (choice.equals("1")) {
            theArray[i] = new Dog();
        }
        if (choice.equals("2")) {
            theArray[i] = new Cat();
        }
        if (choice.equals("3")) {
            theArray[i] = new Horse();
      }
        if (choice.equals("4")) {
            theArray[i] = new Pig();
      }
    }

        //Get all 5 mammals to speak
        for (int i = 0; i < 5; i++) {
            theArray[i].speak();
      }
    }
    
}
