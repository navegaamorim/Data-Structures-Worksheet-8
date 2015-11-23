/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_08;

import ed_08_ex1.SearchingArray;
import ed_08.Car;
import ed_08_ex2.SearchingLinked;

/**
 *
 * @author navega
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NotSupportComparable {
        //lista tem que ter os valores de hp ordenados
        Car car1 = new Car("citroen", "c5", 1.1F);
        Car car2 = new Car("opel", "corsa", 1.2F);
        Car car3 = new Car("vw", "polo", 1.3F);
        Car car4 = new Car("bmw", "320", 1.4F);

        Car cars[] = {car1, car2, car3, car4};

        OrderedListADT linkedList = new DoubleLinkedOrderedList();
        linkedList.add(car1);
        linkedList.add(car2);
        linkedList.add(car3);
        linkedList.add(car4);

//        EX1
//        SearchingArray search = new SearchingArray(cars, 4);
//        System.out.println(search.linearSearch(car3));
//        System.out.println(search.binarySearch(car2));
//
//        EX2 binary search não e possivel em listas ligadas
//        SearchingLinked linkSearch = new SearchingLinked(linkedList);
//        linkSearch.linearSearch(car2);
    }

}
