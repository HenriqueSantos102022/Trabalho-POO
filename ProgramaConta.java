public class ProgramaConta {
    public static void main(String[] args) {

        Conta conta = new Conta();

        conta.setNumero(1234);
        conta.setTitular("Ana");

        conta.depositar(1000);

        conta.sacar(200);

        System.out.println("Numero da conta: " + conta.getNumero());
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: R$ " + conta.getSaldo());
    }
}
