import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        System.out.println("\n");

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso javascript");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

//        System.out.println(curso1);
//        System.out.println(curso2);

        System.out.println("\n");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria de java");
        mentoria.setData(LocalDate.now());
//        System.out.println(mentoria);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescrição("Descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGustavo = new Dev();
        devGustavo.setNome("Gustavo");
        devGustavo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Gustavo" + devGustavo.getConteudosInscritos());
        System.out.println("======================");
        devGustavo.progredir();
        System.out.println("Conteúdos concluidos Gustavo" + devGustavo.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos Gustavo" + devGustavo.getConteudosInscritos());
        System.out.println("XP: " +  devGustavo.calcularTotalXp());

        System.out.println("\n");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("======================");
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteúdos concluidos Camila" + devGustavo.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("XP: " +  devCamila.calcularTotalXp());







    }


}
