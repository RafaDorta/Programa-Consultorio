package view;

import java.io.FileNotFoundException;
import java.util.ArrayList;
public class Menu {

	
	private static ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
	
	
		
	
	public static boolean criaPaciente(String nome, int idade, String endereco, String string, String documento, String responsavel) {
		Paciente newPaciente = new Paciente();
		newPaciente.setNome(nome);
		newPaciente.setIdade(idade);
		newPaciente.setEndereco(endereco);
		newPaciente.setFone(string);
		newPaciente.setDocumento(documento);
		newPaciente.setResponsavel(responsavel);
		pacientes.add(newPaciente);
		
	return true;
	}
	
	
	public static void rafael() {
		Paciente newPaciente = new Paciente();
		newPaciente.setNome("Rafael");
		newPaciente.setIdade(18);
		newPaciente.setDocumento("53593010-0");
		
		
		pacientes.add(newPaciente);
		
		Paciente newPaciente2 = new Paciente();
		newPaciente2.setNome("Nicolas");
		newPaciente2.setIdade(21);
		newPaciente2.setDocumento("496034218-80");
		pacientes.add(newPaciente2);
		
		
		//newPaciente.marcar_Consulta("23 julho 2022", "16:30", "Ingrid");
		
		
	
	}
	
	public static boolean verificaCadastro(String verifica, int flag) {
		if(flag == 1)
		{
			for(Paciente p : pacientes) {
				if(p.getNome().equals(verifica)) {
					return false;
				}
			}
		}
		else {
			for(Paciente p : pacientes) {
				if(p.getDocumento().equals(verifica)) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	public static Paciente acharPaciente(String doc) {
		for(Paciente p : pacientes) {
			if(p.getDocumento().equals(doc)) {
				System.out.println(p.getNome());
				return p;
			}
		}
		
		
		return null;
	}
	
	
	public static String imprimeConsultas(String data) {
		
		String lista= "";
		
		
		for(Paciente p : pacientes)
		{
			String hora ="";
			hora =	p.procuraConsulta(data);
			System.out.println(hora + "2");
			if(!hora.equals(""))
			{
				System.out.println(hora);
				String pontos="";
				for(int i =0;i<22 - p.getNome().length();i++) {
					pontos += "_";
				}
				lista += p.getNome()+pontos + hora + "\n";
			}
		}
		
		System.out.println(lista);
		return lista;
	}
	
	
	
	public static String retornaData(String data) {
		return data;
	}
	
	
	public static String acharConsulta(Paciente p) {
		
		return p.procuraDiaConsulta();
	}
	
	
	
	public static void main(String[] args) throws FileNotFoundException
	{
		
		rafael();
		Tela_Incial.main(args);
		
		
		
	}
	
}
