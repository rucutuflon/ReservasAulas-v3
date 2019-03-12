package org.iesalandalus.programacion.reservasaulas.modelo.dominio.permanencia;

import java.io.Serializable;
import java.time.LocalDate;

public class PermanenciaPorTramo extends Permanencia implements Serializable {

	private static final int PUNTOS = 10;
	private Tramo tramo;
	
	public PermanenciaPorTramo(LocalDate dia, Tramo tramo) {
		super(dia);
		setTramo(tramo);
		
	}
	
	public PermanenciaPorTramo(String s, Tramo tramo) {
		super(s);
		setTramo(tramo);
	}
	
	public PermanenciaPorTramo(PermanenciaPorTramo p) {
		if(p == null) {
			throw new IllegalArgumentException("No se puede copiar una permanencia nula.");
		}
		setDia(p.dia);
		setTramo(p.tramo);
	}

	public Tramo getTramo() {
		return tramo;
	}
	
	private void setTramo(Tramo tramo) {
		if(tramo == null) {
			throw new IllegalArgumentException("El tramo de una permanencia no puede ser nulo.");
		}
		this.tramo = tramo;
	}

	@Override
	public int getPuntos() {
		return PUNTOS;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dia == null) ? 0 : dia.hashCode());
		result = prime * result + ((tramo == null) ? 0 : tramo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PermanenciaPorTramo other = (PermanenciaPorTramo) obj;
		if (tramo != other.tramo)
			return false;
		if (dia == null) {
			if (other.dia != null)
				return false;
		} else if (!dia.equals(other.dia))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[dia="+FORMATO_DIA.format(dia)+", tramo="+tramo+"]";
	}
	
	
	
}
