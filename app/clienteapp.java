package app;
import app.conta.cliente;
import app.conta.trasacoes;

public class clienteapp{
    Cliente c1 = new cliente();
    c1.nome = "Juliana";
    c1.conta = 9090998;
    c1.agencia = 4040;
    c1.total = 900;
    c1.saque = 300;
    c1.deposito = 100;

    c1.ExibirDados();
}