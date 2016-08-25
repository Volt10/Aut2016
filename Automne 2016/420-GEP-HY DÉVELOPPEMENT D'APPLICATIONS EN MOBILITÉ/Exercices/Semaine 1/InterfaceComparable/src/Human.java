//********************************************************************
//  Human.java       Auteur : Sébastien Pouliot 
//							  Enseignant au LEA-8Y
//
//  Démontre l'utilisation versatile des interafaces en POO
//  avec du plaisir et de la joie :D
//  13/03/2012 							Ver. 1.00
//
//  Dépendance : Pilote.java
//********************************************************************
public class Human implements Comparable, Dialoguer {
	private int qi;
	
	public Human(int qi) {
		this.qi = qi;
	}

	@Override
	public int compareTo(Object arg0) {
		if (arg0 instanceof Human)
		{
			Human h = (Human) arg0;
			if (this.qi == h.qi)
				return 0;
			else
				if (this.qi < h.qi)
					return -1;
				else
					return 1;
		}
		return -1;
	}
	
	@Override
	public String parler() {
		return "Hello, I am a " + this.getClass().toString().substring(6);
	}

}
