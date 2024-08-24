package controllers;

import java.text.SimpleDateFormat;
import java.util.UUID;
import javax.swing.JOptionPane;
import entities.Funcionario;
import enums.TipoContratacao;
import repositories.FuncionarioRepository;

public class FuncionarioController {
	public void cadastrarFuncionario() {
		var funcionario = new Funcionario();
		
		try {
			funcionario.setId(UUID.randomUUID());
			funcionario.setNome(JOptionPane.showInputDialog("Nome do Funcionario: "));
			funcionario.setMatricula(JOptionPane.showInputDialog("Matrícula do Funcionario: "));
			funcionario.setDataAdimssao(new SimpleDateFormat("dd/MM/yyyy")
					.parse(JOptionPane.showInputDialog("Data de Admissão (dd/MM/yyyy)")));
			var opcao = JOptionPane.showInputDialog("Informe (1)Estágio, (2)CLT, ou (3)Terceirizado:");
			
			switch (opcao) {
			case "1": funcionario.setTipoContratacao(TipoContratacao.ESTAGIO); break;
			case "2": funcionario.setTipoContratacao(TipoContratacao.CLT); break;
			case "3": funcionario.setTipoContratacao(TipoContratacao.TERCEIRIZADO); break;
			}
			//Enviar os dados do funcionário para gravação em arquivo
			var funcionarioRepository = new FuncionarioRepository();
			funcionarioRepository.exportarDados(funcionario);
		} catch (Exception e) {
			System.out.println("Falha ao capturar os dados: " + e.getMessage());
		}

	}
}
