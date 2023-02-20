package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TryJunitTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testTryJunit() {
		System.out.println("Test1です");
		
		assertEquals(1, TryJunit.cnt);
	}

	@Test
	void testMain() {
		System.out.println("Test2です");
		
		String[] str = {"main", "メソッド"};
		TryJunit.main(str);
		
		TryJunit tj = new TryJunit();
		assertEquals(4, tj.sub());
	}

	

}
