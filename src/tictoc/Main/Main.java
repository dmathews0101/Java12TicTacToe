package tictoc.Main;

import javax.swing.SwingUtilities;

import tictoc.Controller.Controller;
import tictoc.Controller.IController;
import tictoc.Model.GameModel;
import tictoc.Model.IGameModel;
import tictoc.View.IView;
import tictoc.View.View;
import tictoc.View.startWindow;

public class Main {

	public static void main(String arg[]) 
	{
		SwingUtilities.invokeLater(()-> createWindows());
	}
	
	private static void createWindows()
	{
		IGameModel gameModel=new GameModel();
		IController controller=new Controller(gameModel);
		new startWindow(controller);
		
	}
}
