package uz.bnpl.client.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.bnpl.client.model.clientregistration.ClientRegistrationCreateRequest;
import uz.bnpl.client.model.clientregistration.ClientRegistrationsCreateRequest;
import uz.bnpl.client.service.ClientRegistrationService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/client-registrations")
@Tag(name = "#1 Client registrations", description = "APIs for managing client registrations")
public class ClientRegistrationController {

    private final ClientRegistrationService clientRegistrationService;

    @PostMapping
    public ResponseEntity<ClientRegistrationCreateRequest<?>> registerClient(
            @RequestBody ClientRegistrationsCreateRequest clientRegistrationDto) {
        return ResponseEntity.ok(clientRegistrationService.registerClient(clientRegistrationDto));
    }

}
