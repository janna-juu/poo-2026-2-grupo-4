package alunos;

//subclasse dos alunos regulares

class alunoRegular extends Aluno{

    public alunoRegular(String nome, String cpf, int idade){
        super(nome,cpf,idade);
    }
   
    @Override
    public double percentualDeDesconto(){
        return 0.0;
    }
}