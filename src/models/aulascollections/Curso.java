package models.aulascollections;

public class Curso extends Conteudo{

    @Override
    public String toString() {
        return  "Curso: "+this.getNome() + "\n "+
                "Descrição : "+this.getDescricao() + "\n "+
                "Carga horária: "+this.getCargahoraria() + "\n ";
    }

    public Curso(String nome, String descricao, int cargahoraria){
        super(nome,descricao,cargahoraria);
    }

    @Override
    public double calcularXp(){
        return XP_PADRAO * this.getCargahoraria();
    }


}
