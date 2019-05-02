package Sistema.Modelo;

public class PoligonoRegular {
    //Atributos
    private int n;    //Numero de lados del Poligno
    private double lado;  //Longitud del lado
    private double x;     //Coordenada x
    private double y;     //Coordenada y
    
    //Contructor de creacion valores predeterminados
    public PoligonoRegular(){
        n=3;
        lado=1;
        x=0;
        y=0;
    }
    
    //Constructor de poligno con lados, longitud de lados y centrado en (0,0) por parametros
    public PoligonoRegular(int m, double longitud){
        n=m;
        lado=longitud;
        x=0;
        y=0;
    }
    
    //Constructor de poligono con lados, longitud de lados y coordenadas x e y
    public PoligonoRegular(int m, double longitud, double cordx, double cordy){
        n=m;
        lado=longitud;
        x=cordx;
        y=cordy;
    }
    
    //Metodos de acceso y mutadores
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    //Metodo getPerimetro
    public double getPerimetro(){
        double perimetro = (n*lado);
        return perimetro;
    }
    
    //Metodo get Area
    public double getArea(){
        double a = (Math.PI/n);
        double apotema = lado/(2*Math.tan((a/2)));
        double area = ((n*lado*apotema)/2);
        return area;
        
    } 
}
