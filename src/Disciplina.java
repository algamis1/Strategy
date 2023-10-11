public class Disciplina {

    private ICalcMedia calcMedia;
    private double media;
    private String nome;
    private double p1;
    private double p2;
    private String situacao;

    public Disciplina(ICalcMedia calcMedia){
        this.calcMedia = calcMedia;
    }

    public void calcularMedia() {
        media = calcMedia.calculaMedia(this.p1, this.p2);
        situacao = calcMedia.situacao(this.media);
    }

    public double getMedia() {
        return media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        if(p1 < 0 || p1 > 10)
            return;

        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        if(p2 < 0 || p2 > 10)
            return;

        this.p2 = p2;
    }

    public String getSituacao() {
        return situacao;
    }
}