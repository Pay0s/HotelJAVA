import javax.persistence.*;

@Entity
@Table(name = "Chambre")
public class Chambre {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "type", nullable = true)
    private int type;
    @Column(name = "superficie", nullable = true)
    private double superficie;
    @Column(name = "num_chambre", length = 128, nullable = true)
    private int num_chambre;
    @Column(name = "etage", nullable = true)
    private int etage;

    public Chambre(int num_chambre, double superficie, int type, int etage) {
        this.num_chambre = num_chambre;
        this.superficie = superficie;
        this.type = type;
        this.etage = etage;
    }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public int getEtage() {
        return etage;
    }
    public void setEtage(int etage) {
        this.etage = etage;
    }
    public int getNum_chambre() {
        return num_chambre;
    }
    public void setNum_chambre(int num_chambre) {
        this.num_chambre = num_chambre;
    }
    public double getSuperficie() {
        return superficie;
    }
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
}
