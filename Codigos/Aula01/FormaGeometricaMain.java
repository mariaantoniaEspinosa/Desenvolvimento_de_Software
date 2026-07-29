public class Principal {
    public static void main(String[] args) {
        FormaGeometrica quadrado = new FormaGeometrica();
        quadrado.setLado(3.44f);
        float area;
        area = quadrado.CalcularArea();
        System.out.println("Area do quadrado: " + area);
        
        Triangulo t = new Triangulo();
        t.setAltura(4.5f);
        t.setBase(4.33f);
        area = t.CalcularArea();
        System.out.println("Area do triangulo: " + area);
        
    }
}
