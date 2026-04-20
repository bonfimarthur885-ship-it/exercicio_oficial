/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

import javax.swing.JOptionPane;

/**
 *
 * @author IdeaPad
 */
public class exercicio_while2{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(
        "Digite o numero de vezes"));
String frase = JOptionPane.showInputDialog("Digite a frase:");

        int i = 0; 
        while (i < n){
            JOptionPane.showMessageDialog(null, "frase:" + frase);
            i++;
        }
    }
}

// TODO code application logic herehereherehere



