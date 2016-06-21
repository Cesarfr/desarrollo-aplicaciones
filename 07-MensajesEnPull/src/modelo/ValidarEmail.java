package modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase para validar los emails usando expresiones regulares
 * @author cesar
 * @version 1.0
 *
 */
public class ValidarEmail {

	private Pattern pattern;
	private Matcher matcher;

	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	/**
	 * Constructor de la clase
	 */
	public ValidarEmail() {
		pattern = Pattern.compile(EMAIL_PATTERN);
	}

	/**
	 * Método para validar el email
	 * @param email Email a validar en formato String
	 * @return Objeto de tipo boolean donde true es email valido y false es invalido
	 */
	public boolean validate(final String email) {

		matcher = pattern.matcher(email);
		return matcher.matches();

	}

}
