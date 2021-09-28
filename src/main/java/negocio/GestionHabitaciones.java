package negocio;

import datos.ChecaHabitaciones;

public class GestionHabitaciones {

	static final String recurso = "C:\\Users\\XMX2503\\eclipse-workspace\\reservaciones\\src\\main\\resources\\habitacionesOcupadas.txt";

	public boolean disponibilidad(int num) {

		ChecaHabitaciones ch = new ChecaHabitaciones();
		boolean ver = ch.disponible(recurso, num);

		return ver;

	}
	
	public void ocupar(int num){
		
		ChecaHabitaciones ch = new ChecaHabitaciones(); 
		ch.ocupar(recurso, num);
		
	}

}
