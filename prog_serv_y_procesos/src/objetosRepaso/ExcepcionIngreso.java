package objetosRepaso;

public class ExcepcionIngreso extends Exception {
	String smg;

	public ExcepcionIngreso(String smg) {
		this.smg = smg;
	}
}
