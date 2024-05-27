public class Hospital {

	public static void main(String[] args) {

		Paciente paciente1 = new Paciente("Joe", "pris", 30, 630009, 10, 44444);
		GeneraAnalisis analisis1 = new GeneraAnalisis();
		analisis1.setPaciente(paciente1);
		paciente1.addPropertyChangeListener(analisis1);

		paciente1.setUltimo_hierro(12);

	}
}
