package models.alunoscollections;

import models.aulascollections.Conteudo;

import java.util.*;

public class Dev {
    private String nome;

    private Set<Conteudo> conteudosInscritos;
    private Set<Conteudo> conteudosConcluidos;

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Dev(String nome){
        this.conteudosConcluidos = new LinkedHashSet<>();
        this.conteudosInscritos = new LinkedHashSet<>();
        this.setNome(nome);
    }
    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getListaDeDevsInscritos().add(this);
    }

    public void progredir(){
      Optional<Conteudo> conteudo =  this.conteudosInscritos
                .stream()
                .findFirst();
     if (conteudo.isPresent()) {
         this.conteudosConcluidos.add(conteudo.get());
         this.conteudosInscritos.remove(conteudo.get());
     } else {
         System.err.println("você não está inscrito em nenhum bootcamp");
     }

    }

    public double calcularTotalXP(){
        /*
        stream está pegando a lista e utilizando method reference para calcularXp
        somando
         */
       return this.conteudosConcluidos.stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }


}

