<%-- 
    Document   : Inicio
    Created on : 08-jul-2024, 9:39:35
    Author     : Usuario
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="servicio.*" %>

<!-- icon list--><!DOCTYPE html>
<html class="wide wow-animation" lang="en">
  <head>
    <!-- Site Title-->
    <title>Home</title>
    <meta name="format-detection" content="telephone=no">
    <meta name="viewport" content="width=device-width, height=device-height, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta charset="utf-8">
    <link rel="icon" href="images/favicon.ico" type="image/x-icon">
    <!-- Stylesheets-->
    <link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=Lato:400,700,400italic%7CPoppins:300,400,500,700">
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="css/style.css">
    <style>.ie-panel{display: none;background: #212121;padding: 10px 0;box-shadow: 3px 3px 5px 0 rgba(0,0,0,.3);clear: both;text-align:center;position: relative;z-index: 1;} html.ie-10 .ie-panel, html.lt-ie-10 .ie-panel {display: block;}</style>
  </head>
  <body>
    <div class="ie-panel"><a href="http://windows.microsoft.com/en-US/internet-explorer/"><img src="images/ie8-panel/warning_bar_0000_us.jpg" height="42" width="820" alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today."></a></div>
    <!-- Page-->
    <div class="text-center page">
      <!-- Page preloader-->
      <div class="page-loader">
        <div>
          <div class="page-loader-body">
            <div class="loader">
              <div class="window"></div>
              <div class="window"></div>
              <div class="window"></div>
              <div class="window"></div>
              <div class="window"></div>
              <div class="window"></div>
              <div class="window"></div>
              <div class="window"></div>
              <div class="window"></div>
              <div class="window"></div>
              <div class="window"></div>
              <div class="window"></div>
              <div class="window"></div>
              <div class="window"></div>
              <div class="window"></div>
              <div class="window"></div>
              <div class="window"></div>
              <div class="window"></div>
              <div class="window"></div>
              <div class="window"></div>
              <div class="window"></div>
              <div class="window"></div>
              <div class="window"></div>
              <div class="window"></div>
              <div class="window"></div>
              <div class="door"></div>
              <div class="hotel-sign"><span>H</span><span>O</span><span>T</span><span>E</span><span>L</span></div>
            </div>
          </div>
        </div>
      </div>
      <!-- Page Header-->
      <header class="page-header" style="padding-bottom: 24px">
        <!-- RD Navbar-->
        <div class="rd-navbar-wrap">
          <nav class="rd-navbar rd-navbar-default-with-top-panel" data-layout="rd-navbar-fixed" data-sm-layout="rd-navbar-fixed" data-md-layout="rd-navbar-fullwidth" data-md-device-layout="rd-navbar-fixed" data-lg-layout="rd-navbar-fullwidth" data-lg-device-layout="rd-navbar-fullwidth" data-md-stick-up-offset="90px" data-lg-stick-up-offset="150px" data-stick-up="true" data-sm-stick-up="true" data-md-stick-up="true" data-lg-stick-up="true">
            <div class="rd-navbar-top-panel rd-navbar-collapse">
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
                  <div class="rd-navbar-brand fullwidth-brand"><a class="brand-name" href="index.html"><img src="https://wimbledon-hotel.com/wp-content/uploads/2022/08/cropped-logo-hwimbledon.png" alt="" width="314" height="48"/></a></div>
                </div>
                <div class="right-side">
                  <!-- Contact Info-->
                  <div class="contact-info">
                    <div class="unit unit-middle unit-horizontal unit-spacing-xs">
                      <div class="unit__left"><span class="icon icon-primary text-middle mdi mdi-phone"></span></div>
                      <div class="unit__body"><a class="text-middle" href="tel:#">+1 (409) 987–5874</a></div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="rd-navbar-inner">
              <!-- RD Navbar Panel-->
              <div class="rd-navbar-panel">
                <!-- RD Navbar Toggle-->
                <button class="rd-navbar-toggle" data-rd-navbar-toggle=".rd-navbar-nav-wrap"><span></span></button>
                <!-- RD Navbar collapse toggle-->
                <button class="rd-navbar-collapse-toggle" data-rd-navbar-toggle=".rd-navbar-collapse"><span></span></button>
                <!-- RD Navbar Brand-->
                <div class="rd-navbar-brand mobile-brand"><a class="brand-name" href="index.html"><img src="images/logo-default-314x48.png" alt="" width="314" height="48"/></a></div>
              </div>
              <div class="rd-navbar-aside-right">
                <div class="rd-navbar-nav-wrap">
                  <div class="rd-navbar-nav-scroll-holder">
                    <ul class="rd-navbar-nav">
                        <li class="active"><a href="Inicio.jsp">INICIO</a>
                      </li>
                      <li><a href="nosotros.jsp">NOSOTROS</a>
                      </li>
                      <li><a href="contacto.jsp">CONTACTO</a>
                      </li>
                    </ul>
                  </div>
                </div>
              </div>
            </div>
          </nav>
        </div>
      </header>
      <section class="section">
        <div class="shell-wide">
          <div class="range range-30 range-xs-center">
            <div class="cell-lg-8 cell-xl-9">
              <!-- Classic slider-->
              <section class="section">
                <!-- Swiper -->
                <div class="swiper-container swiper-slider swiper-style-2" data-loop="false" data-autoplay="5500" data-simulate-touch="false" data-slide-effect="slide" data-direction="vertical">
                  <div class="swiper-wrapper">
                    <div class="swiper-slide" data-slide-bg="images/switer-1.jpg">
                      <div class="swiper-slide-caption">
                        <div class="shell text-sm-left">
                          <h1 data-caption-animate="slideInDown" data-caption-delay="100">Tu retiro ideal</h1>
                          <div class="slider-subtitle-group">
                            <div class="decoration-line" data-caption-animate="slideInDown" data-caption-delay="400"></div>
                            <h4 data-caption-animate="slideInLeft" data-caption-delay="700">Disfruta del mundo de la relajación</h4>
                            <h3 data-caption-animate="slideInLeft" data-caption-delay="800">¡y tranquilidad!</h3>
                          </div>
                        </div>
                      </div>
                    </div>
                    <div class="swiper-slide" data-slide-bg="images/mt-0444-home-slider1.jpg">
                      <div class="swiper-slide-caption">
                        <div class="shell text-sm-left">
                          <h1 data-caption-animate="slideInDown" data-caption-delay="100">Relájate y Descansa</h1>
                          <div class="slider-subtitle-group">
                            <div class="decoration-line" data-caption-animate="slideInDown" data-caption-delay="400"></div>
                            <h4 data-caption-animate="slideInLeft" data-caption-delay="700">Experimente el nivel de lujo</h4>
                            <h3 data-caption-animate="slideInLeft" data-caption-delay="800">de nuestros tratamientos de spa</h3>
                          </div>
                        </div>
                      </div>
                    </div>
                    <div class="swiper-slide" data-slide-bg="images/mt-0444-home-slider2.jpg">
                      <div class="swiper-slide-caption">
                        <div class="shell text-sm-left">
                          <h1 data-caption-animate="slideInDown" data-caption-delay="100">Revitaliza y Relájate</h1>
                          <div class="slider-subtitle-group"> 
                            <div class="decoration-line" data-caption-animate="slideInDown" data-caption-delay="400"></div>
                            <h4 data-caption-animate="slideInLeft" data-caption-delay="700">Disfrute de nuestra primera categoría</h4>
                            <h3 data-caption-animate="slideInLeft" data-caption-delay="800">balneario</h3>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div class="swiper-pagination"></div>
                </div>
              </section>
            </div>
            <div class="cell-lg-4 cell-xl-3 reveal-lg-flex">
              <div class="hotel-booking-form">
                <h3>Reserva una habitación</h3>
                <p>En nuestro exclusivo hotel, nos dedicamos a brindar experiencias únicas para todos aquellos que buscan disfrutar de momentos inolvidables. Ofrecemos un ambiente donde la relajación y el rejuvenecimiento se entrelazan, proporcionando infinitas oportunidades para explorar y descubrir nuevos horizontes. Nuestro compromiso es asegurar que cada visita sea una experiencia revitalizante y llena de emoción.</p>
                <!-- RD Mailform-->
                <form class="rd-mailform" data-form-output="form-output-global" data-form-type="contact" method="Post" action="IniciarSesion">
                  <div class="range range-sm-bottom spacing-20">
      
                    <div class="cell-lg-12 cell-md-4">
                      <button class="button button-primary button-square button-block button-effect-ujarak" type="button" onclick="window.location.href='registrarCliente.jsp'" ><span>Registrate y Reserva</span></button>
                      <p>¿Ya tienes una cuenta?</p>
                      <button class="button button-primary button-square button-block button-effect-ujarak" type="button" onclick="window.location.href='login.jsp'" ><span>Inicia Sesión</span></button>
                    </div>
                  
                  </div>
                </form>
                  
                
              </div>
            </div>
          </div>
        </div>
      </section>
      <!-- About us-->
      <section class="section section-md bg-white text-center text-sm-left">
        <div class="shell-wide">
          <div class="range range-50 range-xs-center overflow-hidden">
            <div class="cell-sm-10 cell-md-8 cell-lg-7 wow fadeInUp" data-wow-delay=".1s">
              <div class="post-video post-video-border">
                <div class="post-video__image"><img src="images/video-bg-1020x525.jpg" alt="" width="1020" height="525"/>
                </div>
                <div class="post-video__body"><a class="link-control post-video__control" data-lightgallery="item" href="https://www.youtube.com/watch?v=I5FlP07kdvM"></a></div>
              </div>
            </div>
            <div class="cell-sm-10 cell-md-8 cell-lg-5 reveal-flex wow fadeInUp" data-wow-delay=".3s">
              <div class="bg-primary section-wrap-content-var-1">
                <div class="section-wrap-content-var-1-inner">
                  <h2>Sobre nosotros</h2>
                  <p>Comprometidos con todos aquellos que buscan energía y emoción, ofrecemos infinitas posibilidades para relajarse y revitalizarse.</p>
                  <div class="group">
                    <dl class="list-desc">
                      <dt>Días laborables:</dt>
                      <dd><span>8:00–20:00</span></dd>
                    </dl>
                    <dl class="list-desc">
                      <dt>Fines de semana:</dt>
                      <dd><span>9:00–18:00</span></dd>
                    </dl>
                  </div><a class="button button-effect-ujarak button-lg button-secondary-outline button-square" href="about-us.html"><span>Saber más</span></a>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
      <!--Indoor Pool-->
      <section class="section section-md bg-secondary-4 text-center text-sm-left">
        <div class="shell">
          <div class="range range-50 range-md-justify range-sm-middle">
            <div class="cell-sm-6 cell-md-5">
              <h3>Piscina del hotel</h3>
              <p>La piscina cubierta climatizada tiene techos abovedados con vigas de madera. La bañera de hidromasaje cuenta con ventanales y da al estanque y a la cara norte del hermoso paraje local. Por motivos de seguridad y salud, los niños deben ir acompañados de un adulto cuando visiten la piscina.</p>
              <p>La serena piscina del hotel y resort spa Royal Villas cuenta con una decoración elegante que incluye impresionantes columnas de teca del piso al techo contrastadas con un fresco piso de baldosas negras. También está disponible un comedor junto a la piscina, que ofrece una selección de platos de cualquier cocina que desee, que son saludables y deliciosos. Las clases diarias de aeróbic acuático ayudan a los huéspedes a mantenerse en forma mientras viajan.</p><a class="button button-primary button button-square button-effect-ujarak button-lg" href="#"><span>Conocer más</span></a>
            </div>
            <div class="cell-sm-6">
              <div class="box-outline box-outline__mod-1">
                <figure><img src="images/services-inicio.jpg" alt="" width="546" height="516"/>
                </figure>
              </div>
            </div>
          </div>
        </div>
      </section>
      <!-- Portfolio-->
      <section class="section section-md bg-white text-center text-sm-left">
        <div class="shell-wide">
          <div class="range range-10 range-middle">
            <div class="cell-sm-6">
              <h3>Nuestra Galeria</h3>
            </div>
            <div class="cell-sm-6 text-sm-right"><a class="heading-link link-gray-darker" href="#">See All Photos</a></div>
          </div>
          <hr>
          <div class="isotope-wrap">
            <!-- Isotope Content-->
            <div class="row isotope" data-isotope-layout="masonry" data-isotope-group="gallery" data-lightgallery="group">
              <div class="col-xs-12 col-sm-6 col-md-3 grid-sizer"></div>
              <div class="col-xs-12 col-sm-6 col-md-3 isotope-item wow fadeInUp" data-filter="Category 1" data-wow-delay=".1s"><a class="portfolio-item thumbnail-classic" href="images/gallery-1x.jpg" data-size="533x800" data-lightgallery="item"><img src="images/gallery-1x.jpg" alt="" width="420" height="584"/>
                  <figure></figure>
                  <div class="caption"><span class="icon mdi-thumb-up-outline">346</span><span class="icon mdi-eye">220</span></div></a>
              </div>
              <div class="col-xs-12 col-sm-6 col-md-3 isotope-item wow fadeInUp" data-filter="Category 1" data-wow-delay=".2s"><a class="portfolio-item thumbnail-classic" href="images/gallery-2.jpg" data-size="1199x800" data-lightgallery="item"><img src="images/gallery-2.jpg" alt="" width="420" height="278"/>
                  <figure></figure>
                  <div class="caption"><span class="icon mdi-thumb-up-outline">346</span><span class="icon mdi-eye">220</span></div></a>
              </div>
              <div class="col-xs-12 col-sm-6 col-md-3 isotope-item wow fadeInUp" data-filter="Category 1" data-wow-delay=".4s"><a class="portfolio-item thumbnail-classic" href="images/gallery-3.jpg" data-size="584x800" data-lightgallery="item"><img src="images/gallery-3.jpg" alt="" width="420" height="584"/>
                  <figure></figure>
                  <div class="caption"><span class="icon mdi-thumb-up-outline">346</span><span class="icon mdi-eye">220</span></div></a>
              </div>
              <div class="col-xs-12 col-sm-6 col-md-3 isotope-item wow fadeInUp" data-filter="Category 1" data-wow-delay=".5s"><a class="portfolio-item thumbnail-classic" href="images/gallery-4.jpg" data-size="1200x800" data-lightgallery="item"><img src="images/gallery-4.jpg" alt="" width="420" height="278"/>
                  <figure></figure>
                  <div class="caption"><span class="icon mdi-thumb-up-outline">346</span><span class="icon mdi-eye">220</span></div></a>
              </div>
              <div class="col-xs-12 col-sm-6 col-md-3 isotope-item wow fadeInUp" data-filter="Category 1" data-wow-delay=".3s"><a class="portfolio-item thumbnail-classic" href="images/gallery-5.jpg" data-size="1200x800" data-lightgallery="item"><img src="images/gallery-5.jpg" alt="" width="420" height="278"/>
                  <figure></figure>
                  <div class="caption"><span class="icon mdi-thumb-up-outline">346</span><span class="icon mdi-eye">220</span></div></a>
              </div>
              <div class="col-xs-12 col-sm-6 col-md-3 isotope-item wow fadeInUp" data-filter="Category 1" data-wow-delay=".6s"><a class="portfolio-item thumbnail-classic" href="images/gallery-6.jpg" data-size="1200x798" data-lightgallery="item"><img src="images/gallery-6.jpg" alt="" width="420" height="278"/>
                  <figure></figure>
                  <div class="caption"><span class="icon mdi-thumb-up-outline">346</span><span class="icon mdi-eye">220</span></div></a>
              </div>
            </div>
          </div>
        </div>
      </section>
      <!-- Blog-->
      <section class="section section-sm bg-white text-center text-sm-left">
        <div class="shell-wide">
          <h3>Nuestros servicios</h3>
          <hr>
          <!-- Owl Carousel-->
          <div class="owl-carousel owl-carousel-stagePadding" data-items="1" data-sm-items="2" data-xl-items="3" data-dots="false" data-nav="true" data-stage-padding="0" data-lg-stage-padding="100" data-xl-stage-padding="0" data-loop="true" data-margin="30" data-mouse-drag="false" data-nav-class="[&quot;owl-button-prev fl-budicons-free-left161&quot;,&quot;owl-button-next  fl-budicons-free-right163&quot;]">
            <div class="post-box post-box-minimal post-box-horizontal wow fadeInUp" data-wow-delay=".1s"><a class="post-box-image" href="blog-post.html">
                <figure><img src="images/layout-2-blog-01.jpg" alt="" width="460" height="369"/>
                </figure></a>
              <div class="post-box-minimal-caption">
                <div class="post-box-minimal-caption-inner">
                  <h5 class="post-box-minimal-title"><a href="blog-post.html">Se ofrece los mejores procedimientos de spa</a></h5>
                  <div class="post-box-minimal-meta-bottom">
                    <time class="post-box-icon mdi mdi-clock" datetime="2024">Reserva con nosotros</time>
                    <p><a class="" href="#">2024</a></p>
                  </div>
                </div>
              </div>
            </div>
            <div class="post-box post-box-minimal post-box-horizontal wow fadeInUp" data-wow-delay=".2s"><a class="post-box-image" href="blog-post.html">
                <figure><img src="images/layout-2-blog-02.jpg" alt="" width="460" height="369"/>
                </figure></a>
              <div class="post-box-minimal-caption">
                <div class="post-box-minimal-caption-inner">
                  <h5 class="post-box-minimal-title"><a href="blog-post.html">Terapias y actividades destacadas en el Hotel</a></h5>
                  <div class="post-box-minimal-meta-bottom">
                    <time class="post-box-icon mdi mdi-clock" datetime="2024">Reserva con nosotros</time>
                    <p><a class="" href="#">2024</a></p>
                  </div>
                </div>
              </div>
            </div>
            <div class="post-box post-box-minimal post-box-horizontal wow fadeInUp" data-wow-delay=".3s"><a class="post-box-image" href="blog-post.html">
                <figure><img src="images/layout-2-blog-03.jpg" alt="" width="460" height="369"/>
                </figure></a>
              <div class="post-box-minimal-caption">
                <div class="post-box-minimal-caption-inner">
                  <h5 class="post-box-minimal-title"><a href="blog-post.html">Su escapada relajante comienza aquí</a></h5>
                  <div class="post-box-minimal-meta-bottom">
                    <time class="post-box-icon mdi mdi-clock" datetime="2024">Reserva con nosotros</time>
                    <p><a class="" href="#">2024</a></p>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
      <!-- Page Footer-->
      <footer class="page-footer text-left text-sm-left">
        <div class="shell-wide">
          <div class="footer-banner section-sm"></div>
          <div class="page-footer-minimal">
            <div class="shell-wide">
              <div class="range range-50">
                <div class="cell-sm-6 cell-md-3 cell-lg-4 wow fadeInUp" data-wow-delay=".1s">
                  <div class="page-footer-minimal-inner">
                    <h4>Horario de apertura</h4>
                    <ul class="list-unstyled">
                      <li>
                        <div class="group-xs"> 
                          <div>
                            <dl class="list-desc">
                              <dt>Días laborables: </dt>
                              <dd class="text-gray-darker"><span>8:00–20:00</span></dd>
                            </dl>
                          </div>
                          <div>
                            <dl class="list-desc">
                              <dt>Fines de semana: </dt>
                              <dd class="text-gray-darker"><span>9:00–18:00</span></dd>
                            </dl>
                          </div>
                        </div>
                      </li>
                      <li>
                        <p class="rights"><span>&copy;&nbsp;</span><span>2024</span><span>&nbsp;</span><span class="copyright-year"></span>Royal Villas. All Rights Reserved.</p>
                      </li>
                    </ul>
                  </div>
                </div>
                <div class="cell-sm-6 cell-md-5 cell-lg-4 wow fadeInUp" data-wow-delay=".2s">
                  <div class="page-footer-minimal-inner">
                    <h4>Correo</h4>
                    <ul class="list-unstyled">
                      <li>
                        <dl class="list-desc">
                          <dt><span class="icon icon-sm mdi mdi-map-marker"></span></dt>
                          <dd><a class="link link-gray-darker" href="#">6036 Richmond hwy., Alexandria, VA, 2230</a></dd>
                        </dl>
                      </li>
                    </ul>
                  </div>
                </div>
                <div class="cell-sm-8 cell-md-4 wow fadeInUp" data-wow-delay=".3s">
                  <div class="page-footer-minimal-inner-subscribe">
                    <h4>Llamanos</h4>
                    <!-- RD Mailform-->
                    <!--<form class="rd-mailform rd-mailform-inline form-center" data-form-output="form-output-global" data-form-type="subscribe" method="post" action="bat/rd-mailform.php">
                      <div class="form-wrap">
                        <input class="form-input" id="subscribe-email" type="email" name="email" data-constraints="@Email @Required">
                        <label class="form-label" for="subscribe-email">Enter your e-mail</label>
                      </div>
                      <button class="button button-primary-2 button-effect-ujarak button-square" type="submit"><span>Subscribe</span></button>
                    </form>-->
                  <ul class="list-unstyled">
                      
                      <li>
                        <dl class="list-desc">
                          <dt><span class="icon icon-sm mdi mdi-phone"></span></dt>
                          <dd class="text-gray-darker">Celular: <a class="link link-gray-darker" href="tel:#">+1 (409) 987–5874</a>
                          </dd>
                        </dl>
                      </li>
                    </ul>  
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </footer>
    </div>
    <!-- PANEL-->
    <!-- END PANEL-->
    <!-- Global Mailform Output-->
    <div class="snackbars" id="form-output-global"></div>
    <!-- PhotoSwipe Gallery-->
    <div class="pswp" tabindex="-1" role="dialog" aria-hidden="true">
      <div class="pswp__bg"></div>
      <div class="pswp__scroll-wrap">
        <div class="pswp__container">
          <div class="pswp__item"></div>
          <div class="pswp__item"></div>
          <div class="pswp__item"></div>
        </div>
        <div class="pswp__ui pswp__ui--hidden">
          <div class="pswp__top-bar">
            <div class="pswp__counter"></div>
            <button class="pswp__button pswp__button--close" title="Close (Esc)"></button>
            <button class="pswp__button pswp__button--share" title="Share"></button>
            <button class="pswp__button pswp__button--fs" title="Toggle fullscreen"></button>
            <button class="pswp__button pswp__button--zoom" title="Zoom in/out"></button>
            <div class="pswp__preloader">
              <div class="pswp__preloader__icn">
                <div class="pswp__preloader__cut">
                  <div class="pswp__preloader__donut"></div>
                </div>
              </div>
            </div>
          </div>
          <div class="pswp__share-modal pswp__share-modal--hidden pswp__single-tap">
            <div class="pswp__share-tooltip"></div>
          </div>
          <button class="pswp__button pswp__button--arrow--left" title="Previous (arrow left)"></button>
          <button class="pswp__button pswp__button--arrow--right" title="Next (arrow right)"></button>
          <div class="pswp__caption">
            <div class="pswp__caption__cent"></div>
          </div>
        </div>
      </div>
    </div>
    <!-- Javascript-->
    <script src="js/core.min.js"></script>
    <script src="js/script.js"></script>
    <!--Coded by Drel-->
  </body>
</html>
