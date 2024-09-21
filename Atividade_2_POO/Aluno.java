package Atividade_2_POO;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    private double nota;
    private Pessoa name;

    public void setName(){
        this.name = name;;
    }

    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public String getCurso(){
        return curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public double getNota(){
        return nota;
    }

    public void setNota(double nota){
        this.nota = nota;
    }

    @Override
    public String toString() {
        return String.format("Aluno{" +
                "nome =' " + getName() + '\''+
                "idade = '" + getIdade() +'\''+
                "curso='" + curso + '\'' +
                ", matricula=" + matricula +
                ", nota=" + nota +
                '}');
    }
}
