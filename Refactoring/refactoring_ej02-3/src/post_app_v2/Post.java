package post_app_v2;

import java.time.LocalDateTime;

public class Post {
    private String texto;
    private LocalDateTime fecha;
    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }
}
