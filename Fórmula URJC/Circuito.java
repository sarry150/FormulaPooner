import java.util.Scanner;
public class Circuito {

    private String nombreCircuito;
    private int aforo;
    private double canonPorCoche;
    private double [] rectas;
    private double [] curvas;
    private int nr; 
    private int nc;

    public Circuito () {
        this.aforo=-1;
        this.canonPorCoche=-1;
        this.nr=-1;
        this.nc=-1;
        System.out.println("Para crear un circuito rellena la siguiente informacion:");
        Scanner kbd= new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre= kbd.nextLine();
        this.nombreCircuito=nombre;
        while (this.aforo<0){
            System.out.print("Aforo (>0): ");
            int aforo= kbd.nextInt();
            this.aforo=aforo;}
        while (this.canonPorCoche<0){
            System.out.print("Canon por coche (>0): ");
            double canon= kbd.nextDouble();
            this.canonPorCoche=canon;}
        while (this.nr<0){
            System.out.print("Introduce el número de rectas (>0): ");
            int nr= kbd.nextInt();
            this.nr=nr;}
        while (this.nc<0){
            System.out.print("Introduce el número de curvas (>0): ");
            int nc= kbd.nextInt();
            this.nc=nc;}
        this.rectas= new double [nr];
        this.curvas= new double [nc];
        //falta comprobar que las distancias de las rectas y las curvas son correctas
        for (int i=0; i<nr; i++){
            System.out.print("Introduce la distacia en kms de la recta "+ (i+1) +": ");
            double kmr= kbd.nextDouble();
            this.rectas[i]=kmr;}
        for (int j=0; j<nr; j++){
            System.out.print("Introduce la distacia en kms de la curva "+ (j+1) +": ");
            double kmc= kbd.nextDouble();
            this.curvas[j]=kmc;}

    }

    public void verCircuito() {
        System.out.println("La información del circuito es la siguiente:");
        System.out.println("Nombre: "+this.nombreCircuito); 
        System.out.println("Aforo: "+this.aforo); 
        System.out.println("Canon por coche: "+this.canonPorCoche); 
        for (int i=0; i<nr; i++) {
            System.out.println("Recta" + (i+1) + "= " + rectas[i] + " km");
        }
        for (int j=0; j<nc; j++) {
            System.out.println("Curva" + (j+1) + "= " + curvas[j] + " km");
        }

    }

}

