public class ProjetoCasa {
    public float valor;
    
    public float calcularPreco(int tamanho){
        valor = 4300 *tamanho;
        return valor;
    }
    
    public float calcularPreco(int tamanho, int quartos){
       valor = 4300*tamanho + (2500*quartos);
       return valor;
    }
}
