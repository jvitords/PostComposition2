package application;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Post;

public class Program {
	public static void main(String[] args) {
		List<Post> listaDePostagens = new ArrayList<Post>();
		
		Scanner digitar = new Scanner(System.in);
		
		menuDeopcoes();
		int opcaoEscolhida = 0;		
		
		while (opcaoEscolhida != 1) {
			
			int opcao = digitar.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.print("Digite o titulo da postagem: ");
				digitar.next();
				String titulo = digitar.nextLine();
				System.out.print("Digite a legenda da postagem: ");
				String legenda = digitar.nextLine();
				LocalDateTime data = LocalDateTime.now();
				Post postagem = new Post(data, titulo, legenda, null);
				postagem.adicionarPost(listaDePostagens, postagem);
				break;
		
			case 2:
				mostrarItensDaLista(listaDePostagens);
				System.out.print("\nDeseja adicionar comentário em qual post? ");
				int opcaoParaComentario = digitar.nextInt();
				Post postagemEscolhidaParaAdicionarComentario = listaDePostagens.get(opcaoParaComentario);
				postagemEscolhidaParaAdicionarComentario.adicionarComentarios();
				break;
			
			case 3:
				mostrarItensDaLista(listaDePostagens);
				System.out.print("\nDeseja remover qual postagem? ");
				int opcaoParaRemoverPostagem = digitar.nextInt();
				Post postagemEscolhidaParaSerRemovida = listaDePostagens.get(opcaoParaRemoverPostagem);
				postagemEscolhidaParaSerRemovida.removerPost(listaDePostagens, postagemEscolhidaParaSerRemovida);
				break;

			case 4:
				mostrarItensDaLista(listaDePostagens);
				break;

			case 5:
				
				mostrarItensDaLista(listaDePostagens);
				System.out.print("\nDeseja ver os comentários de qual postagem? ");
				int opcaoParaVerComentarios = digitar.nextInt();
				Post postagemParaVerOsComentarios = listaDePostagens.get(opcaoParaVerComentarios);
				postagemParaVerOsComentarios.mostrarComentarios();
				break;

			default:
				System.out.println("Opção inválida.");
			}
			
			digitar.close();
		}
	}
	
	public static void menuDeopcoes() {
		System.out.println("ESCOLHA A OPÇÃO: \n");
		System.out.println("1 - Adicionar postagem");
		System.out.println("2 - Adicionar comentário");
		System.out.println("3 - Remover postagem");
		System.out.println("4 - Ver postagens");
		System.out.println("5 - Ver comentários");
	}
	
	public static void mostrarItensDaLista(List<Post> listaDeListPost) {
		int contador = 1;
		for(Post postagem : listaDeListPost) {
			System.out.println("\n----- " + contador + "° Postagem -----");
			System.out.println("\nData da postagem: " + postagem.getMoment() + "\nTitulo: " + postagem.getTitle() + "\nLegenda: " + postagem.getContent() + "\nNúmero de likes: " + postagem.getLikes() + "\n\n");
		}
	}
}
