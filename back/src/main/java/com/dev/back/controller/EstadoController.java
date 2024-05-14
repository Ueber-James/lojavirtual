// package com.dev.back.controller;

// import org.springframework.web.bind.annotation.RestController;

// import com.dev.back.entity.Estado;
// import com.dev.back.service.EstadoService;

// import jakarta.websocket.server.PathParam;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;

// @RestController
// @RequestMapping("/api/estado")

// public class EstadoController {

// @Autowired
// private EstadoService estadoService;

// @GetMapping("/")
// public List<Estado> buEstados() {
// return estadoService.buscarTodos();
// }
// @PostMapping("/")
// public Estado inserir(Estado estado) {

// return estadoService.inserir(estado);

// }
// @PutMapping("/")
// public Estado alterar(Estado estado) {
// return estadoService.alterar(estado);
// }
// @DeleteMapping("/{id}")
// public ResponseEntity<Void> excluir(@PathParam("id") Long id) {
// estadoService.excluir(id);
// return ResponseEntity.ok().build();
// }
// }
