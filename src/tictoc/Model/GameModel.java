package tictoc.Model;

import java.util.ArrayList;



public class GameModel implements IGameModel {

	private static boolean turn=true;
	
	private IPlayerModel player_1;
	private IPlayerModel player_2;
	private int a[]=new int[9];
	public GameModel() 
	{
		this.player_1=new PlayerModel();
		this.player_2=new PlayerModel();
		
	}
	public void setvalue(int value,int index)
	{
		a[index]=value;
	}
	public int getvalue(int index )
	{
		return a[index];
	}
	public IPlayerModel getPlayerModel1() {
		return player_1;
	}
	public IPlayerModel getPlayerModel2() {
		return player_2;
	}
	public Boolean getturn()
	{
		
		turn = !turn;
		return !turn;
	}
	@Override
	public String getbutton(Object source) {
		// TODO Auto-generated method stub
		if(source=="b1")
			return "b1";
		else if(source=="b2")
			return "b2";
		else if(source=="b3")
			return  "b3";
		else if(source=="b4")
			return  "b4";
		else if(source=="b5")
			return  "b5";
		else if(source=="b6")
			return  "b6";
		else if(source=="b7")
			return  "b7";
		else if(source=="b8")
			return  "b8";
		else 
			return "b9";
		
	}
	@Override
	public int getbuttonvalue(Object source) {
		// TODO Auto-generated method stub
		return 0;
		
	}
	@Override
	public int anywin(int index,int value) {
		// TODO Auto-generated method stub
		int i=0;
		if(index==0 &&((a[1]==value && a[2]==value)||(a[3]==value && a[6]==value)||(a[4]==value && a[8]==value)) ) 
			i=value;
		else if(index==1 &&((a[0]==value && a[2]==value)||(a[4]==value && a[7]==value)) ) 
			i=value;
		else if(index==2 &&((a[0]==value && a[1]==value)||(a[5]==value && a[8]==value)) ) 
			i=value;
		else if(index==3 &&((a[0]==value && a[6]==value)||(a[4]==value && a[5]==value)) ) 
			i=value;
		else if(index==4 &&((a[3]==value && a[5]==value)||(a[1]==value && a[7]==value)||(a[0]==value && a[8]==value)||(a[6]==value && a[2]==value)) ) 
			i=value;
		else if(index==5 &&((a[2]==value && a[8]==value)||(a[3]==value && a[4]==value)) ) 
			i=value;
		else if(index==6 &&((a[0]==value && a[3]==value)||(a[7]==value && a[8]==value)||(a[4]==value && a[2]==value)) ) 
			i=value;
		else if(index==7 &&((a[6]==value && a[8]==value)||(a[4]==value && a[1]==value)) ) 
			i=value;
		else if(index==8 &&((a[5]==value && a[2]==value)||(a[7]==value && a[6]==value)||(a[4]==value && a[0]==value)) ) 
			i=value;
		if(i==value)
		{
			for(int counter=0;counter<9;counter++)
					a[counter]=5;
			return value;
		}
		else {
			for(int counter=0;counter<9;counter++)
			{
				if(a[counter]==0)
					return 3;
			}
		}
				
		return 0;
	}
	
	
}
