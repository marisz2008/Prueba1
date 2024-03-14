

package Modelo;


public class Objeto {
    
  private int id; 
  private String nombre;
   //Constructor con parámetros
    public Objeto(int id, String nombre) 
    {
        this.id = id;
        this.nombre = nombre;
    }

    public Objeto() 
    {
    this.id=0;
    this.nombre="";
            
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    
  @Override
    public String toString() 
    {
        return "Objeto" + "id=" + id + ", nombre=" + nombre ;
    }
    
    
    
    
}//Fin de la clase
