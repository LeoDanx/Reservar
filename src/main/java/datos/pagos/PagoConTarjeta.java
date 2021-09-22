package datos.pagos;

import datos.modelos.Habitacion;

public class PagoConTarjeta implements IFormaPago {

	private String numTarjeta;
	private String fechaVencimiento;// Implementar con date en futuras implementaciones
	private double saldo;

	public PagoConTarjeta(String numTarjeta, String fechaVencimiento, double saldo) {

		this.numTarjeta = numTarjeta;
		this.fechaVencimiento = fechaVencimiento;
		this.saldo = saldo;
	}

	public void reservar(double monto, Habitacion hab) {
		// TODO Auto-generated method stub
		if (saldo >= monto && hab.isEstatus()) {
			saldo -= monto;
			System.out.println("Se ha reservado con exito.");

		} else if (monto > saldo) {

			System.out.println("No hay saldo suficiente en la tarjeta");
		} else {

			System.out.println("La habitacion no se encuentra disponible.");
		}

	}

}
