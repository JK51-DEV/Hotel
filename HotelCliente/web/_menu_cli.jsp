<style>


    body {
        /* Ajusta el tamaño y repetición de la imagen de fondo según sea necesario */
        background-image: url('https://png.pngtree.com/thumb_back/fw800/background/20220926/pngtree-download-wallpapers-red-abstract-background-lines-wallpaper-image_1465946.jpg');
        background-size: cover; /* Cubre toda el área del cuerpo */
        background-repeat: no-repeat; /* Evita la repetición de la imagen */
        background-attachment: fixed; /* Fija la imagen de fondo para que no se desplace con el contenido */
        color: black !important;
    }

    .rd-navbar-nav > li {
        margin-right: -25px; /* Ajusta el espacio entre los elementos <li> */
    }

    .cestabutton {
        color: black;
        background-color: transparent; /* Fondo transparente para que se vea el color del botón */
        border: none; /* Quitamos el borde del botón */
        cursor: pointer; /* Cambiamos el cursor a pointer para indicar que es interactivo */
        transition: color 0.3s ease; /* Transición suave para el cambio de color */
    }

    /* Estilo para el hover que cambia el color del texto a rojo */
    .cestabutton:hover {
        color: red;
    }

    /* Estilo para el botón "CERRAR SESIÓN" */
    .cierre_sesion {
        color: white;
        transition: color 0.3s ease, background-color 0.3s ease; /* Transición suave para el color del texto y el fondo */
        padding: 10px 20px; /* Ajuste de relleno para hacer más grande el botón */
        border: 2px solid transparent; /* Borde transparente para que se vea el fondo cuando se cambie el color */
    }

    /* Estilo para el hover del botón "CERRAR SESIÓN" */
    .cierre_sesion:hover {
        color: white; /* Color rojo oscuro (#8B0000) */
        background-color: rgba(255, 255, 255, 0.1); /* Fondo blanco con opacidad 0.1 */
    }
    
    .card {
        border-radius: 1rem; /* Bordes redondeados */
        margin-bottom: 80px; /* Margen inferior */
        background-color: rgba(255, 255, 255, 0.8); /* Fondo semi-transparente */
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); /* Sombra ligera */
        padding: 20px; /* Espaciado interno */
    }

    .card .card-title {
        margin-bottom: 10px; /* Separación entre el título y el cuerpo */
        font-size: 3.25rem; /* Tamaño de fuente del título */
        font-weight: bold; /* Negrita */
    }

 .card .card-body {
        padding: 0; /* Eliminar relleno del cuerpo si es necesario */
    }
    </style>

    <header class="page-header" style="padding-bottom: 24px">
    <!-- RD Navbar-->
    <div class="rd-navbar-wrap" style="height: 228px;">
        <nav class="rd-navbar rd-navbar-default-with-top-panel rd-navbar-original rd-navbar-fullwidth"
             data-layout="rd-navbar-fixed" data-sm-layout="rd-navbar-fixed" data-md-layout="rd-navbar-fullwidth"
             data-md-device-layout="rd-navbar-fixed" data-lg-layout="rd-navbar-fullwidth"
             data-lg-device-layout="rd-navbar-fullwidth" data-md-stick-up-offset="90px"
             data-lg-stick-up-offset="150px" data-stick-up="true" data-sm-stick-up="true" data-md-stick-up="true"
             data-lg-stick-up="true">
            <div class="rd-navbar-top-panel rd-navbar-collapse toggle-original-elements">
                <div class="rd-navbar-top-panel-inner">
                    <div class="left-side">
                        <div class="group"><span class="text-italic">Siguenos en:</span>
                            <ul class="list-inline">
                                <li><a class="icon icon-sm icon-secondary-5 fa fa-instagram" href="#"></a></li>
                                <li><a class="icon icon-sm icon-secondary-5 fa fa-facebook" href="#"></a></li>
                                <li><a class="icon icon-sm icon-secondary-5 fa fa-twitter" href="#"></a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="center-side">
                        <!-- RD Navbar Brand-->
                        <div class="rd-navbar-brand fullwidth-brand"><a class="brand-name"
                                                                         href="index.html"><img
                                        src="https://wimbledon-hotel.com/wp-content/uploads/2022/08/cropped-logo-hwimbledon.png"
                                        alt="" width="314" height="48"></a></div>
                    </div>
                    <div class="right-side">
                        <!-- Contact Info-->
                        <div class="contact-info">
                            <div class="unit unit-middle unit-horizontal unit-spacing-xs">
                                <div class="unit__left"><span class="icon icon-primary text-middle mdi mdi-phone"></span>
                                </div>
                                <div class="unit__body"><a class="text-middle" href="tel:#">+1 (409) 987?5874</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="rd-navbar-inner">
                <!-- RD Navbar Panel-->
                <div class="rd-navbar-panel">
                    <!-- RD Navbar Toggle-->
                    <button class="rd-navbar-toggle toggle-original"
                            data-rd-navbar-toggle=".rd-navbar-nav-wrap"><span></span></button>
                    <!-- RD Navbar collapse toggle-->
                    <button class="rd-navbar-collapse-toggle toggle-original"
                            data-rd-navbar-toggle=".rd-navbar-collapse"><span></span></button>
                    <!-- RD Navbar Brand-->
                    <div class="rd-navbar-brand mobile-brand"><a class="brand-name"
                                                                 href="index.html"><img
                                    src="images/logo-default-314x48.png"
                                    alt="" width="314" height="48"></a></div>
                </div>
                <div class="rd-navbar-aside-right">
                    <div class="rd-navbar-nav-wrap toggle-original-elements">
                        <div class="rd-navbar-nav-scroll-holder">
                            <ul class="rd-navbar-nav">
                                <!--<li><a href="vistaEmpleado.jsp">EMPLEADOS</a></li>
                                <li><a href="vistaCliente.jsp">CLIENTES</a></li>-->
                                <li><a href="vistaHabitaciones_cli.jsp">HABITACIONES</a></li>
                                <!--<li><a href="vistaReservas.jsp">RESERVAS</a></li>
                                <li><a href="vistaAlojamiento.jsp">ALOJAMIENTO</a></li>
                                <li><a href="GenerarFactura.jsp">FACTURACION</a></li>
                                <li style="display: inline-block">-->
                                    <!-- Formulario con estilo específico para evitar conflictos -->
                                   <!-- <form action="ControlConsumo" method="post" style="margin-bottom: 0;">
                                        <input type="hidden" name="acc" value="Crear Cesta">-->
                                        <!-- Botón personalizado para evitar conflictos de estilo -->
                                       <!-- <button class="cestabutton" type="submit" style="padding: 10px 20px;">CESTA</button>
                                    </form>-->
                                </li>
                                <li class="active" style="display: inline-block"><a><strong>USUARIO: ${nombre}</strong></a></li>
                                <li class="cierre_sesion" style="display: inline-block"><a href="Inicio.jsp" class="btn btn-danger" style="color: white;">CERRAR SESIÓN</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </nav>
    </div>
</header>
                                        <br><br>                             

