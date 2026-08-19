package cadastroalunos;

public class Aluno {
    private String nomeCompleto;
    private String dataNascimento;
    private String sexo;
    private int matricula;
    private String curso;
    private String endereco;
    private String estado;
    private String telefone;
    private String CPF;

    public Aluno(String nomeCompleto, String dataNascimento, String sexo, int matricula, String curso, String cpf, String endereco, String estado, String telefone) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.matricula = matricula;
        this.curso = curso;
        this.endereco = endereco;
        this.estado = estado;
        this.telefone = telefone;
        this.CPF = cpf;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEstado() {
        return estado;
    }

    public String getTelefone() {
        return telefone;
    }
    
    public String getCPF(){
        return CPF;
    }
    
}
