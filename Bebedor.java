
/**
 * Write a description of class Bebedor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bebedor
{
    // indica el nombre del que bebe la copa
    private String nombreBebedor;
    // indica el valor total de alcohol en sangre
    private int nivelAlcoholSangre;
    // indica el limite de alcohol en sangre
    private int limite;

    /**
     * Constructor for objects of class Bebedor
     */
    public Bebedor(String nombreBebedor)
    {
        this.nombreBebedor = nombreBebedor;
        nivelAlcoholSangre = 0;
        limite = 10;
    }

    /**
     * metodo para que el bebedor beba una copa
     */
    public void beberCopa(Cubata nombreCopa)
    {
        int alcoholEnSangre = nombreCopa.getCantidadAlcohol(); // variable local que almacena el alcohol de la copa que bebe
        nivelAlcoholSangre = nivelAlcoholSangre + alcoholEnSangre;// acumula el nivel de alcohol total en sangre        

        if(nivelAlcoholSangre>limite) //si supera el limite
        {
            System.out.println("No quiero beber mas copas");
        }
    }

    /**
     * metodo que nos devuelve el nivel de alcohol en sangre del bebedor
     */

    public int getNivelAlcoholEnSangre()
    {
        return nivelAlcoholSangre;
    }

    /**
     * metodo que pregunta al bebedor
     */
    public void preguntar(String pregunta)
    {
        int numeroLetrasPregunta;
        numeroLetrasPregunta = pregunta.length();//calcula el numero de letras

        if(nivelAlcoholSangre<limite && ! (pregunta.contains(nombreBebedor)))
        {
            if(numeroLetrasPregunta%2==0) // si el numero letras es par entonces
            {
                System.out.println("si");
            }
            else // el numero letras de la pregunta es impar
            {
                System.out.println("No");
            }
        }
        else if(pregunta.contains(nombreBebedor)) // si la pregunta contiene el nombre del bebedor
        {
            System.out.println(pregunta.toUpperCase());

        }
        else
        {
            System.out.println(pregunta.toUpperCase());
        }
    }

            
}

