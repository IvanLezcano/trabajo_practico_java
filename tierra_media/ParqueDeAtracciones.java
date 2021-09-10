package tierra_media;

import java.util.ArrayList;

public class ParqueDeAtracciones {

	public static void main(String[] args) {
		Usuario carlitos = new Usuario("carlitos",200,2,Categoria.AVENTURA);
		
		System.out.println(carlitos.getNombre() + " tiene "+ carlitos.getTiempoDisponible()+ " horas disponibles");
		Atraccion mordor = new Atraccion("mordor", 20, 20, 20, Categoria.AVENTURA);
		Atraccion peron = new Atraccion("peron", 20, 20, 20, Categoria.AVENTURA);
		Atraccion calecita = new Atraccion("calecita", 40, 40, 40, Categoria.AVENTURA);
		Atraccion montaña = new Atraccion("montaña", 30, 30, 30, Categoria.AVENTURA);
		Atraccion menem = new Atraccion("menem", 20, 20, 20, Categoria.AVENTURA);
		
		PromocionDePrecioFijo pacpolitico = new PromocionDePrecioFijo(20,new ArrayList<Atraccion>(){{ add(peron); add(mordor); add(menem); }});
		System.out.println(pacpolitico);
		System.out.println(carlitos.getMonedasDisponibles());
		pacpolitico.pagarPromocion(carlitos);
		System.out.println(carlitos.getSugerenciasAceptadas());
		System.out.println(carlitos.getMonedasDisponibles());
		PromocionDePrecioReducidoPorcentualmente pacreal = new PromocionDePrecioReducidoPorcentualmente(20,new ArrayList<Atraccion>(){{add(montaña); add(calecita); }});
		pacreal.pagarPromocion(carlitos);
		System.out.println(carlitos.getMonedasDisponibles());




		System.out.println(mordor.getNombre()+mordor.getCategoria()+mordor.getValorDeLaAtraccion());
	}

}
