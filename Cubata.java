
/**
 * Write a description of class Cubata here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cubata
{
    //indica el nombre de la copa
    private String nombreCopa;
    // indica la cantidad de alcohol que tiene la copa
    private int cantidadAlcohol;

    /**
     * Constructor for objects of class Cubata
     */
    public Cubata(String nombreCopa, int cantidadAlcohol)
    {
       this.nombreCopa = nombreCopa;
       this.cantidadAlcohol = cantidadAlcohol;
       
    }
    /**
     * metodo que devuelve la cantidad de alcohol que hay en la copa
     */
    public int getCantidadAlcohol()
    {
        return cantidadAlcohol;
    }
     
   
    
    
}
