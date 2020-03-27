import java.time.LocalDate;

public class Aluguel {

    private int cpf, tipoLocacao;
    private String placa;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private int status;

    //Construtor
    public Aluguel(int cpf,int tipoLocacao, String placa) {

        this.cpf = cpf;
        this.placa = placa;
        this.dataInicio = LocalDate.now();
        this.tipoLocacao = tipoLocacao;
        this.status = 0;
    }
    public Aluguel(int cpf,int tipoLocacao, String placa,LocalDate inicio) {

        this.cpf = cpf;
        this.placa = placa;
        this.dataInicio = inicio;
        this.tipoLocacao = tipoLocacao;
        this.status = 0;
    }
    public Aluguel(int cpf,int tipoLocacao, String placa,LocalDate inicio,LocalDate fim,int status) {
        this.cpf = cpf;
        this.placa = placa;
        this.tipoLocacao = tipoLocacao;
        this.dataInicio = inicio;
        this.dataFim = fim;
        this.status = status;
    }
    public Aluguel(int cpf,int tipoLocacao, String placa,LocalDate inicio,LocalDate fim){
        this.cpf = cpf;
        this.placa = placa;
        this.tipoLocacao = tipoLocacao;
        this.dataInicio = inicio;
        this.dataFim = fim;
        this.status = 0;
    }
   
    //Getters and Setters
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public int getTipoLocacao() {
        return tipoLocacao;
    }

    public void setTipoLocacao(int tipoLocacao) {
        this.tipoLocacao = tipoLocacao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }
    
    public int getStatus(){
        return status;
    }
    
    public void setStatus(int s){
        this.status = s;
    }
}
