package com.company;

import java.util.ArrayList;

public class Caja implements Runnable {
    String nom;
    ArrayList<Client> clients = new ArrayList<>();
    Basura basura = new Basura();
    int contador;

    public Caja(String caja) {
        this.nom = caja;
    }

    @Override
    public void run(){

        for (int i = 0; i < Math.random()*5+2; i++) {
            clients.add(new Client(basura.nom[(int) (Math.random()*basura.nom.length)]));
            contador++;
        }
        System.out.println(nom + " tiene "+ contador + " Clientes");
        for (Client c: clients) {
            c.start();

            for (Producto prod: c.carro.productos) {
                c.carro.total += prod.precio;
            }

            String formattedString = String.format("%.2f", c.carro.total);
            System.out.println(nom + " " + c.nom +" --> Total pagament: " + formattedString + "€");
        }
    }

    public String getNom() {
        return nom;
    }
}
