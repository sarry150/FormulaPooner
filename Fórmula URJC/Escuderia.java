import java.util.Scanner;

public class Escuderia {

    private String nombreEscuderia;
    private String país;
    private int añoFundacion;
    private double presupuestoAnual;
    private String directivos;
    private int puntosDelMundialEscuderia;
    private PilotoOficial [] arrayPilotosOficialesEscuderia ;
    private PilotoProbador [] arrayPilotosProbadoresEscuderia;
    private Coche [] arrayCochesEscuderia;
    private int cont_p_of;
    private int cont_p_pr;

    public Escuderia () {
        this.cont_p_of=0;
        this.cont_p_pr=0;
        this.añoFundacion=-1;
        presupuestoAnual=-1;
        this.arrayPilotosOficialesEscuderia= new PilotoOficial [2];
        this.arrayPilotosProbadoresEscuderia= new PilotoProbador [2];
        this.arrayCochesEscuderia= new Coche [2];
        System.out.println("Para crear una escudería rellena la siguiente informacion:");
        Scanner kbd= new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre= kbd.nextLine();
        this.nombreEscuderia=nombre;
        System.out.print("País: ");
        String pais= kbd.nextLine();
        this.país=pais;
        System.out.print("Directivos: ");
        String directivos= kbd.nextLine();
        this.directivos=directivos;
        while (this.añoFundacion<0) {
            System.out.print("Año de fundación (>0): ");
            int año= kbd.nextInt();
            this.añoFundacion=año;}
        while (presupuestoAnual<0) {
            System.out.print("Presupuesto anual (>0): ");
            double presupuesto= kbd.nextDouble();
            this.presupuestoAnual=presupuesto;}
        
        this.puntosDelMundialEscuderia=0;

    }
    

    public void ficharPilotoOficialLibre (PilotoOficial pilotoafichar){
        if (pilotoafichar.escuderia=="libre"){
            if (this.presupuestoAnual>=pilotoafichar.precioPiloto) {
            
            if (this.cont_p_of>=2) {
                System.out.println("No se pueden fichar más pilotos oficiales");
            }
            else{
                this.presupuestoAnual=this.presupuestoAnual-pilotoafichar.precioPiloto;
                pilotoafichar.escuderia=this.nombreEscuderia;
                this.arrayPilotosOficialesEscuderia[this.cont_p_of]= pilotoafichar;
                this.cont_p_of++;
                System.out.println("piloto fichado");}
            }  else {System.out.println("No hay presupuesto para fichar al piloto");
        }
    }
        
        else {System.out.println("El piloto no esta libre");}
        
    }


     public void ficharPilotoProbadorLibre (PilotoProbador pilotoafichar){
        if (pilotoafichar.escuderia=="libre"){
            if (this.presupuestoAnual>=pilotoafichar.precioPiloto) {
            
            if (this.cont_p_pr>=2) {
                System.out.println("No se pueden fichar más pilotos probadores");
            }
            else{
                this.presupuestoAnual=this.presupuestoAnual-pilotoafichar.precioPiloto;
                pilotoafichar.escuderia=this.nombreEscuderia;
                this.arrayPilotosProbadoresEscuderia[this.cont_p_pr]= pilotoafichar;
                this.cont_p_pr++;}
            }  else {System.out.println("No hay presupuesto para fichar al piloto");
        }
    }
        
        else {System.out.println("El piloto no esta libre");}
        

    }
    
    /*
    public void descartarPilotoOficial (PilotoOficial pilotoadescartar) {
        if (pilotoadescartar.escuderia!=this.nombreEscuderia){
            System.out.println("El piloto no se puede descartar porque no pertenece a la escuderia");
        }
        else{
            pilotoadescartar.escuderia="libre";
            if (pilotoadescartar==this.arrayPilotosOficialesEscuderia[1]) {
               this.cont_p_of--;
               this.arrayPilotosOficialesEscuderia[1]=NULL;
            }
            else {
               this.cont_p_of--;
               this.arrayPilotosOficialesEscuderia[0]= this.arrayPilotosOficialesEscuderia[1];
               this.arrayPilotosOficialesEscuderia[1]=NULL;
            }
        }
    }*/
                
            
            
}


    