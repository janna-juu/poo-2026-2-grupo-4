package alunos;

//subclasse dos alunos estudantes

class alunoEstudante extends Aluno{

    public alunoEstudante(String nome, String cpf, int idade){
        super(nome,cpf,idade);
    }

    @Override
    public double percentualDeDesconto(){
        return 0.20;
    }
}

