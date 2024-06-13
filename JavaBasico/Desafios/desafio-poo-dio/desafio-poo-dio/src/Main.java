import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Python");
        curso1.setDescricao("desc curso python");
        curso1.setCargaHoraria(81);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java");
        curso2.setDescricao("desc curso java");
        curso2.setCargaHoraria(92);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Python");
        mentoria1.setDescricao("desc mentoria python");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

//        Conteudo conteudo = new Curso();

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Backend Java Developer");
        bootcamp1.setDescricao("Descricao Bootcamp Java");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev devMatheus = new Dev();
        devMatheus.setNome("Matheus");
        devMatheus.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos Matheus" + devMatheus.getConteudosInscritos());
        devMatheus.progredir();
        System.out.println("***\n" + devMatheus.calcularTotalXP());
        System.out.println("Conteudos inscritos Matheus" + devMatheus.getConteudosInscritos());
        System.out.println("Conteudos concluidos Matheus" + devMatheus.getConteudosConcluidos());

        Dev devJovem = new Dev();
        devJovem.setNome("Jovem");
        devJovem.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos Jovem" + devJovem.getConteudosInscritos());
        devJovem.progredir();
        devJovem.progredir();
        devJovem.progredir();
        System.out.println("***\n" + devJovem.calcularTotalXP());
        System.out.println("Conteudos inscritos Jovem" + devJovem.getConteudosInscritos());
        System.out.println("Conteudos concluidos Jovem" + devJovem.getConteudosConcluidos());

    }
}
