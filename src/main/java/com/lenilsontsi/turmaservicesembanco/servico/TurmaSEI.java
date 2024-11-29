package com.lenilsontsi.turmaservicesembanco.servico;

import java.util.List;

import com.lenilsontsi.turmaservicesembanco.modelo.Turma;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface TurmaSEI {
	@WebMethod
	public List<Turma> listar();
}
