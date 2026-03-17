package example.cashcardmanager.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table (name = "CashCards")
@Getter @Setter
public class CashCard {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column (name = "value")
    private Double value;

    @CreationTimestamp
    @Column (name = "date_created")
    private Date createdDate;

    @UpdateTimestamp
    @Column (name = "last_updated")
    private Date lastUpdatedDate;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

}
