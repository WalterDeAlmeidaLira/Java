package Enumeracões;

public enum Book {
	
	//DECLARA CONSTANTES DO TIPO ENUM
	JHTP("JAVA HOW TO PROGRAM","2010"),
	CHTP("C HOW TO PROGRAM","2007"),
	IW3HTP("iNTERNET & WORLD WIDE WEB HOW TO PROGRAM","2008"),
	CPPHRP("C++ HOW TO PROGRM","2008"),
	VBHTP("Visual Basic 2008 how to program", "2009"),
	CSHARPHTP("Visual C# 2008 how to program","2009");
	
	//CAMPOS DE INSTÂNCIA
	private final String title;
	private final String copyrightYear;
	
	//CONSTRUTOR ENUM
	Book(String bookTitle, String year){
		title = bookTitle;
		copyrightYear = year;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getCopyrightYear() {
		return copyrightYear;
	}
}
