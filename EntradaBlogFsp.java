/**
 * fecha 19/02/2023
 * @author Francisco Salar Pérez
 * @version 2.3
 */
public class EntradaBlogFsp {


        public static char separador=':';
        private int id;
        private String texto;
        private String autor;



    /**
     * Método que lanza la excepción
     * @param id int recibe el número de entrada
     * @param autor String el nombre del autor de la entrada
     * @param texto String el texto que contiene la entrada
     * @throws IllegalArgumentException
     */
	public EntradaBlogFsp(int id,String autor,String texto)throws IllegalArgumentException{
            if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
            this.id=id;
            this.autor=autor;
            this.texto=texto;
        }


    /**
     * Método que imprime en pantalla el mensaje correspondiente
     * @return toString String devuelve como se vería la noticia
     */
    @Override
        public String toString(){
            String cad="";
            cad+="\nENTRADA DE"+separador+autor;
            cad+="\n "+texto;
            return cad;
        }



    /**
     * Método que devuelve la id
     * @return getId int Devuelve el número de la entrada
     */
        public int getId(){
            return this.id;
        }



    /**
     * Método que devuelve el texo
     * @return getTexto String devuelve el texto completo de la entrada
     */
    public String getTexto(){
            return this.texto;
        }



    /**
     * Método que devuelve el autor en mayúsculas
     * @return getAutor String devuelve el nombre del autor de la entrada en mayúsculas
     */
        public String getAutor(){
            return this.autor.toUpperCase();
        }


    /**
     * Método que devuelve el autor. Ya no se usa. Mejor ver getAutor
     * @return devuelveAutor String devuelve el nombre del autor.
     */
    public String devuelveAutor(){
            return this.autor;
        }


    /**
     * Método main
     * @param args No tiene porqué tener argumentos
     */
        public static void main(String[] args) {
            //Modificar.
            EntradaBlogFsp e1=new EntradaBlogFsp (3,"Francisco","Últimas noticias, está disponible BixBy 2.0");
            System.out.println(e1);
        }
}



