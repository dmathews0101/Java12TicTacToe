package tictoc.Model;

public class PlayerModel implements IPlayerModel {
 
	private String playerName;
	private int score;
	public void setPlayerNAme(String name) {
		playerName=name;
	}
	public String getPlayerName() {
		return playerName;
	}
	
	public void setScore()
	{
		score+=1;
	}
	public int getscore() {
		return score;
	}
	
}
