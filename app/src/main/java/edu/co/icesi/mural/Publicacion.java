package edu.co.icesi.mural;

public class Publicacion {

    public static final char LIBROS= 'l';
    public final static char HERRAMIENTAS= 'H';
    public final static char VIVIENDAS= 'V';
    public final static char CELULARES_COMPUTADORES= 'C';
    public final static char MONITORES= 'M';
    public final static char VEHICULOS= 'A';
    public final static String USADO ="US";
    public final static String NUEVO ="NV";
    public final static String NOAPLICA ="NA";

    private char tipo;
    private Usuario usuario;
    private String titulo;
    private String descripcion;
    private String ubicacion;
    private String estado;
    private int precio;

}

