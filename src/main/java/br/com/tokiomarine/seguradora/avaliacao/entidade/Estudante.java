package br.com.tokiomarine.seguradora.avaliacao.entidade;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;



@Entity
@Table(name = "ESTUDANTE")
//@SequenceGenerator(name = "SQ_ESTUDANTE", sequenceName = "SQ_ESTUDANTE", allocationSize = 1) -- Joel - Se for usar Oracle
public class Estudante {
	// TODO Implementar a entidade Estudante conforme solicitado
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID_ESTUDANTE", nullable = false)
    private Integer idEstudante;
	
	@NotEmpty(message = "Nome é Obrigatório.")
    @Column(name = "DS_ESTUDANTE_NAME", nullable = false , length = 50)
    private String dsEstudanteName;
	
	@NotEmpty(message = "Email é Obrigatório.")
    @Column(name = "DS_ESTUDANTE_EMAIL", nullable = false, length = 100)
    private String dsEstudanteEmail;
	
    @Column(name = "DS_ESTUDANTE_TELEFONE", nullable = true)
    private BigInteger dsEstudanteTelefone;
    
    @Column(name = "DS_ESTUDANTE_MATRICULA", nullable = false , length = 6)
    private String dsEstudanteMatricula;
    
    @Column(name = "DS_ESTUDANTE_CURSO", nullable = false , length = 40)
    private String dsEstudanteCurso;
    

	public Integer getIdEstudante() {
		return idEstudante;
	}

	public void setIdEstudante(Integer idEstudante) {
		this.idEstudante = idEstudante;
	}

	public String getDsEstudanteName() {
		return dsEstudanteName;
	}

	public void setDsEstudanteName(String dsEstudanteName) {
		this.dsEstudanteName = dsEstudanteName;
	}

	public String getDsEstudanteEmail() {
		return dsEstudanteEmail;
	}

	public void setDsEstudanteEmail(String dsEstudanteEmail) {
		this.dsEstudanteEmail = dsEstudanteEmail;
	}

	public BigInteger getDsEstudanteTelefone() {
		return dsEstudanteTelefone;
	}

	public void setDsEstudanteTelefone(BigInteger dsEstudanteTelefone) {
		this.dsEstudanteTelefone = dsEstudanteTelefone;
	}

	public String getDsEstudanteMatricula() {
		return dsEstudanteMatricula;
	}

	public void setDsEstudanteMatricula(String dsEstudanteMatricula) {
		this.dsEstudanteMatricula = dsEstudanteMatricula;
	}

	public String getDsEstudanteCurso() {
		return dsEstudanteCurso;
	}

	public void setDsEstudanteCurso(String dsEstudanteCurso) {
		this.dsEstudanteCurso = dsEstudanteCurso;
	}
}
