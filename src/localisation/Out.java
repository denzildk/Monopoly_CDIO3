/**
 * 
 */
package localisation;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Stonecore
 *
 */
public class Out {
private ResourceBundle res;
	public Out() {
		Locale.setDefault(new Locale("en-us","ENG"));
		res = ResourceBundle.getBundle("localisation.LanguagePack");
	}
	public String getString(String name) {
		return res.getString(name);
	}


}
