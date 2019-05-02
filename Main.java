package Sistema;

import Sistema.Modelo.PoligonoRegular;

public class Main {
    public static void main(String[] args){
        PoligonoRegular poligono1 = new PoligonoRegular();
        PoligonoRegular poligono2 = new PoligonoRegular(6,4);
        PoligonoRegular poligono3 = new PoligonoRegular(10,4,5.6,7.8);
        
        System.out.println("Perimetro del poligono 1 "+poligono1.getPerimetro());
        System.out.println("Area del poligono 1 "+poligono1.getArea());
        
        System.out.println("Perimetro del poligono 2 "+poligono2.getPerimetro());
        System.out.println("Area del poligono 2 "+poligono2.getArea());
        
        System.out.println("Perimetro del poligono 3 "+poligono3.getPerimetro());
        System.out.println("Area del poligono 3 "+poligono3.getArea());

        //Parte que agregamos
        PoligonoRegular poligono4 = new PoligonoRegular(3,1);
        System.out.println("Perimetro: "+poligono4.getPerimetro());
        
    }
    
    
}
