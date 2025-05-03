package Cesde.demo.service;

public interface ComentarioService {
    public Comentario crearComentario(Comentario comentario);

    public List<Comentario> findAll();

    public Comentario findById(Long ID);

    public UsComentarioer update(Long ID, Comentario texto);

    public void delete(Long ID);
}
