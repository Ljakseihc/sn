package by.my.sn;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "public.user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;

    private String login;
}
