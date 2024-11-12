public  abstract class Conta implements Iconta{

    protected static final int AGENCIA_PADRAO = 1;
    private  static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        this.agencia= Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL ++;


    }




    @Override
    public void sacar(double valor) {
        saldo = saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo = saldo += valor;

    }

    @Override
    public void transferir(Conta destino, double valor) {
        this.sacar(valor);
        destino.depositar(valor);

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


    protected void imprimirExtratos() {
        System.out.println("AGENCIA: "+agencia);
        System.out.println("Numero: "+numero);
        System.out.println("Saldo: "+saldo);
    }
}
