package Principal;
import javax.swing.JOptionPane;


public class exercicio_matrizes_51{
    public static void main(String[] args) {
        int atleta[][] = new int[3][2];
        for (int i = 0; i < 3; i++) {
            atleta[i][0] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do Atleta " + (i + 1)));
            atleta[i][1] = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do Atleta " + (i + 1) + " (cm)"));
        }
        int numero = atleta[0][0];
        int altura = atleta[0][1];
        for (int i = 1; i < 3; i++) {
            if (atleta[i][1] > altura) {
                numero = atleta[i][0]; // Atualiza o número do mais alto
                altura = atleta[i][1]; // Atualiza a altura do mais alto
            }
        }

        JOptionPane.showMessageDialog(null,
            "a) Atleta mais alto:\n" +
            "   Número: " + numero + "\n" +
            "   Altura: " + altura + " cm");
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            soma += atleta[i][1];
        }
        double media = soma / 3d;

        JOptionPane.showMessageDialog(null,
            "b) Altura média do grupo: " + media + " cm");
        int menor = 0;
        for (int i = 0; i < 3; i++) {
            if (atleta[i][1] < 178) {
                menor++; 
            }
        }

        JOptionPane.showMessageDialog(null,
            "c) Atletas com altura menor que 178 cm: " + menor);
    }
}