package models.aulascollections;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate date;

    public Mentoria(String nome, String descricao, int cargaHoraria){
        super(nome,descricao,cargaHoraria);
        this.setDate(LocalDate.now());
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    public void calculcarXP(){

    }

    @Override
    public String toString() {
        return  "Mentoria: "+this.getNome() + "\n "+
                "Descrição : "+this.getDescricao() + "\n "+
                "Carga horária: "+this.getCargahoraria() + "\n "+
                "Data de inicio: "+this.getDate() +" \n ";

    }

    @Override
    public double calcularXp() {
            return XP_PADRAO + 20d;
    }
}
