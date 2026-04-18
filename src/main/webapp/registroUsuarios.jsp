<jsp:include page="lib/header.jsp" />

<div class="containerGeneral">
    <h2>Registrar Usuario</h2>

    <form action="ServletUsuarios" method="post">
        <input type="hidden" name="accion" value="registrar">

        <div class="form-group">
            <label>Nombre</label>
            <input type="text" name="nombre" class="form-control" required>
        </div>

        <div class="form-group">
            <label>Correo</label>
            <input type="email" name="correo" class="form-control" required>
        </div>

        <div class="form-group">
            <label>Contraseña</label>
            <input type="password" name="password" class="form-control" required>
        </div>

        <div class="form-group">
            <label>Rol</label>
            <select name="rol" class="form-control" required>
                <option value="">Seleccione</option>
                <option value="admin">Administrador</option>
                <option value="operador">Operador</option>
            </select>
        </div>

        <button type="submit" class="btn btn-primary">
            Registrar
        </button>

    </form>
</div>

<jsp:include page="lib/footer.jsp" />