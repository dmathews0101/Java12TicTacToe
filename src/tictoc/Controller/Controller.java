package tictoc.Controller;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.JButton;
import javax.swing.text.View;

import tictoc.Model.GameModel;
import tictoc.Model.IGameModel;
import tictoc.View.IView;

public class Controller implements IController {
	
	
	private IGameModel gameModel;
	private IView view;
	public Controller(IGameModel gameModel) {
		// TODO Auto-generated constructor stub
		this.gameModel=gameModel;
	}
	@Override
	public void setView(IView view) {
		this.view=view;
		
	}
	@Override
	public IView getView() {
		// TODO Auto-generated method stub
		return view;
	}
	public IGameModel getGameModel()
	{
		return gameModel;
	}
	@Override
	public void action(int index) {
		
			int i=gameModel.getvalue(index);
			int k;
			if(i==0)
			{
				boolean a=gameModel.getturn();
				if(a)
				{
					gameModel.setvalue(1,index);
					k=gameModel.anywin(index, 1);
				}
				else
				{
					gameModel.setvalue(2,index);
					k=gameModel.anywin(index, 2);
				}	
				//System.out.println(" winner"+k);
				if(k==1)
				{
					gameModel.getPlayerModel1().setScore();
					view.setWinnertag(1);
				}
				else if(k==2)
				{
					gameModel.getPlayerModel2().setScore();
					view.setWinnertag(2);
				}
				else if(k==0)
				{
					view.setWinnertag(3);
				}
				view.setIconOfButton(index,a);
				view.setPlayerturn(a);
			}
	
	}
	

}
