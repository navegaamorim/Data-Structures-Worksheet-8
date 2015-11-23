/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_08;

import ed_08_ex1.*;

/**
 *
 * @author navega
 */
public class Car implements Comparable<Car> {

    private String brand;
    private String model;
    private float hp;

    public Car(String brand, String model, float hp) {
        this.brand = brand;
        this.model = model;
        this.hp = hp;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    @Override
    public int compareTo(Car o) {
        if (this.hp < o.hp) {
            return -1;
        } else if (this.hp == o.hp) {
            return 0;
        }
        return 1;
    }

    @Override
    public String toString() {
        return "Car{" + "brand=" + brand + ", model=" + model + ", hp=" + hp + '}';
    }

}
