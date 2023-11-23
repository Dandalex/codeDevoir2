public class Test {
    

    public static boolean resoudre (int grid[][]){
        int y=0, x=1, a=1, b=0;
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
}
