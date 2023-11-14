package com.rawtech.Spring.Security.Tutorial.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Service;

@Service
public class JWTService {


    public String extractUsername(String jwtToken) {
        return null;
    }

    private Claims extractAllClaims (String token) {
        return Jwts.parserBuilder().setSigningKey(getSignInKey()).build().parseClaimsJws().getBody();
    }
}
