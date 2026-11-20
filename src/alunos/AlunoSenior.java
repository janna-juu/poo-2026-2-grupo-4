package alunos;

//classe dos alunos seniors

class alunoSenior extends Aluno{

    public alunoSenior(String nome, String cpf, int idade){
        super(nome,cpf,idade);
    }

    @Override
    public double percentualDeDesconto(){
        return 0.30;
    }
}
