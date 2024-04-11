package org.example;

public class Zoologico {
    public static void main(String[] args) {


        Animal animal1 = new Animal("cebra",280);
        animal1.nombre="Cebra";
        animal1.genero="F";


        Animal animal2 = new Animal("caballo",420);
        animal2.nombre="Caballo";
        animal2.genero="M";


        animal1.encontrarPareja(animal2); //Un animal consigue pareja


        Familia familia = new Familia(animal2,animal1);


        familia.tenerHijo("Cebrallo");


        familia.imprimirFamilia();




    }
}