public class QuickUnion{
    private int[] uflist;


    public QuickUnion(int N){
        // Initializes list
        for(int i=0;i<N;i++){
            this.uflist[i] = i;
        }
    }

    private int root(int i){
        // Finds root nodes
        while(uflist[i] != i){
            i = uflist[i];
        }
    }

    private boolean connected(int p, int q){
        // Returns true if both elements have same root and false otherwise
        return(uflist[p]==uflist[q]);
    }

    public void union(int p, int q){
        // Changes root of p to root of q
        int rootp = root(p);
        int rootq = root(q);
        uflist[rootp] = rootq;
    }
}



}