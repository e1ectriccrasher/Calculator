/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import static calculadora.Funciones.convertidor;
import static calculadora.Funciones.oper;
import static calculadora.Funciones.parentesis;
import com.sun.glass.events.KeyEvent;
import java.util.ArrayList;
import javax.swing.JTextField;


/**
 *
 * @author alexcesarmoya
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonSolve = new javax.swing.JButton();
        jButtonSum = new javax.swing.JButton();
        jButtonRest = new javax.swing.JButton();
        jButtonMulti = new javax.swing.JButton();
        jButtonDiv = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButtonNeg = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButtonSolve.setText("solve");
        jButtonSolve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSolveActionPerformed(evt);
            }
        });

        jButtonSum.setText("+");
        jButtonSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSumActionPerformed(evt);
            }
        });

        jButtonRest.setText("–");
        jButtonRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestActionPerformed(evt);
            }
        });

        jButtonMulti.setText("x");
        jButtonMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiActionPerformed(evt);
            }
        });

        jButtonDiv.setText("÷");
        jButtonDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivActionPerformed(evt);
            }
        });

        jButton10.setText("(");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText(")");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButtonNeg.setText("(-)");
        jButtonNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNegActionPerformed(evt);
            }
        });

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jButton16.setText("«««");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("%");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText(".");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton7))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(jButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton6)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonRest)
                                .addComponent(jButtonSum))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonNeg)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton11))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonSolve)
                            .addGap(0, 0, 0)
                            .addComponent(jButtonLimpiar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton18)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton0)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jButton4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton9))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jButton3)
                                    .addGap(12, 12, 12)
                                    .addComponent(jButton8))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonDiv)
                            .addComponent(jButtonMulti)
                            .addComponent(jButton17))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton6)
                    .addComponent(jButtonSum)
                    .addComponent(jButton10)
                    .addComponent(jButton11))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton7)
                    .addComponent(jButtonRest)
                    .addComponent(jButtonNeg))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton8)
                    .addComponent(jButtonMulti))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton9)
                    .addComponent(jButtonDiv))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5)
                        .addComponent(jButton0))
                    .addComponent(jButton17))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSolve)
                    .addComponent(jButtonLimpiar)
                    .addComponent(jButton18)
                    .addComponent(jButton16))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String txt;
        txt = jButton1.getText();
        String full =jTextField1.getText();
        jTextField1.setText(full = full + txt);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String txt;
        txt = jButton3.getText();
        String full =jTextField1.getText();
        jTextField1.setText(full = full + txt);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String txt;
        txt = jButton7.getText();
        String full =jTextField1.getText();
        jTextField1.setText(full = full + txt);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
      
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String txt;
        txt = jButton2.getText();
        String full =jTextField1.getText();
        jTextField1.setText(full = full + txt);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String txt;
        txt = jButton4.getText();
        String full =jTextField1.getText();
        jTextField1.setText(full = full + txt);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String txt;
        txt = jButton5.getText();
        String full =jTextField1.getText();
        jTextField1.setText(full = full + txt);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String txt;
        txt = jButton6.getText();
        String full =jTextField1.getText();
        jTextField1.setText(full = full + txt);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String txt;
        txt = jButton8.getText();
        String full =jTextField1.getText();
        jTextField1.setText(full = full + txt);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String txt;
        txt = jButton9.getText();
        String full =jTextField1.getText();
        jTextField1.setText(full = full + txt);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        String txt;
        txt = jButton0.getText();
        String full =jTextField1.getText();
        jTextField1.setText(full = full + txt);
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        int x;
        try {
        x = Integer.parseInt(jTextField1.getText());
    } catch (NumberFormatException e) {
        jTextField1.setEditable(false);
        
        
    }
            
        
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jButtonSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSumActionPerformed
        String txt;
        txt = jButtonSum.getText();
        String full =jTextField1.getText();
        jTextField1.setText(full = full + txt);
    }//GEN-LAST:event_jButtonSumActionPerformed

    private void jButtonRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestActionPerformed
        String txt;
        txt = jButtonRest.getText();
        String full =jTextField1.getText();
        jTextField1.setText(full = full + "–");
    }//GEN-LAST:event_jButtonRestActionPerformed

    private void jButtonMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiActionPerformed
        String txt;
        txt = jButtonMulti.getText();
        String full =jTextField1.getText();
        jTextField1.setText(full = full + txt);
    }//GEN-LAST:event_jButtonMultiActionPerformed

    private void jButtonDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivActionPerformed
        String txt;
        txt = jButtonDiv.getText();
        String full =jTextField1.getText();
        jTextField1.setText(full = full + txt);
    }//GEN-LAST:event_jButtonDivActionPerformed

    private void jButtonNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNegActionPerformed
        String txt;
        txt = "-";
        String full =jTextField1.getText();
        jTextField1.setText(full = full + txt);
    }//GEN-LAST:event_jButtonNegActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        jTextField1.setText("");
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonSolveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSolveActionPerformed
       String str;
       str = jTextField1.getText();
       if(!parentesisVacios(str) && !operadoresJuntos(str) && operadorAntesYDespueseParantesis(str) && revisaParentesis(str)){
           ArrayList arr, arr1;
            double resp;
       
            arr = elPaso(str);
            arr1 = postfix(arr);
            try{
                resp = evaluar(arr1);
                jTextField1.setText(Double.toString(resp));
            }catch(Exception e){
                jTextField1.setText("MATH ERR");
            }
            
       }
       else{
           jTextField1.setText("Syntas Err");
           
       }
       
       
       
       
       
    }//GEN-LAST:event_jButtonSolveActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String txt;
        txt = jButton10.getText();
        String full =jTextField1.getText();
        jTextField1.setText(full = full + txt);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        String txt;
        txt = jButton11.getText();
        String full =jTextField1.getText();
        jTextField1.setText(full = full + txt);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        String str=removeLastCharacter(jTextField1.getText());
        jTextField1.setText(str);
        
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        String txt;
        txt = jButton17.getText();
        String full =jTextField1.getText();
        jTextField1.setText(full = full + txt);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        String txt;
        txt = jButton18.getText();
        String full =jTextField1.getText();
        jTextField1.setText(full = full + txt);
    }//GEN-LAST:event_jButton18ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonDiv;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonMulti;
    private javax.swing.JButton jButtonNeg;
    private javax.swing.JButton jButtonRest;
    private javax.swing.JButton jButtonSolve;
    private javax.swing.JButton jButtonSum;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

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
                        resp = Double.parseDouble(valor1) / Double.parseDouble(valor2);
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
}
