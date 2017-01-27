import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import org.junit.Test;


public class MyStringsTest {

	MyStrings str = new MyStrings();		
	ArrayList<String> searchItems = new ArrayList<String>();
	ArrayList<String> foundItems = new ArrayList<String>();
			 	
	@Test
	public void testFindInLongString() {
		str.myLongString = "The quick brown fox jumps over the lazy dog";
		
		searchItems.add("fox");
		foundItems = str.FindInLongString(searchItems);
		assertEquals("Should Find Fox, Count is 1", 1, foundItems.size());
		searchItems.clear();		
				
		searchItems.add("cow");
		foundItems = str.FindInLongString(searchItems);
		assertEquals("Should not find Cow, Count is 0", 0, foundItems.size());
		searchItems.clear();
		
		searchItems.add("fox");
		searchItems.add("dog");
		searchItems.add("cow");
		foundItems = str.FindInLongString(searchItems);
		assertEquals("Should Find Fox and dog but not cow, Count is 2", 2, foundItems.size());
		searchItems.clear();
		
		
	}

	
	
}
