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
                    <a href="about-systems.php">About Systems</a>
                    <a href="about-petrinets.php">About Petri Nets</a>
                    <a href="about-oetpns.php" class="focus">About OETPNs</a>
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
                <h1 id="h1"> About Object-Enhanced Timed Petri Nets </h1>
                <h4 id="h4"> Let's dive into the concept of OETPN </h4>
                <i class="fa-solid fa-diagram-project"></i>
            </div>
        </section>
        <section class="second">
            <div class="container reveal">
                <h2>  First things first...  </h2>
                <div class="text-container">
                    <div class="text-box">
                        <h3> ...What is an OETPN? </h3>
                            <p>
                            <br> An <strong>Object-Enhanced Timed Petri Net (OETPN)</strong> keeps the possibilities of Petri nets' 
                            describing and verifying.  But, of course, they have their own, unique characteristics, that can describe
                            the following: logical operations, mutual exclusion, common usage of shared resources, deadlocks, conditional
                            executions, inhibitor and reset arcs and so forth.
                            <br><br> The figure on the right is a simple example of an OETPN. We identify the following:
                            <br> - <strong>t<sub>k</sub></strong>: timed transition;
                            <br> - <strong>p<sub>i</sub,p<sub>j</sub></strong>: input locations;
                            <br> - <strong>p<sub>u</sub,p<sub>v</sub></strong>: output locations
                            <br> - <strong>grd</strong>: guard condition;
                            <br> - <strong>map</strong>: mapping condition;
                            <br> - <strong>eet</strong>: earliest execution time;
                            <br> - <strong>let</strong>: latest execution time;
                        </p>
                    </div>
                    <div class="text-box">
                        <br><br><img style="width:655px; height:295px" src="./../img/oetpn-simple.png">
                    </div>
                </div>
            </div>
        </section>
        <section class="third">
            <div class="container reveal">
                <h2> Definition of OETPN n-uple </h2>
                <p style="text-align: center">
                    <br> An OETPN model is an n-uple described by the following relation:
                    <br><img style="width:622px; height:30px" src="./../img/oetpn-relation.png">
                    <br> - <strong>P = {p1, p2, ..., pm}</strong>: the finite set of locations;
                    <br> - <strong>T = {t1, t2, ..., tn}</strong>: the finite set of transitions;
                    <br> - <strong>pre: PxT -> {0,1}</strong>: "before" incidence function;
                    <br> - <strong>post: TXP -> {0,1}</strong>: "after" incidence function;
                    <br> - <strong>Inp = {pi1, ...} included in P</strong>: set of input channels (inserts tokens in the net);
                    <br> - <strong>Out = {po1, ...} included in P</strong>: set of output channels (draws tokens from the net);
                    <br> - <strong>D = {..., di, ..., dj, ...} included in NxN</strong>: set of delay intervals for the transitions;
                    <br> - <strong>delta: {t E T | |<sup>0</sup>t| = 1} -> D; di = delta(ti) = [eeti,leti]</strong>: the time interval
                    of transition ti from T, meaning the earliest time of execution (eeti) and the latest time of execution (leti).
                    When eeti = leti, the transition is precisely timed.
                    <br> - <strong>Types = {Class1, Class2}</strong>: set of software classes of the net's tokens;
                    <br> - <strong>type: P -> Types</strong>: application that assign every location p a class (type), where type(p) is
                    the location's type. It is important that the added tokens must be of the specified type;
                    <br> - <strong>Grd, Map</strong>: sets of execution conditions for the transitions based on the input locations and
                    conditions for the creating / mapping the tokens in the output locations;
                    <br> - <strong>Lambda = {lambda<sub>t</sub>|t E T, lambda<sub>t</sub> included in grdt x mapt}</strong>: set of relations
                    between the guard and mapping conditions with lambda<sub>t</sub> = {grdti,mapti} that assign every transition t pairs of
                    one guard condition and one mapping condition. The (grd,map) pairs represent the rules of evolution for the model;
                    <br> - <strong>M</strong>: the net's markings array with M(p) the marking belonging to location p, which identifies the 
                    object token of type(p). In implementation, M(p) contains a pointer to an object of type(p) or it is null.
                    <br> - <strong>init</strong>: function used to initialize marking M and to start the execution of the OETPN model;
                    <br> - <strong>end</strong>: function to stop the execution of the OETPN's child;
                </p>
            </div>
        </section>
        <section class="second">
            <div class="container reveal">
                <h2>  Admisibility and Executability for an OETPN model  </h2>
                <div class="text-container">
                    <div class="text-box">
                        <h3> Admisibility </h3>
                        <p>
                            <br> A transition from an OETPN model is admisible (enabled) at the current moment tau_c if there is at least one set
                            of values from its location's domains that satisfies an assigned guard condition.
                            <br><br> It is assumed that only a single admisibility condition of a transition can be done at a certain moment, and this
                            starts the execution of the transition by using the corresponding mapping. If, at a certain moment, a transition becomes
                            admisible (enabled) from more than one guard condition, this can cause an indetermination, and the first found condition
                            will start the model's execution.
                        </p>
                    </div>
                    <div class="text-box">
                        <h3> Executability </h3>
                        <p>
                            <br> A transition is executable (fireable) at a certain moment tau, if it was admisible (enabled) at the moment tau_c, and the
                            current time is equal to tau = tau_c + theta, where theta represents a value in the time domain that is associated with the
                            transition.
                        </p>
                    </div>
                </div>
            </div>
        </section>
        <section class="third">
            <div class="container reveal">
                <h2> Describing an OETPN model </h2>
                <div class="text-container">
                    <div class="text-box">
                        <br><br><img style="width:610px; height:355px" src="./../img/oetpn-describe.png">
                    </div>
                    <div class="text-box">
                        <h3> OETPN with represented tokens </h3>
                        <p>
                            <br> For a better understanding of what an OETPN model consists of, in the left side we can see an OETPN with represented tokens.
                            To better understand the figure, we can define the following:
                            <br> - <strong>o1, o2, o3, o4</strong>: instances associated to p1, p2, p3, p4 locations;
                            <br> - <strong>C1, C2, C3, C4</strong>: classes (types0 assigned to p1, p2, p3, p4 locations;
                            <br> - <strong>(grd1, map1), (grd2, map2), (grd3, map3)</strong>: rules of evolution associated to t1, t2, t3 transitions;
                            <br><br> The types that are assignated to the corresponding locations belong to the suitable set for the phases they are used in.
                            <br> More than that, for the rules of evolution defined by (grd,map) pairs, we can use getter and setter methods, defined in
                            their own classes. The class methods can also be used, but they must be declared static.
                        </p>
                    </div>
                </div>
            </div>
        </section>
        <section class="second">
            <div class="container reveal">
                <h2> Steps for creating OETPN models </h2>
                <p style="text-align: center">
                    <br><strong>Step 1</strong>: Specify the location and transition sets, along with the input and output channels;
                    <br><strong>Step 2</strong>: Describe the OETPN graphically (with Pre, Post matrixes);
                    <br><strong>Step 3</strong>: Specify the location's types;
                    <br><strong>Step 4</strong>: Define the rules of evolution for the transitions (grd and map pairs);
                    <br><strong>Step 5</strong>: Specify the transition's timings and time intervals;
                    <br><strong>Step 6</strong>: Specify the initial conditions (initial marking M<sup>0</sup>);
                    <br><br> Sometimes, it is required to go back to one of the steps to make completions and modifications.
                </p>
            </div>
        </section>
         <section class="third">
            <div class="container reveal">
                <h2> Marked Petri net </h2>
                <div class="text-container">
                    <div class="text-box">
                        <h3> State of an OETPN model</h3>
                        <p>
                            <br> As we already know from the <strong><a href="about-petrinets.php" style="text-decoration: none; color: #313131;">
                            About Petri Nets </a></strong> page, a classic Petri net with an initial marking M0 represents a marked Petri net.
                            The marking represents the state of the net. 
                            <br><br> In OETPN models, things are different, because the state of an OETPN model is described by the marking and the
                            state of the active tokens. In fact, the state of an OETPN model represents the state of the program and it is determined
                            by the following:
                            <br> - The created passive objects (or in process of creation) and stored in locations, along with the containing values;
                            <br> - The created active objects (of in process of creation) along with their state (active, stopped, interrupted, waiting, destroyed_;
                            <br> - The state of the input/output channels (operation performed, performing or waiting).
                        </p>
                    </div>
                    <div class="text-box">
                        <br><br><img style="width:610px; height:355px" src="./../img/oetpn-describe.png">
                    </div>
                </div>
            </div>
        </section>
        <section class="second">
            <div class="container reveal">
                <h2> Properties of OETPN models </h2>
                <div class="text-container">
                    <div class="text-box">
                        <h3> Reachability </h3>
                        <p>
                            In classic Petri nets, we have:
                            <br> - T* = {t0, t1, ..., t0*t1, ...}: set of all the sequences built with the net's transitions;
                            <br> - sigma = t0 * t1 * ...: sequences of admisible transitions;
                            <br> - M0[sigma>M: the marking in which the Petri net arrives, going from M0 after the execution of sigma sequence;
                            <br> - L(N,M0) = {sigma E T* | M0[sigma>}: language of the Petri net, representing all sequences of executed transitions.
                            <br><br> Reachability of classic Petri nets is defined by the following relation:
                            <br><img src="./../img/oetpn-reachability.png">
                            <br> Reachability defines the set of all the realizable markings that can be reached from a certain state. In OETPN, this
                            concept is a lot more complex, because the state of the net includes, besides marking, the variables' values defined and
                            stored in the locations' tokens.
                        </p>
                    </div>
                    <div class="text-box">
                        <h3> Liveness (Viability) </h3>
                        <p>
                            <br> A transition is quasi-live if there is a pair formed by (u, sigma) that satisfies the following condition: S0[(u, sigma*t)>
                            which will finally executes the transition t.
                            <br> A transition is live if, from any initial state S0, there is a pair formed by (u, sigma) that S0[u, sigma*t)> will finally 
                            execute the transition t.
                            <br><br> It is important to establish if a transition is always live or only executable once.
                        </p>
                    </div>
                    <div class="text-box">
                        <h3> Reversibility </h3>
                        <p>
                            <br> Reversibility refers at the possibility of the system to come back from the current state (current marking) in a previous state
                            (previous marking).
                            <br><br> Formally, the reversibility of an OETPN model is described my the following relations:
                            <br> - <strong>M belongs to R(OETPN, M0)</strong>
                            <br> - <strong>M0 belongs to R(OETPN, M)</strong>
                            <br> - <strong>S0 belongs to R(OETPN, S)</strong>
                            <br><br> That means that there is a pair formed by (u, sigma) which drives the system from the current state in a previous state.
                        </p>
                    </div>
                    <div class="text-box">
                        <h3> Observability </h3>
                        <p>
                            <br> A system is observable if its current state can be determined through inferences from the information obtained at the output of the system.
                            Thus, the observability of an OETPN model is sometimes more complex; for this reason, this concept will be simplified by referring to a task.
                            <br><br> A task belonging to an OETPN model is observable if its current state can be infered (determined) from the informations obtained at the output.
                            <br><br> A task belonging to an OETPN model is partially observable if only a part of the state variables can be determined from the values obtained at
                            the output.
                            <br> The OETPN's property of observability is useful in program's testing, because if the tasks are observable, the test are more concludent and easier 
                            to run.
                        </p>
                    </div>
                </div>
                <p style="text-align: center">
                    Please refer to the <strong><a href="documentation.php" style="text-decoration: none; color: #ffc180;"> Documentation </a></strong> page for more information
                    regarding OETPN models and their usage in different scenarios.
                </p>
            </div>
        </section>
        <div class="footer">
            Visual OETPN Simulator (VOS) @2021-2022.
        </div>
        <script src="./../js/reveal.js"></script>
    </body>
</html>