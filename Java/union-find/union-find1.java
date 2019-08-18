public class QuickFind{
    
    ArrayList<Integer> uflist = new ArrayList<Integer>;
    
    UF(int n){
        for(int i=0; i<n; i++){
            uflist[i] = i;
        }
        StdOut.println("Created UF list");
    }

    void union(int p, int q){
        int pid = this.uflist[p];
        int qid = this.uflist[q];

        for(int i=0; i<this.uflist.length; i++){
            if(this.uflist[i]==pid){
                this.uflist[i]=qid;
            }
        }
    }

    boolean connected(int p, int q){
        return(this.uflist[p]==this.uflist[q]);
    }

    int find(int p){

    }

    int count(){

    }
}

public class mainClass{
    public static void main(String[] args){
        int N = StdIn.readInt();
        UF uf = new QuickFind(N);
        while(!StdIn.isEmpty()){
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (!uf.connected(p, q)){
                uf.union(p, q);
                StdOut.println(p+" "+q);
            }
        }
    }
}