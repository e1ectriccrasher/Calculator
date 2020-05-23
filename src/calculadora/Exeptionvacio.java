package calculadora;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexcesarmoya
 */
public class Exeptionvacio extends RuntimeException{

    public Exeptionvacio() {
        super("Coleccion vacia");
    }

    public Exeptionvacio(String mensaje) {
        super(mensaje);
    }
    
}

