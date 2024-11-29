package com.lenilsontsi.turmaservicesembanco;

import com.lenilsontsi.turmaservicesembanco.servico.TurmaSIB;

import jakarta.xml.ws.Endpoint;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	String porta = "8088";
		System.out.println("Publicando o serviço na porta: " + porta);
		Endpoint.publish("http://localhost:" + porta + "/turmas", new TurmaSIB());
		System.out.println("Serviço publicado na porta: " + porta);
    }
}
