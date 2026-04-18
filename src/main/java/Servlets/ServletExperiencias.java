package Servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import Modelo.*;
import java.util.ArrayList;

@WebServlet(name = "ServletExperiencias", urlPatterns = {"/ServletExperiencias"})
public class ServletExperiencias extends HttpServlet {

    ArrayList<ExperienciaTuristica> lista = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String tipo = request.getParameter("tipo");
        String nombre = request.getParameter("nombre");
        String destino = request.getParameter("destino");
        double precio = Double.parseDouble(request.getParameter("precio"));

        if (tipo.equals("real")) {

            int cupos = Integer.parseInt(request.getParameter("cupos"));
            String transporte = request.getParameter("transporte");

            ExperienciaReal e = new ExperienciaReal(cupos, transporte, lista.size() + 1, nombre, destino, precio);

            lista.add(e);

        } else if (tipo.equals("virtual")) {

            String tipoXR = request.getParameter("tipoXR");

            ExperienciaVirtual e = new ExperienciaVirtual(tipoXR, lista.size() + 1, nombre, destino, precio);

            lista.add(e);
        }

        request.setAttribute("listaExperiencias", lista);
        request.getRequestDispatcher("catalogoExperiencias.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String vista = request.getParameter("vista");

        request.setAttribute("listaExperiencias", lista);

        if ("admin".equals(vista)) {
            request.getRequestDispatcher("adminExperiencias.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("catalogoExperiencias.jsp").forward(request, response);
        }

        request.setAttribute("listaExperiencias", lista);
        request.getRequestDispatcher("catalogoExperiencias.jsp").forward(request, response);
    }
}
