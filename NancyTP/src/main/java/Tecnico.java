import jakarta.persistence.*;

    @Entity
    public class Tecnico {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private final Long id;

        private String nombre;
        private String tipoDeNotificacion;
        private String especialidad;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTipoDeNotificacion() {
            return tipoDeNotificacion;
        }

        public void setTipoDeNotificacion(String tipoDeNotificacion) {
            this.tipoDeNotificacion = tipoDeNotificacion;
        }

        public String getEspecialidad() {
            return especialidad;
        }

        public void setEspecialidad(String especialidad) {
            this.especialidad = especialidad;
        }

        public Tecnico(Long id, String nombre, String tipoDeNotificacion) {
            this.id = id;
            this.nombre = nombre;
            this.tipoDeNotificacion = tipoDeNotificacion;
        }
    }





