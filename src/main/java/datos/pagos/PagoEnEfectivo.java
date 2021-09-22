package datos.pagos;

import datos.modelos.Habitacion;

public class PagoEnEfectivo implements IFormaPago {

	public void reservar(double monto, Habitacion hab) {
		// TODO Auto-generated method stub

		if (hab.isEstatus() && hab.getTipoHabitacion().getPrecio() == monto) {

			System.out.println("Se ha reservado la habitación con éxito.");

		} else if (hab.isEstatus() && hab.getTipoHabitacion().getPrecio() < monto) {

			System.out.println("Se ha reservado la habitación con éxito.\nSu cambio es: "
					+ (monto - hab.getTipoHabitacion().getPrecio()));

		} else if (!hab.isEstatus()) {
			System.out.println("La habitación no esta disponible");
		} else {
			System.out.println("El precio de la habitación es de $" + hab.getTipoHabitacion().getPrecio());
		}

	}

}
