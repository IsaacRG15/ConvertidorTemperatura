<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Convertidor</title>
    <link rel="stylesheet" href="resources/css/main.css" type="text/css">
</head>
<body>
    <header>
        <h1>Convertir valor de temperatura</h1>
    </header>
    <section>
        <p>Para poder convertir tu valor, escribe el valor y selecciona a que tipo se convertira</p>
    </section>
    <br>
    <section>
        <form action="lista" method="post">
            <input type="hidden" name="action" value="agregar">
            <label for="valor">Valor:</label>
            <input type="text" id="valor" name="valor"><br>
            <label for="opciones">Elige una opción a convertir:</label>
            <select name="opciones" id="opciones">
                <option value="Celsius">Celsius</option>
                <option value="Fahrenheit">Fahrenheit</option>
            </select>
            <label for="enviar">&nbsp;</label>
            <input type="submit" id="enviar">
        </form>
    </section>

</body>
</html>