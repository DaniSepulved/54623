package Cesde.demo.service.serviceImpl;

@Service
public class ComentarioServiceImpl implements ComentarioService {

    @Autowired
    private ComentarioRepository comentarioRepository;

    @Override
    public Comentario crearComentario(Comentario comentario) {
        return comentarioRepository.save(comentario);
    }

    @Override
    public List<Comentario> listarComentarios() {
        return comentarioRepository.findAll();
    }

    @Override
    public Comentario obtenerComentarioPorId(Long id) {
        return comentarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Comentario no encontrado con ID: " + id));
    }

    @Override
    public Comentario actualizarComentario(Long id, Comentario comentarioActualizado) {
        Comentario existente = obtenerComentarioPorId(id);
        existente.setTexto(comentarioActualizado.getTexto());
        existente.setAutor(comentarioActualizado.getAutor());
        existente.setFecha(comentarioActualizado.getFecha());
        return comentarioRepository.save(existente);
    }

    @Override
    public void eliminarComentario(Long id) {
        comentarioRepository.deleteById(id);
    }
}
