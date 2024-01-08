package BootCamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class BootCamp {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
}
