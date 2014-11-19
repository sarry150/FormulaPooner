
public class PilotoOficial extends Piloto {
    
   
    protected int puntosDelMundialPiloto;
    protected double sueldoPorCarreraPiloto;
    private final int EUROS_POR_PUNTOS_DE_VALORACION=50;
    private final int EUROS_PLUS_PELIGROSIDAD=50;
    
    
    public PilotoOficial () {
        super ();
        this.puntosDelMundialPiloto=0;
        this.sueldoPorCarreraPiloto=this.valoraciónGlobalPiloto * EUROS_POR_PUNTOS_DE_VALORACION;
    }
    
    public void actualizarSueldoPorCarreraPiloto () {
        this.sueldoPorCarreraPiloto=this.valoraciónGlobalPiloto * EUROS_POR_PUNTOS_DE_VALORACION;
}
    public void verPiloto () {
        System.out.println("La información del piloto es la siguiente:");
        System.out.println("Nombre: "+this.nombrePiloto);
        System.out.println("Primer apellido: "+this.primerApellidoPiloto);
        System.out.println("Segundo apellido: "+this.segundoApellidoPiloto);
        System.out.println("Edad: "+this.edad);
        System.out.println("Altura: "+this.altura);
        System.out.println("Peso: "+this.peso);
        System.out.println("Precio: "+this.precioPiloto);
        System.out.println("Reflejos: "+this.reflejos);
        System.out.println("Agresividad: "+this.agresividad);
        System.out.println("Paciencia: "+this.paciencia);
        System.out.println("Valentía: "+this.valentía);
        System.out.println("Valoración global: "+this.valoraciónGlobalPiloto);
        System.out.println("Puntos del mundial: "+this.puntosDelMundialPiloto);
        System.out.println("Sueldo por carrera: "+this.sueldoPorCarreraPiloto);
        System.out.println("Escuderia: "+this.escuderia);
        
    }
    //public void entrenar ()
}