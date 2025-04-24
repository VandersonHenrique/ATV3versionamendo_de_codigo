public class ContaCliente {
    private int id;
    private Cliente cliente;
    private double saldo = 0.0;

    
    public ContaCliente(int id, Cliente cliente, double saldo) {
        this.id = id;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    
    public ContaCliente(int id, Cliente cliente) {
        this(id, cliente, 0.0);
    }

    
    public ContaCliente(int id) {
        this.id = id;
        this.cliente = null;
        this.saldo = 0.0;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    @Override
        public String toString() {
    String nome;
    if (cliente != null) {
        nome = cliente.getNome();
    } else {
        nome = "Sem Cliente";
    }
    return String.format("%s(%d) saldo=R$%.2f", nome, id, saldo);
}

    public double addDeposito(double valor) {
        saldo += valor;
        System.out.printf("Depósito realizado com sucesso. Seu novo saldo é : R$%.2f%n", saldo);
        return saldo;
    }

    public double subSaldo(double valor) {
        if (valor > saldo) {
            System.out.printf("Seu saldo é insuficiente para retirada. Seu saldo atual é: R$%.2f%n", saldo);
            return saldo;
        }
        saldo -= valor;
        System.out.printf("Saque realizado. Seu novo saldo é: R$%.2f%n", saldo);
        return saldo;
    }
}