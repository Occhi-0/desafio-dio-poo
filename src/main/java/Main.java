import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso javascript");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        System.out.println(curso1);
        System.out.println(curso2);

        System.out.println("\n");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria de java");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);






    }


}
