public class Bacteria {
    public float tamanho;
    public String forma;
    public String DNA;
    public int tamanhoFlagelo;
    public float comprimentoParede;

    public Bacteria(float tamanho, String forma, String DNA, int tamanhoFlagelo, float comprimentoParede) {
        this.tamanho = tamanho;
        this.forma = forma;
        this.DNA = DNA;
        this.tamanhoFlagelo = tamanhoFlagelo;
        this.comprimentoParede = comprimentoParede;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getDNA() {
        return DNA;
    }

    public void setDNA(String DNA) {
        this.DNA = DNA;
    }

    public int getTamanhoFlagelo() {
        return tamanhoFlagelo;
    }

    public void setTamanhoFlagelo(int tamanhoFlagelo) {
        this.tamanhoFlagelo = tamanhoFlagelo;
    }

    public float getComprimentoParede() {
        return comprimentoParede;
    }

    public void setComprimentoParede(float comprimentoParede) {
        this.comprimentoParede = comprimentoParede;
    }
}
