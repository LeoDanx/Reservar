package negocio;

import java.util.*;
import datos.*;
import datos.modelos.Lineas;

public class ListarClientes {

	public void Listar() {

		ChecaDatos cd = new ChecaDatos();
		List<Lineas> ml = new ArrayList<Lineas>();
		ml = cd.LeerArchivo("C:\\Users\\XMX2503\\eclipse-workspace\\reservaciones\\src\\main\\resources\\base.txt");

		for (Lineas ln : ml) {

			System.out.println(ln);
		}
	}

}
