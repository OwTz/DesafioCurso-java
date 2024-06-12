import models.alunoscollections.Bootcamp;
import models.alunoscollections.Dev;
import models.aulascollections.Conteudo;
import models.aulascollections.Curso;
import models.aulascollections.Mentoria;

public class Main {
    public static void main(String[] args) {
        Conteudo curso1 = new Curso("Java","sobre Back-end de java",8);
        Conteudo curso2 = new Mentoria("Java - abstraindo","Mentoria sobre POO",10);
        System.out.println(curso1.toString());
        System.out.println(curso2.toString());

        Bootcamp bootcamp1 = new Bootcamp("completo 1 ","curso completo");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);

        Dev devJoao = new Dev("joão");
        Dev maria = new Dev("maria");

        maria.inscreverBootcamp(bootcamp1);
        maria.progredir();

        devJoao.inscreverBootcamp(bootcamp1);
        devJoao.progredir();
        devJoao.progredir();

        System.out.println("conteudos de " +devJoao.getNome()+ " são: "+devJoao.getConteudosInscritos());
        System.out.println("conteudos de "+maria.getNome()+ " são: "+maria.getConteudosInscritos());
        System.out.println("Xp do(a)  "+devJoao.getNome()+ " é "+devJoao.calcularTotalXP());
        System.out.println("Xp do(a)  "+maria.getNome()+ " é "+maria.calcularTotalXP());


        System.out.println("conteudos concluidos do(a) " +maria.getNome()+ " são : " +maria.getConteudosConcluidos());
    }
}
