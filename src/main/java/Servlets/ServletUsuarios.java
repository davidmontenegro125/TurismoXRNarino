package Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

import Modelo.*;

@WebServlet(name = "ServletUsuarios", urlPatterns = {"/ServletUsuarios"})

public class ServletUsuarios extends HttpServlet {

    public static ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accion = request.getParameter("accion");

        if ("login".equals(accion)) {

            String correo = request.getParameter("correo");
            String password = request.getParameter("password");

            boolean encontrado = false;

            for (Usuario u : listaUsuarios) {
                if (u.getCorreo().equals(correo)) {
                    encontrado = true;
                    break;
                }
            }

            if (encontrado) {
                response.sendRedirect("index.jsp");
            } else {
                request.setAttribute("mensaje", "Usuario o contraseña incorrectos");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }

        } else if ("registrar".equals(accion)) {

            String nombre = request.getParameter("nombre");
            String correo = request.getParameter("correo");
            String password = request.getParameter("password");
            String rol = request.getParameter("rol");

            Usuario u = new Usuario(listaUsuarios.size() + 1, nombre, correo);
            listaUsuarios.add(u);

            response.sendRedirect("login.jsp");
        }
    }
}
