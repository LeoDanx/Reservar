package datos;

import java.io.*;
import java.util.*;

import datos.modelos.TipoHabitacion;

public class ChecaHabitaciones {

	public boolean disponible(String recurso, int num) {

		File archivo = new File(recurso);
		boolean ver = false;
		int i = 0;

		try {
			BufferedReader entrada = new BufferedReader(new FileReader(archivo));
			String linea = entrada.readLine();
			String elementos[] = null;

			while (linea != null) {
				i++;
				elementos = linea.split("\\|");

				if (i > 1 && num == Integer.parseInt(elementos[0])) {
					ver = true;// true es que no esta disponible
				}

				linea = entrada.readLine();

			}

			entrada.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ver;
	}

	public void desocupar(String recurso, int num) {

		File archivo = new File(recurso);
		BufferedReader entrada;
		boolean check = false;
		String elementos[] = null;

		try {
			// Se tiene que borrar del archivo base.txt el cliente con dicha habitación
			entrada = new BufferedReader(new FileReader(archivo));
			String linea = entrada.readLine();
			List<String> clientes = new ArrayList<String>();
			int indice = 0;

			while (linea != null) {
				indice++;
				elementos = linea.split("\\|");

				if (indice > 1 && num == Integer.parseInt(elementos[0])) {

					linea = "";
					check = true;
				}

				clientes.add(linea);

				linea = entrada.readLine();

				// Considerar una funcion para prevenir saltos en blanco en archivo
			}

			entrada.close();

			if (check) {

				PrintWriter pw = new PrintWriter(new FileWriter(archivo, false));

				for (String s : clientes) {

					if (!s.isBlank()) {
						pw.println(s);
					}
				}

				pw.close();

				System.out.println("Se ha desocupado la habitacion con el num " + num);

			} else {
				System.out.println("La habitacion no esta ocupada");
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public boolean comprobarTipo(TipoHabitacion t, int num) {

		boolean verif = false;

		switch (t) {

		case INDIVIDUAL:

			if (num >= 1 && num <= 5) {

				verif = true;// ok
			}

			break;

		case DOBLE:
			if (num >= 6 && num <= 10) {

				verif = true;// ok
			}

			break;

		case QUEEN:
			if (num >= 11 && num <= 15) {

				verif = true;// ok
			}

			break;

		case KING:
			if (num >= 16 && num <= 20) {

				verif = true;// ok
			}

			break;

		case SUITE:
			if (num >= 21 && num <= 25) {

				verif = true;// ok
			}

			break;

		default:
			System.out.println("Ingrese un tipo válido.");
			break;

		}

		return verif;
	}

}
