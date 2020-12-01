package org.jwt.controller;

import org.jwt.config.SmsTokenUtils;
import org.jwt.model.SmsRequestDTO;
import org.jwt.model.SmsResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class SmsAuthenticationController {

    @Autowired
    SmsTokenUtils smsTokenUtils;

    @PostMapping(value = "/authenticate")
    public ResponseEntity<SmsResponseDTO> createAuthenticationToken(@RequestBody SmsRequestDTO authenticationRequest) {
        String token = smsTokenUtils.generateToken(authenticationRequest.getPhone());
        return ResponseEntity.ok(new SmsResponseDTO(token));
    }
}
