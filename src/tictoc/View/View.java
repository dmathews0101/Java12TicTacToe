package tictoc.View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import tictoc.Controller.IController;

public class View extends JFrame implements IView
{
	private IController controller;
	public JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;


	private BufferedImage bImage1;
	private BufferedImage bImage2;
	private BufferedImage bImage3;
	private ImageIcon icon;
	private ImageIcon icon2;
	private ImageIcon icon3;
	private JLabel label,label1,label2,label3,label4,label5,label6,label7;

	private String text1="src/images/12.jpg";
	private String text2="src/images/111.jpg";
	private String text3="src/images/turn.jpg";

	public View(IController controller) {
		super("TicTacToe");
		this.controller=controller;

		try {
			bImage1=ImageIO.read(new File(text1));
			bImage2=ImageIO.read(new File(text2));
			bImage3=ImageIO.read(new File(text3));
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.print(e);
		}

		icon=new ImageIcon(bImage1);
		icon2=new ImageIcon(bImage2);
		icon3=new ImageIcon(bImage3);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);


		this.setMinimumSize(new Dimension(400, 400));
		this.setLayout(null);	

		JPanel gridPanel = new JPanel();

		gridPanel.setLayout(new GridLayout(3, 3));
		b1 = new JButton("");
		b2 = new JButton("");
		b3 = new JButton("");
		b4 = new JButton("");
		b5 = new JButton("");
		b6 = new JButton("");
		b7 = new JButton("");
		b8 = new JButton("");
		b9 = new JButton("");


		gridPanel.add(b1);
		gridPanel.add(b2);
		gridPanel.add(b3);
		gridPanel.add(b4);
		gridPanel.add(b5);
		gridPanel.add(b6);
		gridPanel.add(b7);
		gridPanel.add(b8);
		gridPanel.add(b9); 


		b1.addActionListener(new Listener(controller));
		b2.addActionListener(new Listener(controller));
		b3.addActionListener(new Listener(controller));
		b4.addActionListener(new Listener(controller));
		b5.addActionListener(new Listener(controller));
		b6.addActionListener(new Listener(controller));
		b7.addActionListener(new Listener(controller));
		b8.addActionListener(new Listener(controller));
		b9.addActionListener(new Listener(controller));
		label=new JLabel("Score");
		label1=new JLabel(controller.getGameModel().getPlayerModel1().getPlayerName());
		label2=new JLabel(controller.getGameModel().getPlayerModel2().getPlayerName());
		label3=new JLabel(icon3);
		label4=new JLabel(icon3);
		label5=new JLabel("");
		label6=new JLabel("1");
		label7=new JLabel("1");
		JButton newgamebutton = new JButton("ReGame");
		JButton exitButton = new JButton("Exit");

		JPanel contentPane= (JPanel)getContentPane();


		contentPane.add(gridPanel);
		contentPane.add(label1);
		contentPane.add(label2);
		contentPane.add(label3);
		contentPane.add(label4);
		contentPane.add(label5);
		contentPane.add(label6);
		contentPane.add(label7);
		
		
		contentPane.add(newgamebutton);
		contentPane.add(exitButton);

		gridPanel.setBounds(10, 10, 200, 200);
		label1.setBounds(230, 10, 50, 30);
		label2.setBounds(230, 40, 50, 30);
		label3.setBounds(195, 10, 50, 30);
		label4.setBounds(195, 40, 50, 30);
		label5.setBounds(230, 135, 90, 30);
		label6.setBounds(195, 40, 50, 30);
		label7.setBounds(230, 135, 90, 30);
		label4.setVisible(false);
		newgamebutton.setBounds(10, 235,90, 30);
		exitButton.setBounds(120, 235,90, 30);
		this.setVisible(true);

	}
	@Override
	public void setPlayerturn(boolean turn)
	{
		if(turn)
		{
			label3.setVisible(false);
			label4.setVisible(true);
		}
		else 
		{
			label3.setVisible(true);
			label4.setVisible(false);
		}
	}
	@Override
	public void setIconOfButton(int i, Boolean text) {
		ImageIcon finaIcon;
		if(text)
			finaIcon=icon;
		else 
			finaIcon=icon2;

		// TODO Auto-generated method stub
		if(i==0)
		{
			b1.setIcon(finaIcon);	
		}	
		else if(i==1)
		{
			b2.setIcon(finaIcon);
		}
		else if(i==2)
		{
			b3.setIcon(finaIcon);	
		}
		else if(i==3)
		{
			b4.setIcon(finaIcon);	
		}
		else if(i==4)
		{
			b5.setIcon(finaIcon);	
		}
		else if(i==5)
		{
			b6.setIcon(finaIcon);
		}
		else if(i==6)
		{
			b7.setIcon(finaIcon);
		}
		else if(i==7)
		{
			b8.setIcon(finaIcon);
		}
		else if(i==8)
		{
			b9.setIcon(finaIcon);
		}
	}
	public int  getButton(Object source) {
		// TODO Auto-generated method stub
		if(source==b1)
			return 0;
		else if(source==b2)
			return 1;
		else if(source==b3)
			return 2;
		else if(source==b4)
			return 3;
		else if(source==b5)
			return 4;
		else if(source==b6)
			return 5;
		else if(source==b7)
			return 6;
		else if(source==b8)
			return 7;
		else 
			return 8;
		
	}
	@Override
	public void setWinnertag(int turn) {
		// TODO Auto-generated method stub
		if(turn==1)
			label5.setText("Player 1 win");
		else if(turn==2)
			label5.setText("Player 2 win");
		else
			label5.setText("Match Draw");
	}

}
class Listener implements ActionListener
{
	private IController cont;

	public Listener(IController cont) {
		this.cont = cont;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int index =cont.getView().getButton(e.getSource());
		//System.out.println(index);
		cont.action(index);

	}

}
