package com.company;


import java.util.ArrayList;

public class Client {
    String nom;
    Carro carro = new Carro();
    Basura basura = new Basura();

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Client(String nom) {
        this.nom = nom;
    }

    public void start(){

        for (int i = 0; i < Math.random()*20; i++) {
            int numero = (int) (Math.random()*basura.nomTotal.length);
            carro.productos.add(new Producto(basura.nomTotal[numero], basura.precioTotal[numero]));
        }


        /*System.out.println();
        System.out.println("Client" + nom);
        System.out.print("Total pagament: ");
        System.out.printf("%.2f",carro.total);
        System.out.println("€");*/


    }
}
/*
*       for (int i = 0; i < Math.random()*20; i++) {
            int numero = (int) (Math.random()*basura.nomTotal.length);
            carro.productos.add(new Producto(basura.nomTotal[numero], basura.precioTotal[numero]));
        }
        System.out.println("Productos: ");
        for (Producto prod: carro.productos) {
            System.out.println("- " + prod.nom + " --> " + prod.precio + "€");
            carro.total += prod.precio;
        }
        System.out.print("Total pagament: ");
        System.out.printf("%.2f",carro.total);
        System.out.println("€");
    }*/