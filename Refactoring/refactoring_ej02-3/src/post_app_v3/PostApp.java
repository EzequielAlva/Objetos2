package post_app_v3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class PostApp {
    // . . .
    private List<Post> posts;
    // . . .
    public List<Post> ultimosPosts(Usuario user, int cantidad) {

        List<Post> postsOtrosUsuarios = obtenerPostsDeOtrosUsuarios(user);

        ordenarPostsPorFecha(postsOtrosUsuarios);

        return postsOtrosUsuarios.stream().limit(cantidad).collect(Collectors.toList());

    }

    private List<Post> obtenerPostsDeOtrosUsuarios(Usuario user) {
        return posts.stream().filter(post -> !post.getUsuario().equals(user)).collect(Collectors.toList());
    }

    private void ordenarPostsPorFecha(List<Post> listaDePosts) {
        listaDePosts = listaDePosts.stream()
                .sorted((post1, post2) -> post1.getFecha().compareTo(post2.getFecha()))
                .collect(Collectors.toList());
    }

    //
    // posts.stream().filter(post -> !post.getUsuario().equals(user))
    //               .sorted((post1, post2) -> post1.getFecha().compareTo(post2.getFecha()))
    //               .limit(cantidad)
    //               .collect(Collectors.toList());
}
