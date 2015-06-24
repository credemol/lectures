package javaadv.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class GameRecorderTest {

	GameRecorder gameRecorder = null;
	
	@Before
	public void init() {
		gameRecorder = new GameRecorder();
	}
	
	@Test
	public void testGameRecorder() {
		
		List<String> players = 
				Arrays.asList(new String[]{"kim", "lee", "ko", "park", "choi"});
		
		int count = 100;
		
		for(int i = 0; i < count; i++) {
			Collections.shuffle(players);
			String winner = players.get(0);
			String loser = players.get(1);
			
			gameRecorder.addResult(winner, loser);
		}
		
		Collections.sort(players);
		for(String player: players) {
			gameRecorder.printResult(player);
		}
	}
	
	@Test
	public void testMock() {
		
		gameRecorder.addResult("kim", "lee");
		gameRecorder.addResult("choi", "kim");
		
		gameRecorder.printResult("kim");
		gameRecorder.printResult("lee");
		gameRecorder.printResult("choi");
	}
}
