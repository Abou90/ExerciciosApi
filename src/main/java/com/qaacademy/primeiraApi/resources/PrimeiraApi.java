package com.qaacademy.primeiraApi.resources;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class PrimeiraApi {

    @GetMapping("/primeiraApi")
    public String primeiraApi(){
        return "Retorno da api com sucesso!!!";
    }

    @GetMapping("/primeiraApiV1")
    public String primeiraApiQuerryParam(@RequestParam String palavra){
        return palavra;
    }

    @GetMapping("/primeiraApiV2/{teste}")
    public String primeiraApiPathParam(@PathVariable(value = "teste") String teste){
        return teste;
    }

}
