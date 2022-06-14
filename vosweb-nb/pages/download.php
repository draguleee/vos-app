<!DOCTYPE html>
<html>
    <head> 
        <meta charset="UTF-8">
        <title> VOS - Download </title> 
        <link href="./../css/style.css" rel="stylesheet">
        <link href="./../font-awesome/css/all.min.css" rel="stylesheet">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Comfortaa:wght@300&family=Questrial&display=swap" rel="stylesheet">
    </head>
    <body class="body">
        <ul>
            <li><img src="./../img/vos.jpg" alt="VOS" class="logo"></li>
            <li><a href="./../index.php">Home</a></li>
            <li class="dropdown"><a href="#about" class="dropbtn">About</a>
                <div class="dropdown-content">
                    <a href="about-systems.php">About Systems</a>
                    <a href="about-petrinets.php">About Petri Nets</a>
                    <a href="about-oetpns.php">About OETPNs</a>
                    <a href="about-vos.php">About VOS (Visual OETPN Simulator)</a>
                </div>
            </li>
            <li><a href="documentation.php">Documentation</a></li>
            <li class="dropdown"><a href="#contact" class="dropbtn">Contact Me</a>
                <div class="dropdown-content">
                    <a href="mailto:aandreid14@gmail.com">E-mail</a>
                    <a href="https://github.com/draguleee">GitHub</a>
                    <a href="https://www.linkedin.com/in/andreea-ioana-dragu-870a121a1/">LinkedIn</a>
                </div>
            </li>
            <li><a href="download.php" class="focus">Download VOS</a></li>
            <li><a href="logout.php">Log Out</a></li>
        </ul>
        <section class="first">
            <div align="center">
                <h1 id="h1"> Download Visual OETPN Simulator (VOS) </h1>
                <h4 id="h4"> Design, create and simulate OETPNs now! </h4>
                <i class="fa-solid fa-file-arrow-down"></i>
            </div>
        </section>
        <section class="second">
            <div class="container reveal">
                <h2> Available Downloads </h2>
                <div class="text-container">
                    <div class="text-box">
                        <h3> Download the Application </h3>
                        <p style="text-align: center">
                            <br>As intended, <strong>Visual OETPN Simulator</strong> is a free-to-use <br>software,  no charges are applied for using 
                            this application, as anyone can benefit of the usage of it.
                            <br> Download <strong>Visual OETPN Simulator</strong> application from the button below.
                            <br><br>
                            <a href="file:///C:\vos-app\vos-desktop.zip">
                                <button class="button" download="vos-desktop"> Visual OETPN Simulator </button>
                            </a>
                        </p>
                    </div>
                    <div class="text-box">
                        <h3> Download the Source Code </h3>
                        <p style="text-align: center">
                            <strong>Visual OETPN Simulator</strong> is an open-source tool, which means anyone <br>can come with contributions as long as they are benefical.
                            <br> Please <a href="mailto:aandreid14@gmail.com" style="text-decoration: none; color: #ffc180;">contact me</a> if you want to bring your 
                            useful changes to this application.
                            <br> Download the source code of <strong>Visual OETPN Simulator</strong> from the button below (please check the brances accordingly).
                            <br><br>
                            <a href="https://github.com/draguleee/vos-app/tree/main">
                                <button class="button"> Visual OETPN Simulator </button>
                            </a>
                        </p>
                    </div>
                </div>
            </div>  
        </section>
        <div class="footer">
            Visual OETPN Simulator (VOS) @2021-2022.
        </div>
        <script src="./../js/reveal.js"></script>
    </body>
</html>