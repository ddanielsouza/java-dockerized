package br.com.jtest;

import java.util.ArrayList;
import java.util.Random;

public class Main{
    public static void main(String[] args){

        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        for(int i = 1; i < 10; i ++){
            Random random = new Random();
            var nome =  "Nome: ";

            for (int indexChar = 0; indexChar < random.nextInt(25); indexChar++) {
                nome +=  String.valueOf(indexChar);
            }

            System.out.println(nome);

            alunos.add(new Aluno(i, nome));
        }


        var menorNome = alunos.stream().min((a, b) -> a.name.length() - b.name.length());
        var maiorNome = alunos.stream().max((a, b) -> a.name.length() - b.name.length());

        

        var idImpares = alunos.parallelStream()
            .filter(aluno -> aluno.id % 2 == 1)
            .reduce("", (_accumulator, aluno) ->  String.valueOf(aluno.id), (a,b) ->  a + " " + b);

        System.out.printf("Menor nome %s \n", menorNome);
        System.out.printf("Maior nome %s \n", maiorNome);
        System.out.printf("Id inpares: %s \n", idImpares);

    }
}