public class Test {

	public static void afficher(int[][] grid){
		// le contenu de la fonction doit être remplacé... 
		// les lignes ci-dessous indiquent comment utiliser les caractères "blocs"  
		  for (int i=0;i<grid.length;i++){
			for (int t=0;t<grid.length;t++){
			  if (grid[i][t]==1){			
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
        //int ancienY=1, ancienX=0;
        //boolean [][] reponse = new boolean[grid.length][grid[0].length];
       // reponse[y][x]=true;
            for (int i= 0; i<(grid.length*grid.length);i++){
				for (int y=1;y<18;y++){
					for (int x=1;x<18;x++){
						if( grid[yDebut][xDebut]==-2||grid[yFin][xFin]==-2){
							return false;
						}
						verifierCulDeSac(grid, y, x);
					}	
				}
			}
			while (grid[yDebut][xDebut]!=-1 && grid[yFin][xFin]!=-1){
				for (int y=1;y<18;y++){
					for (int x=1;x<18;x++){
						verifierLineaireCase(grid, y, x);
					}	
				}
			}
			return true;
	}
				//ici on suit un chemin linéaire
				/* 
                if (grid[y][x-1]==0 && (verifierLineaireCase(grid, y, x)) && ancienX!=x-1){
					x=x-1;
					grid[y][x]=-1;
					return resoudre(grid);
				}
				if (grid[y+1][x]==0 && (verifierLineaireCase(grid, y, x)) && ancienY!=y+1){
					y=y+1;
					grid[y][x]=-1;
					return resoudre(grid);
                }
				if (grid[y][x+1]==0&&(verifierLineaireCase(grid, y, x))&& ancienX!=x+1){
					x=x+1;
					grid[y][x]=-1;
					return resoudre(grid);
                }
				if (grid[y-1][x]==0&&(verifierLineaireCase(grid, y, x))&&ancienY!=y-1){
					y=y-1;
					grid[y][x]=-1;
					return resoudre(grid);
                }
				ici on verifier les intersection, mais je crois changer pour modifier tout les cul de sacs
				if (grid[y][x-1]==0 && verifierIntersection(grid, y, x) && !verifierCulDeSac(grid, y, x-1)){
					x=x-1;
					grid[y][x]=-1;
					return resoudre(grid);
				}
				if (grid[y+1][x]==0 && verifierIntersection(grid, y, x) && !verifierCulDeSac(grid, y+1, x)){
					y=y+1;
					grid[y][x]=-1;
					return resoudre(grid);
				}
				if (grid[y+1][x]==0 && verifierIntersection(grid, y, x) && !verifierCulDeSac(grid, y+1, x)){
					y=y+1;
					grid[y][x]=-1;
					return resoudre(grid);
				}*/
			




            


    
    public static boolean verifierIntersection (int grid[][],int y , int x) {
    	if (grid[y][x-1]==0 && grid[y+1][x]==0 && grid[y][x+1]==0||
    		grid[y][x+1]==0 && grid[y+1][x]==0 && grid[y][x+1]==0|| 
    		grid[y][x-1]==0 && grid[y-1][x]==0 && grid[y][x+1]==0||
    		grid[y][y+1]==0 && grid[y-1][x]==0 && grid[y][x+1]==0){
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    
/*public static char verifierOrigine ( int y , int ancienY, int x, int ancienX) {
	 if(ancienX==x&&ay==y-1) {
		 return 'h';
	 }
	 if(ancienX==x&&ancienY==y+1) {
		 return 'b';
	 }
	 if(ancienX==x-1&&ancienY==y) {
		 return 'g';
	 }
	 if(ancienX==x+1&&ancienY==y+1) {
		 return 'd';
	 }
 }*/


public static boolean verifierLineaireCase (int grid[][],int y , int x) {
    	if (grid[y][x-1]==0 && grid[y][x+1]==0 && grid[y-1][x]!=0 && grid[y+1][x]!=0
		||grid[y][x-1]==0 && grid[y][x+1]!=0 && grid[y-1][x]==0 && grid[y+1][x]!=0
		||grid[y][x-1]!=0 && grid[y][x+1]==0 && grid[y-1][x]==0 && grid[y+1][x]!=0
		||grid[y][x-1]==0 && grid[y][x+1]!=0 && grid[y-1][x]!=0 && grid[y+1][x]==0
		||grid[y][x-1]!=0 && grid[y][x+1]==0 && grid[y-1][x]!=0 && grid[y+1][x]==0
		||grid[y][x-1]!=0 && grid[y][x+1]!=0 && grid[y-1][x]==0 && grid[y+1][x]==0){
    		return true;
    	}
    	else {
    		return false;
    	}
    }

	 
    public static boolean verifierCulDeSac (int grid[][], int y , int x) {
		
		if (!verifierLineaireCase(grid, y, x) && !verifierIntersection(grid, y, x) && y!=0 && y!=19){
			grid[x][y]=-2;
			return true;
		}
    	return false;
    }
    
    
    
    
    
    
}
