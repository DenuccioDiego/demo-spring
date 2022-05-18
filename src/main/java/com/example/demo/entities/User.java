package com.example.demo.entities;

public class User {
    String nome;
    String cognome;
    Integer eta;
    String codicefiscale;
    String sesso;

    public User(String nome, String cognome, Integer eta, String codicefiscale, String sesso) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.codicefiscale = codicefiscale;
        this.sesso = sesso;
    }

}
