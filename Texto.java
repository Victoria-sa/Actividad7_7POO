package CadenaTexto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Texto {
private String cad;
LocalDate creacion;
LocalDateTime ultimaModificacion;
private final int LONGIUD_MAX;
static final String VOCALES_STRING="aeiouáéíóú";

public Texto(int longitud) {//paso el valor con el metodo

	LONGIUD_MAX = longitud;//asigno a la constante y se inicializa
	this.cad="";
	this.creacion=LocalDate.now();
	this.ultimaModificacion=null;
	//En este momento es cuando se crea el objeto con el constructoe 
	//Se inicializan todos los atributos de la clase
	
}
public void addFinal(char c) {//añade un caracter al final si hay sitio
	if( LONGIUD_MAX>cad.length()) {
	this.cad=this.cad+c;//la cadena +caracter que hemos recibido
	this.ultimaModificacion=LocalDateTime.now();
	}
}
public void addFinal (String cadena) {
	if(LONGIUD_MAX>cad.length()+cadena.length() ) {
	this.cad=this.cad+cadena;
	this.ultimaModificacion=LocalDateTime.now();
	}
}
public void addInicio (char c) {
	if( LONGIUD_MAX>cad.length()) {
	this.cad=c+this.cad;//caracter mas cadena que hemos recibido
	this.ultimaModificacion=LocalDateTime.now();
	}
}
public void addInicio (String cadena) {
	if(LONGIUD_MAX>cad.length()+cadena.length() ) {
	this.cad=cadena+this.cad;
	this.ultimaModificacion=LocalDateTime.now();
	}
}
public void mostrar() {
	DateTimeFormatter formato1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	System.out.println("Fecha de creacion: "+ creacion.format(formato1));
	DateTimeFormatter formato2=DateTimeFormatter.ofPattern("dd/MM/yyyy' Hora: 'hh:mm:ss");
	System.out.println("Fecha de ultima modificacion: "+ultimaModificacion.format(formato2));
	System.out.println("La cadena es: \n"+this.cad);
}
	
}
