package com.mitocode.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class SorteoBean implements Serializable {
	
	private String nombre;
	private String ganador;
	private List<String> lista;

	@PostConstruct
	public void init() {
		this.lista = new ArrayList<>();
	}
	
	public void sortear() {
		Integer[] numeros = new Integer[] { 1, 2, 3, 4 };
		List<Integer> numerosList = Arrays.asList(numeros);

		Collections.shuffle(this.lista);
		Collections.shuffle(numerosList);

		this.ganador = this.lista.get(numerosList.get(0));		
	}

	public void agregar() {
		this.lista.add(nombre);
	}
	/*
	 * getters & setters
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<String> getLista() {
		return lista;
	}

	public void setLista(List<String> lista) {
		this.lista = lista;
	}

	public String getGanador() {
		return ganador;
	}

	public void setGanador(String ganador) {
		this.ganador = ganador;
	}

}
