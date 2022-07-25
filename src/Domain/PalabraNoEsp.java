package Domain;

public class PalabraNoEsp extends Palabra{
    private String pronunciación;

    public PalabraNoEsp(String palabra, String significado, String idioma, String pronunciación) {
        super(palabra, significado, idioma);
        this.pronunciación = pronunciación;
    }

    //realizo solo el get

    public String getPronunciación() {
        return pronunciación;

    }
}
