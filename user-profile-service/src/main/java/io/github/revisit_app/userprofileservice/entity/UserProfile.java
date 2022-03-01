package io.github.revisit_app.userprofileservice.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table("user_profile")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserProfile {

  @Id
  private Long id;

  @Column("cards_authored")
  private List<String> cardsAuthored;

  @Column("decks_authored")
  private List<String> decksAuthored;

  private List<Long> followers;

  private List<Long> following;
}
