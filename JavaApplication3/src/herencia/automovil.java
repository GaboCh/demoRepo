package herencia;
public class automovil {
    double peso,altura,ancho,largo;
    int npuertas;
    boolean encendido;
    String modelo;

    public automovil(double peso, double altura, double ancho, double largo, int npuertas, String modelo) {
        this.peso = peso;
        this.altura = altura;
        this.ancho = ancho;
        this.largo = largo;
        this.npuertas = npuertas;
        this.modelo = modelo;
       System.out.print(peso);
       System.out.print(altura);
       System.out.print(ancho);
       System.out.print(largo);
       System.out.print(npuertas);
       System.out.print(modelo); 
    }
    
    public double peso(){
        return this.peso;
    }
    
     public boolean encendido(){
        return this.encendido;
    }
     
      public String apagar(){
        return "El carro esta apagado";
    }   
      public String estado (){
          if (encendido==true){
            return "esta encendido";
          }else{
            return "esta apagado";        
          }
      }
}
