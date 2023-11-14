package com.rawtech.Spring.Security.Tutorial.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Base64;

@Service
public class JWTService {

    private static final String SECRET_KEY = "E2rqQhqIQt4Z+D/SqiFa8WiDWHk1vbynrUdih6k27y/pUjj5QfvENULyfJ5HCXi2PS2aKPFFSQR2bCRIFYrDoPcsMOfz6Q8iJf8Olc6I4PdTU6iNpQOylcft/SRdlcoSq8UlFP1Z1bfiDwr/BQ3xjaTGM31MoJXP3ajuqL50RwZpqmIsz7TBpR+a5mxaqoy6Nq+tZc/ZNZqJykle7GqzgCndinWrfIGoS8lxtj+eQOINO75/getBoknaCuCFTpwAHuxflma/GiCCALZxuPxjsRpWo0V6N9o/OG5aGTVCG/Uxo3+9H6xaxp2pGyx/FaDXmFfyenvo/F8YBOb73mK3eT+pb4qQzJhRHwhRiT2qZBk=\n";

    public String extractUsername(String jwtToken) {
        return null;
    }

    private Claims extractAllClaims (String token) {
        return Jwts
                .parserBuilder()
                .setSigningKey(getSignInKey())
                .build()
                .parseClaimsJws()
                .getBody();
    }

    private Key getSignInKey() {
        byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
