import java.io.FileNotFoundException;

public class Test {
    

    public static void main(String[] args){
        Localisation a= new Localisation(0, 0);
        /*Localisation b = new Localisation(0, 0);

        b.printLocal();*/

        int [][]grid = {{0,0,0,0,1},
                        {1,0,1,0,0}};
        System.out.println(a.deplacementBasPossible(grid));




    }
}
