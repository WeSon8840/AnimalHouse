/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package animalhouse;

/**
 *
 * @author glSon8840
 */
public class Dog extends Mammal {
  public Dog() {
    //call Mammal constructor
    super();
  }

  //override the Mammal speak method
  public void speak() {
    System.out.println("Woof!!");
  }
    
}
