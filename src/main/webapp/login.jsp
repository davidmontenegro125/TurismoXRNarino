<jsp:include page="lib/header.jsp" />

<div class="containerGeneral">
    <h2>Iniciar Sesión</h2>

    <form action="ServletUsuarios" method="post">
        <input type="hidden" name="accion" value="login">

        <div class="form-group">
            <label>Correo</label>
            <input type="email" name="correo" class="form-control" required>
        </div>

        <div class="form-group">
            <label>Contraseña</label>
            <input type="password" name="password" class="form-control" required>
        </div>

        <button type="submit" class="btn btn-primary">
            Ingresar
        </button>
        

    </form>

    <div style="text-align:center; margin-top:15px;">
        <a href="registroUsuarios.jsp">¿No tienes cuenta? Regístrate</a>
    </div>
</div>

<jsp:include page="lib/footer.jsp" />
