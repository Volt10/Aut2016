//********************************************************************
//  Pilote.java       Auteur : Sébastien Pouliot 
//							  Enseignant au LEA-8Y
//
//  Démontre l'utilisation versatile des interafaces en POO
//  avec du plaisir et de la joie :D
//  13/03/2012 							Ver. 1.00
//
//  Dépendance : Human.java
//********************************************************************
public class Pilote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h1 = new Human(145);
		Human h2 = new Human(140);
		// plus grand que
		System.out.println("" + h1.compareTo(h2));
		// plus petit que
		System.out.println("" + h2.compareTo(h1));
		// égal à
		System.out.println("" + h1.compareTo(h1));
		
		System.out.println(h1.parler());
		
		Dog d1 = new Dog(88);
		Dog d2 = new Dog(99);
		
		System.out.println(d1.parler());
		
		// comparaison bidon pour démontrer que le programme ne tombe pas en exception
		System.out.println("" + h1.compareTo(d1));
	}

}
