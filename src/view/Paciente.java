package view;
import java.util.ArrayList;

public class Paciente {
	
	private static ArrayList<Consultas> consulta = new ArrayList<Consultas>();
	
	private String nome;
	private int idade;
	private String endereco;
	private String fone;
	private String documento;
	
	
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	private String responsavel;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	public void marcar_Consulta(String date, String horario, String medico) {
		System.out.println("Entrou MC");
		Consultas newConsulta  = new Consultas();
		newConsulta.setDate(date);
		newConsulta.setHorario(horario);
		newConsulta.setMedico(medico);
		consulta.add(newConsulta);
	}
	
	public String procuraConsulta(String data) {
		
		
		for(Consultas c : consulta) {
			
				if (data.equals(c.date))
				{
				System.out.println("Achou Consulta");
				return c.getHorario();
				}
			
		}
		
		return "";
	}
	
	public String procuraDiaConsulta() {
		for(Consultas c : consulta) {
			return c.getDate();
			}
		return "";
		
	}
	
	
	
	

}
