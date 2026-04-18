<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.*"%>

<jsp:include page="lib/header.jsp" />

<div class="containerGeneral">
    <h2>Catálogo de Experiencias</h2>

    <table class="table table-hover">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Destino</th>
                <th>Precio</th>
                <th>Tipo</th>
                <th>Detalle</th>
            </tr>
        </thead>

        <tbody>
        <%
            // ? Luego esto vendrá del servlet
            ArrayList<ExperienciaTuristica> lista = 
                (ArrayList<ExperienciaTuristica>) request.getAttribute("listaExperiencias");

            if (lista != null && !lista.isEmpty()) {
                for (ExperienciaTuristica e : lista) {
        %>
            <tr>
                <td><%= e.getId() %></td>
                <td><%= e.getNombre() %></td>
                <td><%= e.getDestino() %></td>
                <td>$<%= e.getPrecio() %></td>

                <td>
                    <%= (e instanceof ExperienciaReal) ? "Real" : "Virtual" %>
                </td>

                <td>
                    <%= e.toString() %>
                </td>
            </tr>
        <%
                }
            } else {
        %>
            <tr>
                <td colspan="6" class="text-center">
                    No hay experiencias registradas
                </td>
            </tr>
        <%
            }
        %>
        </tbody>
    </table>

</div>

<jsp:include page="lib/footer.jsp" />
