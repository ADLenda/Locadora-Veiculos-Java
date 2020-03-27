public class ClientePJ extends Cliente{
    private int cnpj;

    public ClientePJ(String nome,int cnpj, String end, String tel) {
        super(nome, end, tel);
        this.cnpj = cnpj;
    }
    
    @Override
    public int getCpf() {
        return cnpj;
    }
    public void setCpf(int cpf) {
        this.cnpj = cpf;
    }
    @Override
    public void DadosCliente(){
        super.DadosCliente();
        System.out.printf("CNPJ: %d\n",this.cnpj);   
    }
    
    
}
