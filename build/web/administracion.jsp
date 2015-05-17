<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="css/style.css"
        <title>Pagina de Administracion</title>
    </head>
    <body>
        <div id="wrapper">
            <header></header>
            <div id="contents">
                <section>
                    <p>Lista de usuarios</p>
                    <table id="listaUsuarios" name="listaUsuarios">
                        <tr>
                            <th>#</th>
                            <th>Nombre, Apellidos</th>
                            <th>Ver</th>
                            <th>Eliminar</th>
                        </tr>
                    </table>
                </section>
                <section>
                    <p>Agregar noticia</p>
                    <form>
                        <textarea cols="50" rows="4"></textarea>
                        <button type="submit" >Agregar</button>
                    </form>
                </section>
            </div>
            <footer></footer>
        </div>
    </body>
</html>
