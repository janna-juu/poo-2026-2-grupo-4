package alunos;

//subclasse dos alunos estudantes

public class AlunoEstudante extends Aluno{

    public AlunoEstudante(String nome, String cpf, int idade){
        super(nome,cpf,idade);
    }

    @Override
    public double percentualDeDesconto(){
        return 0.20;
    }
}

