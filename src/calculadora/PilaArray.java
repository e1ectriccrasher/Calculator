package calculadora;

import java.util.Iterator;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexcesarmoya
 * @param <T>
 */
public class PilaArray <T> implements PilasADT <T> {
    
    private T[] datos;
    private int tope;
    private static final int MAX=100;

    public PilaArray() {
        datos =(T[])  new Object[MAX];
        tope=-1;
    }
    
    @Override
    public boolean isEmpty(){
        return tope==-1;
    }
    
    @Override
    public void push (T nuevo){
        if(tope == datos.length)
            expande();
        tope++;
        datos[tope]=nuevo;
    }
    
    private void expande(){
        T[] grande= (T[])new Object[datos.length*2];
        for(int i=0;i<tope;i++){
            grande[i]=datos[i];
        }
        datos=grande;
        
    }
    
    @Override
    public T pop(){
        if(isEmpty())
            throw new Exeptionvacio();
        T resul = datos[tope];
        datos[tope]=null;
        tope--;
        return resul;
    }
    
    @Override
    public T peek(){
        if(isEmpty())
            throw new Exeptionvacio();
        return datos[tope];
    }
    
    @Override
    public boolean contiene (T busca){
        boolean resp;
        if(this.isEmpty()){
            throw new Exeptionvacio();
        }
        int i=0;
        while(i<tope && !datos[i].equals(busca)){
            i++;
        }
//        if(datos[tope].equals(busca)){
//            resp = true;
//        }
         if(datos[i].equals(busca)){
            resp =true;
        }
        else {
            resp = false;
        }
        return resp;
    }
    
    @Override
    public void multiPop(int n) {
        if(this.isEmpty()){
            throw new Exeptionvacio();
        }
        int i=0;
        while(i<n && tope>=0){
            tope--;
            i++;
        }
        if(tope<0){
            throw new ArrayIndexOutOfBoundsException(" ya no hay mas cosas en la pila manito");
        }
        
    }
    
    @Override
    public Iterator<T> iterator() {
        return new IteratorArreglo<>(datos, tope);
    }

    public static void main(String[] args) {
        // 
        PilaArray pila = new PilaArray();
        
        pila.push(1);
        pila.push(9);
        pila.push(67);
        pila.push(12);
        pila.push(5);
        
        
        
        
        System.out.println(pila.peek());
        
        
        
        
   
        
        
    }

    
    

    
    

    

    

    

    

    
}


        
        
        ////////////////////////////////////////////////////////////////////////////////////////////////
        
                
    

    
    
    

