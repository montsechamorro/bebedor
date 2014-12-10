
/**
 * Representa una persona que bebe alcohol
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bebedor
{
    // indica el nombre del bebedor
    private String nombreBebedor;
    // indica el valor total de alcohol en sangre
    private float nivelAlcoholSangre;
    // indica el limite de alcohol en sangre que admite el bebedor antes de dejar de beber copas
    private float limite;
    // guarda el nombre de la ultima copa que bebe
    private String ultimaCopa;

    /**
     * Constructor for objects of class Bebedor
     */
    public Bebedor(String nombreBebedor, float limite)
    {
        this.nombreBebedor = nombreBebedor;
        nivelAlcoholSangre = 0;
        this.limite = limite;
        ultimaCopa = "";
    }

    /**
     * metodo para que el bebedor beba una copa
     */
    public void beberCopa(Cubata nombreCopa)
    {
        if(nivelAlcoholSangre>limite) //si supera el limite, rechaza copa
        {
            System.out.println("No quiero beber mas copas!!");
        }
        else if(ultimaCopa == nombreCopa.getNombreCopa())
    
        {
            nivelAlcoholSangre = nivelAlcoholSangre + (nombreCopa.getCantidadAlcohol()* 2);
        }
            
        else // se bebe copa, aumentamos en nivel de alcohol en sangre
        {
            nivelAlcoholSangre = nivelAlcoholSangre + nombreCopa.getCantidadAlcohol();// acumula el nivel de alcohol total en sangre        
        }
        
        ultimaCopa = nombreCopa.getNombreCopa();

    }

    /**
     * metodo que nos devuelve el nivel de alcohol en sangre del bebedor
     */

    public float getNivelAlcoholEnSangre()
    {
        return nivelAlcoholSangre;
    }

    /**
     * metodo que pregunta al bebedor
     */
    public void preguntar(String pregunta)
    {
        if(nivelAlcoholSangre>=limite || (pregunta.contains(nombreBebedor)))
        {
            //Responde gritando
            System.out.println(pregunta.toUpperCase());
        }
        else
        {
            //Responde si o no
            int numeroLetrasPregunta = pregunta.length();//calcula el numero de letras
            if((numeroLetrasPregunta % 2) != 0) //como tiene dos operadores, marcamos con parentesis
            {
                //la pregunta tiene un numero letras impar
                System.out.println("No");
            }
            else
            {
                //la pregunta tiene un numero letras par
                System.out.println("si");
            }

        }
    }
}