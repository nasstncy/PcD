package TestSwing;

import java.awt.Button;

import javax.swing.JButton;



/* On gere la grille des boutons. Attention faire tout ce qui est graphique dans une classe � part . Surtout pour mettre � 0 le 4-voisinage */


public class grille_button  {


	int x;
	int y;
	button[][] matrix;
	
	public grille_button(int x, int y){
		
		this.x=x;
		this.y=y;
		this.matrix=new button[x][y];
		
		
		for (int i=0;i<x;i++){ //Pour cr�er notre grille 5*5.
			for (int j=0;j<y;i++){
			button Button=new button((int) (Math.random()*4) + 1, i,j) ;
			}
		}
		
	}
	
}
