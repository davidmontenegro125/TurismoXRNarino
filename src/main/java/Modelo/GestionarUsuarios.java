package Modelo;
import java.util.ArrayList;

public class GestionarUsuarios {

    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    public void registrar(Usuario u) {
        listaUsuarios.add(u);
    }

    public ArrayList<Usuario> listar() {
        return listaUsuarios;
    }

    public void eliminar(int id) {
        listaUsuarios.removeIf(u -> u.getId() == id);
    }

    public Usuario buscar(int id) {
        for (Usuario u : listaUsuarios) {
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }
}
