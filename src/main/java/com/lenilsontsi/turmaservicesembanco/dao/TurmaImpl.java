package com.lenilsontsi.turmaservicesembanco.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.lenilsontsi.turmaservicesembanco.modelo.Turma;

public class TurmaImpl implements TurmaDao {
	@Override
	public List<Turma> listar() {
		ArrayList<Turma> turmas = new ArrayList<Turma>();
		String pattern = "yyyy-MM-dd'T'HH:mm:ssXXX";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);

		try {
			Date dataHoraInicial = sdf.parse("2022-09-10T04:20:50-00:00");
			Date dataHoraFinal = sdf.parse("2025-09-10T04:20:50-00:00");

			Turma tur1 = new Turma();
			tur1.setId(1);
			tur1.setDescricao("3714");
			tur1.setTurno("Matutino");
			tur1.setQuantidadeAlunos(22);
			tur1.setDataInicial(dataHoraInicial);
			tur1.setDataFinal(dataHoraFinal);

			Turma tur2 = new Turma();
			tur2.setId(2);
			tur2.setDescricao("3714A");
			tur2.setTurno("Matutino");
			tur2.setQuantidadeAlunos(35);
			tur2.setDataInicial(dataHoraInicial);
			tur2.setDataFinal(dataHoraFinal);

			Turma tur3 = new Turma();
			tur3.setId(3);
			tur3.setDescricao("3714C");
			tur3.setTurno("Vespertino");
			tur3.setQuantidadeAlunos(19);
			tur3.setDataInicial(dataHoraInicial);
			tur3.setDataFinal(dataHoraFinal);

			turmas.add(tur1);
			turmas.add(tur2);
			turmas.add(tur3);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return turmas;
	}
}
