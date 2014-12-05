
/**
 * Representa un cubata
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cubata
{
    //indica el nombre de la copa
    private String nombreCopa;
    // indica la cantidad de alcohol que tiene la copa
    private float cantidadAlcohol;

    /**
     * Constructor de la clase:crea un cubata con el nombre y la cantidad de alcohol dada
     */
    public Cubata(String nombreCopa, float cantidadAlcohol)
    {
       this.nombreCopa = nombreCopa;
       this.cantidadAlcohol = cantidadAlcohol;
       
    }
    /**
     * metodo getter que devuelve la cantidad de alcohol que hay en la copa
     */
    public float getCantidadAlcohol()
    {
        return cantidadAlcohol;
    }
     
   
    
    
}
