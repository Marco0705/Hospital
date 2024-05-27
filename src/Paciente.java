import java.beans.PropertyChangeListener;
import java.io.Serializable;
import java.beans.PropertyChangeSupport;

public class Paciente implements Serializable {
	private String nombre;
	private String apellido;
	private int edad;
	private int telefono;
	private int ultimo_hierro;
	private int ultimo_urea;

	private PropertyChangeSupport propertySupport;

	public Paciente() {

	}

	public Paciente(String nombre, String apellido, int edad, int telefono, int ultimo_hierro, int ultimo_urea) {
		propertySupport = new PropertyChangeSupport(this);
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
		this.ultimo_hierro = ultimo_hierro;
		this.ultimo_urea = ultimo_urea;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getUltimo_hierro() {
		return ultimo_hierro;
	}

	public void setUltimo_hierro(int nuevoValorUltimoHierro) {
		int valorAnterior = this.ultimo_hierro;
		this.ultimo_hierro = nuevoValorUltimoHierro;

		if (this.ultimo_hierro != valorAnterior) {
			propertySupport.firePropertyChange("ultimo_hierro", valorAnterior, this.ultimo_hierro);
		}
	}

	public int getUltimo_urea() {
		return ultimo_urea;
	}

	public void setUltimo_urea(int ultimo_urea) {
		this.ultimo_urea = ultimo_urea;
	}

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		propertySupport.addPropertyChangeListener(listener);
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
		propertySupport.removePropertyChangeListener(listener);
	}

}
