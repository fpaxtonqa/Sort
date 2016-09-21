package Test;

import static org.junit.Assert.*;

import Sort.Sort;

import org.junit.Test;

public class SortTest {
	
	Sort sort = new Sort();

	@Test
	public void test() {
		
		
		assertEquals(4, sort.main().length);
		
	}

}
