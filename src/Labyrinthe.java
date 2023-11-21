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
      int y=0;
      int x=1;
      int a=1;
      for (y=0;y<20;y++){
        if(y==19&&x==18){
          return true;
        }
        if(grille[y+1][x]==0){
          continue;
        }
        for (x=a;x<=20;x++){
          if (grille [y][x]==1){
            for(x=a-1;x>0;x--){
               if (grille [y][x]==1){
                return false;
               }
              if (grille[y+1][x]==0){
                a=x;
                break;
            }
          }
          break;
        }
          else{
            if (grille[y+1][x]==0){
              a=x;
              break;
            }
            if (x==20){
              return false;
            }
          }
        }
      }
      return true;
    }
}