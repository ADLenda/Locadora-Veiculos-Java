public class Carro {
    private String placa;
    private String descricao;
    private int situacao;
    private int km;
    private float precoKm;
    private float taxaDiaria;
    private String observacao;

    //Construtor
    public Carro(String placa, String descricao, int situacao, int km, float precoKm, float taxaDiaria, String observacao){
        this.placa = placa;
        this.descricao = descricao;
        this.situacao = situacao;
        this.km = km;
        this.precoKm = precoKm;
        this.taxaDiaria = taxaDiaria;
        this.observacao = observacao;
        
    }
    
    //Getters and Setters
    public String getPlaca() {
        return placa;
    }
     public void setPlaca(String placa) {
        this.placa = placa;
    }
     public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getSituacao() {
        return situacao;
    }
    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }
    public int getKm() {
        return km;
    }
    public void setKm(int km) {
        this.km = km;
    }
    public float getPrecoKm() {
        return precoKm;
    }
    public void setPrecoKm(float precoKm) {
        this.precoKm = precoKm;
    }
    public float getTaxaDiaria() {
        return taxaDiaria;
    }
    public void setTaxaDiaria(float taxaDiaria) {
        this.taxaDiaria = taxaDiaria;
    }
    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    public void DadosCarro(){
        System.out.printf("\nPlaca: %s\n Descricao: %s\n Situação: %s\n Km: %d \n Preço por Km: %.2f\n Taxa Diaria: %.2f \n Observação: %s\n",this.placa, this.descricao, this.situacao, this.km, this.precoKm, this.taxaDiaria, this.observacao);
        
    }
}
