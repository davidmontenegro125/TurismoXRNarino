<%@include file = "./lib/header.jsp" %>

<h2>Registro de Usuario</h2>

<form action="ServletUsuarios" method="post">

    Nombre: <input type="text" name="nombre"><br><br>
    Correo: <input type="text" name="correo"><br><br>
    Contraseña: <input type="password" name="password"><br><br>
    Teléfono: <input type="text" name="telefono"><br><br>

    Tipo:
    <select name="tipo">
        <option value="operador">Operador</option>
        <option value="admin">Administrador</option>
    </select><br><br>

    <input type="submit" value="Registrar">
</form>

<%@include file = "./lib/footer.jsp" %>