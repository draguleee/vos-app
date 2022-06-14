<!DOCTYPE html>
<html>
    <head>
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
            <li><a href="documentation.php" class="focus">Documentation</a></li>
            <li class="dropdown"><a href="#contact" class="dropbtn">Contact Me</a>
                <div class="dropdown-content">
                    <a href="mailto:aandreid14@gmail.com">E-mail</a>
                    <a href="https://github.com/draguleee">GitHub</a>
                    <a href="https://www.linkedin.com/in/andreea-ioana-dragu-870a121a1/">LinkedIn</a>
                </div>
            </li>
            <li><a href="download.php">Download VOS</a></li>
            <li><a href="logout.php">Log Out</a></li>
        </ul>
        <section class="first">
            <div align="center">
                <h1 id="h1"> Documentation </h1>
                <h4 id="h4"> Useful resources you can browse through </h4>
                <i class="fa-solid fa-book"></i>
            </div>
        </section>
        <section class="second">
            <div class="container reveal">
                <h2> Please refer to the available documentation </h2>
                <div class="text-container">
                    <table>
                        <tr>
                            <th> Name </th>
                            <th> Author </th>
                            <th> Place or Publisher </th>
                            <th> File Link </th>
                        </tr>
                        <tr>
                            <td> Suport de Curs - Sisteme cu Evenimente Discrete </td>
                            <td> Prof. Dr. Ing. Adina Mariana ASTILEAN </td>
                            <td> Cluj-Napoca </td>
                            <td><a href="./../documentation/SED/Cursuri-SED.rar">Cursuri-SED.rar</td>
                        </tr>
                        <tr>
                            <td> Sisteme cu Evenimente Discrete - Indrumator de Laborator </td>
                            <td> Dr. Ing. Camelia Claudia AVRAM </td>
                            <td> Cluj Napoca, Automation Department </td>
                            <td><a href="./../documentation/SED/SED_indrumator.pdf">SED_indrumator.pdf</a></td>
                        </tr>
                        <tr>
                            <td> Aplicatii ale retelelor Petri in studierea Sistemelor cu Evenimente Discrete </td>
                            <td> Octavian Pastravanu, Mihaela Matcovschi, Cristian Mahulea </td>
                            <td> Editura Gh. Asachi, 2002 </td>
                            <td><a href="./../documentation/SED/Aplicatii-Retele-Petri.pdf">SED_indrumator.pdf</a></td>
                        </tr>
                        <tr>
                            <td> Suport de Curs - Sisteme de Timp Real </td>
                            <td> Prof. Tiberiu Stefan LETIA </td>
                            <td> Cluj-Napoca </td>
                            <td><a href="./../documentation/STR/Cursuri-STR.rar">Cursuri-STR.rar</a></td>
                        </tr>
                        <tr>
                            <td> Laboratoare - Sisteme de Timp Real </td>
                            <td> Sl. Dr. Ing. Octavian CUIBUS </td>
                            <td> Cluj-Napoca </td>
                            <td><a href="./../documentation/STR/Laboratoare-STR.rar">Laboratoare-STR.rar</a></td>
                        </tr>
                        <tr>
                            <td> Suport de Curs - Sisteme de Control Distribuit </td>
                            <td> Prof. Tiberiu Stefan LETIA </td>
                            <td> Cluj-Napoca </td>
                            <td><a href="./../documentation/SCD/Cursuri-SCD.rar">Cursuri-SCD.rar</a></td>
                        </tr>
                        <tr>
                            <td> Laboratoare - Sisteme de Control Distribuit </td>
                            <td> Sl. Dr. Ing. Octavian CUIBUS </td>
                            <td> Cluj-Napoca </td>
                            <td><a href="./../documentation/SCD/Laboratoare-SCD.rar">Laboratoare-SCD.rar</a></td>
                        </tr>
                        <tr>
                            <td> Descrierea Dezvoltarii Aplicatiei </td>
                            <td> Andreea-Ioana Dragu </td>
                            <td> Cluj-Napoca </td>
                            <td><a href="./../documentation/Descriere-Dezvoltare-VOS.docx">Descriere_Dezvoltare-VOS.docx</a></td>
                        </tr>
                        <tr>
                            <td> Documentatie - Visual OETPN Application </td>
                            <td> Andreea-Ioana Dragu </td>
                            <td> Cluj-Napoca </td>
                            <td><a href="./../documentation/Documentatie-VOS.docx">Descriere_Dezvoltare-VOS.docx</a></td>
                        </tr>
                    </table>
                </div>
            </div>
        </section>
        <div class="footer">
            Visual OETPN Simulator (VOS) @2021-2022.
        </div>
        <script src="./../js/reveal.js"></script>
    </body>
</html>