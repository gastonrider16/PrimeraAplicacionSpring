package com.bolsadeideas.springboot.backend.apirest.models.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.transactional;
import org.springframework.stereotype.Service;
import com.bolsadeideas.springboot.backend.apirest.models.dao.IClienteDao;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;

@Service
public interface ClienteServiceImp1 implements ICliente {
    @Autowired
    private IClienteDao clienteDao;
    @Override
    @Transactional(readOnly=true)
    public List<Cliente>findAll(){
        return (List <Cliente>) clienteDao.findAll();
    }
}
