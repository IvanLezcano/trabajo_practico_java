package tierra_media;

import java.util.List;

public class Usuario {
	
	private String nombre;
	private double monedasDisponibles;
	private double tiempoDisponible;
	private String tipoDeAtraccionFavorita;
	private List <Atracciones> SugerenciasAceptadas;
	
	
	public Usuario(String nombre, double monedasDisponibles, double tiempoDisponible, String tipoDeAtraccionFavorita) {
		super();
		this.nombre = nombre;
		this.monedasDisponibles = monedasDisponibles;
		this.tiempoDisponible = tiempoDisponible;
		this.tipoDeAtraccionFavorita = tipoDeAtraccionFavorita;
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


	public String getTipoDeAtraccionFavorita() {
		return tipoDeAtraccionFavorita;
	}


	public void setTipoDeAtraccionFavorita(String tipoDeAtraccionFavorita) {
		this.tipoDeAtraccionFavorita = tipoDeAtraccionFavorita;
	}


	public List<Atracciones> getSugerenciasAceptadas() {
		return SugerenciasAceptadas;
	}


	public void setSugerenciasAceptadas(List<Atracciones> sugerenciasAceptadas) {
		SugerenciasAceptadas = sugerenciasAceptadas;
	}
	
	
	

	
	
}
