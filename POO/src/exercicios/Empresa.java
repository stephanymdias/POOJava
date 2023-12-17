package exercicios;

import java.util.ArrayList;

public class Empresa {
    private String nome;
    private ArrayList<String> funcionarios;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void contratarFuncionario(String nomeFuncionario) {
        funcionarios.add(nomeFuncionario);
        System.out.printf("Funcionario '%s' contratado pela empresa %s.%n", nomeFuncionario, nome);
    }

    public void demitirFuncionario(String nomeFuncionario) {
        if (funcionarios.remove(nomeFuncionario)) {
            System.out.printf("Funcionario '%s' demitido pela empresa %s.%n", nomeFuncionario, nome);
        } else {
            System.out.printf("Funcionario '%s' nao encontrado na empresa %s.%n", nomeFuncionario, nome);
        }
    }

    public void exibirFuncionarios() {
        System.out.printf("Funcionarios da Empresa %s:%n%s%n", nome, funcionarios.isEmpty() ? "Sem funcionarios" : funcionarios);
    }

    public static void main(String[] args) {
        Empresa minhaEmpresa = new Empresa("LIMPAY", "5423245324424");
        minhaEmpresa.contratarFuncionario("Steph");
        minhaEmpresa.contratarFuncionario("Rebeca");
        minhaEmpresa.exibirFuncionarios();
        minhaEmpresa.demitirFuncionario("Steph");
        minhaEmpresa.exibirFuncionarios();
    }
}