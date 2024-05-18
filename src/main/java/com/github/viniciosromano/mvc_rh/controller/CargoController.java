package com.github.viniciosromano.mvc_rh.controller;

import com.github.viniciosromano.mvc_rh.model.Cargo;
import com.github.viniciosromano.mvc_rh.model.Departamento;
import com.github.viniciosromano.mvc_rh.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("cargos")
public class CargoController {
	@Autowired
	CargoRepository cargoRepository;

	@GetMapping()
	public String list(Model model) {
		List<Cargo> cargos = cargoRepository.findAll();
		model.addAttribute("cargos", cargos);
		return "cargo/list";
	}

	@PostMapping("save")
	public String save(@ModelAttribute Cargo cargo) {
		cargoRepository.save(cargo);

		return "redirect:/cargos";
	}
	@GetMapping("add")
	public String create(Model model){
		model.addAttribute("cargo",new Cargo());
		return "cargo/form";
	}

	@GetMapping("update/{id}")
	public String update(@PathVariable Long id, Model model) {
		Cargo cargo = cargoRepository.findById(id).orElse(new Cargo());
		model.addAttribute("cargo", cargo);
		return "cargo/form";
	}

	@GetMapping("delete/{id}")
	public String delete(@PathVariable Long id) {
		cargoRepository.deleteById(id);
		return "redirect:/cargos";
	}
}
