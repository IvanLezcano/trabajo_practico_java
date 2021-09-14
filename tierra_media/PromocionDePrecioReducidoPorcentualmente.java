package tierra_media;

import java.util.List;


public class PromocionDePrecioReducidoPorcentualmente extends Promociones {
	
	private double porcentaje;
	
	public PromocionDePrecioReducidoPorcentualmente(double porcentaje,List<Atraccion> atracciones) {
		this.atracciones = atracciones;
		this.porcentaje = porcentaje/100;
		
	}
	
	public void pagarPromocion(Usuario usuario){

	    double montoAPagar = this.atracciones.stream()
	    .mapToDouble(atraccion -> atraccion.getValorDeLaAtraccion()).sum();
	    montoAPagar = montoAPagar-(montoAPagar * porcentaje);
		usuario.pagar(montoAPagar);
		for (Atraccion atraccion : atracciones) {
			atraccion.setCupoLimite(atraccion.getCupoLimite()-1);
		}
		
		usuario.setSugerenciasAceptadas(this.atracciones);
	};
}
