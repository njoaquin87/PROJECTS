package services.veritec;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VeritecTest {
	
	VeritecConn ver= new VeritecConn();
	String VERITEC_STATES[] = {"AL","FL"};//,"IL","IN","MI","ND","OK"};
	
	@Test
	public void testConnectionForVeritecStates() throws Exception{
		String VERITEC_STATES[] = {"AL","FL","IL","IN","MI","ND","OK"};
		for (String state : VERITEC_STATES) {
			assertEquals("the State "+state+" must be true", true, ver.VeritecConnection(state));
		}
		
	}
}
