<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Usuario"%>
<%@page import="Servlets.ServletUsuarios"%>

<jsp:include page="lib/header.jsp" />

<div class="containerGeneral">
    <h2>Administrar Usuarios</h2>

    <table class="table table-hover">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Correo</th>
            </tr>
        </thead>

        <tbody>
        <%
            ArrayList<Usuario> lista = ServletUsuarios.listaUsuarios;

            if (lista != null && !lista.isEmpty()) {
                for (Usuario u : lista) {
        %>
            <tr>
                <td><%= u.getId() %></td>
                <td><%= u.getNombre() %></td>
                <td><%= u.getCorreo() %></td>
            </tr>
        <%
                }
            } else {
        %>
            <tr>
                <td colspan="3" class="text-center">
                    No hay usuarios registrados
                </td>
            </tr>
        <%
            }
        %>
        </tbody>
    </table>

    <div style="text-align:center; margin-top:20px;">
        <a href="registroUsuarios.jsp" class="btn btn-primary">
            Registrar nuevo usuario
        </a>
    </div>

</div>

<jsp:include page="lib/footer.jsp" />
