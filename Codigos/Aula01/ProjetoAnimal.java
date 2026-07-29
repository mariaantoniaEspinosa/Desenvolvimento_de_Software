package projetoanimal;

/**
 *
 * @author laboratorio
 */
abstract class ProjetoAnimal {
    public String nome;
    
    public void exibirDados(){
        System.out.println("Nome: " + nome);
    }
    
    abstract void emitirSom();
}
