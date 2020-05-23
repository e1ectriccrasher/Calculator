/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Iterator;







/**
 *
 * @author alexcesarmoya
 * @param <T>
 */
public interface PilasADT <T> extends Iterable<T>{
    
    public void push(T dato);
    
    public T pop();
    
    public boolean isEmpty();
    
    public T peek();

    public boolean contiene(T i);
    
    public void multiPop(int n);
    
    @Override
    public Iterator <T> iterator();
    
    
    
}

