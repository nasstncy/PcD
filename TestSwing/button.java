package TestSwing;

import javax.swing.JButton;

/*On gère les boutons ici */

@SuppressWarnings("unused")
public class button extends JButton{

int x;
int y;
int valeur;



public button(int valeur,int x,int y){
	super();
	this.x=x;
	this.y=y;
	this.valeur=valeur;
}

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}

public int getValeur() {
	return valeur;
}

public void setValeur(int valeur) {
	this.valeur = valeur;
}
	
	
	
	

}
