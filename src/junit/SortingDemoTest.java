package junit;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import sortingDemo.SortingStrings;

public class SortingDemoTest {
	SortingStrings srtStrings=null;
	
@Before
 public void setUp(){
	srtStrings=new  SortingStrings();	
}
	
	@Test
	public void testNullValuessortingStringWithLibrary() {					
		assertTrue(null==srtStrings.sortingStrings(null));		
	}
	
	@Test
	public void testEmptyValuessortingStringWithLibrary() {		
		
		assertTrue("".equals(srtStrings.sortingStrings("  ")));
		
	}
	
	@Test
	public void testSortingsortingStringWithLibrary() {	
		String givenInput = "When not studying nuclear physics,Bambi likes to play beach volleyball.";
		String sortedString="aaaaabbbbcccdeeeeeghhhiiiiklllllllmnnnnooopprsssstttuuvwyyyy";			
		assertTrue("deemostt".equals(srtStrings.sortingStrings("demo test.")));
		assertTrue(sortedString.equals(srtStrings.sortingStrings(givenInput)));
		
		
	}
	
	

}
