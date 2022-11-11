package tictoc.Controller;

import tictoc.Model.IGameModel;
import tictoc.View.IView;

public interface IController {
	public void setView(IView view) ;
	public IView getView() ;
	public IGameModel getGameModel();
	public void action(int index);
}
