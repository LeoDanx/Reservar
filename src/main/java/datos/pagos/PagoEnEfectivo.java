package datos.pagos;

import datos.modelos.Habitacion;

public class PagoEnEfectivo implements IFormaPago {

	public void reservar(double monto, Habitacion hab) {
		// TODO Auto-generated method stub

		if (hab.isEstatus() && hab.getTipoHabitacion().getPrecio() == monto) {

			System.out.println("Se ha reservado la habitaci�n con �xito.");

		} else if (hab.isEstatus() && hab.getTipoHabitacion().getPrecio() < monto) {

			System.out.println("Se ha reservado la habitaci�n con �xito.\nSu cambio es: "
					+ (monto - hab.getTipoHabitacion().getPrecio()));

		} else if (!hab.isEstatus()) {
			System.out.println("La habitaci�n no esta disponible");
		} else {
			System.out.println("El precio de la habitaci�n es de $" + hab.getTipoHabitacion().getPrecio());
		}

	}

}
