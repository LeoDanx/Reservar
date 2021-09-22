package datos.modelos;

import datos.pagos.IFormaPago;
import datos.pagos.PagoConTarjeta;
import datos.pagos.PagoEnEfectivo;

public class Cliente extends Persona {

	private Habitacion habitacion;
	private IFormaPago ifp;

	public Cliente(String nombre, int edad, String sexo, String direccion, String email, String celular,
			Habitacion habitacion, String numTarjeta, String fechaVencimiento, double saldo) {
		super(nombre, edad, sexo, direccion, email, celular);
		this.habitacion = habitacion;
		this.ifp = new PagoConTarjeta(numTarjeta, fechaVencimiento, saldo);
	}

	public Cliente(String nombre, int edad, String sexo, String direccion, String email, String celular,
			Habitacion habitacion) {

		super(nombre, edad, sexo, direccion, email, celular);
		this.habitacion = habitacion;
		this.ifp = new PagoEnEfectivo();
	}

	public Habitacion getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}

	public IFormaPago getIfp() {
		return ifp;
	}

	public void setIfp(IFormaPago ifp) {
		this.ifp = ifp;
	}

}
