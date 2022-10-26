package com.qaacademy.primeiraApi.resources;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/exercicios")
public class Exercicios {

    @GetMapping("/parOUimpar")
    public String parOUimpar(@RequestParam int numero){
        if (numero % 2 == 0){
            return "O numero " + (numero) + " é par";
        }
        else {
            return "O numero " + (numero) + " é impar";
        }
    }

    @GetMapping("/calculaSalario/{salarioDigitado}")
    public String calculaSalario(@PathVariable(value = "salarioDigitado") double salario){
        double ir =0;
        if(salario > 0 && salario <= 1903.98) {
            ir=0;
        }
        if(salario >= 1903.99 && salario <= 2826.65) {
            ir = (salario * 0.075) - 142.80;
        }
        if(salario >=2826.66 && salario <= 3751.05) {
            ir = (salario * 0.15) - 354.80;
        }
        if(salario >=3751.06 && salario <= 4664.68) {
            ir = (salario * 0.225) - 636.13;
        }
        if(salario > 4664.68) {
            ir = (salario * 0.275) - 869.36;
        }

        return "Salario liquido: " +(salario-ir) + "\n"
                + "Salario Bruto: " +salario + "\n"
                + "Imposto de Renda: " + ir;
    }
}
