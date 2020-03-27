

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;

public class ManipularArquivo {

    public void escritorCliente(String path, ArrayList<Cliente> List) throws IOException {
        FileWriter buff = (new FileWriter(path));
        PrintWriter p = new PrintWriter(buff);

        for (Cliente c : List) {
            p.println(c.getNome());
            p.println(Integer.toString(c.getCpf()));
            p.println(c.getEnd());
            p.println(c.getTel());
            p.println(c.getDivida());
        }
        buff.close();
    }

    public void escritorCarro(String path, ArrayList<Carro> List) throws IOException {
        FileWriter arq = (new FileWriter(path));
        PrintWriter buffWrite = new PrintWriter(arq);

        for (Carro car : List) {

            buffWrite.println(car.getPlaca());
            buffWrite.println(car.getDescricao());
            buffWrite.println(Integer.toString(car.getSituacao()));
            buffWrite.println(car.getKm());
            buffWrite.println(Float.toString(car.getPrecoKm()));
            buffWrite.println(Float.toString(car.getTaxaDiaria()));
            buffWrite.println(car.getObservacao());
        }

        buffWrite.close();
    }

    public void escritorAluguel(String path, ArrayList<Aluguel> List) throws IOException {
        FileWriter arq = (new FileWriter(path));
        PrintWriter buffWrite = new PrintWriter(arq);

        for (Aluguel alug : List) {
            buffWrite.println(alug.getCpf());
            buffWrite.println(alug.getPlaca());
            buffWrite.println(alug.getDataInicio());
            buffWrite.println(alug.getDataFim());
            buffWrite.println(alug.getTipoLocacao());
            buffWrite.println(alug.getStatus());
        }
        buffWrite.close();
    }

    public ArrayList leitorCliente(String path, ArrayList<Cliente> List) throws IOException {
        //File arquivo = new File(path);
        FileReader arq = (new FileReader(path));
        BufferedReader buffRead = new BufferedReader(arq);

        String nome, end, tel;
        int cpf;
        float divida;
        
        while (true) {
            nome = buffRead.readLine();
            if (nome != null) {
                cpf = Integer.parseInt(buffRead.readLine());
                end = buffRead.readLine();
                tel = buffRead.readLine();
                divida = Float.parseFloat(buffRead.readLine());
                Cliente c = new ClientePF(nome, cpf, end, tel);
                c.setDivida(divida);
                List.add(c);
            } else {
                break;
            }
        }
        buffRead.close();
        return List;
    }

    public ArrayList leitorCarro(String path, ArrayList<Carro> List) throws IOException {
        //File arquivo = new File(path);
        FileReader arq = (new FileReader(path));
        BufferedReader buffRead = new BufferedReader(arq);

        String placa, descricao, observacao;
        int situacao, km;
        float precoKm, taxaDiaria;

        while (true) {
            placa = buffRead.readLine();
            if (placa != null) {
                descricao = buffRead.readLine();
                situacao = Integer.parseInt(buffRead.readLine());
                km = Integer.parseInt(buffRead.readLine());
                precoKm = Float.parseFloat(buffRead.readLine());
                taxaDiaria = Float.parseFloat(buffRead.readLine());
                observacao = buffRead.readLine();

                Carro car = new Carro(placa, descricao, situacao, km, precoKm, taxaDiaria, observacao);
                List.add(car);
            } else {
                break;
            }

        }
        buffRead.close();
        return List;
    }

    public ArrayList leitorAluguel(String path, ArrayList<Aluguel> List) throws IOException {
        //File arquivo = new File(path);
        FileReader arq = (new FileReader(path));
        //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try (BufferedReader buffRead = new BufferedReader(arq)) {
            //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String dataIAux[] = new String[3];
            String dataFAux[] = new String[3];
            
            String placa;
            String linha;
            int sel, cpf,status;
            LocalDate dataI,dataF;
            while (true) {

                linha = buffRead.readLine();
                if (linha != null) {
                    cpf = Integer.parseInt(linha);
                    placa = buffRead.readLine();
                    dataIAux = buffRead.readLine().split("-");
                    dataI = LocalDate.of(Integer.parseInt(dataIAux[0]), Integer.parseInt(dataIAux[1]), Integer.parseInt(dataIAux[2]));
                    dataFAux = buffRead.readLine().split("-");
                    dataF = LocalDate.of(Integer.parseInt(dataFAux[0]), Integer.parseInt(dataFAux[1]), Integer.parseInt(dataFAux[2]));
                    sel = Integer.parseInt(buffRead.readLine());
                    status = Integer.parseInt(buffRead.readLine());
                    Aluguel alug = new Aluguel(cpf, sel, placa, dataI,dataF,status);
                    List.add(alug);
                } else {
                    break;
                }

            }
        }
        return List;
    }

}
