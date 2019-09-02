package edu.usal.config;

public class UniversitasConstants {

	//Constantes para respuestas del servidor al FrontEnd en metodos del Login
	public static final String REST_STATUS_CODE_OK = "OK";
	public static final String REST_STATUS_CODE_UNAUTHORIZED = "401";
	public static final String REST_STATUS_CODE_NOT_FOUND = "404";
	public static final String REST_STATUS_CODE_UNDEFINED = "405";
	
	public static final  String LOGIN_ERROR_GOOGLE = "Error login google.";
	public static final  String LOGIN_ERROR_DOMINIOUSAL = "La cuenta no pertenece al dominio @usal.edu.ar";
	public static final  String LOGIN_ERROR_USUARIO_INEXISTENTE = "Usuario inexistente";
	//public static final  String LOGIN_ERROR_USUARIO_INEXISTENTE = "";
	
	// constantes para identificar el origen de la persona
	public static final int PERSONA_ORIGEN_APPGRAL = 1;
	public static final int PERSONA_ORIGEN_PERSONAL = 2;
	//public static final int PERSONA_ORIGEN_PREINGRESO = 3;

	
}
