package com.lenilsontsi.turmaservicesembanco.servico;

import java.util.ArrayList;
import java.util.List;

import com.lenilsontsi.turmaservicesembanco.dao.TurmaDao;
import com.lenilsontsi.turmaservicesembanco.dao.TurmaImpl;
import com.lenilsontsi.turmaservicesembanco.modelo.Turma;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.lenilsontsi.turmaservicesembanco.servico.TurmaSEI")
public class TurmaSIB implements TurmaSEI {
	@Override
	public List<Turma> listar() {
		TurmaDao dao = new TurmaImpl();
		List<Turma> turmas = new ArrayList<Turma>();
		try {
			turmas = dao.listar();
			return turmas;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return turmas;
	}
}
