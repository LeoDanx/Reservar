package negocio;

import datos.ChecaHabitaciones;
import datos.modelos.TipoHabitacion;

public class GestionHabitaciones {

	static final String recurso = "C:\\Users\\XMX2503\\eclipse-workspace\\reservaciones\\src\\main\\resources\\habitacionesOcupadas.txt";

	public boolean disponibilidad(int num) {

		ChecaHabitaciones ch = new ChecaHabitaciones();
		boolean ver = ch.disponible(recurso, num);

		return ver;

	}

	// Se asegura que el tipo de habitacion sea el correspondiente al designado
	public boolean comprobarHabitacion(TipoHabitacion tipo, int num) {

		ChecaHabitaciones ch = new ChecaHabitaciones();
		boolean ver = ch.comprobarTipo(tipo, num);

		return ver;
	}

	public void ocupar(int num) {

		ChecaHabitaciones ch = new ChecaHabitaciones();
		ch.ocupar(recurso, num);

	}

	public void desocupar(int num) {

		ChecaHabitaciones ch = new ChecaHabitaciones();
		ch.desocupar(recurso, GestionClientes.recurso, num);

	}

}
