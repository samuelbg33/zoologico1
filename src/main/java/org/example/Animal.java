package org.example;

public class Animal {

    String nombre;
    String genero;
    int peso;
    Animal pareja;


    public Animal(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    void encontrarPareja(Animal pareja){
        this.pareja=pareja;
    }






}
