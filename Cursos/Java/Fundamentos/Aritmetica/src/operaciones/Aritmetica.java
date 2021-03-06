package operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
    //Constructor Vacío
    public Aritmetica()
    {
        System.out.println("Ejecutando constructor");
    }
    
    public Aritmetica(int arg1, int arg2)
    {
        this.a = arg1;
        this.b = arg2;
    }
    
    //Metodo
    public void sumar()
    {
       int resultado = a + b;
        System.out.println("resultado= " + resultado);
    }
    
    public int sumarConRetorno()
    {
        int resultado = this.a+this.b;
        return resultado;
    }
    
    public int sumarConArgumentos(int a, int b)
    {
        this.a = a; //El argumento a se asigna al atributo this.a
        this.b= b;
        
        //return a + b;
        return this.sumarConRetorno();
    }
}
