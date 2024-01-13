package Enumeracões;

import java.util.EnumSet;

public class EnumTEst {
	public static void main(String[] args) {
		System.out.println("All Books: \n");

		//IMPRIME TODOS OS LIVROS EM ENUM BOOK
		for(Book book : Book.values()) {
			System.out.printf("%-10s%-45s%s\n",book,book.getTitle(),book.getCopyrightYear());
		}
		System.out.println("\nDysplay a ranger of enum constantes\n");

		//IMPRIME OS PRIMEIROS QUATRO LIVROS
		for(Book book : EnumSet.range(Book.JHTP, Book.CPPHRP) )
			System.out.printf("%-10s%-45s%s\n",book,book.getTitle(),book.getCopyrightYear());
		
	}
}
