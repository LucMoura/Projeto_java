package Atividade_2_POO;

public class Professor extends Pessoa {
    private int matricula;
    private String discplinas;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getDiscplinas() {
        return discplinas;
    }

    public void setDiscplinas(String discplinas) {
        this.discplinas = discplinas;
    }

    @Override
    public String toString() {
        return String.format("Professor{" +
                "nome='" + getName() + '\'' +
                ", disciplinas='" + discplinas + '\'' +
                ", matricula=" + matricula +
                '}');
    }
}