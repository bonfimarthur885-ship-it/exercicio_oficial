package Principal;

import javax.swing.JOptionPane;

public class exercicio_vetores {

    public static void main(String[] args) {
        //Entrada
        String nome [] = new String [100];
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite quantidade de alunos"));
        for (int i = 0; i < n; i++){
            nome [i] = JOptionPane.showInputDialog("Digite o nome(" + (i+1) + ") :");
        }

        //Saida
        for (int i = 0; i < n; i++){
            System.out.println("nome: " + i + ": " + nome[i]);
        }
    }
}