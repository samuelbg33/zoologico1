package org.example;

import org.example.Animal;

public class Familia {

    Animal papa;
    Animal mama;
    Animal hijo;

    public Familia(Animal papa, Animal mama) {
        this.papa = papa;
        this.mama = mama;
    }

    public void imprimirFamilia(){


        System.out.println(
                "El papá es: "+this.papa.nombre+
                        "\nLa mamá es: "+this.mama.nombre+
                            "\nEl hijo es: "+this.hijo.nombre
        );

    }

    public void tenerHijo(String nombre){

        if (this.papa != null && this.mama != null) {

            Animal hijo= new Animal(nombre, 1);
            hijo.nombre=nombre;
            hijo.peso=1;
            double random = Math.random();
            if(random<0.5){
                hijo.genero="F";
            }else{
                hijo.genero="M";
            }
            this.hijo=hijo;

        }else{
            System.out.println("Aun no puedes tener hijos");
        }


    }




}
