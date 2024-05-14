// package com.dev.back.service;

// import java.sql.Date;
// import java.util.List;
// import java.time.LocalDateTime;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.dev.back.entity.Estado;
// import com.dev.back.repository.EstadoRepository;

// @Service
// public class EstadoService {

//     @Autowired
//     private EstadoRepository estadoRepository;

//     public List<Estado> buscarTodos() {

//         return estadoRepository.findAll();

//     };
    
//     public Estado inserir(Estado estado) {

//         estado.setDataCriacao(new Date(0));
//         Estado estadoNovo = estadoRepository.saveAndFlush(estado);

//         return estadoNovo;

//     };

    
//     public Estado alterar(Estado estado) {

//         return estadoRepository.saveAndFlush(estado);

//     };

//     public void excluir(Long id) {
        
//         Estado estado = estadoRepository.findById(id).get();

//         estadoRepository.delete(estado);
//     };
    
// }
