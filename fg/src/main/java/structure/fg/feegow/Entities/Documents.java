package structure.fg.feegow.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Documents {

    @Id
    private Long id;

    private String rg;

    private String cpf;

    @OneToOne(mappedBy = "documents")
    private Pacient pacient;
}
