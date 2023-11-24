import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // ce code n'a pas besoin d'être modifié

      
        int[][] labyrinthe = charger("labyrinthe1.txt"); // ici on peut choisir le  labyrinthe parmi: "labyrinthe1.txt", "labyrinthe11.txt", "labyrinthe2.txt",  "labyrinthe21.txt", "labyrinthe3.txt", "labyrinthe31.txt".


        // fonction pour afficher le labyrinthe (à faire)
        Test.afficher(labyrinthe);
        // fonction pour résoudre le labyrinthe (à faire)
        boolean solution = Test.resoudre(labyrinthe);
        
        if (solution == true){
            System.out.println("Chemin trouvé!");
        } else {
            System.out.println("Chemin non trouvé!");
        }
        Labyrinthe.afficher(labyrinthe);

    }



    /* méthode fournie pour lire une grille dans un fichier*/ 
    public static int[][] charger(String fichier) throws FileNotFoundException {		
    File file = new File(fichier);
    int[][] tableau = new int[20][20]; //grille 20x20

      Scanner lectureFichier = new Scanner(file);
      int count = 0;
      for (int i = 0; i<20; i++) { // le fichier a 20 lignes
          String ligne  = lectureFichier.nextLine();
          char[] caracteres = ligne.toCharArray();
          for (int c=0;c<caracteres.length;c++) {
            tableau[i][c]= (caracteres[c]=='0'?0:1); // expression conditionnelle: si '0' alors 0 else 1
        }
      }
      lectureFichier.close();

      return tableau;

  }

}