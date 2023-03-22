public class perros{
    private int numperros =0;

    private int chip;
    private char raza;
    private String nombre;

perros() { 
    chip = 0;
    raza =' ';
    nombre = " ";
    nuevoPerro();
}

//metodos
public void setchip(int c) { 
    chip = c;

}

public int getchip() {
    return(chip);
}

//public static vvoid nuevoPerro(){

public void nuevoPerro() { 
    numperros++;
}

//public static void muestraPerros(){
public void muestraPerros() {
    System.out.println("Número de perros: " + numperros);
}


}