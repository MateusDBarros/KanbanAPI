package br.com.projeto.api.modelo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "clientes")

@Getter
@Setter
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    private String name;

    private Integer age;

    private LevelType level;



    public enum LevelType {
        JUNIOR(0, "JUNIOR"),
        PLENO(1, "PLENO"),
        SENIOR(2, "SENIOR");

        private final int level;
        private final String description;

        LevelType(int level, String description) {
            this.level = level;
            this.description = description;
        }

        // Getter para o valor numérico do nível
        public int getLevel() {
            return level;
        }

        // Getter para a descrição do nível
        public String getDescription() {
            return description;
        }

        // Método para obter o LevelType a partir do valor numérico
        public static LevelType getByLevel(int level) {
            for (LevelType levelType : values()) {
                if (levelType.getLevel() == level) {
                    return levelType;
                }
            }
            return null; // Caso não encontre o valor
        }

        @Override
        public String toString() {
            return description;
        }
    }

}