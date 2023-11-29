
public class Test {

	public static void afficher(int[][] grid){
		// le contenu de la fonction doit être remplacé... 
		// les lignes ci-dessous indiquent comment utiliser les caractères "blocs"  
		  for (int i=0;i<grid.length;i++){
			for (int t=0;t<grid.length;t++){
			  if (grid[i][t]==1 ){			
				System.out.print("\u2588\u2588"); // utiliser ce caractère pour faire les murs
			  }
			  if (grid[i][t]==-1){
				System.out.print("..");
			  }
			  if (grid[i][t]==0 || grid[i][t]==-2){
				System.out.print("  ");
			  }  
			}
			System.out.println();
		  }
	  }

	public static boolean resoudre (int grid[][]){
		int xDebut = 1, xFin=18, yDebut = 1, yFin=18;
		boolean changement=true;
            while (changement==true){
				changement=false;
				for (int y=1;y<19;y++){
					for (int x=1;x<20;x++){
						if( grid[yDebut][xDebut]==-2||grid[yFin][xFin]==-2){
							return false;
						}
						if(grid[y][x]==0 && verifierCulDeSac(grid, y, x)){
							changement = true;
							grid[y][x]=-2;
						}
					}	
				}
			}
			while (grid[yDebut][xDebut]!=-1 && grid[yFin][xFin]!=-1){
				for (int y=1;y<19;y++){
					for (int x=1;x<19;x++){
						if (grid[y][x]==0)
							grid[y][x]=-1;
					}	
				}
			}
			grid[0][1]=-1;
			grid[19][18]=-1;
			return true;
	}
				
   
    public static boolean verifierIntersection (int grid[][],int y , int x) {
    	if ((grid[y][x-1]==0 && grid[y+1][x]==0 && grid[y][x+1]==0)||
    		(grid[y][x+1]==0 && grid[y+1][x]==0 && grid[y-1][x]==0)|| 
    		(grid[y][x-1]==0 && grid[y-1][x]==0 && grid[y][x+1]==0)||
    		(grid[y][x-1]==0 && grid[y-1][x]==0 && grid[y+1][x]==0)){
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
	public static boolean verifierLineaireCase (int grid[][],int y , int x) {
    	if ((grid[y][x-1]==0 && grid[y][x+1]==0 && grid[y-1][x]!=0 && grid[y+1][x]!=0)
		||(grid[y][x-1]==0 && grid[y][x+1]!=0 && grid[y-1][x]==0 && grid[y+1][x]!=0)
		||(grid[y][x-1]!=0 && grid[y][x+1]==0 && grid[y-1][x]==0 && grid[y+1][x]!=0)
		||(grid[y][x-1]==0 && grid[y][x+1]!=0 && grid[y-1][x]!=0 && grid[y+1][x]==0)
		||(grid[y][x-1]!=0 && grid[y][x+1]==0 && grid[y-1][x]!=0 && grid[y+1][x]==0)
		||(grid[y][x-1]!=0 && grid[y][x+1]!=0 && grid[y-1][x]==0 && grid[y+1][x]==0)){
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public static boolean verifierCulDeSac (int grid[][], int y , int x) {
		if (grid[y][x]==0 && (!verifierLineaireCase(grid, y, x) && !verifierIntersection(grid, y, x) && y!=0 && y!=19)){
				return true;
		}
    	return false;
    }
    
}
