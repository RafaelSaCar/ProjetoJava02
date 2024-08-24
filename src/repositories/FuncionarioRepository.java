package repositories;

import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import entities.Funcionario;

public class FuncionarioRepository {
public void exportarDados(Funcionario funcionario) {
	try {
		var fileWriter = new FileWriter("c:\\temp\\funcionarios.txt",true);
		var printWriter = new PrintWriter(fileWriter);
		//
		printWriter.write("\nid do funcionário......: "+funcionario.getId());
		printWriter.write("\nNome...................: "+funcionario.getNome());
		printWriter.write("\nMatrícula..............: "+funcionario.getMatricula());
		printWriter.write("\nData de Admissão.......: "+funcionario.getDataAdimssao());
		printWriter.write("\nTipo de contratação....: "+funcionario.getTipoContratacao());
		
		printWriter.close();
		JOptionPane.showMessageDialog(null, "Dados gravados com sucesso!");
	}
	catch(Exception e) {
		System.out.println("\nFalha ao gravar o arquivo: " +e.getMessage());
	}
}
	
}
