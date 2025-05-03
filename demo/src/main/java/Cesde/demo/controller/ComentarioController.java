package Cesde.demo.controller;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/comentarios")
public class ComentarioController {

    @Autowired
    private ComentarioService comentarioService;

    @PostMapping
    public ResponseEntity<Comentario> crear(@RequestBody Comentario comentario) {
        return ResponseEntity.ok(comentarioService.crearComentario(comentario));
    }

    @GetMapping
    public ResponseEntity<List<Comentario>> listar() {
        return ResponseEntity.ok(comentarioService.listarComentarios());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Comentario> obtener(@PathVariable Long id) {
        return ResponseEntity.ok(comentarioService.obtenerComentarioPorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Comentario> actualizar(@PathVariable Long id, @RequestBody Comentario comentario) {
        return ResponseEntity.ok(comentarioService.actualizarComentario(id, comentario));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Long id) {
        comentarioService.eliminarComentario(id);
        return ResponseEntity.ok("Comentario eliminado correctamente.");
    }
}
