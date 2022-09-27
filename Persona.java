public class Persona {
    int id;
    int edad;
    String nombreCompleto;
    String sexo;

    public Persona(int id, String nombreCompleto, int edad, String sexo) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.sexo = sexo;
    }
    public String printInfo(){
        //System.out.println("id: " + id + " nombre: " + nombreCompleto + "edad" + edad);
        return "id: " + id + " nombre: " + nombreCompleto + " edad: " + edad;
    }
}
