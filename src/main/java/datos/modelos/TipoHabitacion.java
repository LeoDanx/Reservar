package datos.modelos;

public enum TipoHabitacion {
	
	INDIVIDUAL(1,1,1,"individual",500.00,
			"Habitacion para una persona. Incluye ba�o, servicio a habitaci�n, televisi�n e internet"),
	DOBLE(2,1,2,"individual",800.00, "Habitacion para dos personas. Incluye ba�o, servicio a habitaci�n, televisi�n e internet"),
	QUEEN(1,1,4, "matrimonial",1200.00,"Habitacion para una persona. Incluye ba�o, servicio a habitaci�n, televisi�n e internet"),
	KING(1,1,6, "king-size", 1500.00, "Habitacion para una persona. Incluye ba�o, servicio a habitaci�n, televisi�n e internet"),
	SUITE(3, 3,12, "king-size",2500.00,
			"Habitacion para siete personas m�ximo. Incluye un sal�n, servicio de bar, sal�n de juegos, 1 ba�o por habitaci�n, terraza con piscina,televisi�n e internet");

	private int cantidadCamas;
	private int numDormitorios;
	private int maxPersonas;
	private String tamCamas;
	private double precio;
	private String descripcion;

	TipoHabitacion(int cantidadCamas, int numDormitorios, int maxPersonas, String tamCamas, double precio, String descripcion) {

		this.cantidadCamas = cantidadCamas;
		this.tamCamas = tamCamas;
		this.maxPersonas = maxPersonas;
		this.descripcion = descripcion;
		this.precio = precio;
		this.numDormitorios = numDormitorios;
	}

	public int getMaxPersonas() {
		return maxPersonas;
	}

	public void setMaxPersonas(int maxPersonas) {
		this.maxPersonas = maxPersonas;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getNumDormitorios() {
		return numDormitorios;
	}

	public void setNumDormitorios(int numDormitorios) {
		this.numDormitorios = numDormitorios;
	}

	public int getCantidadCamas() {
		return cantidadCamas;
	}

	public void setCantidadCamas(int cantidadCamas) {
		this.cantidadCamas = cantidadCamas;
	}

	public String getTamCamas() {
		return tamCamas;
	}

	public void setTamCamas(String tamCamas) {
		this.tamCamas = tamCamas;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
