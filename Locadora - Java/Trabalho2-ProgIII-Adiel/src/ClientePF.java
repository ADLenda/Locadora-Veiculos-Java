public class ClientePF extends Cliente{
    private int cpf;

    public ClientePF(String nome, int cpf, String end, String tel) {
        super(nome, end, tel);
        this.cpf = cpf;
    }
    
    @Override
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public void DadosCliente(){
        super.DadosCliente();
        System.out.printf("CPF: %d\n",this.cpf);   
    }
}
