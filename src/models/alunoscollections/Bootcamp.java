package models.alunoscollections;

import models.aulascollections.Conteudo;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private LocalDate dataInicial = LocalDate.now();
    private LocalDate dataFinal = dataInicial.plusDays(45);

    Set<Dev> listaDeDevsInscritos = new HashSet<>();
    Set<Conteudo> conteudos = new LinkedHashSet<>();

    public Bootcamp(String nome, String Descricao){
        this.setNome(nome);
        this.setDescricao(descricao);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Set<Dev> getListaDeDevsInscritos() {
        return listaDeDevsInscritos;
    }

    public void setListaDeDevsInscritos(Set<Dev> listaDeDevsInscritos) {
        this.listaDeDevsInscritos = listaDeDevsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(listaDeDevsInscritos, bootcamp.listaDeDevsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, listaDeDevsInscritos, conteudos);
    }
}
