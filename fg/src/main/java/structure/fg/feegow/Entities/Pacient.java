package structure.fg.feegow.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Pacient")
public class Pacient {

    @Id
    private Long id;

    @Column(name = "success")
    private boolean success;
    @Column(name = "name")
    private String name;

    @Column(name = "birthDate")
    private String birthDate;

    @Column(name = "sex")
    private String sex;

    @Column(name = "address")
    private String address;

    @Column(name = "number")
    private String number;

    @Column(name = "complement")
    private String complemento;

    @Column(name = "neighbourhood")
    private String bairro;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "cep")
    private String cep;

    @Column(name = "profession")
    private String profession;

    @Column(name = "photo")
    private String photo;

    @Column(name = "telephone")
    private List<String> telephone;

    @Column(name = "email")
    private List<String> email;

    //@Column(name = "documents")
    @OneToOne(cascade = CascadeType.ALL)
    private Documents documents;

    @Column(name = "cellPhone")
    private List<String> cellPhone;


}
