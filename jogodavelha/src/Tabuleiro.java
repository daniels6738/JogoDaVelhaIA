public class Tabuleiro {
    private int[] tab;


    public Tabuleiro() {
        int[] tab = new int[10];
        for(int i = 0; i < 10; i++){
            tab[i] = i;
        }
        this.tab = tab;
    }


    public int[] getTab() {
        return this.tab;
    }

    public void setTab(int[] tab) {
        this.tab = tab;
    }

    public void imprimeTab(){
        System.out.println(" " + this.tab[7] + "|" + this.tab[8] + "|" + this.tab[9]);
        System.out.println("-------");
        System.out.println(" " + this.tab[4] + "|" + this.tab[5] + "|" + this.tab[6]);
        System.out.println("-------");
        System.out.println(" " + this.tab[1] + "|" + this.tab[2] + "|" + this.tab[3]);
    }


}
