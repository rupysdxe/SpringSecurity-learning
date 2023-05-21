package com.example.customconfig.auth;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Role implements GrantedAuthority {
    @Id
    private Long id;
    private ERole role;
    @Override
    public String getAuthority() {
        return this.role.toString();
    }
}
