package Principal;
import javax.swing.JOptionPane;

public class exercicio_vetores3 {
    public static void main(String[] args) {
        //Entrada 
        String nomes[] = new String[100];
        float notas[] = new float[100];
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos"));
        
        for(int i = 0; i < n; i++){
            nomes[i] = JOptionPane.showInputDialog("Digite nome " + i + ":");    
            notas[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota " + i + ":"));
        }
        
        //Processamento
        float soma = 0;
        for (int i = 0; i < n; i++) {
            soma = soma + notas[i];
        }
        
        float media = soma / n;
        
        // Saída com JOptionPane
        String resultado = "A media das notas é: " + media + "\n\n";
        for (int i = 0; i < n; i++){
            resultado += "nome: " + nomes[i] + " | nota: " + notas[i] + "\n";
        }
        
        JOptionPane.showMessageDialog(null, resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}