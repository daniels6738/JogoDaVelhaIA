import java.util.ArrayList;

public class No {
    private Tabuleiro tab;
    private ArrayList<No> filhos;
    private int alfa;
    private int beta;
    private boolean minmax;
    private Integer valor;


    public No() {
        this.tab = new Tabuleiro();
        this.filhos = new ArrayList<>();
        this.alfa = -10; //os valores possíveis são -1, 0 e 1 então -10 e 10 é o suficiente
        this.beta = 10;
        this.minmax = true;
        this.valor = null; 
    }

    public No(Tabuleiro tab){
        this.tab = tab;
        this.filhos = new ArrayList<>();
        this.alfa = -10; //os valores possíveis são -1, 0 e 1 então -10 e 10 é o suficiente
        this.beta = 10;
        this.minmax = true; 
    }


    public Tabuleiro getTab() {
        return this.tab;
    }

    public void setTab(Tabuleiro tab) {
        this.tab = tab;
    }

    public ArrayList<No> getFilhos() {
        return this.filhos;
    }

    public void setFilhos(ArrayList<No> filhos) {
        this.filhos = filhos;
    }

    public int getAlfa() {
        return this.alfa;
    }

    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    public int getBeta() {
        return this.beta;
    }

    public void setBeta(int beta) {
        this.beta = beta;
    }

    public boolean isMinmax() {
        return this.minmax;
    }

    public boolean getMinmax() {
        return this.minmax;
    }

    public void setMinmax(boolean minmax) {
        this.minmax = minmax;
    }


}
