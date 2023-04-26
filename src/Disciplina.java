public class Disciplina {
    private ICalcMedia CalcMedia;
    private double Media;
    private String Nome;
    private double P1;
    private double P2;
    private String Situacao;

    public Disciplina(){

    }
    public Disciplina(ICalcMedia CalcMedia){
        this.CalcMedia = CalcMedia;
    }
    public void CalcularMedia(){
        this.Media = this.CalcMedia.CalculaMedia(this.P1,this.P2);
    }

    public double getMedia() {
        return Media;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSituacao() {
        this.Situacao = this.CalcMedia.Situacao(this.Media);
        return Situacao;
    }

    public ICalcMedia getCalcMedia() {
        return CalcMedia;
    }

    public void setCalcMedia(ICalcMedia calcMedia) {
        CalcMedia = calcMedia;
    }

    public double getP1() {
        return P1;
    }

    public void setP1(double p1) {
        P1 = p1;
    }

    public double getP2() {
        return P2;
    }

    public void setP2(double p2) {
        P2 = p2;
    }
}
