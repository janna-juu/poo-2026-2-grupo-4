package alunos;

// classe mãe 

abstract class Aluno {
    private String nome;
    private String cpf;
    private int idade;

    public Aluno(String nome, String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;

        if(nome == null){
            throw new IllegalArgumentException("Nome inválido");
        }

        if (cpf == null || cpf.length() != 11){
            throw new IllegalArgumentException("CPF Inválido");
        
        }
    }

    public String consultarNome() {
        return this.nome;
    }

    public String consultarCpf(){
        return this.cpf;            // aq eu não sei se precisa necessariamente de alguma censura em qualquer parte do cpf
    }

    public int consultarIdade(){
        return this.idade;
    } 

    public abstract double percentualDeDesconto();  //metodo abstrato
     
}











