package com.benedict.mydev;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Team {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String location;
    private String mascot;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "teamId")
    private Set<Player> players;

    Team (String name, String location, Set<Player> players){
        super();
        this.name= name;
        this.location = location;
        this.players = players;

    }


}
