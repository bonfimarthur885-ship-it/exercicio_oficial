 
package Principal;

import javax.swing.JOptionPane;

 
public class exercicio_java3 {

     
    public static void main(String[] args) {
         int Kg;
         double altura;
         Kg = Integer.parseInt(JOptionPane.showInputDialog("Digite seu peso: "));
         altura = Integer.parseInt(JOptionPane.showInputDialog("Digite sua altura: "));
         
         double IMC;
         IMC = Kg / (altura * altura);
         
         JOptionPane.showMessageDialog(null,"O seu índice de Massa Corporal é:" + IMC);
         
                
         
         
        
         
         
         
         
         
                
        
    }

}
