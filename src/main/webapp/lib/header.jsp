<%-- 
    Document   : header
    Created on : 19/03/2026, 8:39:23 a. m.
    Author     : daavv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>TurismoXR Nariño</title>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">

        <link href="./styles/styles.css" rel="stylesheet" type="text/css">
    </head>

    <body>

        <nav class="navbar navbar-expand-lg navbar-dark" style="background: linear-gradient(135deg, #0076c7, #003d7a);">
            <div class="container-fluid">

                <a class="navbar-brand" href="index.jsp">
                    🌍 TurismoXR
                </a>

                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#menu">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="menu">
                    <ul class="navbar-nav me-auto">

                        <li class="nav-item">
                            <a class="nav-link" href="index.jsp">Inicio</a>
                        </li>

                        <li class="nav-item">
                            <a class="nav-link" href="ServletExperiencias">Catálogo</a>
                        </li>

                        <li class="nav-item">
                            <a class="nav-link" href="registroExperiencias.jsp">Registrar</a>
                        </li>
                        
                        <li class="nav-item">
                            <a class="nav-link" href="ServletExperiencias?vista=admin">Administrar experiencias</a>                            
                        </li>

                        <li class="nav-item">
                            <a class="nav-link" href="login.jsp">Login</a>
                        </li>

                        <li class="nav-item">
                            <a class="nav-link" href="adminUsuarios.jsp">Usuarios</a>
                        </li>


                    </ul>
                </div>

            </div>
        </nav>