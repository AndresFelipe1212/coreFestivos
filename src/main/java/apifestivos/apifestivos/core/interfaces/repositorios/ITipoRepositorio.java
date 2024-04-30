package apifestivos.apifestivos.core.interfaces.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import apifestivos.apifestivos.core.entidades.Tipo;

@Repository
public interface ITipoRepositorio extends JpaRepository<Tipo, Integer> {
    @Query("SELECT t FROM Tipo t WHERE t.id = :id")
    public Tipo buscar(Integer id);
}