import javax.persistence.*;

@Entity
@Table(name = "Salarie")
public class Salarie {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nom", length = 128, nullable = true)
    private String nom;
    @Column(name = "prenom", length = 128, nullable = true)
    private String prenom;
    @Column(name = "salaire", length = 128, nullable = true)
    private String salaire;
    @Column(name = "experience", length = 128, nullable = true)
    private String experience;


    public Salarie(Integer id, String nom, String prenom, String salaire, String experience) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
        this.experience = experience;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getSalaire() {
        return salaire;
    }
    public void setSalaire(String salaire) {
        this.salaire = salaire;
    }
    public String getExperience() {
        return experience;
    }
    public void setExperience(String experience) {
        this.experience = experience;
    }
}
