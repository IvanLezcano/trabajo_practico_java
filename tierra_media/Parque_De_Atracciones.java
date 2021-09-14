package tierra_media;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Parque_De_Atracciones {
	static Scanner scan = new Scanner(System.in);

	public static void abrir_el_parque() {

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader("src/archivos/atracciones.txt");
			br = new BufferedReader(fr);

			String linea = br.readLine();

			while ((linea = br.readLine()) != null) {
				try {
					String[] datos = linea.split(",");
					System.out.println(datos[4]);
					String nombre = datos[0];
					Double valor = Double.parseDouble(datos[1]);
					Double duracion = Double.parseDouble(datos[2]);
					Double cupo = Double.parseDouble(datos[3]);
					String categoria = datos[4].toUpperCase();
					System.out.println(categoria);

					
					Atraccion atraccionnueva = new Atraccion(nombre,valor,duracion,cupo,Categoria.AVENTURA);
				}

				catch (Exception e) {
					e.getMessage();
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	

		Usuario carlitos = new Usuario("carlitos", 200, 2, Categoria.AVENTURA);

		/*try (FileWriter fw = new FileWriter("myfile.txt", true);
				BufferedWriter bw = new BufferedWriter(fw);

				PrintWriter out = new PrintWriter(bw)) {
			out.println("usuario dinero tiempo");
			// more code

		} catch (IOException e) {
			// exception handling left as an exercise for the reader
		}

	
		 * System.out.println("che pone un numero"); int numero = scan.nextInt();
		 * 
		 * carlitos.agendar();
		 * System.out.println(carlitos.leerTxt("src/archivos/"+carlitos.getNombre()+
		 * ".txt"));
		 * 
		 * System.out.println(carlitos.getNombre() + " tiene "+
		 * carlitos.getTiempoDisponible()+ " horas disponibles");
		 * 
		 * PromocionDePrecioFijo pacpolitico = new PromocionDePrecioFijo(20,new
		 * ArrayList<Atraccion>(){{ add(subeybaja); add(mordor); add(tusam); }});
		 * 
		 * System.out.println(carlitos.getMonedasDisponibles());
		 * pacpolitico.pagarPromocion(carlitos);
		 * 
		 * System.out.println(carlitos.getSugerenciasAceptadas());
		 * System.out.println(carlitos.getMonedasDisponibles());
		 * PromocionDePrecioReducidoPorcentualmente pacreal = new
		 * PromocionDePrecioReducidoPorcentualmente(20,new
		 * ArrayList<Atraccion>(){{add(montaña); add(calecita); }});
		 * pacreal.pagarPromocion(carlitos);
		 * System.out.println(carlitos.getMonedasDisponibles());
		 * System.out.println(carlitos.getSugerenciasAceptadas());
		 * PromocionDeTresProductosAlCostoDeDos pacx2 = new
		 * PromocionDeTresProductosAlCostoDeDos(mordor,tusam,calecita);
		 * pacx2.pagarPromocion(carlitos);
		 * System.out.println(carlitos.getMonedasDisponibles());
		 * System.out.println(carlitos.getSugerenciasAceptadas());
		 * 
		 * System.out.println(numero);
		 */

	}

}
