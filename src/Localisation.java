public class Localisation {
    private int x;
    private int y;

    Localisation (int xLocal, int yLocal){
        x = xLocal;
        y = yLocal;
    }

    public Localisation deplacementDroit(int [][]grid){
        if (grid[x+1][y]==0){
            x=x+1;
            return this;
        }
        return this;
    }

    public boolean deplacementDroitPossible(int [][]grid){
        if (grid[x+1][y]==0){
            return true;
        }
        return false;
    }

    public Localisation deplacementGauche( int [][]grid){
        if (grid[x-1][y]==0){
            x=x-1;
            return this;
        }
        return this;
    }

    public boolean deplacementGauchePossible(int [][]grid){
        if (grid[x-1][y]==0){
            return true;
        }
        return false;
    }

    public Localisation deplacementBas(int [][]grid){
        if (grid[x][y+1]==0){
            x=x-1;
            return this;
        }
        return this;
    }

    public boolean deplacementBasPossible(int [][]grid){
        if (grid[x][y+1]==0){
            return true;
        }
        return false;
    }

    public boolean equals(Localisation n){
        if (this.x==n.x&&this.y==n.y){
            return true;
        }
        return false;
    }
}

