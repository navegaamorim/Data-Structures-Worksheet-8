/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_08;

/**
 *
 * @author navega
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car car1 = new Car("citroen", "c5", 1.6F);
        Car car2 = new Car("opel", "corsa", 1.6F);
        Car car3 = new Car("vw", "polo", 1.6F);

        Car cars[] = {car1, car2, car3};

        Searching search = new Searching(cars);

        System.out.println(search.linearSearch(car3));


    }

}
