package datos.modelos;

import datos.pagos.IFormaPago;
import datos.pagos.PagoConTarjeta;
import datos.pagos.PagoEnEfectivo;

public class Cliente extends Persona {

	private Habitacion habitacion;
	private IFormaPago ifp;
	private String fechaIngreso;
	private String fechaSalida;

	public Cliente(String nombre, int edad, String sexo, String direccion, String email, String celular,
			Habitacion habitacion, String numTarjeta, String fechaVencimiento, double saldo, String fechaIngreso,
			String fechaSalida) {
		super(nombre, edad, sexo, direccion, email, celular);

		this.habitacion = habitacion;
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
		this.ifp = new PagoConTarjeta(numTarjeta, fechaVencimiento, saldo);
	}

	public Cliente(String nombre, int edad, String sexo, String direccion, String email, String celular,
			Habitacion habitacion, String fechaIngreso, String fechaSalida) {

		super(nombre, edad, sexo, direccion, email, celular);
		this.habitacion = habitacion;
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
		this.ifp = new PagoEnEfectivo();
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
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
