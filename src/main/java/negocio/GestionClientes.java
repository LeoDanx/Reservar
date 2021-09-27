package negocio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import datos.ChecaDatos;
import datos.modelos.Cliente;
import datos.modelos.Lineas;

public class GestionClientes {

	static final String recurso = "C:\\Users\\XMX2503\\eclipse-workspace\\reservaciones\\src\\main\\resources\\base.txt";

	public void Listar() {

		ChecaDatos cd = new ChecaDatos();
		List<Lineas> ml = new ArrayList<Lineas>();
		ml = cd.LeerArchivo(recurso);

		for (Lineas ln : ml) {

			System.out.println(ln);
		}
	}

	public void registrar(Cliente cliente) {

		ChecaDatos cd = new ChecaDatos();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el numero de personas registradas: ");
		int noP = Integer.parseInt(sc.nextLine());

		if (noP <= cliente.getHabitacion().getTipoHabitacion().getMaxPersonas()) {

			cd.escribirArchivo(recurso, cliente, noP, true);

		} else {
			System.out.println("Se ha excedido el numero de personas por habitación.");
		}

		sc.close();
	}

}
