package conta;

public class trasacoes{

    double total;
    double saque;
    double deposito;

    public void saque() {
        if total>=saque{
            total =- saque;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Valor em conta" + total);
        }else{
            System.out.println("Valor indisponível");
        }
    }
    public void deposito() {

        total += deposito;
        System.out.println("Valor atual: " + total);
        
    }
}