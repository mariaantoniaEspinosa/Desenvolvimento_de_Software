public class PrincipalCasa {
    public static void main(String[] args) {
        ProjetoCasa casa = new ProjetoCasa();
        float valor;
        valor = casa.calcularPreco(70);
        System.out.println("Valor: " + valor);
        valor = casa.calcularPreco(70, 3);
        System.out.println("Valor 2: " + valor);
         
    }
    
}
