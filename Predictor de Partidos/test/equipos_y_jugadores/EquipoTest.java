/**
 * 
 */
package equipos_y_jugadores;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Antonio
 *
 */
public class EquipoTest {
	Equipo equipo1;
	Equipo equipo2;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		equipo1 = new Equipo("Villareal",44,35,18,10,10,4,4);
		equipo1.setPartidosGanadosCasa(12);
		equipo1.setPartidosEmpatadosCasa(4);
		equipo1.setPartidosPerdidosCasa(3);
		equipo1.setGolesFavorAnterior(50);
		equipo1.setGolesContraAnterior(30);
		equipo1.setGolesFavorCasa(26);
		equipo1.setGolesContraCasa(12);
		equipo1.setPartidosGanadosFuera(6);
		equipo1.setPartidosEmpatadosFuera(6);
		equipo1.setPartidosPerdidosFuera(7);
		
		equipo2 = new Equipo("Sevilla",51,50,14,14,10,7,4);
		equipo2.setPartidosGanadosCasa(14);
		equipo2.setPartidosEmpatadosCasa(1);
		equipo2.setPartidosPerdidosCasa(4);
		equipo2.setGolesFavorAnterior(54);
		equipo2.setGolesContraAnterior(28);
		equipo2.setGolesFavorCasa(38);
		equipo2.setGolesContraCasa(21);
		equipo2.setPartidosGanadosFuera(0);
		equipo2.setPartidosEmpatadosFuera(9);
		equipo2.setPartidosPerdidosFuera(10);

	}

	/**
	 * Test method for {@link equipos_y_jugadores.Equipo#indiceEquipo(boolean)}.
	 */
	@Test
	public final void testIndiceEquipo() {
		System.out.println("Villareal");
		System.out.println("Indice casa: "+equipo1.indiceCasa());
		System.out.println("Indice fuera: "+equipo1.indiceFuera());
		System.out.println("Indice equipo: "+equipo1.indiceEquipo(false));
		System.out.println("Sevilla");
		System.out.println("Indice casa: "+equipo2.indiceCasa());
		System.out.println("Indice fuera: "+equipo2.indiceFuera());
		System.out.println("Indice equipo: "+equipo2.indiceEquipo(true));
		
	}

}