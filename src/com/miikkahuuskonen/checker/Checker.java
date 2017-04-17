package com.miikkahuuskonen.checker;
import java.util.*;

public class Checker {
	private static Scanner input = new Scanner(System.in);
	
	public static String kaanna(String merkkijono) {
		String tulos = "";
		for (int i = 0; i < merkkijono.length(); i++) {
			char merkki = merkkijono.charAt(i);
			tulos = merkki + tulos.toUpperCase();		
		}
		
		return tulos;	
	}
	
	public static boolean palindromi(String merkkijono) {
		return merkkijono.equals(kaanna(merkkijono));
	}
	
	
	public static void main(String[] args) {
		
		String end = "lopeta";
		
		System.out.println("Anna sana: ");
		String sana = input.nextLine();
		
		while (!sana.equals(end)) {
	
			if (palindromi(sana.toUpperCase())) {
				System.out.println("Sana on palindromi");
			} else {
				System.out.println("Sana ei ole palindromi");
			}
			
			System.out.println("Anna sana: ");
			sana = input.nextLine();
		}
		
    }
}
