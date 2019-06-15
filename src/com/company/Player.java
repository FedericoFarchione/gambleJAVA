package com.company;
import java.util.Scanner;


public class Player {

    private String nome = "";
    private String cognome ="";

    //tasto destro refactoring encapsule è crea tutti i metodi
    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // [Modificatore accesso][Tipo][nomeMetodo][Parametri];

    public String getScommessa(){

        String scommessa = "";
        Scanner console = new Scanner(System.in);
        System.out.println(this.nome + "balblablalbla");
        scommessa = console.next();
        return scommessa;
    }

}
