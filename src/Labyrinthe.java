public class Labyrinthe{

    /** 
    À faire: cette fonction doit afficher le labyrinthe sur 20 lignes et 40 colonnes
    */
    public static void afficher(int[][] grid){
      // le contenu de la fonction doit être remplacé... 
      // les lignes ci-dessous indiquent comment utiliser les caractères "blocs"  
        for (int i=0;i<grid.length;i++){
          for (int t=0;t<grid.length;t++){
            if (grid[i][t]==1){			
              System.out.print("\u2588\u2588"); // utiliser ce caractère pour faire les murs
            }
            else{
              System.out.print("  ");
            }  

          }
          System.out.println();
        }
    }

    //resout le labyrinthe
    public static boolean resoudre(int[][] grille){
      Localisation a = new Localisation(1,0);
      Localisation fin= new Localisation(19, 18);
      while (!a.equals(fin)){
        if (a.deplacementBasPossible(grille)){
          a.deplacementBas(grille);
        }
        else{
          int i=0;
          while ((!a.deplacementBasPossible(grille))&&i<40){
            i++;
            if (a.deplacementDroitPossible(grille)){
              a.deplacementDroit(grille);
            }
            else {
              if (a.deplacementGauchePossible(grille)){
                a.deplacementGauche(grille);
              }
              else{
                return false;
              }
            }
          }
       }
      }
        return true;

    }
}