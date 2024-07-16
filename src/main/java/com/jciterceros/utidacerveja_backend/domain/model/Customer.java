package com.jciterceros.utidacerveja_backend.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "customer")
    private Set<Address> customerAddresses;

    @OneToMany(mappedBy = "customer")
    private Set<Cart> customerCarts;
}
