/*
 * generated by Xtext 2.25.0
 */
package greenhouse.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class GreenHouseAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("greenhouse/parser/antlr/internal/InternalGreenHouse.tokens");
	}
}