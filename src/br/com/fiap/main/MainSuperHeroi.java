package br.com.fiap.main;

import br.com.fiap.bean.SuperHeroi;

import javax.swing.*;

public class MainSuperHeroi {
    public static void main(String[] args) {
        // atributos
        SuperHeroi manogood;
        String nome;
        String identidadeSecreta;
        String[] poderes;
        String[] fraquezas;
        int quantidadepoderes, quantidadefraquezas;

        do {
            try {
                nome = JOptionPane.showInputDialog("Informe o nome do herói");
                identidadeSecreta = JOptionPane.showInputDialog("Informe o ID de identidade");
                quantidadepoderes = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de poderes: "));
                poderes = new String[quantidadepoderes];
                for (int i = 0; i < poderes.length; i++){
                    poderes[i] = JOptionPane.showInputDialog("Insirá o poder:");
                }
                quantidadefraquezas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de fraquezas:"));
                fraquezas = new String[quantidadefraquezas];
                for (int i = 0; i < fraquezas.length; i++){
                    fraquezas[i] = JOptionPane.showInputDialog("Informe a fraqueza:");
                }
                manogood = new SuperHeroi(nome, identidadeSecreta, poderes, fraquezas);
                manogood.listarHeroi();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "fim de Programa", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}
