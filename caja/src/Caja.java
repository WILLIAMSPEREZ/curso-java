public class Caja {
    //Agregar los atributos
    int ancho;
    int alto;
    int profundo;
     //Agregar un constructor vacio
  public Caja(){
    }
      //Agregar otro constructor con 3 argumentos
    public Caja(int ancho, int alto, int profundo){

      this.ancho = ancho;
      this.alto = alto;
      this.profundo = profundo;
    }

    //Agregar metodo para calcular volumen

    public int calcularVolumen(){

      return ancho*alto*profundo;
    }

    public int calcularVolumen(int ancho, int alto, int profundo){

      return ancho * alto * profundo;
    }

}







