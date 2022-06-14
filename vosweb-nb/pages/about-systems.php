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
      <li><a href="homepage.php">Home</a></li>
      <li class="dropdown focus"><a href="#about" class="dropbtn, focus">About</a>
        <div class="dropdown-content">
          <a href="about-systems.php" class="focus">About Systems</a>
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
      <h1 id="h1"> About Systems </h1>
      <h4 id="h4"> A quick familiarization with the concept of System </h4>
      <i class="fa-solid fa-computer"></i>
      </div>
    </div>
  </section>
  <section class="second">
    <div class="container reveal">
      <h2>  First things first...  </h2>
      <div class="text-container">
        <div class="text-box">
          <h3> ...What is a System? </h3>
          <p>
            <br> A system represents an ensemble of elements that have a global purpose. 
            Between these elements, there are common actions, interactions and 
            interdependencies. Each and every element has its own behaviour, and 
            those behaviors describe the system overall. <br><br>
            To better understand the concept of system (if you are new to those 
            terminologies), imagine a bicycle: a bicycle represents an ensemble of 
            elements (wheels, brakes, handle bar, seat, chain, pedals etc), that 
            have a global purpose: to allow its "user" to travel to certain locations. <br><br>
            Between the listed elements, there are common actions, interactions and
            interdependencies, such as:
            <br> - When the pedals are pushed, the wheels start moving;
            <br> - When the brake is actioned, the wheels are stopped;
            <br> - When the wheels are in movement, the chain is rotating too. 
            This is only a simple example of a system, but there are many more systems 
            of many more types.
          </p>
        </div>
        <div class="text-box">
          <br><br><i class="fa-solid fa-gears"></i>
        </div>
    </div>
  </section>
  <section class="third">
    <div class="container reveal">
      <h2> Going further... </h2>
      <div class="text-container">
        <div class="text-box">
          <br><br><img src="./../img/vos-systems-hierarchy.jpg">
        </div>
        <div class="text-box">
          <h3> ...Types of systems </h3>
          <p>
            <br> Systems can be classified as continuous, discrete-time, discrete-event, hybrid, control etc.
            When one or more of the system's characteristics change in time, the system is dynamic. 
            The hierarchy that best describes the dynamic systems is described as follows:
            <br> - <b>Dynamic systems:</b> Systems with variable parameters in time, Time invariant systems;
            <br> - <b>Time invariant systems:</b> Nonlinear systems, Linear systems;
            <br> - <b>Linear systems:</b> Continuous state systems, Discrete state systems;
            <br> - <b>Discrete state systems:</b> Time-driven systems, Event-driven systems;
            <br> - <b>Event-driven systems:</b> Deterministic systems, Stochastic systems.
            <br> All of the systems listed above present unique and vaste characteristics, thus we 
            will not talk them through. The one and only system category of interest is <b>Discrete
            events systems</b> category.
            <br> If you are interested in reading about other types of systems (Continuous, Hybrid, Control Systems etc.,
            please refer to the <a href="documentation.php" style="text-decoration: none; color: #313131;;"><strong>Documentation</strong></a>
            page, where you can find additional information.
            </b>
          </p>
        </div>
      </div>
    </div>
  </section>
  <section class="second">
    <div class="container reveal">
      <h2> Discrete Systems </h2>
      <div class="text-container">
        <div class="text-box">
          <br><br><img src="./../img/discrete-sys.jpg" width="640px" height="396px">
        </div>
        <div class="text-box">
          <h3> How are they different from the other types of systems? </h3>
          <p>
            Discrete Events Systems (DES) are different from the other categories of systems
            by considering the following major characteristics: 
            <br> - Their dynamic behaviour is determined by events, rather than time
            <br> - The control actions happen at precise moments, rather than being permanent
            <br> - A major part of the variables that describe the system are quantized
            <br> - Discrete Event Systems are considered dynamic systems, that are characterized by
            the presence of a state space and a state transition mechanism; thus, the modelling and 
            analysis of those kind of systems require a new mathematical approach. <br>
            <br> There are many approaches and representations of Discrete Events Systems, such as 
            natural languages, formal and automatic languages, Markov chains, Petri nets, finite state
            machines and so on. But the approach that we will talk and elaborate further is the Petri 
            nets (of different kinds) approach. Please refer to <a href="about-petrinets.php" style="text-decoration: none; color: #ffc180;">
            <strong>About Petri Nets</strong></a> page, where you can get familiar with Petri nets.
          </p>
        </div>
      </div>
    </div>
  </section>
  </div>
  <div class="footer">
    Visual OETPN Simulator (VOS) @2021-2022.
  </div>
  <script src="./../js/reveal.js"></script>
  </body>
</html>