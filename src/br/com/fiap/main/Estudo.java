package br.com.fiap.main;

public class Estudo {
    public static void main(String[] args) {
        //As chaves servem para declarar vetor. Declaração de vetor
        String[] carros = {"Ford", "BMW", "Volvo", "Mazda"};
        //É uma forma de declarar e instanciar dizendo o seu tamanho.
        double[] numeros = new double[3];
        numeros[0] = 1.7;
        numeros[1] = 33.33;
        numeros[2] = 25;
        System.out.println("Vetor carros tem tamanho: " + carros.length);
        // System.out.println(carros[0] + carros[1] + carros[2] + carros[3]);
        for (int i = 0; i < carros.length ; i++) {
            System.out.println(carros[i]);
        }
        //for-each
        for (double i: numeros){
            System.out.println(i);
        }
    }
}
