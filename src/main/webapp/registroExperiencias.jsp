<jsp:include page="lib/header.jsp" />

<div class="containerGeneral">
    <h2>Registrar Experiencia</h2>

    <form action="ServletExperiencias" method="post">

        <!-- TIPO -->
        <div class="form-group">
            <label>Tipo de experiencia</label>
            <select name="tipo" id="tipo" class="form-control" required onchange="mostrarCampos()">
                <option value="">Seleccione</option>
                <option value="real">Real</option>
                <option value="virtual">Virtual</option>
            </select>
        </div>

        <!-- COMUNES -->
        <div class="form-group">
            <label>Nombre</label>
            <input type="text" name="nombre" class="form-control" required>
        </div>

        <div class="form-group">
            <label>Destino</label>
            <input type="text" name="destino" class="form-control" required>
        </div>

        <div class="form-group">
            <label>Precio</label>
            <input type="number" name="precio" class="form-control" required>
        </div>

        <!-- REAL -->
        <div id="camposReal" style="display:none;">
            <div class="form-group">
                <label>Cupos</label>
                <input type="number" name="cupos" class="form-control">
            </div>

            <div class="form-group">
                <label>Tipo de Transporte</label>
                <input type="text" name="transporte" class="form-control">
            </div>
        </div>

        <!-- VIRTUAL -->
        <div id="camposVirtual" style="display:none;">
            <div class="form-group">
                <label>Tipo XR</label>
                <input type="text" name="tipoXR" class="form-control">
            </div>
        </div>

        <button type="submit" class="btn btn-primary">
            Registrar
        </button>

    </form>
</div>

<script>
function mostrarCampos() {
    var tipo = document.getElementById("tipo").value;

    var real = document.getElementById("camposReal");
    var virtual = document.getElementById("camposVirtual");

    if (tipo === "real") {
        real.style.display = "block";
        virtual.style.display = "none";
    } else if (tipo === "virtual") {
        real.style.display = "none";
        virtual.style.display = "block";
    } else {
        real.style.display = "none";
        virtual.style.display = "none";
    }
}
</script>

<jsp:include page="lib/footer.jsp" />