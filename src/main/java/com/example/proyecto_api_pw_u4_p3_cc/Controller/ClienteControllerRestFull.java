package com.example.proyecto_api_pw_u4_p3_cc.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyecto_api_pw_u4_p3_cc.service.IClienteService;
import com.example.proyecto_api_pw_u4_p3_cc.model.*;

@RestController
@RequestMapping("/clientes")
public class ClienteControllerRestFull {

    @Autowired
    private IClienteService clienteService;

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping(path = "/cedula/{cedula}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Cliente> buscarClientePorCedula(@PathVariable("cedula") String cedula) {
        // TODO Auto-generated method stub
        return ResponseEntity.status(HttpStatus.OK).body(this.clienteService.buscarClientePorCedula(cedula));
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertarCliente(@RequestBody Cliente cliente) {
        // TODO Auto-generated method stub
        this.clienteService.insertarCliente(cliente);
    }

    @PutMapping(path = "/actualizar", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void actualizarCliente(@RequestBody Cliente cliente) {
        // TODO Auto-generated method stub
        this.clienteService.actualizarCliente(cliente);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Cliente>> buscarClientes() {
        // TODO Auto-generated method stub
        return ResponseEntity.status(HttpStatus.OK).body(this.clienteService.buscarClientes());
    }

    @DeleteMapping(path = "/{id}")
    public void borrarPorElId(@PathVariable("id") Integer id) {
        // TODO Auto-generated method stub
        this.clienteService.borrarPorElId(id);
    }

    @DeleteMapping(path = "/cedula/{cedula}")
    @CrossOrigin(origins = "http://localhost:8080")
    public void borrarPorCedual(@PathVariable("cedula") String cedula) {
        // TODO Auto-generated method stub
        this.clienteService.borrarPorCedual(cedula);
    }
}
