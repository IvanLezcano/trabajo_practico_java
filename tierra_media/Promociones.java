package tierra_media;
import java.util.List;



public abstract class Promociones {
	private int costo;
	private double tiempo;
	private int cupo;
	public List<Atraccion> atracciones;
	private Categoria categoria;
	
	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}
	public double getTiempo() {
		return tiempo;
	}
	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}
	public int getCupo() {
		return cupo;
	}
	public void setCupo(int cupo) {
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





