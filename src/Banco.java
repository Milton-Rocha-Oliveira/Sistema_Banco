import java.util.ArrayList;
import java.util.List;

public class Banco {
    //atributos
    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContas(List<Conta> contas){
        this.contas = contas;
    }

    public void exibirClientes(){
        List<Conta> exibirContas = new ArrayList<>();
        System.out.println(exibirContas);
    }
}
