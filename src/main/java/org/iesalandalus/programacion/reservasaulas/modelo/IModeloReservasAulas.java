package org.iesalandalus.programacion.reservasaulas.modelo;

import java.io.IOException;
import java.util.List;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reservasaulas.modelo.dominio.Aula;
import org.iesalandalus.programacion.reservasaulas.modelo.dominio.Profesor;
import org.iesalandalus.programacion.reservasaulas.modelo.dominio.Reserva;
import org.iesalandalus.programacion.reservasaulas.modelo.dominio.permanencia.Permanencia;

public interface IModeloReservasAulas {
	
	public List<Aula> getAulas();
	
	public int getNumAulas();	
	
	public List<String> representarAulas();
	
	public Aula buscarAula(Aula aula);
	
	public void insertarAula(Aula aula) throws OperationNotSupportedException;
	
	public void borrarAula(Aula aula) throws OperationNotSupportedException;
	
	public void leerAulas() throws IOException, ClassNotFoundException;
	
	public void escribirAulas() throws IOException;
	
	public int getNumProfesores();

	public List<Profesor> getProfesores();
	
	public List<String> representarProfesores();
	
	public Profesor buscarProfesor(Profesor profesor);
	
	public void insertarProfesor(Profesor profesor) throws OperationNotSupportedException;
	
	public void borrarProfesor(Profesor profesor) throws OperationNotSupportedException;
	
	public void leerProfesores() throws IOException, ClassNotFoundException;
	
	public void escribirProfesores() throws IOException;
	
	public int getNumReservas();

	public List<Reserva> getReservas();
	
	public List<String> representarReservas();
	
	public Reserva buscarReserva(Reserva reserva);
	
	public void realizarReserva(Reserva reserva) throws OperationNotSupportedException;
	
	public void anularReserva(Reserva reserva) throws OperationNotSupportedException;
	
	public List<Reserva> getReservasAula(Aula aula);
	
	public List<Reserva> getReservasProfesor(Profesor profesor);
	
	public List<Reserva> getReservasPermanencia(Permanencia permanencia);
	
	public boolean consultarDisponibilidad(Aula aula, Permanencia permanencia);
	
	public void leerReservas() throws IOException, ClassNotFoundException;
	
	public void escribirReservas() throws IOException;

}
