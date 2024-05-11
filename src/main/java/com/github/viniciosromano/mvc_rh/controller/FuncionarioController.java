package com.github.viniciosromano.mvc_rh.controller;

import com.github.viniciosromano.mvc_rh.model.Funcionario;
import com.github.viniciosromano.mvc_rh.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("funcionarios")
public class FuncionarioController {
    @Autowired
    private FuncionarioRepository funcionarioRepository;
    @GetMapping()
    public String list(Model model) {
        List<Funcionario> funcionarios = funcionarioRepository.findAll();
        model.addAttribute("funcionarios", funcionarios);
        return "funcionario/list";
    }
    @PostMapping("save")
    public String save(@ModelAttribute Funcionario funcionario){
        funcionarioRepository.save(funcionario);

        return "redirect:/funcionarios";
    }

    @GetMapping("add")
    public String create(Model model) {
        model.addAttribute("funcionario",new Funcionario());
        return "funcionario/form";
    }

    @GetMapping("update/{id}")
    public String update(@PathVariable Long id,Model model){
        Funcionario funcionario = funcionarioRepository.findById(id).orElse(new Funcionario());
        model.addAttribute("funcionario",funcionario);
        return "funcionario/form";
    }
    @GetMapping("delete/{id}")
    public String delete(@PathVariable Long id){
        funcionarioRepository.deleteById(id);
        return "redirect:/funcionarios";
    }


}
