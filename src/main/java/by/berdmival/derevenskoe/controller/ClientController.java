//package by.berdmival.derevenskoe.controller;
//
//import by.berdmival.derevenskoe.service.security.ClientService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.oauth2.provider.ClientDetails;
//import org.springframework.security.oauth2.provider.client.BaseClientDetails;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//public class ClientController {
//    @Autowired
//    private ClientService clientService;
//
//    @GetMapping(path = "/clients/{clientId}")
//    public ResponseEntity<ClientDetails> getClientById(@PathVariable("clientId") String clientId) {
//        return ResponseEntity.ok(clientService.getClientById(clientId));
//    }
//
//    @PostMapping(path = "/clients")
//    public ResponseEntity<ClientDetails> addClient(@RequestBody BaseClientDetails clientDetails) {
//        return ResponseEntity.ok(clientService.addClient(clientDetails));
//    }
//}
