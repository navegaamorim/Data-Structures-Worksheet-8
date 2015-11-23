/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_08;

/**
 *
 * @author Navega
 */
public interface UnorderedListADT<T> extends ListADT<T> {

    public void addToFront(Object element) throws NotSupportComparable;

    public void addToRear(Object element) throws NotSupportComparable;

    public void addAfter(Object element, Object target) throws NotSupportComparable, NotFoundInCollectionException;

}
