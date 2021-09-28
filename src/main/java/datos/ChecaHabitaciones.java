package datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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

}
