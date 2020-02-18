package by.my.sn.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;

    private String login;

    @JoinColumn(name = "id_message")
    @OneToOne(fetch = FetchType.LAZY)
    private Message idMessage;
}
