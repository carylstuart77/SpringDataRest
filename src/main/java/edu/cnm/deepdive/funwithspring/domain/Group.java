package edu.cnm.deepdive.funwithspring.domain;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "Flowwer")
public class Group {


  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private long id;

  /**
   * Generate timestamp to be used with id to reference records in the entity.
   */
  @Column(nullable = false, insertable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
  @Temporal(TemporalType.TIMESTAMP)
  private Date created;


  /**
   * Map one group to many memberships.
   */
  @OneToMany(fetch = FetchType.EAGER, mappedBy = "group")
  private List<Membership> memberships = new LinkedList<>();

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "person_id")
  private Person person;

  private String name;

  public Long getId() {
    return id;
  }

  public Group() {
  }

  public Group(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public Date getCreated() {
    return created;
  }

  public List<Membership> getMemberships() {
    return memberships;
  }

  public void setMemberships(List<Membership> memberships) {
    this.memberships = memberships;
  }

  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }
}



