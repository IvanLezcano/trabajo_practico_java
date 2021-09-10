package tierra_media;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String nombre;
	private double monedasDisponibles;
	private double tiempoDisponible;
	private Categoria categoriaFavorita;
	private List <Atraccion> sugerenciasAceptadas;
	
	
	public Usuario(String nombre, double monedasDisponibles, double tiempoDisponible, Categoria categoriaFavorita) {
		super();
		this.nombre = nombre;
		this.monedasDisponibles = monedasDisponibles;
		this.tiempoDisponible = tiempoDisponible;
		this.categoriaFavorita = categoriaFavorita;
		sugerenciasAceptadas= new ArrayList();
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getMonedasDisponibles() {
		return monedasDisponibles;
	}


	public void setMonedasDisponibles(double monedasDisponibles) {
		this.monedasDisponibles = monedasDisponibles;
	}


	public double getTiempoDisponible() {
		return tiempoDisponible;
	}


	public void setTiempoDisponible(double tiempoDisponible) {
		this.tiempoDisponible = tiempoDisponible;
	}


	public Categoria getTipoDeAtraccionFavorita() {
		return categoriaFavorita;
	}


	public void setTipoDeAtraccionFavorita(Categoria categoriaFavorita) {
		this.categoriaFavorita = categoriaFavorita;
	}


	public List<Atraccion> getSugerenciasAceptadas() {
		return sugerenciasAceptadas;
	}
	
	
	
	public void pagar(double monto) {
		
		this.setMonedasDisponibles(Math.max(this.getMonedasDisponibles()-monto,0));
		
	};

	public void setSugerenciasAceptadas(List<Atraccion> sugerencias) {
		
		for (Atraccion atraccion : sugerencias) {
			sugerenciasAceptadas.add(atraccion);
		};
		
		
		
	}
	
	
	

	
	
}
