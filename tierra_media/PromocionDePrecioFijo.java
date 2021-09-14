package tierra_media;

import java.util.Iterator;
import java.util.List;

public class PromocionDePrecioFijo extends Promociones{
	
	private double precioFijo;
	
	
	public PromocionDePrecioFijo(double precioFijo, List<Atraccion> atracciones) {
		this.precioFijo = precioFijo;
		this.atracciones = atracciones;

	}

    
	public void pagarPromocion(Usuario usuario){
		usuario.pagar(this.precioFijo);
		usuario.setSugerenciasAceptadas(this.atracciones);
		for (Atraccion atraccion : atracciones) {
			atraccion.setCupoLimite(atraccion.getCupoLimite()-1);
		}
		/*atracciones.stream().mapToDouble(atraccion -> atraccion.setCupoLimite(atraccion.getCupoLimite()-1));*/
	};
}
