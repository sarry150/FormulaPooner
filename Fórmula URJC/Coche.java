import java.util.Scanner;
public class Coche {

    private String nombreCoche;
    private String modeloCoche;
    private double potenciaMotor;
    private double aerodinamica;
    private double neumaticos;
    private double velocidadMaxRectas;
    private double velocidadMaxCurvas;
    private final int MULT_REC_POT=20;
    private final int MULT_REC_AER=30;
    private final int MULT_CUR_POT=10;
    private final int MULT_CUR_NEU=10;
    private final int MULT_CUR_AER=10;

    public Coche () {
        this.potenciaMotor=-1;
        this.aerodinamica=-1;
        this.neumaticos=-1;
        System.out.println("Para crear un coche rellena la siguiente informacion:");
        Scanner kbd= new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre= kbd.nextLine();
        this.nombreCoche=nombre;
        System.out.print("Modelo: ");
        String modelo= kbd.nextLine();
        this.nombreCoche=modelo;
        while ((this.potenciaMotor<0)||(this.potenciaMotor>5)){
            System.out.print("Potencia del motor (0-5): ");
            double potencia= kbd.nextDouble();
            this.potenciaMotor=potencia;}
        while ((this.aerodinamica<0)||(this.aerodinamica>5)){
            System.out.print("Aerodinámica (0-5): ");
            double aerodinamica= kbd.nextDouble();
            this.aerodinamica=aerodinamica;}
        while ((this.neumaticos<0)||(this.neumaticos>5)){
            System.out.print("Neumáticos (0-5): ");
            double neumaticos= kbd.nextDouble();
            this.neumaticos=neumaticos;}
        this.velocidadMaxRectas=(this.potenciaMotor*MULT_REC_POT)+(this.aerodinamica*MULT_REC_AER);
        this.velocidadMaxCurvas=(this.potenciaMotor*MULT_CUR_POT)+(this.neumaticos*MULT_CUR_NEU)+(this.aerodinamica*MULT_CUR_AER);
    }

    public void actualizarVelocidadCoche (){
        this.velocidadMaxRectas=(this.potenciaMotor*MULT_REC_POT)+(this.aerodinamica*MULT_REC_AER);
        this.velocidadMaxCurvas=this.potenciaMotor*MULT_CUR_POT+this.neumaticos*MULT_CUR_NEU+this.aerodinamica*MULT_CUR_AER;
    }

    public void verCoche (){
        System.out.println("La información del coche es la siguiente:");
        System.out.println("Nombre: "+this.nombreCoche);
        System.out.println("Modelo: "+this.modeloCoche);
        System.out.println("Potencia del motor: "+this.potenciaMotor);
        System.out.println("Aerodinámica: "+this.aerodinamica);
        System.out.println("Neumaticos: "+this.neumaticos);
        System.out.println("Nombre: "+this.nombreCoche);
        System.out.println("Velocidad máxima en rectas: "+this.velocidadMaxRectas);
        System.out.println("Velocidad máxima en curvas: "+this.velocidadMaxCurvas);
    }

        
        
        
        
        
        
        
        
}
        