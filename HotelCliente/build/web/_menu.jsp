<header>
    <div style="background-color: #b21f2d; color: yellow">
        <h3 style="text-align: center">.: Sistema de Hotel :.</h3>
        <div class="container">
            <ul style="display: inline-block" class="nav navbar-nav" id="lista-menu">
                <li style="display: inline-block"><a href="vistaEmpleado.jsp" class="btn btn-primary">EMPLEADOS</a></li>
                <li style="display: inline-block"><a href="vistaCliente.jsp" class="btn btn-primary">CLIENTES</a></li>
                <li style="display: inline-block"><a href="vistaHabitaciones.jsp" class="btn btn-primary">HABITACIONES</a></li>
                <li style="display: inline-block"><a href="vistaReservas.jsp" class="btn btn-primary">RESERVAS</a></li>
                <li style="display: inline-block"><a href="vistaAlojamiento.jsp" class="btn btn-primary">ALOJAMIENTO</a></li>
                <li style="display: inline-block"><a href="GenerarFactura.jsp" class="btn btn-primary">FACTURACION</a></li>
                <li style="display: inline-block">
                <form action="ControlConsumo" method="post">
                    <input type="hidden" name="acc" value="Crear Cesta">
                    <button type="submit" class="btn btn-primary">CESTA</button>
                </form>
                </li>
                <li style="display: inline-block"><a><strong>USUARIO: ${nombreAdmin}</strong></a></li>
                <li style="display: inline-block"><a href="Inicio.jsp" class="btn btn-danger">CERRAR SESI�N</a></li>
            </ul> <br><br>
        </div>
    </div>
</header> 

