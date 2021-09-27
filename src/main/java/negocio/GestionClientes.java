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

	public void registrar(Cliente cliente, int noP) {

		ChecaDatos cd = new ChecaDatos();
		cd.escribirArchivo(recurso, cliente, noP, true);
		
	}

}
