package post_app_v2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PostApp {
    // . . .
    private List<Post> posts;
    // . . .
    public List<Post> ultimosPosts(Usuario user, int cantidad) {
        List<Post> postsOtrosUsuarios = obtenerPostsDeOtrosUsuarios(user);

        ordenarPostsPorFecha(postsOtrosUsuarios);

        return agregarUltimosPosts(postsOtrosUsuarios, cantidad);
    }

    private List<Post> agregarUltimosPosts(List<Post> postsOtrosUsuarios, int cantidad) {
        Iterator<Post> postIterator = postsOtrosUsuarios.iterator();
        List<Post> ultimosPosts = new ArrayList<Post>();
        int index = 0;
        while (postIterator.hasNext() &&  index < cantidad) {
            ultimosPosts.add(postIterator.next());
        }
        return ultimosPosts;
    }

    private List<Post> obtenerPostsDeOtrosUsuarios(Usuario user) {
        List<Post> postsOtrosUsuarios = new ArrayList<Post>();
        for (Post post : this.posts) {
            if (!post.getUsuario().equals(user)) {
                postsOtrosUsuarios.add(post);
            }
        }
        return postsOtrosUsuarios;
    }

    private void ordenarPostsPorFecha(List<Post> postsOtrosUsuarios) {
        for (int i = 0; i < postsOtrosUsuarios.size(); i++) {
            int masNuevo = i;
            for(int j= i +1; j < postsOtrosUsuarios.size(); j++) {
                if (postsOtrosUsuarios.get(j).getFecha().isAfter(
                        postsOtrosUsuarios.get(masNuevo).getFecha())) {
                    masNuevo = j;
                }
            }
            Post unPost = postsOtrosUsuarios.set(i,postsOtrosUsuarios.get(masNuevo));
            postsOtrosUsuarios.set(masNuevo, unPost);
        }
    }
}
