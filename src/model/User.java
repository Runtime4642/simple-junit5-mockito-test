package model;
import java.util.List;

import lombok.*;
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private long idx;
    @Setter
    private String username;
    @Setter
    private String email;
    @Setter
    private List<String> roles;
    
    
}