package com.blog.payload;

import lombok.Data;
import org.hibernate.query.criteria.internal.predicate.PredicateImplementor;

@Data
public class SignUpDto {
    private String name;
    private String username;
    private String email;
    private String password;


}
