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
                    <a href="about-petrinets.php" class="focus">About Petri Nets</a>
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
                <h1 id="h1"> About Petri Nets... </h1>
                <h4 id="h4"> ... and why are they so special </h4>
                <i class="fa-solid fa-network-wired"></i>
            </div>
        </section>
        <section class="second">
            <div class="container reveal">
                <h2>  First things first...  </h2>
                <div class="text-container">
                    <div class="text-box">
                        <h3> ...What is a Petri net? </h3>
                        <p>
                            <br> As mentioned in the About Systems section, there are different approaches for modelling
                            discrete events systems, but we will be focusing on the Petri nets approach.
                            <br><br> A Petri net is the Discrete Event System approach that is able to model dynamic
                            systems. The model describes the conditions and the events that lead to their evolution. Those
                            conditions are describes using a set of state variables, representing the conditions.
                            <br><br> A Petri net contains two parts: a net structure representing the static part of the system and
                            a marking that corresponds to the global state of the system:
                            <br> - <strong>The net structure</strong> is described by the <strong>N = (P,T,pre,post)</strong> tuple, 
                            where <b>P</b> represents the number of locations, <b>T</b> represents the number of transitions, <b>pre</b> 
                            represents the "before" incidence function and <b>post</b> represents the "after" incidence function.
                            <br> - <strong>The marking</strong> is described by the <strong>RP = (N, M0)</strong> tuple, where <b>N</b>
                            represents the Net, and <b>M0</b> represents the initial marking.
                            <br> - <strong>The incidence matrix</strong> which is defined by the subtraction of post function and pre function.
                            <br><br> As seen in the figure on the right, we have a simple Petri net. As a first look, we can describe the following:
                            <br> - <strong> The number of places </strong>: P = 5 (places are represented by circles);
                            <br> - <strong> The number of transitions </strong>: T = 4 (transitions are represented by rectangles);
                            <br> - <strong> The initial marking </strong>: M0 = [1 ; 0 ; 0 ; 0 ; 0] (if there is a token in one of the locations, the value 
                            is 1, otherwise it is 0);
                            <br><br> For a more detailed explanation of Petri nets, please refer to the <strong><a href="documentation.php" 
                            style="text-decoration: none; color: #ffc180;">Documentation</a></strong> page.
                        </p>
                    </div>
                <div class="text-box">
                    <br><br><br><img src="./../img/simple-pn.png" style="width: 400px; height: 570px;"></i>
                </div>
            </div>
        </section>
        <section class="third">
            <div class="container reveal">
                <h2> Admisibility & Executability  </h2>
                <div class="text-container">
                    <div class="text-box">
                        <h3> What is admisibility? </h3>
                        <p>
                            <br> <strong>Admisibility</strong> refers to transitions; a transition is admisible for a certain marking of the Petri net
                            <strong>(M = [M(p1),...,M(pm)]<sup>t</sup></strong> only if any location <b>p</b> from <b>P</b> checks the following relations:
                            <br> - <strong> M(p) >= pre(p,t) </strong>: the non-strict admisibility rule.
                            <br> - <strong> K(p) >= M(p) - pre(p,t) + post(t,p) </strong>: the strict admisibility rule (may not apply if a place's capacity is infinite).
                            <br><br> The above relations represent the admisibility conditions for a transition.
                            <br><br> For more informations and concrete examples of the admisibility of a transition can be found in the <strong><a href="documentation.php" 
                            style="text-decoration: none; color: #313131;">Documentation</a></strong> page.
                    </div>
                    <div class="text-box">
                        <h3> Dynamic behaviour </h3>
                        <p>
                            <br> The dynamic behaviour of a Petri net is described by the marking's evolution, given by the following
                            relations:
                            <br> - <strong> M(p)<sup>'</sup> = M(p) - pre(p,t) + post(t,p) </strong>
                            <br> - <strong> M[t>M<sup>'</sup> <=> M<sup>'t</sup> = M<sup>t</sup> + C * e<sub>t</sub> >= 0 </strong>
                            <br> In the above relations, we can define <b>M(p)<sup>'</sup></b> as the marking before firing the executable transition,
                            <b>M<sup>'</sup></b> as the marking after firing the transition and <b>M[t>M</b> as the marking obtained by firing the transition t
                            from M.
                            <br><br> The state / marking of a Petri net is being modified after the following rules:
                            <br> - A transition is executable if every location p of a transition t has at least pre(p,t) tokens.
                            <br> - It is not necessary that an admisible transition to be executed right away, because transitions are being fired in the moment when real
                            events or corresponding events occur.
                            <br> - The firing of a transition shifts pre(pmt) tokens from every entry location p of t and adds post(t,p) tokens
                            in every exit location p of t.
                        </p>
                    </div>
                </div>
            </div>       
        </section>
        <section class="second">
            <div class="container reveal">
                <h2>  Petri Nets properties  </h2>
                <div class="text-container">
                    <div class="text-box">
                        <h3> Limitation </h3>
                        <p>
                            <br> A Petri net <strong>PN = (N,M0)</strong> is <strong>limited (or k-limited)</strong> if the number of tokens from every location does not exceed a certain number k,
                            regardless of the marking that has been executed (for every p from P and every M from R(M0) results M(p) <= k.
                            <br> A Petri net is <strong>safe</strong> if it is l-limited. If a Petri net is limited from any finite initial marking, then the Petri net is structurally limited.
                        </p>
                    </div>
                    <div class="text-box">
                        <h3> Viability </h3>
                        <p>
                            <br> A Petri net <strong>PN = (N,M0)</strong> is <strong>viable</strong> (or, M0 is a viable marking for the N net) if, regardless of 
                            the executable marking from M0, any transition from the net can be fired. A Petri net is structurally viable if there is a viable initial marking for the net.
                            <br><br> Do not forget that this property is strongly related to the absence of deadlocks from the systems that use resources in common. Thus, if a Petri net is viable, 
                            it automatically means that it does not have deadlocks. A viable transitions stays permanently fireable and the activity presented by it will always be possible.
                            <br><br> A transition can be: L0 (dead), L1 (viable, potentially fireable), L2 (viable), L3 (viable) and L4 (non-viable).
                        </p>
                    </div>
                    <div class="text-box">
                        <h3> Reversibility </h3>
                        <p>
                            <br> A Petri net <strong>PN = (N,M0)</strong> is <strong>reversible</strong> if, regardless of the marking M from the R(M0) set, the marking M0 can be realizable from M.
                            Thus, the net is reversible if there is always a possibility to get back to its initial state.
                            <br><br> Sometimes, instead of requesting the initial state of the Petri net, it is required to see if the Petri net can reach a specific state. So, M' is a base state if, 
                            regardless of the marking M from the R(M0) set, M' is realizable from M.
                        </p>
                    </div>
                </div>
                <p style="text-align:center;"> <strong> Viability, limitation and reversibility are NOT dependent for one another. </strong></p>
            </div>
        </section>
        <section class="third">
            <div class="container reveal">
                <h2> Qualitative analysis of Petri net described models </h2>
                <div class="text-container">
                    <div class="text-box">
                        <br><br><i class="fa-solid fa-chart-line"></i>
                    </div>
                    <div class="text-box">
                        <h3> Methods of analysis for Petri nets </h3>
                        <p>
                            <br> There are four main methods to qualitatively  analize a Petri net:
                            <br> - <strong>Enumeration analysis</strong> (static method, based on realization graph and coverage tree; will be discussed further)
                            <br> - <strong>Transformation analysis</strong> (static method)
                            <br> - <strong>Structural analysis</strong> (static method)
                            <br> - <strong>Simulation analysis</strong> (static method)
                            <br><br> The enumeration analysis will be discussed and elaborated further. It is based on the following:
                            <br> - <strong>Realization graph</strong>: individually represent the Petri net's markings and the transitions' firings
                            <br> - <strong>Coverage tree</strong>: in case the Petri net is not limited, the realization graph will be infinite (impossible to build);
                            in this case, we build the coverage tree.
                            <br><br> We will further elaborate those two enumeration analysis methods by defining their steps and the process of obtaining them.
                        </p>
                    </div>
                </div>
            </div>
        </section>
        <section class="second">
            <div class="container reveal">
                <h2> Realization graph method </h2>
                <div class="text-container">
                    <div class="text-box">
                        <h3> General notions </h3>
                        <p>
                            <br> We say that a marking from a Petri net PN = (N,M0) is realizable if there is a sequence tau, M0[tau>M so that M belongs to R(N,M0). 
                            Systems with infinite states/markings do not have finite representation. But, for finite systems, we have the realization graph method 
                            we can approach those systems with. The realization graph method is based on the exhaustive sequential simulation.
                            <br><br> Namely, the <strong>realization graph</strong> that is associated with a (N,M0) net is a GR(N,M0) graph in which every node represents
                            a realizable marking from the initial marking M0 and every arc represents a transition's firing.
                            <br> There is a labeled arc, t<sub>k</sub>, which starts from the Mi-representing node and goes up to Mj markingm if Mj marking can be executed
                            from the Mi marking by firing the t<sub>k</sub> transition: <strong>M<sub>i</sub>[t<sub>k</sub>>M<sub>j</sub></strong>.
                            <br><br> As seen in the image on the right, we have a Petri net with the initial marking M0 = [1;0;0;0]. We observe that the possible transitions that
                            can be fired are t1 and t2, thus the markings will evolve into M1 = [0;1;0;0] and M2 = [0;0;1;0]. From the M1 marking, transition t4 can be executed,
                            resulting M3 = [0;0;0;1] and from M3, transition t4 is executable, which goes back to marking M1. From marking M2, the only possible transition ia t5, 
                            which will result in marking M4 = [0;0;0;0].
                        </p>
                    </div>
                    <div class="text-box">
                        <br><br><br><br><img src="./../img/realization-graph.png">
                    </div>
                </div>
            </div>
        </section>
        <section class="third">
            <div class="container reveal">
                <h2> Coverage tree method </h2>
                <div class="text-container">
                    <div class="text-box">
                        <br><br><img src="./../img/coverage-tree.png">
                    </div>
                    <div class="text-box">
                        <h3> General notions and algorithm </h3>
                        <p>
                            <br> <strong>Definition of Coverage</strong>: a marking M from PN = (N,M0) is coverable if there is a marking M' from R(M0) so that M'(p) >= M(p) for any p from P.
                            <br><br> Given any Petri net, we can build a coverage graph beginning from the initial marking M0 and building an arc for each 
                            fireable transition. At the ends of the arc, we note the marking of the Petri net, and the arc is marked with the transition that determines such transformation. 
                            A proper example of a coverage graph can be seen in the figure on the left. This coverage graph was obtained by taking account of the following rules:
                            <br> <strong>S1</strong> Label the initial marking M0 as root and new;
                            <br> <strong>S2</strong> As long as the existing markings are new, execute the following:
                            <br> &nbsp - Select a marking M labeled as new;
                            <br> &nbsp - If M is equivalent with a marking from the root's path to M, then M is labeled as old and we proceed to another marking;
                            <br> &nbsp - If there are no admisible transitions in M, the M is labeled with end.
                            <br> <strong>S3</strong> For each admisible transition t from M, execute:
                            <br> &nbsp - Let M' be the marking that results after firing t from M;
                            <br> &nbsp - If there is a marking M'' from the root's path to M, so that M'(p) >= M''(p), for each location p and M' != M'' (M'' is covered), then we will replace M'(p)
                            with w, for each location p that checks M'(p) > M"(p).
                            <br> &nbsp - Introduce M' as a new node and draw a new arc with label t from M to M'.
                            <br><br> We can build the coverage graph with the help of coverage tree, which is a directed graph.
                        </p>
                    </div>
                </div>
            </div>
        </section>
        <section class="second">
            <div class="container reveal">
                <h2> Algebrical methods of analyzing Petri nets: Use of invariants </h2>
                    <p style="text-align: center">
                        <br> Invariants are used for studying the behaviour of the systems and checking the logical properties that they possess.
                        In this scope, two types of invariants have been defined: type-P invariant and type-T invariant, which will be discussed 
                        further on.
                    </p>
                <div class="text-container">
                    <div class="text-box">
                        <h3> Type-P invariant </h3>
                        <p>
                            <br> <strong>Type-P invariant</strong> is represented by an array that has the following property: multiplying it with
                            the array of any aavailable marking gives the save result: <strong>Y<sup>T</sup>*M = Y<sup>T</sup>*M0</strong>, where:
                            <br> - <b>M</b>: the obtained marking from marking M0;
                            <br> - <b>Y</b>: the invariant.
                            <br><br> An invariant can be determined with the following relations:
                            <br><img src="./../img/invariant.png">
                            <br>There are n unknown values and m equations. If n is greater than m, some of the elements belonging to Y will have
                            arbitrary values. Thus, for a Petri net, we can have more than one invariant.
                            <br><br> If M and M' are accesible markings, then we have the following relations:
                            <br><img src="./../img/relations.png">
                        </p>
                    </div>
                    <div class="text-box">
                        <h3> Type-T invariant</h3>
                        <p>
                            <br> <strong>Type-T invariant</strong> is an array that checks <strong>C*X = 0, X>=0 => M0</strong> such that
                            <strong>M0[tau>Mo</strong> and <strong>tau = X</strong>.
                            <br> If there is any way to find such invariant, then there is a marking M0 and a sequence of equations that brings
                            this marking back to the initial state. The sequence of executions represents the counting vector of the executions and 
                            it is equal to X.
                            <br><br> - The set of locations for a Petri net N that corresponds to the not null elements of a type-P invariant is called
                            support of the invariant Y.
                            <br> - The set of transitions for a Petri net N that corresponds to the not null elements of a type-T invariant is called 
                            support of the invariant X.
                            <br> - A support of invariant is called minimal if no strict subset of the set represents another support for another invariant.
                            <br> - A type-P invariant (noted Y) is minimal if there is no other type-P invariant (noted Y') for Y >= Y'.
                            <br> - A type-T invariant (noted X) is minimal if therre is no other type-T invariant (noted X') for X >= X'.
                        </p>
                    </div>
                </div>
                <p style="text-align: center">
                    <br> For examples and more explanations on the invariants, please refer to the <strong><a href="documentation.php" 
                    style="text-decoration: none; color: #ffc180;">Documentation</a></strong> page.
                </p>
            </div>
        </section>
        <section class="third">
            <div class="container reveal">
                <h2> Siphons and traps </h2>
                <p style="text-align: center">
                    <br> Siphons are structural deadlocks and traps are subsets of locations which can be possibly recognized and which generate specific
                    subnets.
                    <br> As definitions, we have the following:
                    <br> - <strong>Siphon</strong>: Represents a subset of locations for which its input transitions' set is contained in its output transitions' set.
                    <br> - <strong>Trap</strong>: Represents a subset of locations for which the output transitions' set is contained in its input transitions' set.
                    <br><br> As noticed, the concepts of siphon and trap are opposite.
                    <br><br> For examples and more explanations on the siphons and traps, as well as solved and explained examples, please refer to the 
                    <strong><a href="documentation.php" style="text-decoration: none; color: #313131;">Documentation</a></strong> page.
                </p>
            </div>
        </section>
        <div class="footer">
            Visual OETPN Simulator (VOS) @2021-2022.
        </div>
        <script src="./../js/reveal.js"></script>
    </body>
</html>