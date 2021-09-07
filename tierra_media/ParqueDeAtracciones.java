package tierra_media;

public class ParqueDeAtracciones {

	public static void main(String[] args) {
		Usuario carlitos = new Usuario("carlitos",200,2,"atraccion loca");
		
		System.out.println(carlitos.getNombre() + " tiene "+ carlitos.getTiempoDisponible()+ " horas disponibles");
		Atracciones mordor = new Atracciones("mordor", 20, 20, 20, Categorias.AVENTURA);
		System.out.println(mordor.getNombre()+mordor.getCategoria()+mordor.getValorDeLaAtraccion());
	}

}
