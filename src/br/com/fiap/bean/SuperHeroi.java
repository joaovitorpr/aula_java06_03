package br.com.fiap.bean;

import javax.swing.*;

public class SuperHeroi {
    //Criando atributos
    private String nome;
    private String idSecreta;
    private String[] poderes;
    private String[] fraquezas;

    //Cronstrutores
    public SuperHeroi() {
    }
    public SuperHeroi(String nome, String idSecreta, String[] poderes, String[] fraquezas) {
        this.nome = nome;
        this.idSecreta = idSecreta;
        this.poderes = poderes;
        this.fraquezas = fraquezas;
    }

    //getters and setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getIdSecreta() {
        return idSecreta;
    }
    public void setIdSecreta(String idSecreta) {
        this.idSecreta = idSecreta;
    }
    public String[] getPoderes() {
        return poderes;
    }
    public void setPoderes(String[] poderes) {
        this.poderes = poderes;
    }
    public String[] getFraquezas() {
        return fraquezas;
    }
    public void setFraquezas(String[] fraquezas) {
        this.fraquezas = fraquezas;
    }

    //Metodos
    public void listarHeroi(){
        String exibir1 = String.format("Nome do heroi: %s \nIdentidade Secreta: %s\n", nome, idSecreta);
        String exibir2 = "poderes:\n";
        for (String i : poderes){
            exibir2 += i + "\n";
        }
        String exibir3 = "Fraquezas:\n";
        for (String i : fraquezas){
            exibir3 += i + "\n";
        }
        String exibir = exibir1 + exibir2 + exibir3;
        JOptionPane.showMessageDialog(null, exibir, "Ficha do Super Heroi", JOptionPane.INFORMATION_MESSAGE);
    }
}
