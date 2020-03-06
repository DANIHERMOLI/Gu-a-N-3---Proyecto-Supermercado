
package supermercado;

/**
 * Maneja la información de los empleados de un supermercado
 * @author Daniela
 */
public class empleado {
   //Atributos
    private String nombre;
    private String departamento;
    private String cargo;
    private double salario;
    
  //Constructor
    public empleado (String nombre, String departamento,String cargo,double salario )
    {
        this.nombre = nombre;
        this.departamento= departamento;
        this.cargo = cargo;
        this.salario = salario;
    }
    //Getters
    public String getnombre()
    {
        return nombre;
    }
     public String getdepartamento()
    {
        return departamento;
    }
      public String getcargo()
    {
        return cargo;
    }
       public double getsalario()
    {
        return salario;
    }
     //Setters
    public void setnombre(String nombre)
    {
        this.nombre = nombre;
    }
    public void setdepartamento(String departamento)
    {
        this.departamento = departamento;
    }
    public void setcargo(String cargo)
    {
        this.cargo = cargo;
    }
    public void setsalario(double salario)
    {
        this.salario = salario;
    }
    public static void main(String[] args) {
    
 
    
}
    

