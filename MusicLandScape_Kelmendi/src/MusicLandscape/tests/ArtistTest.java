// **************************************************
// 
//       git.rev = 234
//  git.revision = fdd4980be270473bdd7e8206afeda65ab6e4c3a4
//         stage = ES03
//
// ***************************************************



package MusicLandscape.tests;

import java.lang.reflect.Field;

import org.mockito.internal.util.reflection.Whitebox;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import MusicLandscape.entities.*;

import static org.mockito.Mockito.mock;
import static org.testng.Assert.*;

/**
 * 
 * @author TeM
 * @version 234
 * @Stage ES03
 *
 */
public class ArtistTest {

	@DataProvider(name = "names2")
	private static Object[][] names2() {
		return new Object[][] { { null, "unknown" }, { "kiss", "kiss" },
				{ "", "unknown" }, { "  ", "unknown" },
				{ "Jon Bon Jovi", "Jon Bon Jovi" } };
	}
		
	 
	
	/**************** ES 03 ***********************/
	@Test(dataProvider = "names2")
	public void testtoString(String in, String out) {
		
		boolean myTest=(new Artist(in).toString()==out)||
				(new Artist(in).toString()==in);
		assertEquals(myTest, true);
	}
	


	

	
}
