
package herencia;
public class carromazda extends automovil {
    public carromazda(double peso, double altura, double ancho, double largo, int npuertas, String modelo) {
        super(peso, altura, ancho, largo, npuertas, modelo); 
        //System.out.println("mazda");
    } 

    public void turbo (){
      System.out.print("Esta acelerando a 140 Km/h");  
    }
}
