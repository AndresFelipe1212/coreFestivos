package apifestivos.apifestivos.core.interfaces.servicios;

import java.util.List;

import apifestivos.apifestivos.core.entidades.Festivo;

public interface IFestivoServicio {
    public List <Festivo> buscar(String nombre);
}
