public class Multime {

    private int[] date;
    private int dim;
    private int n;

    public Multime(){
        this.date = new int[0];
        this.dim = 10;
        this.n = 0;
    }

    public Multime(int dim){
        this.date = new int[dim];
        this.dim = dim;
        this.n = 0;
    }

    public void adauga(int elem){
        if (n != dim){
            boolean found = false;
            for (int i = 0; i < dim; i++) {
                if (date[i] == elem){
                    found = true;
                }
            }
            int i = 0;
            while (i < dim && found == false){
                if (date[i] == 0){
                    date[i] = elem;
                    n++;
                    found = true;
                }
                i++;
            }
        } else {
            System.out.println("Vectorul este plin.");
        }
    }

    public void extrage(int elem){
        boolean found = false;
        for (int i = 0; i < dim ; i++) {
            if (date[i] == elem) {
                found = true;
            }
        }
        int i = 0;
        while(i < dim && found == true){
            if (date[i] == elem){
                date[i] = 0;
                n--;
            }
            i++;
        }
    }

    public void afisare(){
        for (int i = 0; i < dim; i++) {
            System.out.print(date[i] + " ");
        }
        System.out.println();
        System.out.println("Nr de elemente = " + n);
    }

}
