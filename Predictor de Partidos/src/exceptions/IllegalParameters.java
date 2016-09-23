package exceptions;

/**
 * @author Antonio Pay� y Guillermo D�az
 *
 */
public class IllegalParameters  extends Exception{

	private static final long serialVersionUID = 1L;

	/**
	 * Clase que sirve como controlador de par�metros
	 */
	public IllegalParameters() {
		
	}
	
	public void mayor0(double param){
		if (param < 0){
			throw new RuntimeException("Par�metro incorrecto ya que es menor que 0");
		}
	}
	

}
