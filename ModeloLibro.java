
/**
 * Un ejemplo POO para controlar el préstamo de las copias de un Libro.
 * 
 * Todos los atributos se declaran con el modificador "protected" (concepto de encapsulamiento).
 * 
 * Para cada uno de los atributos o propiedades básicas se crean métodos
 * GET (para acceder al valor) y SET (para modificar el valor).
 * 
 * Los demas métodos diferentes a GET/SET corresponde a funcionalidades 
 * específicas de los requerimientos:
 * 
 * Req1: Consultar la cantidad de copias disponibles para prestar.
 * Corresponde a la resta entre numeroDeCopias y numeroDeCopiasPrestadas
 * 
 * Req2: Registrar el préstamo de una copia del libro.
 * 
 * Req3: Registrar la devolución de una copia prestada.
 * 
 * Req4: Cambiar la cantidad de copias del libro, evitando inconsistencias.
 * numeroDeCopias no puede ser menor que numeroDeCopiasPrestadas ¿por qué?
 * 
 * @author (Milton Jesús Vera Contreras - miltonjesusvc@ufps.edu.co)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
public class ModeloLibro
{
    
   /**Título del libro*/
   //COMPLETE
   private String title;
   /**Nombre de la Empresa editorial*/
   //COMPLETE
   private String editorial;

   /**Nombre de los autores*/
   //COMPLETE
   private String autor;
   /**Año en que fué impreso el libro*/
   //COMPLETE
   private int year;
   /**Cantidad de hojas-páginas del libro*/
   //COMPLETE
   private int pages;
   /**Valor en que se compró el libro*/
   //COMPLETE
   private int value;
   /**Cantidad de ejemplares-copias del libro*/   
   //COMPLETE
   private int copys;
   /**Cantidad de ejemplares-copias prestados*/
   //COMPLETE
   private int copysBorrows;

   /**Método Constructor que inicializa con valores por defecto*/
   public ModeloLibro()
   {
     //COMPLETE
     
     year=0;
     pages=0;
     value=0;
     copys=0;
     copysBorrows=0;
     autor="";
   }//Fin constructor default

   /***
    * Método Construye que inicializa las propiedades con los parámetros recibidos
    * @param    titulo valor inicial de la propiedad titulo
    * @param    editorial valor inicial de la propiedad editorial
    * @param    autores valor inicial de la propiedad autores
    * @param    añoEdicion valor inicial de la propiedad añoEdicion 
    * @param    numeroDePaginas valor inicial de la propiedad numeroDePaginas
    * @param    precio valor inicial de la propiedad precio
    * @param    numeroDeCopias valor inicial de la propiedad numeroDeCopias
    */
   public ModeloLibro(int añoEdicion, int numeroDePaginas,int precio, String titulo, String editorial,String autores, int numeroDeCopias)
   {
     //COMPLETE
     title=titulo;
     this.editorial=editorial;
     autor=autores;
     year=añoEdicion;
     pages=numeroDePaginas;
     value=precio;
     copys=numeroDeCopias;
     
    }//Fin constructor con parámetros
    
    /**
     * Método de acceso a la propiedad titulo
     * @return el valor de titulo para éste objeto Libro
     */
    public String getTitulo()
    {
       //COMPLETE
       return title;
    }//fin getTitulo

    /***
     * Método para modificación de la propiedad titulo
     * @param   titulo el nuevo valor de la propiedad titulo
     */
    public void setTitulo(String titulo)
    {
      //COMPLETE
      title = titulo;
    }//fin setTitulo
    
    /**
     * Método de acceso a la propiedad editorial
     * @return el valor de editorial para éste objeto Libro
     */
    public String getEditorial()
    {
       //COMPLETE
       return this.editorial;
    }//fin getEditorial
    
        /***
     * Método para modificación de la propiedad editorial
     * @param   editorial el nuevo valor de la propiedad editorial
     */    
    public void setEditorial(String editorial)
    {
      //COMPLETE
      this.editorial=editorial;
    }//fin setEditorial
    
    /**
     * Método de acceso a la propiedad autores
     * @return el valor de autores para éste objeto Libro
     */
    public String getAutores()
    {
       //COMPLETE
       return this.autor;
    }//fin getAutores
    
    /***
     * Método para modificación de la propiedad autores
     * @param   autores el nuevo valor de la propiedad autores
     */ 
    public void setAutores(String autores)
    {
      //COMPLETE
      this.autor=autores;
    }//fin setAutores
        
    /**
     * Método de acceso a la propiedad añoEdicion
     * @return el valor de añoEdicion para éste objeto Libro
     */
    public int getAñoEdicion()
    {
       //COMPLETE
       return this.year;
    }//fin getAñoEdicion

        /***
     * Método para modificación de la propiedad añoEdicion
     * @param   añoEdicion el nuevo valor de la propiedad añoEdicion
     */
    public void setAñoEdicion(int añoEdicion)
    {
      //COMPLETE
      this.year=añoEdicion;
    }//fin setAñoEdicion
    
    /**
     * Método de acceso a la propiedad numeroDePaginas
     * @return el valor de numeroDePaginas para éste objeto Libro
     */
    public int getNumeroDePaginas()
    {
       //COMPLETE
       return this.pages;
    }//fin getNumeroDePaginas

        /***
     * Método para modificación de la propiedad numeroDePaginas
     * @param   numeroDePaginas el nuevo valor de la propiedad numeroDePaginas
     */
    public void setNumeroDePaginas(int numeroDePaginas)
    {
       //COMPLETE
       pages=numeroDePaginas;
    }//fin setNumeroDePaginas
    
    /**
     * Método de acceso a la propiedad precio
     * @return el valor de precio para éste objeto Libro
     */
    public int getPrecio()
    {
       //COMPLETE
       return this.value;
    }//fin getPrecio
        
    /***
     * Método para modificación de la propiedad precio
     * @param   precio el nuevo valor de la propiedad precio
     */
    public void setPrecio(int precio)
    {
      //COMPLETE
      value=precio;
    }//fin setPrecio
       
    /**
     * Método de acceso a la propiedad numeroDeCopias
     * @return el valor de numeroDeCopias para éste objeto Libro
     */
    public int getNumeroDeCopias()
    {
       //COMPLETE
       return this.copys;
    }//fin getNumeroDeCopias
    
    /**
     * Método de acceso a la propiedad numeroDeCopiasPrestadas
     * @return el valor de numeroDeCopiasPrestadas para éste objeto Libro
     */
    public int getNumeroDeCopiasPrestadas()
    {
      //COMPLETE
      return this.copysBorrows;
    }//fin getNumeroDeCopiasPestadas

    /*
     * No hay método SET para numeroDeCopiasPrestadas pues ésta propiedad
     * se modifica al prestar (Req2) y devolver (Req3).
     * No hay método SET para numeroDeCopias, en su lugar el método cambiarNumeroDeCopias (Req4)
    */
    
    /*--- Desde aquí comienzan los métodos para satisfacer los Requerimientos---*/
    
    /**
     * Determina la cantidad de copias disponibles para prestar (Req1)
     * @return  la diferencia entre la cantidad de copias y la cantidad de prestamos
     */
    public int getNumeroDeCopiasDisponibles()
    {
      //COMPLETE
      return this.copys;
    }//fin getNumeroDeCopiasDisponibles
    
    /***
     * Registra el préstamo de una de las copias de este libro (Req2)
     * @return  true si pudo registrar el prestamo, false si no.
     */
    public boolean prestar()
    {
       //COMPLETE
       if(copys>0){
           copys--;
           copysBorrows++;
           return true;
        }
        return false;
    }//fin método prestar

    /***
     * Registra la devolución de una de las copias de este libro (Req3)
     * @return  true si pudo registrar la devolución, false si no.
     */
    public boolean devolver()
    {
       //COMPLETE
       if(copysBorrows>0){
           copysBorrows--;
           copys++;
           return true;
        }
        return false;
       
    }//fin método devolver
    
    /***
     * Método para modificación de la propiedad numeroDeCopias. (Req4)
     * Controla que no se reduzca numeroDeCopias a un valor inconsistente:  
     * numeroDeCopias no puede ser menor que numeroDeCopiasPrestadas
     * @param   numeroDeCopias el nuevo valor de la propiedad numeroDeCopias
     * @return true si pudo cambiar el valor, false si no se pudo. 
     */ 
    public boolean cambiarNumeroDeCopias(int numeroDeCopias)
    {
      //COMPLETE
      if(numeroDeCopias>=copysBorrows){
          copys=numeroDeCopias;
          return true;
        }
        return false;
    }//fin setNumeroDeCopias
    
    /***
     * Regresa una cadena String con los datos del Libro
     * @override java.lang.Object.toString
     */
    public String toString()
    {
      String str = "\n**********Libro**********\n";
      str = str + "Titulo: " + this.getTitulo()+"\n";
      str = str + "Autores: "  + this.getAutores()+"\n";
      str = str + "Editorial: "  + this.getEditorial()+"\n";
      str = str + "Año: "  + this.getAñoEdicion()+"\n";
      str = str + "Paginas: "  + this.getNumeroDePaginas()+"\n";
      str = str + "Precio: "  + this.getPrecio()+"\n";      
      str = str + "Copias: "  + this.getNumeroDeCopias()+"\n";
      str = str + "Copias Disponibles: "  + this.getNumeroDeCopiasDisponibles()+"\n";
      str = str + "Copias Prestadas: "  + this.getNumeroDeCopiasPrestadas()+"\n";
      return str;
    }
    
}//fin clase Libro