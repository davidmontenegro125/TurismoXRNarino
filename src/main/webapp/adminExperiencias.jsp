<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.*"%>

<jsp:include page="lib/header.jsp" />

<div class="containerGeneral">
    <h2>Administrar Experiencias</h2>

    <table class="table table-hover">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Destino</th>
                <th>Precio</th>
                <th>Tipo</th>
                <th>Detalle</th>
                <th>Acciones</th>
            </tr>
        </thead>

        <tbody>
        <%
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
                <%
                    if (e instanceof ExperienciaReal) {
                        ExperienciaReal r = (ExperienciaReal) e;
                %>
                        Cupos: <%= r.getCupos() %> <br>
                        Transporte: <%= r.getTipoTransporte() %>
                <%
                    } else {
                        ExperienciaVirtual v = (ExperienciaVirtual) e;
                %>
                        Tipo XR: <%= v.getTipoXR() %>
                <%
                    }
                %>
                </td>

                <td>
                    <!-- Por ahora no funcional -->
                    <button class="btn btn-warning btn-sm">Editar</button>
                    <button class="btn btn-danger btn-sm">Eliminar</button>
                </td>
            </tr>
        <%
                }
            } else {
        %>
            <tr>
                <td colspan="7" class="text-center">
                    No hay experiencias registradas
                </td>
            </tr>
        <%
            }
        %>
        </tbody>
    </table>

    <div style="text-align:center; margin-top:20px;">
        <a href="registroExperiencias.jsp" class="btn btn-primary">
            Registrar nueva experiencia
        </a>
    </div>

</div>

<jsp:include page="lib/footer.jsp" />
