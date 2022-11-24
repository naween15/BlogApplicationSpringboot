package com.example.blogapplicationbackend.Config;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.filter.OncePerRequestFilter;

@Getter
@Setter

public class JwtAuthResponse  {
    private String token;
}
