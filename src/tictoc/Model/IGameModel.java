package tictoc.Model;

public interface IGameModel {
	public Boolean getturn();
	public int getvalue(int source);
	public String getbutton(Object source);
	public int getbuttonvalue(Object source);
	public void setvalue(int value,int index);
	public int anywin(int index,int value);
	public IPlayerModel getPlayerModel1();
	public IPlayerModel getPlayerModel2();
}
