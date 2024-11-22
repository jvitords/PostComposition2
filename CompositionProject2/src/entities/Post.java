package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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
	
	public void adicionarPost(List<Post> lista, Post postagem) {
			
		lista.add(postagem);
		System.out.println("Postagem adcionada com sucesso!");
		//System.out.println("\n" + dataDaPostagem + "\n" + postagem.getTitle() + "\n" + postagem.getContent() + "\n" + postagem.getLikes() + "\n\n");
	}
	
	public void removerPost(List<Post> lista, Post postagemEscolhidaParaRemoverPost) {
		
		lista.remove(postagemEscolhidaParaRemoverPost);
		System.out.println("Postagem removida com sucesso!");
	}
	
	public void adicionarComentarios() {
		
		Scanner digitar = new Scanner(System.in);
		System.out.print("Digite o comentário do post " + title +": ");
		String comentario = digitar.nextLine();
		Coment comentaComent = new Coment(comentario);
		listaDeComentarios.add(comentaComent);
		System.out.println("\nComentário postado com sucesso!\n");
		digitar.close();
	}
	
	public void mostrarComentarios() {
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