import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso  curso1 = new Curso();
        curso1.setTitulo("java");
        curso1.setDescricao("curso de java");
        curso1.setCargaHoraria(11);

        Curso curso2 = new Curso();
        curso2.setTitulo("ts");
        curso2.setDescricao("typescript curso");
        curso2.setCargaHoraria(2020);
        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setTitulo("mentoria java");
        mentoria1.setData(LocalDate.now());

    }
}