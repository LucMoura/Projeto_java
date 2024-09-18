package Projeto;

public class Peças {
    private double Valor;
    private String Nome;
    private String Marca;
    private String Modelo;

    public String getNome(){
        return Nome;

    }
    public void setNome(String Nome){
        this.Nome = Nome;
    }
    public String getMarca(){
        return Marca;
    }
    public void setMarca(String Marca){
        this.Marca = Marca;
    }
    public String getModelo(){
        return Modelo;
    }
    public void setModelo(String Modelo){
        this.Modelo = Modelo;
    }

    public double getValor(){
        return Valor;
    }

    public void setValor(Double Valor){
        this.Valor = Valor;
    }


    @Override
    public String toString() {
        return "Peças{" +
                "Marca='" + Marca + '\'' +
                ", Valor=" + Valor +
                ", Nome='" + Nome + '\'' +
                ", Modelo='" + Modelo + '\'' +
                '}';
    }
    public String nomePeca(){
        return  "Nome= " + Nome ;
    }
}



