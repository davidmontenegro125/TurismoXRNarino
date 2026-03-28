<%@include file = "./lib/header.jsp" %>

<h1>Cuerpo de página</h1>

<!  Formularios />

<div class="container">
    <form>
        <div class="form-group">
            <label class="form-control">Nombre</label>
            <input type="text" name="nameUser" placeholder="Nombre de usuario">
        </div>

        <div class="form-group">
            <label class="form-control">email</label>
            <input type="email" name="emailUser" placeholder="correo de usuario">
        </div>
        <div class="form-group">
            <label class="form-control">edad</label>
            <input type="number" name="ageUser" placeholder="Edad de usuario">

        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>

    <br><!-- comment -->

    <h3>Mensaje - Recuperando datos</h3>
    <div class ="alert alert-primary" role="alert">
        <%
            String nombre = request.getParameter("nameUser");
            String email = request.getParameter("emailUser");
            String edad = request.getParameter("ageUser");

            String saludar = "El usuario ingreado es: " + nombre + ", su edad es: " + edad + ", su emai es: " + email;
            out.print(saludar);
        %>
    </div>
</div>

<%@include file = "./lib/footer.jsp" %>