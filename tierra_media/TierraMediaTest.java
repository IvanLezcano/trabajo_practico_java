package tierra_media;

import static org.junit.Assert.*;

import org.junit.Test;

public class TierraMediaTest {
	
	Atraccion mordor = new Atraccion("mordor", 40, 2, 30, Categoria.AVENTURA);

	@Test
	public void creandoUnaAtraccionYQueCoincidanSusDatos() {
		assertEquals("mordor",mordor.getNombre());
		assertEquals(Categoria.AVENTURA,mordor.getCategoria());
		assertEquals(30.0, mordor.getCupoLimite(), 0.0001);		
		assertEquals("mordor",mordor.getNombre());
	}

}
