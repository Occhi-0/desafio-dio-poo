package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    public Curso() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    private int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }



}
