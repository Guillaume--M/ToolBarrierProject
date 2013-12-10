package testBonres;
import static org.junit.Assert.*;

import org.junit.Test;

import bornes.*;

public class TestBorne extends Borne{

	@Test
	public final void TestRapport() {
		fail("Yet not implemented");
		
	}

	@Test
	public final void TestSetBarrier(){
		Borne borne = new BorneManuel();
		boolean state;
		state = false;
		borne.setBarrier(false);
		if(borne.getBarrier() !=state)
			fail("state is false");
		state = true;
		borne.setBarrier(true);
		if(borne.getBarrier() != state)
			fail("state is true");
	}

}
