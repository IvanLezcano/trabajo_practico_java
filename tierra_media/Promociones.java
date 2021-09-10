package tierra_media;
import java.util.List;



public abstract class Promociones {
	private double costo;
	private double tiempo;
	private double cupo;
	public List<Atraccion> atracciones;
	private Categoria categoria;
	
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public double getTiempo() {
		return tiempo;
	}
	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}
	public double getCupo() {
		return cupo;
	}
	public void setCupo(double cupo) {
		this.cupo = cupo;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public abstract void pagarPromocion(Usuario usuario);
	
	
/*	Promocionesporcentuales pack aventura = new Promocionesporcentuales(atraccion1, atraccion2,porcentaje)
			Promocionesabsolutas pack degustacion = new Promocionesabsolutas(atraccion1, atraccion2,precioAbsoluto)
			promocionesAxB pack terror = new promocionesAxB(atraccion1, atraccion2,atraccion3)*/

}





