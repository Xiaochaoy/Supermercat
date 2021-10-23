package com.company;

import java.util.ArrayList;

public class Caja {
    String nom;
    String nomClient;
    ArrayList<Client> clients = new ArrayList<>();
    Basura basura = new Basura();
    int contador;

    public Caja(String caja) {
        this.nom = caja;
    }

    public void start(){

        for (int i = 0; i < Math.random()*5+2; i++) {
            nomClient = basura.nom[(int) (Math.random()*basura.nom.length)];
            clients.add(new Client(nomClient));
            contador++;
        }
        System.out.println(nom + " tiene "+ contador + " Clientes");
        for (Client c: clients) {
            c.start();

            for (Producto prod: c.carro.productos) {
                c.carro.total += prod.precio;
            }

            String formattedString = String.format("%.02f", c.carro.total);
            System.out.println(nom + " " + c.nom +" --> Total pagament: " + formattedString + "€");
        }
    }

    public String getNom() {
        return nom;
    }
}
