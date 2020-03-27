public class Cliente {

    
   // private int cpf;
    private String nome;
    private String end;
    private String tel;
    private float divida;

    //Construtor
    public Cliente(String nome, String end, String tel){
        
        this.nome = nome;
        //this.cpf = cpf;
        this.end = end;
        this.tel = tel;
        this.divida = 0.0f;
        
    }
    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public float getDivida() {
        return divida;
    }

    public void setDivida(float divida) {
        this.divida = divida;
    }
    
    public void DadosCliente(){
        System.out.printf("Nome: %s\n Endereço: %s\n Tel: %s \n Divida: %.2f\n",this.nome, this.end, this.tel, this.divida);   
    }
    public int getCpf(){
        return 1;
    }
}
