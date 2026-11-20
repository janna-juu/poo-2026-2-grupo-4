package alunos;

//classe dos alunos seniors

public class AlunoSenior extends Aluno{

    public AlunoSenior(String nome, String cpf, int idade){
        super(nome,cpf,idade);
    }

    @Override
    public double percentualDeDesconto(){
        return 0.30;
    }
}
