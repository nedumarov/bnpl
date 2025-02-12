package uz.bnpl.client.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.http.parser.AcceptLanguage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import uz.bnpl.client.model.dto.ClientInfoDto;
import uz.bnpl.client.model.request.myId.MyIdProfileRequest;
import uz.bnpl.client.service.ClientInfoService;
import uz.bnpl.client.util.LanguageUtil;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/clients")
public class ClientInfoController {

    private final ClientInfoService clientInfoService;

    @PostMapping
    public ResponseEntity<ClientInfoDto> createClientInfo(
            @RequestHeader AcceptLanguage acceptLanguage,
            @RequestBody @Valid MyIdProfileRequest myIdProfileRequest) {

        return ResponseEntity.status(HttpStatus.CREATED).body(clientInfoService.create(myIdProfileRequest, LanguageUtil.translate(acceptLanguage)));
    }

}
