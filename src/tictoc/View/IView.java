package tictoc.View;

import javax.swing.JButton;

import tictoc.Model.IGameModel;

public interface IView {

	//void setTextOfButton(Object source,Boolean text);
	int  getButton(Object source);
	void setIconOfButton(int i,Boolean path);
	void setPlayerturn(boolean turn);
	void setWinnertag(int turn);
}