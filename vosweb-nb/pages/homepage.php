<?php

session_start();

if(!isset($_SESSION["loggedin"]) || $_SESSION["loggedin"] !== true) {
    header("location: login.php");
    exit;
}
?>

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
            <li><a href="homepage.php" class="focus">Home</a></li>
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
            <li><a href="download.php">Download VOS</a></li>
            <li><a href="logout.php">Log Out</a></li>
        </ul>
        <section class="first">
            <div align="center">
                <h1 id="h1"> Visual OETPN Simulator </h1>
                <h4 id="h4"> The tool for designing and simulating Object Enhanced Timed Petri Nets </h4>
                <img align="center" class="image" src="./../img/vos.jpg" alt="VOS">
            </div>
        </section>
        <section class="second">
            <div class="container reveal">
                <h2> What is Visual OETPN Simulator (VOS)? </h2>
                <div class="text-container">
                    <div class="text-box">
                        <h3> Short Description </h3>
                        <p id="justify">
                            <strong>Visual OETPN Simulator </strong>(short: <strong> VOS</strong>) is an open-source tool that helps students 
                            learning in technical fields to understand, design and simulate <strong>Object-Enhanced Timed Petri Nets</strong> 
                            (OETPNs).<br>
                            <br><strong>Visual OETPN Simulator</strong> was developed by Automation and Applied Informatics student, 
                            <strong>Dragu Andreea</strong>, as a bachelor's thesis, including researches on Petri Nets (specifically OETPNs), 
                            Web Development technologies and programming languages (HTML, JavaScript, CSS) and Desktop Development technologies 
                            and programming languages (Java, Swing, MySQL).<br> 
                            More information about the creator can be found on <a href="https://www.linkedin.com/in/andreea-ioana-dragu-870a121a1/" 
                            style="text-decoration: none; color: #ffc180;"><strong>LinkedIn</strong></a>, <a href="https://github.com/draguleee" 
                            style="text-decoration: none; color: #ffc180;"><strong>GitHub</strong></a>, or directly via 
                            <a href="mailto:aandreid14@gmail.com" style="text-decoration: none; color: #ffc180;"><strong>E-mail</strong></a>.<br>
                            <br>And, the most important thing of all, <strong>Visual OETPN Simulator</strong></span> is completely free to use. 
                            The user must create a new account to start using the tool, or if they already have an account, they must log into their account. 
                        </p>
                    </div>
                    <div class="text-box">
                        <h3> Why OETPNs? </h3>
                        <p>
                            <strong>Visual OETPN Simulator</strong> was thinked and designed under
                            my strong interest in Petri Nets. The passion for Petri Nets started in the third year of university, specifically
                            the first semester, when I first got acquaintained with the <strong>Discrete Events Systems</strong> subject. 
                            Then, the interest grew in time when I completed the <strong> Real-Time Systems</strong> subject, concluding with 
                            the <strong>Distributed Control Systems</span> subject.<br>
                            <br><strong>OETPNs</strong> retain the possibilities of describing and verifying classic Petri Nets, but also comes 
                            with new features. OETPNs can describe <strong>logical operations, mutual exclusion and synchronizations,
                            shared usage of limited resources, deadlocks, endless executions, inhibitory arches, reset arches, data structures, 
                            conditional executions, distributed structures and executions</strong> and many more.<br>
                            <br>To read further informations about OETPNs, please consult the <strong><a href="about-oetpns.php" 
                            style="text-decoration: none; color: #ffc180;"> About OETPNs</a></strong> page.
                        </p>
                    </div>
                </div>
            </div>
        </section>  
        <section class="third">
            <div class="container reveal">
                <h2> Sign up to start using Visual OETPN Simulator (VOS)! </h2>
                <div class="text-container">
                    <div class="text-box">
                        <h3> Create an account </h3>
                        <p>
                            If you decided to start using <strong>Visual OETPN Simulator</strong>, the first thing you need to do is create an 
                            account that will grant you access into the application. Simply fill in every field in the Sign Up form, make sure 
                            that the inputed information is correct, press the Sign Up button, and you will be prompted to the Login Page.
                            Here, you can use your newly created account to start using VOS.<br>
                            <br> Do you already have an account? Just press "Already have an account? Log In" button to get access to the tool.<br>
                            <br> If you want to refresh your memory about <strong>OETPNs</strong>, feel free to visit <strong><a href="about-oetpns.php" 
                            style="text-decoration: none; color: #313131;" alt="About OETPN Page">About OETPNs</a></strong> page.<br>
                            <br> Want to see the full features of <strong>Visual OETPN Simulator</strong>? Feel free to visit <strong><a href="about-vos.php" 
                            style="text-decoration: none; color: #313131;">About VOS</a></strong> page.<br>
                        </p>
                    </div>
                    <div class="text-box">
                        <video width="1050px" height="570px" controls="controls">
                            <source src="./../vids/signup.mp4" type="video/mp4">
                        </video>
                    </div>
                </div>
            </div>
        </section> 
        <section class="second">
            <div class="container reveal">
                <h2>Login to start using Visual OETPN Simulator (VOS)!</h2>
                <div class="text-container">
                    <div class="text-box">
                        <video width="1050px" height="570px" controls="controls">
                            <source src="./../vids/login.mp4" type="video/mp4">
                        </video>
                    </div>
                <div class="text-box">
                    <h3>Get access to VOS</h3>
                    <p>
                        Do you already have an account for <strong>Visual OETPN Simulator</strong>? Good for you!<br> To get access granted to the tool,
                        enter your credentials (E-mail and Password) in the corresponding fields. Make sure you entered your credentials correctly. If so,
                        you will automatically be redirected to the main page of <strong>Visual OETPN Simulator</strong>.<br>
                        <br> You don't have an account? Just press "Don't have an account? Sign Up" button to create one.<br>
                        <br> If you want to re-read information about <strong>OETPNs</strong>, feel free to visit <strong><a href="about-oetpns.php" 
                        style="text-decoration: none; color: #ffc180;">About OETPNs</a></strong> page.<br>
                        <br> Want to see the full features of <strong>Visual OETPN Simulator</strong>? Feel free to visit <strong><a href="about-vos.php" 
                        style="text-decoration: none; color: #ffc180;">About VOS</a></strong> page.<br>
                    </p>
                </div>
            </div>
        </section>
        <section class="third">
            <div class="container reveal">
                <div align="center">
                    <h2>A quick, convincing demo</h2>
                    <video width = 1050px height="570px" controls="controls">
                        <source src="./../vids/demo.mp4">
                    </video>
                </div>
            </div>
        </section>
        <div class="footer">
            Visual OETPN Simulator (VOS) @2021-2022.
        </div>
        <script src="./../js/reveal.js"></script>
    </body>
</html>
