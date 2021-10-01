package negocio;

import datos.ChecaHabitaciones;
import datos.modelos.TipoHabitacion;

public class GestionHabitaciones {

	public boolean disponibilidad(int num) {

		ChecaHabitaciones ch = new ChecaHabitaciones();
		boolean ver = ch.disponible(GestionClientes.recurso, num);

		return ver;

	}

	// Se asegura que el tipo de habitacion sea el correspondiente al designado
	public boolean comprobarHabitacion(TipoHabitacion tipo, int num) {

		ChecaHabitaciones ch = new ChecaHabitaciones();
		boolean ver = ch.comprobarTipo(tipo, num);

		return ver;
	}

	public void desocupar(int num) {

		ChecaHabitaciones ch = new ChecaHabitaciones();
		ch.desocupar(GestionClientes.recurso, num);

	}

}
