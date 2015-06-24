package javaadv.collections;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;

public class GameRecorder {
	private Bag<String> wins = new HashBag<String>();
	private Bag<String> losses = new HashBag<String>();
	public GameRecorder() {
		super();
	}
	
	public void addResult(String winner, String loser) {
		wins.add(winner);
		losses.add(loser);
	}
	
	public void printResult(String player) {
		System.out.format("%20s - win: %3d, lose: %3d", player, wins.getCount(player), losses.getCount(player));
		System.out.println();
	}
}
