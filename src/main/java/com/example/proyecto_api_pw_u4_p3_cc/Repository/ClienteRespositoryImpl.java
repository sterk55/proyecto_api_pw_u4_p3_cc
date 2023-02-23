package com.example.proyecto_api_pw_u4_p3_cc.Repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.proyecto_api_pw_u4_p3_cc.model.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ClienteRespositoryImpl  implements IClienteRespository{

    
    @PersistenceContext
	private EntityManager entityManager;

    @Override
    public Cliente buscarClientePorCedula(String cedula) {
        // TODO Auto-generated method stub
        TypedQuery<Cliente> myQuery = this.entityManager.createQuery("SELECT c FROM Cliente c WHERE c.cedula =:cedula", Cliente.class);
		myQuery.setParameter("cedula", cedula);
		return myQuery.getSingleResult();
    }

    @Override
    public void insertarCliente(Cliente cliente) {
        // TODO Auto-generated method stub
        this.entityManager.persist(cliente);
    }

    @Override
    public void actualizarCliente(Cliente cliente) {
        // TODO Auto-generated method stub
        this.entityManager.merge(cliente);
    }

    @Override
    public List<Cliente> buscarClientes() {
        // TODO Auto-generated method stub
        TypedQuery<Cliente> myQuery = this.entityManager.createQuery("SELECT c FROM Cliente c", Cliente.class);
		return myQuery.getResultList();
    }

    @Override
    public void borrarPorElId(Integer id) {
        // TODO Auto-generated method stub
        this.entityManager.remove(this.buscarClientePorId(id));
    }

    @Override
    public void borrarPorCedual(String cedula) {
        // TODO Auto-generated method stub
        this.entityManager.remove(this.buscarClientePorCedula(cedula));
    }

    @Override
    public Cliente buscarClientePorId(Integer id) {
        // TODO Auto-generated method stub
        return this.entityManager.find(Cliente.class, id);
    }
}
