package exercicios;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<String> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(String contato) {
        contatos.add(contato);
        System.out.printf("Contato adicionado com sucesso", contato);
    }

    public void removerContato(String contato) {
        if (contatos.remove(contato)) {
            System.out.printf("Contato removido com sucesso", contato);
        } else {
            System.out.printf("Contato n�o encontrado na agenda", contato);
        }
    }

    public void exibirContatos() {
        if (contatos.isEmpty()) {
            System.out.println("A agenda est� vazia.");
        } else {
            System.out.println("Contatos na Agenda:");
            for (String contato : contatos) {
                System.out.println(contato);
            }
        }
    }

    public static void main(String[] args) {
        Agenda minhaAgenda = new Agenda();

        minhaAgenda.adicionarContato("Professor");
        minhaAgenda.adicionarContato("Jailson");
        minhaAgenda.adicionarContato("Bra�o");
        minhaAgenda.adicionarContato("Curto");
        
        minhaAgenda.exibirContatos();

        minhaAgenda.removerContato("Jailson");

        minhaAgenda.exibirContatos();
    }
}