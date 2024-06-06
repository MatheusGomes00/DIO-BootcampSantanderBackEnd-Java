package OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int codConvite;

    public Convidado(String nome, int codConvite) {
        this.nome = nome;
        this.codConvite = codConvite;
    }

    @Override  // método de sobrescrita para verificar e não permitir existencia/inserção repetida
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Convidado convidado = (Convidado) object;
        return getCodConvite() == convidado.getCodConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodConvite());
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Convidados{" +
                "nome='" + nome + '\'' +
                ", codConvite=" + codConvite +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public int getCodConvite() {
        return codConvite;
    }
}
