package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Post {
	
	private LocalDateTime moment;
	private String title;
	private String content; // legenda do post
	private Integer likes;
	List<Coment> listaDeComentarios = new ArrayList<Coment>();
	
	public Post() {
	}
	
	public Post(LocalDateTime moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
	
	public void adicionarPost(List<Post> lista) {
		
		Scanner digitar = new Scanner(System.in);
		//List<Post> postagens = new ArrayList<Post>();
		
		System.out.println("======== CRIAR NOVA POSTAGEM ========\n");
		
		System.out.print("Titulo: ");
		String tituloPostagem =  digitar.nextLine();  
		System.out.print("Legenda: ");
		String legendaPostagem =  digitar.nextLine();  
		
		LocalDateTime dataDaPostagem = LocalDateTime.now();

		
		Post postagem = new Post(dataDaPostagem, tituloPostagem, legendaPostagem, null);
		lista.add(postagem);
		//System.out.println("\n" + dataDaPostagem + "\n" + postagem.getTitle() + "\n" + postagem.getContent() + "\n" + postagem.getLikes() + "\n\n");
	}
	
	
	public void adicionarComentarios(Coment comentario) {
		listaDeComentarios.add(comentario);
		System.out.println("\nComentário postado com sucesso!\n");
	}
	
	public void removerComentarios(Coment comentario) {
		listaDeComentarios.remove(comentario);
		System.out.println("\nComentário retirado com sucesso!\n");
	}
	
	public void mostrarPostagensFeitas(List<Post> listaDePostagem) {
		for (Post postagem : listaDePostagem) {			
			System.out.println("\n" + postagem.getMoment() + "\n" + postagem.getTitle() + "\n" + postagem.getContent() + "\n" + postagem.getLikes() + "\n\n");
		}
	}
	
	public void verComentarios() {
		for (Coment lista : listaDeComentarios) {
			System.out.println(lista.getTexto());
		}
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public String getMoment() {
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		String dataFormatada = moment.format(formatoData);
		return dataFormatada;
	}
}
