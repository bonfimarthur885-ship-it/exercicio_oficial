 
package Principal;

import javax.swing.JOptionPane;

 
public class exercicio_java2 {

     
    public static void main(String[] args) {
         int número1;
         int número2;
         número1 = Integer.parseInt(JOptionPane.showInputDialog("Digite seu número: "));
         número2 = Integer.parseInt(JOptionPane.showInputDialog("Digite seu número: "));
         
         int soma;
         soma = número1 + número2;
         
         JOptionPane.showMessageDialog(null, "A soma dos seus números é: " + soma);
         
         
         
         
         
                
        
    }

}
