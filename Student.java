public class Student {
    
    private String PrimerNombre;
    private String SegundoNombre;
    private String Genero;
    private String Carrera;
    private int math_score;

    public Student(String PrimerNombre, String SegundoNombre, String Genero, String Carrera, int math_score) {
        this.PrimerNombre = PrimerNombre;
        this.SegundoNombre = SegundoNombre;
        this.Genero = Genero;
        this.Carrera = Carrera;
        this.math_score = math_score;
    }

    public String getPrimerNombre() {
        return PrimerNombre;
    }

    public void setPrimerNombre(String PrimerNombre) {
        this.PrimerNombre = PrimerNombre;
    }

    public String getSegundoNombre() {
        return SegundoNombre;
    }

    public void setSegundoNombre(String SegundoNombre) {
        this.SegundoNombre = SegundoNombre;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public int getMath_score() {
        return math_score;
    }

    public void setMath_score(int math_score) {
        this.math_score = math_score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "PrimerNombre='" + PrimerNombre + '\'' +
                ", SegundoNombre='" + SegundoNombre + '\'' +
                ", Genero='" + Genero + '\'' +
                ", Carrera='" + Carrera + '\'' +
                ", math_score=" + math_score +
                '}';
    }
}

