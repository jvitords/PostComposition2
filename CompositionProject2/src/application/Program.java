package application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Post;

public class Program {
	public static void main(String[] args) {
		List<Post> postagens = new ArrayList<Post>();
		adicionarPost(postagens);
	}
	
	public static void adicionarPost(List<Post> lista) {
		
		Scanner digitar = new Scanner(System.in);
		//List<Post> postagens = new ArrayList<Post>();
		
		System.out.println("======== POSTAGEM ========\n");
		
		System.out.print("Titulo: ");
		String tituloPostagem =  digitar.nextLine();  
		System.out.print("Legenda: ");
		String legendaPostagem =  digitar.nextLine();  

		Post postagem = new Post(LocalDate.now(), "", "", 5);
		lista.add(postagem);
	}
}
