import java.util.Scanner;

<<<<<<< HEAD
class Calculator {
	
	
  static int add(int a, int b){ 
	  int res= a +b ;
	  return res; 
	  }

  static int sub(int a, int b){ return 0; }
  static int mul(int a, int b){ return 0; }
  static int div(int a, int b){ return 0; }
  static int mod(int a, int b){ return 0; }
  
  
  public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x,a,b;
		double respuesta;
		
		System.out.println("Ingrese primer valor");
		a = scan.nextInt();
		System.out.println("Ingrese segundo valor");
		b = scan.nextInt();
		
		
		System.out.println("Ingrese un numero para seleccionar la operacion");
		System.out.println("1.Adicion");
		System.out.println("2.Sustraccion");
		System.out.println("3.Multiplicacion");
		System.out.println("4.Division");
		System.out.println("5.Modulo");
		x = scan.nextInt();

		switch (x) {
		case 1:
			respuesta = add(a,b);
			System.out.println(respuesta);
			break;
		case 2:
			respuesta = sub(a,b);
			System.out.println(respuesta);
			break;
		case 3:
			respuesta = mul(a,b);
			System.out.println(respuesta);
			break;
		case 4:
			respuesta = div(a,b);
			System.out.println(respuesta);
			break;
		case 5:
			respuesta = mod(a,b);
			System.out.println(respuesta);
			break;
		default:
			System.out.println("Numero invalido");
			break;
		}
}	}
=======
public class Calculator {
	public static void main(String []args){
     }
     public static int sumar(int a, int b){
           return a+b;
       }
     public static int restar(int a, int b){
     	return a - b;
     }
}
>>>>>>> 5be13dd465f182c2287e3e16d99c5ef8e51556ee
