package GrupoAlunos;

public class Alunos {String nome;
    double[] notas = new double[3];

    double calcularMedia(){
        double soma = 0;

        for(double nota : notas){
            soma += nota;
        }
        return soma / notas.length;
    }
}
