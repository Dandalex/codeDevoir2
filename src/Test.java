public class Test {
    

    public static boolean resoudre (int grid[][]){
        int y=0, x=1, ay=1, ax=0;
        boolean [][] reponse = new boolean[grid.length][grid[0].length];
        reponse[y][x]=true;
            for (y=0;y<20;y++){
                if (grid[y][x-1]==0){
                    x=x-1;
                    reponse[y][x]=true;
                    
                }




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
    
    
 public static char verifierOrigine ( int y , int ancienY, int x, int ancienX) {
	 if(ancienX==x&&ay==y-1) {
		 return 'h';
	 }
	 if(ax==x&&ay==y+1) {
		 return 'b';
	 }
	 if(ax==x&&ay==y) {
		 return 'b';
	 }
	 if(x==ax&&ay==y+1) {
		 return 'b';
	 }
 }
	 
    public static boolean culDeSac (int grid[][],boolean[][] reponse,int y , int x) {
    
    	
    	
    	
    	return false;
    }
    
    
    
    
    
    
}
