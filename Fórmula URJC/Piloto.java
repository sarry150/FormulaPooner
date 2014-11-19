
import java.util.Scanner;

public abstract class Piloto {

    protected String nombrePiloto;
    protected String primerApellidoPiloto;
    protected String segundoApellidoPiloto;
    protected int edad;
    protected double altura;
    protected double peso;
    protected double precioPiloto;
    protected double reflejos;
    protected double agresividad;
    protected double paciencia;
    protected double valentía;
    protected double valoraciónGlobalPiloto;
    protected String escuderia;

    public Piloto () {
        this.altura=-1;
        this.peso=-1;
        this.precioPiloto=-1;
        this.reflejos=-1;
        this.agresividad=-1;
        this.paciencia=-1;
        this.valentía=-1;
        System.out.println("Para crear un piloto rellena la siguiente informacion:");
        Scanner kbd= new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre= kbd.nextLine();
        this.nombrePiloto=nombre;
        System.out.print("Primer apellido: ");
        String apellido1= kbd.nextLine();
        this.primerApellidoPiloto=apellido1;
        System.out.print("Segundo apellido: ");
        String apellido2= kbd.nextLine();
        this.segundoApellidoPiloto=apellido2;
        do{
            System.out.print("Edad (>0): ");
            int edad= kbd.nextInt();
            this.edad=edad;
            if (this.edad < 0){
                System.out.println("La edad introducida es incorrecta.");}
            }while (this.edad<0);
        while (this.altura<0){
            System.out.print("Altura (>0): ");
            double altura= kbd.nextDouble();
            this.altura=altura;}
        while (this.peso<0){
            System.out.print("Peso (>0): ");
            double peso= kbd.nextDouble();
            this.peso=peso;}
        while (this.precioPiloto<0){
            System.out.print("Precio (>0): ");
            double precio= kbd.nextDouble();
            this.precioPiloto=precio;}
        while ((this.reflejos<0)||(this.reflejos>5)){
            System.out.print("Reflejos: ");
            double reflejos= kbd.nextDouble();
            this.reflejos=reflejos;}
        while ((this.agresividad<0)||(this.agresividad>5)){
            System.out.print("Agresividad: ");
            double agresividad= kbd.nextDouble();
            this.agresividad=agresividad;}
        while ((this.paciencia<0)||(this.paciencia>5)){
            System.out.print("Paciencia: ");
            double paciencia= kbd.nextDouble();
            this.paciencia=paciencia;}
        while ((this.valentía<0)||(this.valentía>5)){
            System.out.print("Valentía: ");
            double valentia= kbd.nextDouble();
            this.valentía=valentia;}
        this.valoraciónGlobalPiloto=this.reflejos+this.agresividad+this.paciencia+this.valentía;
        this.escuderia="libre";

    }

    //este metodo nose si es private ni si va aqui pero habra que usarlo  
    public void actualizarValoracionGlobal () {
        this.valoraciónGlobalPiloto=this.reflejos+this.agresividad+this.paciencia+this.valentía;
    }

    public abstract void verPiloto ();

    //public abstract void entrenar ();

}

    