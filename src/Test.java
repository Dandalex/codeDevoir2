public class Test {
    private int x,y,xfin=18,yfin=19;

    public Test(int x, int y, int xfin, int yfin) {
		this.x = x=1;
		this.y = y=0;
		this.xfin = xfin;
		this.yfin = yfin;
	}

	public boolean resoudre (int grid[][]){
        int ancienY=1, ancienX=0;
        boolean [][] reponse = new boolean[grid.length][grid[0].length];
        reponse[y][x]=true;
            while (x!=xfin &&y!=yfin){
                if (grid[y][x-1]==0 && (verifierLineaireCase(grid, y, x)) && ancienX!=x-1){
					x=x-1;
					grid[y][x]=-1;
					return resoudre(grid);
				}
				if (grid[y+1][x]==0 && (verifierLineaireCase(grid, y, x)) && ancienY!=y+1){
					ancienY=y;
					y=y+1;
					return resoudre(grid);
                }
				if (grid[y][x+1]==0&&(verifierLineaireCase(grid, y, x))&& ancienX!=x+1){
					ancienX=x;
					x=x+1;
					return resoudre(grid);
                }
				if (grid[y-1][x]==0&&(verifierLineaireCase(grid, y, x))&&ancienY!=y-1){
					ancienY=y;
					y=y-1;
					return resoudre(grid);
                }
				/*if (grid[y-1][x]==1 &&(verifierIntersection(grid, y, x))==true){
				
					}*/
				}




            

        return false;
			
    }
    
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
    	if (grid[y][x-1]==0 && grid[y][x+1]==0 && grid[y-1][x]==1&& grid[y+1][x]==1
		||grid[y][x-1]==0 && grid[y][x+1]==1 && grid[y-1][x]==0&& grid[y+1][x]==1
		||grid[y][x-1]==1 && grid[y][x+1]==0 && grid[y-1][x]==0&& grid[y+1][x]==1
		||grid[y][x-1]==0 && grid[y][x+1]==1 && grid[y-1][x]==1&& grid[y+1][x]==0
		||grid[y][x-1]==1 && grid[y][x+1]==0 && grid[y-1][x]==1&& grid[y+1][x]==0
		||grid[y][x-1]==1 && grid[y][x+1]==1 && grid[y-1][x]==0&& grid[y+1][x]==0){
    		return true;
    	}
    	else {
    		return false;
    	}
    }

	 
    public static boolean culDeSac (int grid[][],boolean[][] reponse,int y , int x) {
		if (verifierLineaireCase(grid, y, x)==false&&verifierIntersection(grid, y, x)==false){
			return true;
		}
		


		
    	
    	
    	
    	return false;
    }
    
    
    
    
    
    
}
