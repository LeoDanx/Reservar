package datos.modelos;

public class Habitacion {

	private static int num;
	private TipoHabitacion tipoHabitacion;
	private boolean estatus = true;// false ocupada, true disponible

	public Habitacion(TipoHabitacion tipoHabitacion, int num) {

		this.tipoHabitacion = tipoHabitacion;
		this.estatus = false;
		Habitacion.num = num;
	}

	public int getNum() {

		return num;
	}

	public TipoHabitacion getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	public boolean isEstatus() {
		return estatus;
	}

	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}

	@Override
	public String toString() {
		return "Habitacion [tipoHabitacion=" + tipoHabitacion + ", estatus=" + estatus + "]";
	}

}
