public class DobleP {
    
     private double r=234.43e32f; /* Esto es, en r se almacena la constante 234,43 x 10^32 */
     private double p=-3.43e-15; /* Esto es, en r se almacena la constante -3,43 x 10^(-15) */
    
    //constructor
    public DobleP (double r, double p){
        this.r=r;
        this.p=p;
        
        System.out.println("El valor de la variable cientifica de doble precicion es :"+(p*r));
        //se oueden hacer las mismas operacionses que un tipo de dato double, integer 
        //se utilizan cuando la cantidad de numeros es muy grande gerelamnete cuand supera los 32 bits
        System.out.println("El numero mas alto es "+Math.max(r, p));//asi se puede usar todas la librerias math
        
    }
    
   
}
