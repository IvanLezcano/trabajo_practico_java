package tierra_media;


public class Atraccion {
	private String nombre; 
	private double valorDeLaAtraccion;
	private double duracionDeLaAtraccion;
	private double cupoLimite;
	private Categoria categoria;
	
	public Atraccion(String nombre, double valorDeLaAtraccion, double duracionDeLaAtraccion, double cupoLimite,
			Categoria categoria) {
		this.nombre = nombre;
		this.valorDeLaAtraccion = valorDeLaAtraccion;
		this.duracionDeLaAtraccion = duracionDeLaAtraccion;
		this.cupoLimite = cupoLimite;
		this.categoria = categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getValorDeLaAtraccion() {
		return valorDeLaAtraccion;
	}

	public void setValorDeLaAtraccion(double valorDeLaAtraccion) {
		this.valorDeLaAtraccion = valorDeLaAtraccion;
	}

	public double getDuracionDeLaAtraccion() {
		return duracionDeLaAtraccion;
	}

	public void setDuracionDeLaAtraccion(double duracionDeLaAtraccion) {
		this.duracionDeLaAtraccion = duracionDeLaAtraccion;
	}

	public double getCupoLimite() {
		return cupoLimite;
	}

	public void setCupoLimite(double cupoLimite) {
		this.cupoLimite = cupoLimite;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public void ofertarse() {
		
	}

}


