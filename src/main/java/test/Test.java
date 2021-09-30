package test;

import java.util.Scanner;

import datos.modelos.Cliente;
import datos.modelos.Habitacion;
import datos.modelos.TipoHabitacion;
import negocio.GestionClientes;
import negocio.GestionHabitaciones;

public class Test {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		//Considerar solo dejar el archico base.txt y hacer las operaciones en base a ese archivo
		//Prevenir la introduccion de clientes repetidos

		GestionClientes lc = new GestionClientes();
		GestionHabitaciones gh = new GestionHabitaciones();
		int op = 0;

		System.out.println("------------Bienvenido------------------");

		do {

			System.out.println("Que desea hacer?\n1)Listar clientes\n2)Registrar Clientes \n3)Buscar\n4)Desocupar\n5)Salir");
			op = Integer.parseInt(sc.nextLine());

			menu(lc, gh, op);

		} while (op != 5);

		sc.close();
	}

	public static void menu(GestionClientes lc, GestionHabitaciones gh, int op) {

		switch (op) {

		case 1:

			lc.Listar();

			break;

		case 2:
			System.out.println("Ingrese su nombre ");
			String nombre = sc.nextLine();
			System.out.println("Ingrese su edad ");
			int edad = Integer.parseInt(sc.nextLine());
			System.out.println("Ingrese su sexo ");
			String sexo = sc.nextLine();
			System.out.println("Ingrese su direccion ");
			String direccion = sc.nextLine();
			System.out.println("Ingrese su email ");
			String email = sc.nextLine();
			System.out.println("Ingrese su celular ");
			String celular = sc.nextLine();

			System.out.println("Elija tipo de habitacion: \n1)Individual\n2)Doble\n3)Queen\n4)King\n5)Suite");
			int tipo = Integer.parseInt(sc.nextLine());

			boolean check = false;
			int num = 0;

			do {

				System.out.println("Ingrese numero de habitacion ");
				num = Integer.parseInt(sc.nextLine());
				check = gh.disponibilidad(num);

				// Comprobamos que la habitacion este disponible
				// true lo encontro, false no lo encontro
				if (check) {

					System.out.println("Habitacion ocupada. Elija otra.");

				} else {

					gh.ocupar(num);
					check = false;
				}

			} while (check);

			TipoHabitacion t = null;

			switch (tipo) {

			case 1:
				t = TipoHabitacion.INDIVIDUAL;
				break;

			case 2:
				t = TipoHabitacion.DOBLE;
				break;
			case 3:
				t = TipoHabitacion.QUEEN;
				break;
			case 4:
				t = TipoHabitacion.KING;
				break;
			case 5:
				t = TipoHabitacion.SUITE;
				break;

			}

			int noP = 0;
			boolean ver = false;

			do {

				System.out.println(
						"Teclee el numero de personas a ingresar.(Max " + t.getMaxPersonas() + " persona(s)).");
				noP = Integer.parseInt(sc.nextLine());

				if (noP > t.getMaxPersonas()) {

					System.out.println("Se ha excedido el numero de personas por habitación.");

				} else {
					ver = true;
				}

			} while (!ver);

			System.out.println("Ingrese su fecha de ingreso ");
			String fecha1 = sc.nextLine();
			System.out.println("Ingrese su fecha de salida ");
			String fecha2 = sc.nextLine();
			System.out.println("Seleccione tipo de pago: \n1)Tarjeta\n2)Efectivo ");
			int tipo2 = Integer.parseInt(sc.nextLine());

			if (tipo2 == 1) {

				System.out.println("Ingrese el numero de tarjeta");
				String tarjeta = sc.nextLine();
				System.out.println("Introduce la fecha de vencimiento");
				String vencimiento = sc.nextLine();
				System.out.println("Ingresa saldo");
				double saldo = Double.parseDouble(sc.nextLine());

				lc.registrar(new Cliente(nombre, edad, sexo, direccion, email, celular, new Habitacion(t, num), tarjeta,
						vencimiento, saldo, fecha1, fecha2), noP);

			} else {

				lc.registrar(new Cliente(nombre, edad, sexo, direccion, email, celular, new Habitacion(t, num), fecha1,
						fecha2), noP);
			}

			break;

		case 3:

			System.out.println("Ingrese el correo del cliente a buscar");
			String correo = sc.nextLine();
			lc.buscarCliente(correo);

			break;

		case 4:
			System.out.println("Escriba el numero de habitacion a desocupar");
			int num2 = Integer.parseInt(sc.nextLine());
			gh.desocupar(num2);
			break;
		case 5:
			System.out.println("Has salido del programa.");
			break;

		default:
			System.out.println("Opcion incorrecta");
			break;

		}

	}

}
