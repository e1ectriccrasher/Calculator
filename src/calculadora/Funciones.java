
package calculadora;

import java.util.ArrayList;
import javax.xml.transform.Source;


/**
 *
 * @author alexcesarmoya
 */
public class Funciones {

    
    /**
     * funcon que permite identificar si el carater del Strin a vereficar es un parentesis
     * @param value es el caracter a identificar 
     * @return regresa un boolean para decir si fue o no fue 
     */
    public static boolean oper(Character value){
        boolean resp;
        if(value.equals('+')|| value.equals('–')|| value.equals('x') || value.equals('÷') || value.equals('%')){
            resp = true;
        }
        else {
            resp = false;
        }
        return resp;
    }
    /**
     * función que permite identificar si ek caracter del string es un parentesis 
     * @param value es el caracter a analizsr
     * @return regresea un boolean para indicar si es parentesis o no
     */
    public static boolean parentesis (Character value){
        boolean resp;
        if(value.equals('(')|| value.equals(')') || value.equals('[') || value.equals(']') || value.equals('{') || value.equals('}')){
            resp = true;
        }
        else {
            resp = false;
        }
        return resp;
    }
    /**
     * identifica si el numero es negativo, si detecta el simbolo de negativo avanza hasta tomar todo el numero negativo 
     * @param value es el caracter a analizar 
     * @return regresa un booleano para indicar si es un numero negativo o no 
     */
    public static boolean negative(Character value){
        boolean resp;
        if(value.equals('-')){
            resp = true;
        }
        else {
            resp = false;
        }
        return resp;
    }
    /**
     * es un metodo que identifica que operador tiene mas peso en el momento de pasar la operacion a postfijo 
     * @param signo es el operador que esta siendo evaluado para asignarle un numero de jerarquia 
     * @return regresa el numero que le corrsponde a ese operador según su jerarquia
     */
    public static int jerarquia (String signo){
        int resultado=0;
        if(signo.equals("(") || signo.equals(")") ||signo.equals("[") || signo.equals("]") || signo.equals("{") || signo.equals("}"))
            resultado=0;
        if(signo.equals("x")||signo.equals("÷") || signo.equals("%"))
            resultado=2;
        if(signo.equals("+")||signo.equals("–"))
            resultado=1;
        return resultado;
    }
    /**
     * Este metodo convierte una caracter del String en un char para que sea mas facil de manejarlo con el .ToCharArray
     * @param str es la operacion matematica a realizar
     * @return regresa el caracter del String en forma de char
     */
    public static char convertidor(String str){
        Character c = str.charAt(0);
        
        return c;
    }
    /**
     * este metod lo que hace es que es un "backspace" en el JTextfield1 para si el usuario se equivoca pueda corregir facilmente 
     * @param str es la operacion matematica 
     * @return la misma operacion matematica pero con un caracter menos
     */
    public static String removeLastCharacter(String str) {
        String result = null;
        if ((str != null) && (str.length() > 0)) {
            result = str.substring(0, str.length() - 1);
        }
        return result;
    }
    /**
     * Este metodo lo que hace es que pasa el Srtring a un a ArrayList para que sea más facil de manejar
     * @param <T> esto lo que hace es que permite que cualquier objeto pueda ser isertado en el ArrayList 
     * @param str es la operación matematica a pasar al arreglo
     * @return 
     */
    public  static <T> ArrayList elPaso(String str){
        ArrayList arr = new ArrayList<>();
        int i=0;
        
        while(i<str.length()){
            String valor="";
            
            if(oper(str.charAt(i)) || parentesis(str.charAt(i))){
                Character c = str.charAt(i);
                
                arr.add(c.toString());
                i++;
            }
            
            else if(negative(str.charAt(i))){
             
                while(i!=str.length() && !oper(str.charAt(i)) && !parentesis(str.charAt(i))){

                    valor = valor + String.valueOf(str.charAt(i));
                    i++;
                }
                arr.add(valor);
            }
            
            else if(!oper(str.charAt(i))){
                 while(i!=str.length() && !oper(str.charAt(i)) && !parentesis(str.charAt(i))){
                    valor = valor + str.charAt(i);
                    
                     i++;
                 }
                 arr.add(valor);
            }
            
        }
     
         
        return arr;
    }
    /**
     * este metodo lo que hace es que pasa la operación matematica a una froma mas sencilla para que la pueda evaluar la computadora, respetando la jerarquía
     * @param <T> esto lo que hace es que permite que cualquier objeto pueda ser isertado en el ArrayList
     * @param arr1 es a donde se asara la nueva operacion matematica ya modificada para evaluar 
     * @return regresa un ArrayList
     */
    public static <T> ArrayList postfix (ArrayList arr1){
        int i=0;
        ArrayList arr2 = new ArrayList();
        PilasADT pila = new PilaArray();
        while(i<arr1.size()){
           
            if(arr1.get(i).equals("(") || arr1.get(i).equals("[") || arr1.get(i).equals("{")){
                pila.push(arr1.get(i));
            } 
            else{
                if(arr1.get(i).equals(")") || arr1.get(i).equals("]") || arr1.get(i).equals("}")){
                    while(!pila.isEmpty() && !pila.peek().equals("(") && !pila.peek().equals("[") && !pila.peek().equals("{")){
                        arr2.add(pila.pop());
                    }
                    pila.pop();
                }
                else{
                    if(!oper(convertidor((String) arr1.get(i)))){
                        arr2.add(arr1.get(i));
                    }
                    else{
                        while(!pila.isEmpty() && jerarquia((String) pila.peek())>=jerarquia((String) arr1.get(i))){
                            arr2.add(pila.pop());
                        }
                        pila.push(arr1.get(i));
                    }
                }
            }
           i++;
        }
        while(!pila.isEmpty()){
            arr2.add(pila.pop());
        }
        return arr2;
    }
    /**
     * este metodo lo que hace es que toma los dos primeros número que enceutre en el arreglo y los evalua con el pimero operador que este en arreglo
     * @param <T> esto lo que hace es que le arreglo sea generico y aceta varios tipos de objetos / datos
     * @param arr arr es el arreglo de recibe para poder evaluarlo
     * @return regresa un int que es el resultado de la operacion matemática
     */
    public static <T> double evaluar(ArrayList arr){
        ArrayList list = new ArrayList();
        double resp=0;
        int i=0;
        
        PilasADT pila = new PilaArray();
        while(i<arr.size()){
            String valor1 ;
            String valor2 ;
            String oper   ;
            if(!oper(convertidor((String) arr.get(i)))){
                pila.push(arr.get(i));
                
                i++;
            }
            else{
                valor2= (String) pila.pop();
                valor1=(String) pila.pop();
                
                oper= (String) arr.get(i);
                
                switch (oper){
                    case "+":
                        resp=Double.parseDouble(valor1) + Double.parseDouble(valor2);
                        break;
                    case "–":
                        resp = Double.parseDouble(valor1) -  Double.parseDouble(valor2);
                        break;
                    case"x":
                        resp = Double.parseDouble(valor1) * Double.parseDouble(valor2);
                        break;
                    case"÷":
                        try{
                             resp = Integer.parseInt(valor1) / Integer.parseInt(valor2);
                        }catch(ArithmeticException e){
                            
                        }
                       
                        break;
                    case"%":
                        resp = Double.parseDouble(valor1) % Double.parseDouble(valor2);
                        
                        
                }
                pila.push(Double.toString(resp));
                i++;
            } 
            
        }
        return resp;
    }
    /**
     * Este metodo revisa que no haya parentesis sin nada que operar dentro de ellos
     * @param str Es la operacion matematica a revisar si esta correctamente escrita por el usuario
     * @return revisa un booleano que indica si la operaion recibida es correcta sintacticamente
     */
    public static  boolean parentesisVacios(String str){
        boolean bandera =false;
        int i=0;
        char [] arr = str.toCharArray();
        while(!bandera && i<=arr.length-1){
            if(arr[i]==convertidor("(") && arr[i+1]==convertidor(")")){
                bandera = true;
            }
            else if(arr[i]==convertidor("{") && arr[i+1]==convertidor("}")){
                bandera = true;
            }
            else if(arr[i]==convertidor("[") && arr[i+1]==convertidor("]")){
                bandera = true;
            }
            i++;
        }
        return bandera;
    }
    /**
     * Este metodo prevee el caso en el que haya dos operadores juntos e indica que hay un error sntactico
     * @param str es la operacion matemaica a revisar 
     * @return regresa un boolean que indica que no hay errores en la operación dada
     */
    public static  boolean operadoresJuntos(String str){
        char arr[] = str.toCharArray();
        int i=0;
        boolean bandera =false;
        while(!bandera && i<arr.length-1){
            if(oper(arr[i])&& oper(arr[i+1])){
                bandera =true;
            }
            i++;
        }
        return bandera;
    }
    /**
     * Revisa que la operacion matematica tenga correctos los operadores antes de los parentesis, evita un editor sintactico 
     * @param str es la operación matematica a revisar
     * @return regrsa un booleano que indica si es correcta la operación 
     */
    public static boolean operadorAntesYDespueseParantesis(String str){
        char arr [] = str.toCharArray();
        boolean bandera = true;
        int i=0;
        while(bandera && i<arr.length-1){
            
            
             if(arr[i] == '(' || arr[i]=='[' || arr[i]=='{'){
                 try{
                     if(!oper(arr[i-1])){
                    bandera = false;
                 }
                
                }catch (Exception e){
                    
                }
                
            }
            else if(arr[i] == ')' || arr[i]==']' || arr[i]=='}'){
                if(!oper(arr[i+1]) && !parentesis(arr[i+1])){
                    bandera = false;
                }
            }
            
           i++; 
        }
        return bandera;
    }
    /**
     * este es el codigo que revisa que los parentesis balanceados y no haya error de operación 
     * @param txt es el Stirng que recibe, es laoperacion para revisar los parentesis
     * @return regresa un boolean que idica si estan bien balanceados los parentesis
     */
    public static  boolean revisaParentesis(String txt){
         boolean resp =true;
         int i=0;
         PilaArray pila = new PilaArray();
         while(i<txt.length() && resp){
             if(txt.charAt(i) == '(' || txt.charAt(i) == '{' || txt.charAt(i) == '['){
                 pila.push(txt.charAt(i));
             }
             else if(txt.charAt(i)==')' || txt.charAt(i) == '}' || txt.charAt(i) == ']'){
                 try{
                     pila.pop();
                 }
                 catch (Exeptionvacio e){
                     resp = false;
                 }
             }
             i++;
         }
         
         return pila.isEmpty() && resp;
     }
    
    public static void main(String[] args) {
       String str = "1+";
       ArrayList arr;
       ArrayList arr1;
        System.out.println(str);
        if(!parentesisVacios(str) && !operadoresJuntos(str) && operadorAntesYDespueseParantesis(str) && revisaParentesis(str)){
            System.out.println("correct");
            arr = elPaso(str);
            System.out.println(arr.toString());
            arr1 = postfix(arr);
            System.out.println(arr1.toString());
            try{
                System.out.println(evaluar(arr1));
            }catch(Exception e){
                System.out.println("no se puede");
            }
            
            
        }
        else {
            System.out.println("no corect");
        }
        
       
        
        
        
        
        
        
        
        
        
       

       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
    