package Pesquisa;

import java.util.Objects;

public class Contato {
    private String nome;
    private int numero;

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Contatos{" + nome + '\'' + numero + '}';
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override  // alt+insert equals() and hashCode()
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Contato contato = (Contato) object;
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNome());
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }
}
