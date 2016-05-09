package snakecamel;

import java.util.*;

public class Main {
	public static void main(String[] args){
		
		SnakeCamelUtil scu = new SnakeCamelUtil();
		
		String before = "";

		
		System.out.println("capitalize()を呼び出します。");
		System.out.println(scu.capitalize("a"));
		System.out.println(scu.capitalize("xyz"));
	
		System.out.println("uncapitalize()を呼び出します。");
		System.out.println(scu.uncapitalize("A"));
		System.out.println(scu.uncapitalize("Xyz"));
		
		System.out.println("snakeToCamelCase()を呼び出します。");
		System.out.println(scu.snakeToCamelcase("abc"));
		System.out.println(scu.snakeToCamelcase("abc_def"));
		System.out.println(scu.snakeToCamelcase("abc_def_gh"));
		System.out.println(scu.snakeToCamelcase("abc__def___gh"));
		System.out.println(scu.snakeToCamelcase("_abc_def__"));
		
		System.out.println("camelToSnakeCase()を呼び出します。");
		System.out.println(scu.camelToSnakecase("Abc"));
		System.out.println(scu.camelToSnakecase("AbcDef"));
		System.out.println(scu.camelToSnakecase("AbcDefGh"));
	}
	
	
}
