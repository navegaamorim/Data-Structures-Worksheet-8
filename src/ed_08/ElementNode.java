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
public class ElementNode<T extends Comparable<T> > implements Comparable<ElementNode<T>>{

    private ElementNode<T> previous;
    private T element;
    private ElementNode<T> next;

    public ElementNode(T element) {
        this.element = element;
    }

    public ElementNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(ElementNode<T> previous) {
        this.previous = previous;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public ElementNode<T> getNext() {
        return next;
    }

    public void setNext(ElementNode<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "element = " + element;
    }


    @Override
    public int compareTo(ElementNode<T> o) {
        return this.element.compareTo(o.element);
    }

}
