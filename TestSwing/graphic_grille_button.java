package TestSwing;

import javax.swing.*;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//Ici on gËre SEULEMENT l'affichage
//Faut crÈer un objet grille_button et fr get/set dessus (avec l'onglet source ->generate getters setters)


public class graphic_grille_button extends JFrame implements ActionListener {

	super("increment 5x5") ;
	public void jeu (grille_button dim ){
		int x=dim.x;
		int y=dim.y;
		
		
		setPreferredSize(new Dimension(500, 500)) ;
		setLayout(new GridLayout(5,5)) ; // cree la grille diff√©rent de "setLayout(new FlowLayout()) ;" qui cree une fenetre basique
		for (int i=0;i<x;i++){ 
			for (int j=0;i<y;j++){//Pour crÈer notre grille 5*5
				button Button=dim.matrix[i][j];
				this.add(new JButton(Integer.toString(Button.valeur)));
			}
		}
		
		pack() ;
		setVisible(true);
	}
	
	

	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
