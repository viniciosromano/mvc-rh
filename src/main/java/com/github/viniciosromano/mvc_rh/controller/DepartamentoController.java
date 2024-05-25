package com.github.viniciosromano.mvc_rh.controller;

import com.github.viniciosromano.mvc_rh.controller.dto.FormDepartamento;
import com.github.viniciosromano.mvc_rh.model.Departamento;
import com.github.viniciosromano.mvc_rh.model.Funcionario;
import com.github.viniciosromano.mvc_rh.repository.DepartamentoRepository;
import com.github.viniciosromano.mvc_rh.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("departamentos")
public class DepartamentoController {
	@Autowired
	private DepartamentoRepository departamentoRepository;

	@GetMapping()
	public String list(Model model) {
		List<Departamento> departamentos = departamentoRepository.findAll(Sort.by(Sort.Direction.ASC,"nome") );
		model.addAttribute("departamentos", departamentos);
		return "departamento/list";
	}
	
	@GetMapping("cargos")
	public String cargosByDepartamento() {
		return "departamento/list_cargos";
	}
	@GetMapping("add")
	public String create(Model model){
		model.addAttribute("departamento",new FormDepartamento());
		return "departamento/form";
	}
	@PostMapping("save")
	public String save(@ModelAttribute FormDepartamento formDepartamento) {
		departamentoRepository.save(formDepartamento.toModel());
		return "redirect:/departamentos";
	}

	@GetMapping("update/{id}")
	public String update(@PathVariable Long id, Model model) {
		Departamento departamento = departamentoRepository.findById(id).orElse(new FormDepartamento().toModel());
		model.addAttribute("departamento", departamento);
		return "departamento/form";
	}

	@GetMapping("delete/{id}")
	public String delete(@PathVariable Long id) {
		departamentoRepository.deleteById(id);
		return "redirect:/departamentos";
	}
}
