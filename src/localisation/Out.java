/**
 * 
 */
package localisation;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Provides Strings for the game through a Resourcebundle
 * by loading a .properties file from the localisation package
 * 
 * This class should only be imported from the controller.Controller class.
 * @see java.util.ResourceBundle
 */

public class Out {
private ResourceBundle res;

	/**
	 * Constructs a resourcebundle to be used in the program.
	 * This is not build by any objects and is instead only a pointer to the .properties file.
	 */

	public Out() {
		Locale.setDefault(new Locale("en-us","ENG"));
		res = ResourceBundle.getBundle("localisation.LanguagePack");
	}
	
	/**
	 * Return the String from a specific line from the Resourcebundle.
	 * 
	 * @param name A natural number as a String that responds to a line in the Resourcebundle.
	 * @return A String from the Resourcebundle.
	 */
	
	public String getString(String name) {
		return res.getString(name);
	}
}