import java.awt.image.renderable.ContextualRenderedImageFactory;

public class Caixa {
    public static void main(String[] args) {

        Conta cc = new ContaCorrente();
            cc.depositar(100);
            cc.imprimirExtrato();
        Conta cc2 = new ContaCorrente();
         cc2.imprimirExtrato();


        Conta cop = new ContaPoupanca();
            cop.imprimirExtrato();
            cop.getAgencia();
    }
}
