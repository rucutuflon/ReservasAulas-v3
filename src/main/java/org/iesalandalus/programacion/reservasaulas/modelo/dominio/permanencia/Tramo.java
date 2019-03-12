package org.iesalandalus.programacion.reservasaulas.modelo.dominio.permanencia;

import java.io.Serializable;

public enum Tramo implements Serializable {
	
    MANANA("Mañana"), TARDE("Tarde");
    private String cadenaAMostrar;
    
    private Tramo(String tramo) {
        this.cadenaAMostrar = tramo;
    }
    
    public String toString() {
        return cadenaAMostrar;
    }
}
