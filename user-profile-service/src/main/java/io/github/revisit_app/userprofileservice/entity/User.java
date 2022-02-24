package io.github.revisit_app.userprofileservice.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

  @Id
  private String id;

  @Column("first_name")
  private String firstName;

  @Column("last_name")
  private String lastName;

  private String username;

  private String bio;

  @Column("image_url")
  private String imageUrl;

  @Column("cards_authored")
  private List<String> cardsAuthored;

  @Column("decks_authored")
  private List<String> decksAuthored;
}
