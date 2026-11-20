package alunos;

//subclasse dos alunos regulares

public class AlunoRegular extends Aluno{

    public AlunoRegular(String nome, String cpf, int idade){
        super(nome,cpf,idade);
    }
   
    @Override
    public double percentualDeDesconto(){
        return 0.0;
    }
}