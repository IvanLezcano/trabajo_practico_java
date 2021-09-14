package tierra_media;


	import java.util.ArrayList;
import java.util.List;


	public class PromocionDeTresProductosAlCostoDeDos {
		
		private double porcentaje;
		private Atraccion atraccion1;
		private Atraccion atraccion2;
		private Atraccion atraccionGratuita;
		
		public PromocionDeTresProductosAlCostoDeDos(Atraccion atraccion1,Atraccion atraccion2,Atraccion atraccionGratuita) {
			this.atraccion1 = atraccion1;
			this.atraccion2 = atraccion2;
			this.atraccionGratuita = atraccionGratuita;

			this.porcentaje = porcentaje/100;
			
		}
		
		public void pagarPromocion(Usuario usuario){

		    double montoAPagar = this.atraccion1.getValorDeLaAtraccion()+this.atraccion2.getValorDeLaAtraccion();
			usuario.pagar(montoAPagar);
			
				this.atraccion1.setCupoLimite(atraccion1.getCupoLimite()-1);
				this.atraccion2.setCupoLimite(atraccion2.getCupoLimite()-1);
				this.atraccionGratuita.setCupoLimite(atraccionGratuita.getCupoLimite()-1);

			
			 
			usuario.setSugerenciasAceptadas(new ArrayList<Atraccion>(){{ add(atraccion1); add(atraccion2); add(atraccionGratuita); }});
		};
	}
