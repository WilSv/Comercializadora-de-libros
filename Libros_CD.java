package libros_cd;

/**
 *
 * @author Karasu
 */
public class Libros_CD {

     private int ISBN;
    private String Autor;
    private String Titulo;
    private int Numerodepaginas;
    private double PrecioVenta;
    private String editorial;
    private int anioPublicacion;
    private String TituloCD;
    private String Interprete;
    private int anioPublicacionCD;
    private double PrecioVentaCD;

    public Libros_CD(int ISBN, String Autor, String Titulo, int Numerodepaginas, double PrecioVenta, String editorial, int anioPublicacion) {
        this.ISBN = ISBN;
        this.Autor = Autor;
        this.Titulo = Titulo;
        this.Numerodepaginas = Numerodepaginas;
        this.PrecioVenta = PrecioVenta;
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
    }

    public Libros_CD(String TituloCD, String Interprete, int anioPublicacionCD, double PrecioVentaCD) {
        
        this.TituloCD = TituloCD;
        this.Interprete = Interprete;
        this.anioPublicacionCD = anioPublicacionCD;
        this.PrecioVentaCD= PrecioVentaCD;
    }
    
    
    
   
    public static void main(String[] args) {
        Libros_CD libro1=new Libros_CD(1234 ," Miyasaki" , " Bloodborne " , 20 , 25 , " lacoste " , 1999);
        Libros_CD libro2=new Libros_CD(12234 , " Miyasaki " , "  Dark Souls " , 24 , 20 , " lacost " , 1999);
        
        System.out.println(libro1.toString());
        System.out.println();
        System.out.println("El precio del libro con el IVA y el descuento incluido es de : " + libro1.PrecioVenta());
        System.out.println();
        System.out.println(libro2.toString());
        System.out.println();
        System.out.println("El precio del libro con el IVA y el descuento incluido es de : " + libro2.PrecioVenta());
        System.out.println();
        
        
        Libros_CD CD1= new Libros_CD("Inmortals" , "Fall out boys" , 2014 , 25);
        Libros_CD CD2= new Libros_CD("Radioactive" , "Imagine Dragons" , 2015 , 30);
        
        System.out.println(CD1.toString2());
        System.out.println();
        System.out.println("El precio del CD con el IVA y el descuento incluido es de " + CD1.PrecioVentaCD());
        System.out.println();
        System.out.println(CD2.toString2());
        System.out.println();
        System.out.println("El precio del CD con el IVA y el descuento incluido es de " + CD2.PrecioVentaCD());
        
        
        
            
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getNumerodepaginas() {
        return Numerodepaginas;
    }

    public void setNumerodepaginas(int Numerodepaginas) {
        this.Numerodepaginas = Numerodepaginas;
    }

    public double getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(double PrecioVenta) {
        this.PrecioVenta = 25;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getTituloCD() {
        return TituloCD;
    }

    public void setTituloCD(String TituloCD) {
        this.TituloCD = TituloCD;
    }

    public String getInterprete() {
        return Interprete;
    }

    public void setInterprete(String Interprete) {
        this.Interprete = Interprete;
    }

    public int getAnioPublicacionCD() {
        return anioPublicacionCD;
    }

    public void setAnioPublicacionCD(int anioPublicacionCD) {
        this.anioPublicacionCD = anioPublicacionCD;
    }

    public double getPrecioVentaCD() {
        return PrecioVentaCD;
    }

    public void setPrecioVentaCD(double PrecioVentaCD) {
        this.PrecioVentaCD = PrecioVentaCD;
    }
    
    

    
    
    public double PrecioVenta(){
        int precioDescuento = (int) ((PrecioVenta * 20)/100);
        int precioIVA = (int) ((PrecioVenta * 4)/100);
        PrecioVenta= precioIVA + PrecioVenta - precioDescuento;
       
        
        
        return PrecioVenta;
    }
    
    public double PrecioVentaCD(){
        int precioDescuentoCD = (int) ((PrecioVentaCD * 10)/100);
        int precioIVACD = (int) ((PrecioVentaCD * 9)/100);
        PrecioVentaCD= precioIVACD + PrecioVentaCD - precioDescuentoCD;
        
        return PrecioVentaCD;
    }
    @Override
    public String toString(){
        return" El libro " + Titulo + " con ISBN " + ISBN + " creado por el autor " + Autor  + " tiene un precio de " + PrecioVenta + " , su editorial es " + editorial + " y su año de publicacion fue " + anioPublicacion;
    } 
    
    public String toString2(){
        return "El CD " + TituloCD + " compuesto por " + Interprete + " que fue lanzado el  " + anioPublicacionCD + " tiene un precio de " + PrecioVentaCD ;
    }
}
