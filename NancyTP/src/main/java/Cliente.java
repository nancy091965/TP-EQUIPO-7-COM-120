import jakarta.persistence.*;

import java.util.List;

    @Entity
    public class Cliente {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nombre;
        private String razonSocial;

        @OneToMany(mappedBy = "cliente")
        private List<MesaAyuda> mesasAyuda;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getRazonSocial() {
            return razonSocial;
        }

        public void setRazonSocial(String razonSocial) {
            this.razonSocial = razonSocial;
        }

        public List<MesaAyuda> getMesasAyuda() {
            return mesasAyuda;
        }

        public void setMesasAyuda(List<MesaAyuda> mesasAyuda) {
            this.mesasAyuda = mesasAyuda;
        }
    }
