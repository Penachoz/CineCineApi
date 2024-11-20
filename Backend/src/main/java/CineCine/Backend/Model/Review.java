package CineCine.Backend.Model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {
    @Id
    private ObjectId id;        // Identificador único
    private String peliculaId;  // ID de la película asociada (string plano)
    private ObjectId usuarioId; // ID del usuario que realizó la review
    private String contenido;   // Contenido de la review
}
