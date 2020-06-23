package br.com.tokiomarine.seguradora.avaliacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.tokiomarine.seguradora.avaliacao.service.*;

import br.com.tokiomarine.seguradora.avaliacao.entidade.Estudante;

// TODO não esquecer de usar as anotações para criação do restcontroller
@RestController
//@RequestMapping(path = "")
public class EstudanteRestController {
	
	@Autowired
	private EstudandeService estudanteService;

	// TODO caso você não conheça THEMELEAF faça a implementação dos métodos em forma de RESTCONTROLLER (seguindo o padrão RESTFUL)

	// TODO IMPLEMENTAR CADASTRO DE ESTUDANTES (POST)
	@PostMapping
	public ResponseEntity<Estudante> cadastrar(@RequestBody Estudante estudante){
		return ResponseEntity.ok(this.estudanteService.cadastrarEstudante(estudante));
	}

	// TODO IMPLEMENTAR ATUALIZACAO DE ESTUDANTES (PUT)
	@PutMapping(path = "/{id}")
	public ResponseEntity<Estudante> atualizar(@PathVariable(name = "id") Integer id, @RequestBody Estudante estudante){
		estudante.setIdEstudante(id);
		return ResponseEntity.ok(this.estudanteService.atualizarEstudante(estudante));
	}

	// TODO IMPLEMENTAR A LISTAGEM DE ESTUDANTES (GET)
	@GetMapping(path = "/{id}")
	public ResponseEntity<Estudante> listarPorId(@PathVariable(name = "id") Long id){
		return ResponseEntity.ok(this.estudanteService.buscarEstudante(id));
	}
	
//	@GetMapping
//	public ResponseEntity<List<Estudante>> listarTodos(){
//		return ResponseEntity.ok(this.estudanteService.listarTodos());
//	}

	// TODO IMPLEMENTAR A EXCLUSÃO DE ESTUDANTES (DELETE)
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Integer> remover(@PathVariable(name = "id" Long id)){
		this.estudanteService.deleteEstudante(id);
	}
	
}
