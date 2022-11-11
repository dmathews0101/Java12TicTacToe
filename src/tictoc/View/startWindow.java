package tictoc.View;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import tictoc.Controller.IController;
import tictoc.Model.IGameModel;

public class startWindow extends JFrame{

	private IController controller;
	private startWindow startWindow ;
	public startWindow( IController controller) {
		
		super("Tictactoe");
		startWindow=this;
		this.controller=controller;
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocation(50, 50);
		this.setMinimumSize(new Dimension(250, 250));
		this.setLayout(null);
		JLabel jLabel=new JLabel("Player 1: ");
		JLabel jLabel1=new JLabel("Player 2: ");
		JTextField textField=new JTextField();
		JTextField textField1=new JTextField();
		JButton button=new JButton("Next");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					//System.out.print(textField);
					controller.getGameModel().getPlayerModel1().setPlayerNAme(textField.getText());
					controller.getGameModel().getPlayerModel2().setPlayerNAme(textField1.getText());
					startWindow.dispose();
					IView view=new View(controller);
					controller.setView(view);
					
				}
				catch(Exception e1)
				{
					System.out.print(e1);
				}
			}
		});
		JPanel contentPane= (JPanel)getContentPane();
		contentPane.add(jLabel);
		contentPane.add(jLabel1);
		contentPane.add(textField);
		contentPane.add(textField1);
		contentPane.add(button);
		jLabel.setBounds(10, 50,70,30);
		jLabel1.setBounds(10, 90,70,30);
		textField.setBounds(80, 50,150,30);
		textField1.setBounds(80, 90,150,30);
		button.setBounds(80, 160,90,30);
		this.setVisible(true);
		
	}
}
