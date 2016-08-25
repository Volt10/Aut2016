//********************************************************************
//  Pilote.java       Auteur : S�bastien Pouliot 
//							  Enseignant au LEA-8Y
//
//  D�montre l'utilisation versatile des interafaces en POO
//  avec du plaisir et de la joie :D
//  13/03/2012 							Ver. 1.00
//
//  D�pendance : Human.java
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
		// �gal �
		System.out.println("" + h1.compareTo(h1));
		
		System.out.println(h1.parler());
		
		Dog d1 = new Dog(88);
		Dog d2 = new Dog(99);
		
		System.out.println(d1.parler());
		
		// comparaison bidon pour d�montrer que le programme ne tombe pas en exception
		System.out.println("" + h1.compareTo(d1));
	}

}
