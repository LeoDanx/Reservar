package datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ChecaHabitaciones {

	public boolean disponible(String recurso, int num) {

		// Individual 1-5//Doble 6-10//Queen 11-15
		// King 16-20//Suite 21-25
		File archivo = new File(recurso);
		boolean ver = false;

		try {
			BufferedReader entrada = new BufferedReader(new FileReader(archivo));
			String linea = entrada.readLine();
			String elementos[] = null;

			while (linea != null) {

				elementos = linea.split("\\|");

				for (String s : elementos) {

					if (num == Integer.parseInt(s)) {
						ver = true;
					}
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

	public void ocupar(String recurso, int num) {

		File archivo = new File(recurso);

		try {
			PrintWriter pw = new PrintWriter(new FileWriter(recurso, true));
			pw.print(num + "|");

			System.out.println("La habitacion numero " + num + " ha sido ocupada.");
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void desocupar(String recurso, String recurso2, int num) {

		File archivo = new File(recurso);
		File archivo2 = new File(recurso2);
		BufferedReader entrada, entrada2;
		boolean check = false;
		String elementos[] = null;

		try {
			entrada = new BufferedReader(new FileReader(archivo));
			String linea = null;
			linea = entrada.readLine();

			while (linea != null) {

				elementos = linea.split("\\|");

				for (int i = 0; i < elementos.length; i++) {

					if (num == Integer.parseInt(elementos[i])) {

						elementos[i] = "";
						check = true;
					}
				}

				linea = entrada.readLine();
			}

			entrada.close();

			if (check) {

				PrintWriter pw = new PrintWriter(new FileWriter(archivo, false));

				for (int i = 0; i < elementos.length; i++) {

					if (!elementos[i].isBlank()) {
						pw.print(elementos[i] + "|");
					}
				}

				
				pw.close();
				
				//Se tiene que borrar del archivo base.txt el cliente con dicha habitación
				entrada2 = new BufferedReader(new FileReader(archivo2));
				linea = entrada2.readLine();
				List<String> clientes = new ArrayList<String>();
				int indice=0;

				while (linea != null) {
					indice++;
					elementos = linea.split("\\|");

					if ( indice>1 && num == Integer.parseInt(elementos[0])) {

						linea = "";
					}

					clientes.add(linea);

					linea = entrada2.readLine();

					// Considerar una funcion para prevenir saltos en blanco en archivo
				}
				
				entrada2.close();
				
				PrintWriter pw2 = new PrintWriter(new FileWriter(archivo2, false));

				for (String s: clientes) {

					if (!s.isBlank()) {
						pw2.println(s);
					}
				}

				
				pw2.close();
				
				System.out.println("Se ha desocupado la habitacion con el num " + num);

			} else {

				System.out.println("La habitación no esta ocupada");
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
