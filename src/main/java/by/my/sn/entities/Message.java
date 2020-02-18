package by.my.sn.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "message")
@Data
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMessage;
    private String text;

    @JoinColumn(name = "id_user")
    @ManyToOne(fetch = FetchType.EAGER)
    private User author;
}
