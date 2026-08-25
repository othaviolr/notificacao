package com.othavio.notificacao.controller;

import com.othavio.notificacao.business.EmailService;
import com.othavio.notificacao.business.dto.TarefasDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/email")
public class EmailController {

    private final EmailService emailService;

    @PostMapping
    public ResponseEntity<Void> enviarEmail(@RequestBody TarefasDto dto){
        emailService.enviaEmail(dto);
        return ResponseEntity.ok().build();
    }
}
