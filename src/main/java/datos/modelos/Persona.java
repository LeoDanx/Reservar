package datos.modelos;

public class Persona {

	private String nombre;
	private int edad;
	private String sexo;
	private String direccion;
	private String email;
	private String celular;

	public Persona(String nombre, int edad, String sexo, String direccion, String email, String celular) {

		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.direccion = direccion;
		this.email = email;
		this.celular = celular;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", direccion=" + direccion
				+ ", email=" + email + ", celular=" + celular + "]";
	}

}
