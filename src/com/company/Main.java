package com.company;
import java.util.Scanner;

public class Main {

    public static int NUM_GIOCATE = 3;
    public static int COLONNE = 3;

    public static void main(String[] args) {

        Player gino = new Player();
        Player gina = new Player();

        gino.setCognome("Rossolino");
        gino.setNome("Mariolino");

        String scritta = gino.getScommessa();

        System.out.print(gino.getNome()+"ha scritto" +scritta);
        Scanner scan = new Scanner(System.in);
        String storage[][] = new String[NUM_GIOCATE][COLONNE];

        String carta = "carta";
        String forbice = "forbice";
        String sasso = "sasso";

        System.out.print("Quante volte vuoi giocare? ");
        int scelta = scan.nextInt();
        for (int i = 0; i < scelta; i++) {
            //--stampa scelta giocatore 1
            System.out.print("GIOCATORE 1 SCEGLI: ");
            String prima = scan.next();

                if (!(prima.equals(carta) || prima.equals(forbice) || prima.equals(sasso))) {
                    System.out.println("DEVI inserire solo sasso carta forbice, reinserisci");
                    prima = scan.next();
                }
                //--stampa scelta giocatore 2
                System.out.print("GIOCATORE 2 SCEGLI: ");
                String seconda = scan.next();

                if (!(seconda.equals(carta) || seconda.equals(forbice) || seconda.equals(sasso))) {
                    System.out.println("DEVI inserire solo sasso carta forbice, reinserisci");
                    seconda = scan.next();
                }
                System.out.println("giocata numero " + scelta);
                if (prima.equals(seconda)) {
                    storage[i][0] = "PAREGGIO ";
                    storage[i][1] = " " + prima;
                    storage[i][2] = " " + seconda;
                } else if (prima.equals(forbice) && seconda.equals(sasso)) {
                    storage[i][0] = "WIN PLAYER 2";
                    storage[i][1] = " " + prima;
                    storage[i][2] = " " + seconda;
                } else if (seconda.equals(forbice) && prima.equals(sasso)) {
                    storage[i][0] = "WIN PLAYER 1";
                    storage[i][1] = " " + prima;
                    storage[i][2] = " " + seconda;
                } else if (prima.equals(carta) && seconda.equals(forbice)) {
                    storage[i][0] = "WIN PLAYER 2";
                    storage[i][1] = " " + prima;
                    storage[i][2] = " " + seconda;
                } else if (seconda.equals(carta) && prima.equals(forbice)) {
                    storage[i][0] = "WIN PLAYER 1";
                    storage[i][1] = " " + prima;
                    storage[i][2] = " " + seconda;
                } else if (prima.equals(sasso) && seconda.equals(carta)) {
                    storage[i][0] = "WIN PLAYER 2";
                    storage[i][1] = " " + prima;
                    storage[i][2] = " " + seconda;
                } else if (seconda.equals(sasso) && prima.equals(carta)) {
                    storage[i][0] = "WIN PLAYER 1";
                    storage[i][1] = " " + prima;
                    storage[i][2] = " " + seconda;
                }
        }
        for (int x = 0; x < NUM_GIOCATE; x++) {
            for (int y = 0; y < scelta; y++) {
                System.out.print(storage[x][y]);
            }
            System.out.println("");
        }

    }
}