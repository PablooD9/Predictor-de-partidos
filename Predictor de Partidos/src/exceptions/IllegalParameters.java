package exceptions;

/**
 * @author Antonio Payá y Guillermo Díaz
 *
 */
public class IllegalParameters  extends Exception{

	private static final long serialVersionUID = 1L;

	/**
	 * Clase que sirve como controlador de parámetros
	 */
	public IllegalParameters() {
		
	}
	
	public void mayor0(double param){
		if (param < 0){
			throw new RuntimeException("Parámetro incorrecto ya que es menor que 0");
		}
	}
	

}
