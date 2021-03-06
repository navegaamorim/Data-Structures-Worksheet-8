/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_08;

import java.util.Iterator;

/**
 *
 * @author Navega
 */
public class ArrayList<T> implements UnorderedListADT<T>, OrderedListADT<T> {

    public ElementNode head, tail;
    public int count;

    public ArrayList() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    @Override
    public void add(T element) throws NotSupportComparable {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addToFront(Object element) throws NotSupportComparable {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addToRear(Object element) throws NotSupportComparable {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addAfter(Object element, Object target) throws NotSupportComparable, NotFoundInCollectionException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T removeFirst() {
        ElementNode temp = this.head;
        this.head = this.head.getNext();
        --count;
        return (T) temp;
    }

    @Override
    public T removeLast() {
        if (this.size() == 1) {
            return removeFirst();
        } else {
            ElementNode temp = this.tail;
            this.tail = this.tail.getPrevious();
            this.tail.setNext(null);
            --count;
            return (T) temp;
        }
    }

    @Override
    public Object remove(Object element) throws NotSupportComparable, NotFoundInCollectionException {
        if (element instanceof Comparable) {
            ElementNode current = this.head;
            ElementNode tempElement = new ElementNode((Comparable) element);

            if (!this.contains((T) element)) {
                throw new NotFoundInCollectionException("Not found in Collection.");

            } else {
                if (tempElement.compareTo(this.head) == 0) {
                    this.removeFirst();
                } else {
                    while (current != null) {
                        if (current.compareTo(tempElement) == 0) {
                            ElementNode tempObject = current;
                            ElementNode temp = current.getPrevious();
                            temp.setNext(current.getNext());
                            return tempObject;
                        }
                        current = current.getNext();
                    }
                }
                --count;
            }
        } else {
            throw new NotSupportComparable("Not support comparable.");
        }
        return null;
    }

    @Override
    public T first() {
        return (T) this.head.getElement();
    }

    @Override
    public T last() {
        return (T) this.tail.getElement();
    }

    @Override
    public boolean contains(T target) throws NotSupportComparable {
        if (target instanceof Comparable) {
            boolean result = false;
            ElementNode current = this.head;
            ElementNode tempElement = new ElementNode((Comparable) target);

            while (current != null) {
                if (current.compareTo(tempElement) == 0) {
                    result = true;
                }
                current = current.getNext();
            }
            return result;
        } else {
            throw new NotSupportComparable("Not support comparable.");
        }
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public int size() {
        return this.count;
    }

    @Override
    public Iterator<T> iterator() {
        return new DoubleLinkedIterator<>();
    }

    public class DoubleLinkedIterator<T> implements Iterator {

        private ElementNode node;

        public DoubleLinkedIterator() {
            this.node = head;
        }

        @Override
        public boolean hasNext() {
            return this.node != null;
        }

        @Override
        public Object next() {
            ElementNode temp = this.node;
            node = node.getNext();
            return temp;
        }
    }

}
