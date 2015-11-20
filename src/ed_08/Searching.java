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
public class Searching<T extends Comparable<? super T>> {

    private T[] list;

    public Searching(T[] list) {
        this.list = list;
    }

    public int linearSearch(T element) {
        for (int index = 0; index < this.list.length; ++index) {
            if (element.equals(this.list[index])) {
                return index;
            }
        }

        return -1;
    }

    public int binarySearch(T element) {

        return -1;
    }
}
