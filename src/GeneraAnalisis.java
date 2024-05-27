import java.beans.PropertyChangeListener;
import java.beans.*;
import java.io.Serializable;
import java.util.Date;

public class GeneraAnalisis implements Serializable, PropertyChangeListener {

	private static final long serialVersionUID = 1L;
	private int num_analisis;
	private Paciente paciente;
	private Date fecha;
	private int analisis_pendiente;

	public GeneraAnalisis() {

	}

	public GeneraAnalisis(int num_analisis, Paciente paciente, Date fecha, int analisis_pendiente) {

		this.num_analisis = num_analisis;
		this.paciente = paciente;
		this.fecha = fecha;
		this.analisis_pendiente = analisis_pendiente;

		// Registrando esta instancia como listener para cambios en el paciente
		paciente.addPropertyChangeListener(this);

	}

	public int getNum_analisis() {
		return num_analisis;
	}

	public void setNum_analisis(int num_analisis) {
		this.num_analisis = num_analisis;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;

	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getAnalisis_pendiente() {
		return analisis_pendiente;
	}

	public void setAnalisis_pendiente(int analisis_pendiente) {
		this.analisis_pendiente = analisis_pendiente;
	}

	public void propertyChange(PropertyChangeEvent evt) {
		System.out.printf("Valor anterior de ultimo_hierro: %d%n ", evt.getOldValue());
		System.out.printf("Nuevo valor de ultimo_hierro: %d%n", evt.getNewValue());

		// Accediendo al método getUltimo_hierro en el paciente asociado
		System.out.printf("REALIZAR nuevo analisis: %s%n", paciente.getNombre());

		paciente.getNombre();
	}
}
