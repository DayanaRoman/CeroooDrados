package ejemplo;

public class Main {
  
  public static void main(String[]  args){
    System.out.println("HOLA PAPUH");
    int s = suma (20, 30);
    System.out.println(s);
    int r = resta (20, 30);
    System.out.println(r);
    
    int m = multiplicacion (2, 3);
    System.out.println(m);
    
    try {
      double d =division (2, 0);
      System.out.println(d);
    } catch(Exeption e) {
      String mensaje = e.getMessage();
      e.printlnStackTrace(mensaje);
    }
    
    
  }
  
  public static int suma(int n1, int n2){
    return n1 + n2;
  }
  public static int resta(int n1, int n2){
    return n1 - n2;
  }
  public static int multiplicacion(int n1, int n2){
    return n1 * n2;
  }
  public static double division(double n1, int n2) throw Exeption{
    if(n2 == 0){
      throw new Exeption("NO ES POSIBLE HACER LA DIVISIÓN PAPUH")
    }
    return n1 / n2;
  }
}









