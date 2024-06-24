import java.time.LocalDate;

import br_com_dio_desafio.br_com_dio_desafio_dominio.Bootcamp;
import br_com_dio_desafio.br_com_dio_desafio_dominio.Curso;
import br_com_dio_desafio.br_com_dio_desafio_dominio.Dev;
import br_com_dio_desafio.br_com_dio_desafio_dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo(" curso java");
        curso1.setDescricao(" descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo(" curso js");
        curso2.setDescricao(" descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo(" mentoria java");
        mentoria.setDescricao(" descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
    
        Dev devVictor = new Dev();
        devVictor.setNome("Victor");
        devVictor.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Victor: " + devVictor.getConteudosInscritos());
        devVictor.progredir();
        devVictor.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos Victor: " + devVictor.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Victor: " + devVictor.getConteudosConcluidos());
        System.out.println("XP: " + devVictor.calucularTotalXp());
        
        System.out.println("----------------");
        
        Dev devNoemi = new Dev();
        devNoemi.setNome("Noemi");
        devNoemi.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Noemi: " + devNoemi.getConteudosInscritos());
        devNoemi.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos Noemi: " + devNoemi.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Noemi: " + devNoemi.getConteudosConcluidos());
        System.out.println("XP: " + devNoemi.calucularTotalXp());
        
    }

}
    
