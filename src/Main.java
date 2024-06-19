public class Main {

    public static void main(String[] args) {
        Cliente milton = new Cliente();
        milton.setNome("Milton");

        Cliente juliete = new Cliente();
        juliete.setNome("Juliete");

        Conta cc = new ContaCorrente(milton);
        Conta poupanca = new ContaPoupanca(juliete);

    /*    cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        cc.depositar(200);
        cc.transferir(100,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
*/
        Banco banco = new Banco();

        banco.exibirClientes();
    }
}
