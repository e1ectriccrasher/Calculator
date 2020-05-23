/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author alexcesarmoya
 */
public class IteratorArreglo <T> implements Iterator<T> {
    
    private T[] colec;
    private int total;
    private int actual;
    
    public IteratorArreglo(T[]arre, int n){
        colec =arre;
        total = n;
        actual =0;
    }

    @Override
    public boolean hasNext() {
        return actual < total;
    }

    @Override
    public T next() {
        if(hasNext()){
            T res =colec[actual];
            actual++;
            return res;
        }
        else 
            throw new NoSuchElementException();
    }

    
    
}
