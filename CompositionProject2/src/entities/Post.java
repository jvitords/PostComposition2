package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Post {
	
	private LocalDate moment;
	private String title;
	private String content; // legenda do post
	private Integer likes;
	List<Coment> listaDeComentarios = new ArrayList<Coment>();
	
	public Post(LocalDate moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
	
	public void adicionarComentarios(Coment comentario) {
		listaDeComentarios.add(comentario);
		System.out.println("\nComentário postado com sucesso!\n");
	}
	
	public void removerComentarios(Coment comentario) {
		listaDeComentarios.remove(comentario);
		System.out.println("\nComentário retirado com sucesso!\n");
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

	public Date getMoment() {
		return moment;
	}
}
