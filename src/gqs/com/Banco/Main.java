public class Main {
    public static void main(String[] args) {   
        Cliente c1 = new Cliente(2, "Pablo", 10);
        ContaCliente conta1 = new ContaCliente(12, c1, 500);
        FaturaCliente fc1 = new FaturaCliente(6, c1, 200);

        System.out.println("Nome do cliente: "+c1);
        System.out.println("Conta do cliente: "+conta1);
        System.out.println("Fatura do cliente: "+fc1);

        System.out.println("Valor da fatura com o desconto do cliente aplicado: "+fc1.getValorComDesconto());
        conta1.addDeposito(200);
        System.out.println("Conta após adicionar dinheiro: "+conta1);
        conta1.subSaldo(76);
        System.out.println("Conta após subtrair dinheiro: "+conta1);
        conta1.subSaldo(800);
        System.out.println("Conta após subtrair dinheiro: "+conta1);
    
    }
}