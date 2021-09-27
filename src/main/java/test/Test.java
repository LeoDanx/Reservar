package test;

import datos.modelos.Cliente;
import datos.modelos.Habitacion;
import datos.modelos.TipoHabitacion;
import negocio.GestionClientes;

public class Test {

	public static void main(String[] args) {

		GestionClientes lc = new GestionClientes();
		lc.Listar();

		Habitacion hab = new Habitacion(TipoHabitacion.DOBLE, 3);
		Cliente cliente = new Cliente("Rogelio Cruz", 23, "Masculino", "C. Roma lt 13 mz 24 col. Miguel Ramos",
				"rogcruz@gmail.com", "5534567721", hab, "4521322455567894", "25-09-2024", 13000,"25-09-2021","26-09-2021");
		
		lc.registrar(cliente);
		
		lc.Listar();
	}

}
