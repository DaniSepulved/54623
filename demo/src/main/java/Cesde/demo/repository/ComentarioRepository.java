package Cesde.demo.repository;


public interface ComentarioRepository extends JpaRepository<Comentario, Long>{
    Optional<Comentario> findById(Long id);
    Comentario findBytexto(String texto);
}
