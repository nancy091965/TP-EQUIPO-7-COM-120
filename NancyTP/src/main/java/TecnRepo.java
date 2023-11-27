
import java.time.LocalDateTime;
import java.util.List;
    public interface TecnRepo {
    public interface TecnicoRepository {

        List<Tecnico> findByOrderByIncidentesResueltosDesc();

        List<Tecnico> findByEspecialidadAndIncidentesFechaResolucionAfterOrderByIncidentesResueltosDesc(String especialidad, LocalDateTime fecha);
    }

}
