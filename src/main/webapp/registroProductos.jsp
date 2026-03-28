<%@ include file="lib/header.jsp" %>

<h2>Registro de Experiencia</h2>

<div class="container">
    <form>

        Nombre: <input type="text"><br><br>
        Descripción: <input type="text"><br><br>
        Destino: <input type="text"><br><br>

        Tipo:
        <select>
            <option>Real</option>
            <option>Virtual</option>
        </select><br><br>

        Disponibilidad: <input type="number"><br><br>

        <input type="submit" value="Registrar">
    </form>
</div>

<%@ include file="lib/footer.jsp" %>