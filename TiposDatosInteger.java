public class TiposDatosInteger
{
public static void main(String [] args)
{
int x = 250;
System.out.println("La variable x es " + x);
short a, b, c;
c = 21;
b = 9;
a = (short) (b + c); //por que se hace el casting con el tipo short?
System.out.println("la variable a es: " + a);
long y = 12345678987654321L; //note el identificador “L”
System.out.println("la variable y es " + y);
y = x;
byte s;
s = (byte) c;
System.out.println("Al final la variable y es: " + y + " y la variable s es " + s);
}
}
