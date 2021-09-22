package datos.modelos;

public class Lineas {

	private String contenido;
	private int numeroLinea;

	public Lineas(String contenido, int numeroLinea) {

		this.contenido = contenido;
		this.numeroLinea = numeroLinea;
	}

	public String getContenido() {
		return contenido;
	}

	public int getNumeroLinea() {
		return numeroLinea;
	}

	@Override
	public String toString() {
		return contenido;
	}

}
