package models.aulascollections;

public  abstract class Conteudo {

    private String nome;
    private String descricao;
    private int cargahoraria;
    /*
    XP padrão as classes filhas vão ter acesso para calcular XP
     */
   protected final  static double XP_PADRAO = 10;

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

    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    @Override
    public String toString() {
        return  "Curso: "+this.getNome() + "\n "+
                "Descrição : "+this.getDescricao() + "\n "+
                "Carga horária: "+this.getCargahoraria() + "\n ";
    }

    public abstract double calcularXp();
    public Conteudo(String nome, String descricao,int cargahoraria){
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setCargahoraria(cargahoraria);
    }



}
