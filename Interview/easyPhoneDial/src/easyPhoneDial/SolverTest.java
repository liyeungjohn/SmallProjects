package easyPhoneDial;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolverTest {

	@Test
	public void testisEasyDialing() {
		assertTrue(Solver.isEasyDialing("2547096"));
		assertTrue(Solver.isEasyDialing("5547521"));
		
		assertFalse(Solver.isEasyDialing("2806547"));
		assertFalse(Solver.isEasyDialing("3558123"));

	}
	
	@Test
	public void testIsNeighbor() {
		assertTrue(Solver.isNeighbor(0,8));
		assertTrue(Solver.isNeighbor(0,7));
		assertTrue(Solver.isNeighbor(0,9));
		assertTrue(Solver.isNeighbor(7,4));
		assertTrue(Solver.isNeighbor(7,5));
		assertTrue(Solver.isNeighbor(7,8));
		assertTrue(Solver.isNeighbor(8,4));
		assertTrue(Solver.isNeighbor(8,5));
		assertTrue(Solver.isNeighbor(8,6));
		assertTrue(Solver.isNeighbor(8,9));
		assertTrue(Solver.isNeighbor(9,5));
		assertTrue(Solver.isNeighbor(9,6));

		assertTrue(Solver.isNeighbor(1,2));
		
		assertFalse(Solver.isNeighbor(1,3));
		assertFalse(Solver.isNeighbor(1,6));
		assertFalse(Solver.isNeighbor(1,7));
		assertFalse(Solver.isNeighbor(1,8));
		assertFalse(Solver.isNeighbor(1,9));



		
	}
	
	@Test
	public void testCoord() {

		int [] coord = Solver.getCoordinates(1);
		assertEquals(0, coord[0]);
		assertEquals(0, coord[1]);
		
		coord = Solver.getCoordinates(2);
		assertEquals(1, coord[0]);
		assertEquals(0, coord[1]);
		
		coord = Solver.getCoordinates(3);
		assertEquals(2, coord[0]);
		assertEquals(0, coord[1]);
		
		coord = Solver.getCoordinates(4);
		assertEquals(0, coord[0]);
		assertEquals(1, coord[1]);
		
		coord = Solver.getCoordinates(5);
		assertEquals(1, coord[0]);
		assertEquals(1, coord[1]);
		
		coord = Solver.getCoordinates(6);
		assertEquals(2, coord[0]);
		assertEquals(1, coord[1]);
		
		coord = Solver.getCoordinates(7);
		assertEquals(0, coord[0]);
		assertEquals(2, coord[1]);
		
		coord = Solver.getCoordinates(8);
		assertEquals(1, coord[0]);
		assertEquals(2, coord[1]);
		
		coord = Solver.getCoordinates(9);
		assertEquals(2, coord[0]);
		assertEquals(2, coord[1]);
		
		coord = Solver.getCoordinates(0);
		assertEquals(1, coord[0]);
		assertEquals(3, coord[1]);

	}

}
