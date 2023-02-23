package com.example.proyecto_api_pw_u4_p3_cc.service;

import java.util.List;

import com.example.proyecto_api_pw_u4_p3_cc.model.Cliente;

public interface IClienteService {
    Cliente buscarClientePorCedula(String cedula);
    void insertarCliente(Cliente cliente);
    void actualizarCliente(Cliente cliente);
    List<Cliente> buscarClientes();
    void borrarPorElId(Integer id);
    void borrarPorCedual(String cedula);
}
