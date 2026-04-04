package br.com.andreina.academiaa;

import java.util.ArrayList;

public class Academia {

    private ArrayList<Aluno> alunos;
    public static int totalAlunos = 0;
    public final int LIMITE_VAGAS = 50;

    public Academia(){
        alunos = new ArrayList<>();
    }

    public void cadastrarAluno(Aluno aluno){

        if (totalAlunos >= LIMITE_VAGAS){
            System.out.println("Academia esta lotada. Nao aceitamos mais matriculas.");
        }
        else if (aluno.getIdade() < 14){
            System.out.println("Aluno nao pode ser matriculado.");
        }
        else{
            alunos.add(aluno);
            totalAlunos++;
            System.out.println("Aluno cadastrado com sucesso!");
        }
    }

    public void listarAlunos(){

        if (alunos.isEmpty()){
            System.out.println("Nenhum aluno cadastrado.");
        }
        else {
            System.out.println("Lista de Alunos:");
            for (int i = 0; i < alunos.size(); i++){
                System.out.println("Nome: " + alunos.get(i).getNome());
                System.out.println("Idade: " + alunos.get(i).getIdade());
                System.out.println("Plano: " + alunos.get(i).getPlano());
                System.out.println("---------------------------");
            }
        }
    }

    public static void mostrarTotalAlunos(){
        System.out.println("Total de alunos: " + totalAlunos);
    }
}