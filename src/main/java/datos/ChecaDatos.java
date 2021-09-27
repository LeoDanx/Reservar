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

import datos.modelos.Cliente;
import datos.modelos.Habitacion;
import datos.modelos.Lineas;
import datos.pagos.PagoConTarjeta;

public class ChecaDatos {

	public void crear(String nombreRecurso) {
		File archivo = new File(nombreRecurso);
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(archivo));
			salida.close();
			System.out.println("Se ha creado el archivo");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public List<Lineas> LeerArchivo(String nombreRecurso) {

		File archivo = new File(nombreRecurso);
		int cuentaLinea = 0;
		List<Lineas> miLinea = new ArrayList<Lineas>();

		try {
			BufferedReader entrada = new BufferedReader(new FileReader(archivo));
			String linea = null;
			linea = entrada.readLine();

			while (linea != null) {
				cuentaLinea++;

				if (cuentaLinea > 1) {

					miLinea.add(new Lineas(linea, (cuentaLinea - 1)));

				}

				linea = entrada.readLine();
			}
			entrada.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();

		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return miLinea;
	}

	public void escribirArchivo(String nombreRecurso, Cliente cliente, int noPersonas, boolean anexar) {

		File miArchivo = new File(nombreRecurso);

		try {
			PrintWriter pw = new PrintWriter(new FileWriter(miArchivo));
			pw.print(cliente.getHabitacion().getNum() + "|" + cliente.getNombre() + "|" + cliente.getEdad() + "|"
					+ cliente.getSexo() + "|" + cliente.getDireccion() + "|" + cliente.getEmail() + "|"
					+ cliente.getCelular() + "|" + cliente.getHabitacion().getTipoHabitacion().name() + "|" + noPersonas
					+ "|" + cliente.getHabitacion().getTipoHabitacion().getPrecio() + "|"
					+ (cliente.getIfp() instanceof PagoConTarjeta ? "Tarjeta" : "Efectivo") + "|"
					+ (cliente.getHabitacion().getTipoHabitacion().getPrecio() * noPersonas));
			
			System.out.println("Se ha escrito en archivo correctamente");
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error al escribir archivo.");
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error al escribir archivo.");
			e.printStackTrace();
		}

	}

}
