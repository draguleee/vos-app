<?php

session_start();
 
if(isset($_SESSION["loggedin"]) && $_SESSION["loggedin"] === true){
    header("location: homepage.php");
    exit;
}
 
require_once "config.php";
 
$username = $password = "";
$username_err = $password_err = $login_err = "";
 
if($_SERVER["REQUEST_METHOD"] == "POST"){
 
    // Check if username is empty
    if(empty(trim($_POST["username"]))){
        $username_err = "Please enter username.";
    } else{
        $username = trim($_POST["username"]);
    }
    
    // Check if password is empty
    if(empty(trim($_POST["password"]))){
        $password_err = "Please enter your password.";
    } else{
        $password = trim($_POST["password"]);
    }
    
    // Validate credentials
    if(empty($username_err) && empty($password_err)){
        $sql = "SELECT id, username, password FROM users WHERE username = ?";
        if($stmt = mysqli_prepare($link, $sql)) {
            mysqli_stmt_bind_param($stmt, "s", $param_username);
            $param_username = $username;
            if(mysqli_stmt_execute($stmt)){
                mysqli_stmt_store_result($stmt);
                if(mysqli_stmt_num_rows($stmt) == 1){         
                    mysqli_stmt_bind_result($stmt, $id, $username, $password);
                    if(mysqli_stmt_fetch($stmt)){
                            session_start();
                            $_SESSION["loggedin"] = true;
                            $_SESSION["id"] = $id;
                            $_SESSION["username"] = $username;      
                            header("location: homepage.php");
                    }
                } else{
                    // Username doesn't exist, display a generic error message
                    $login_err = "Invalid username or password.";
                }
            } else{
                echo "Oops! Something went wrong. Please try again later.";
            }
            mysqli_stmt_close($stmt);
        }
    }
    mysqli_close($link);
}
?>
 
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title> VOS - Log In</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
         <link href="./../css/style.css" rel="stylesheet">
            <link href="./../font-awesome/css/all.min.css" rel="stylesheet">
            <link rel="preconnect" href="https://fonts.googleapis.com">
            <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <style>
            body{ font: 15px sans-serif; }
            .wrapper{ width: 360px; padding: 20px; }
        </style>
    </head>
    <body>
        <ul>
            <li><img src="./../img/vos.jpg" alt="VOS" class="logo" style="width:100px"></li>
            <li><a href="./../index.php">Welcome</a></li>
            <li class="dropdown"><a href="#contact" class="dropbtn">Contact Me</a>
                <div class="dropdown-content">
                <a href="mailto:aandreid14@gmail.com">E-mail</a>
                <a href="https://github.com/draguleee">GitHub</a>
                <a href="https://www.linkedin.com/in/andreea-ioana-dragu-870a121a1/">LinkedIn</a>
                </div>
            </li>
            <li><a href="signup.php"> Sign Up </a></li>
        </ul>
        <section class="first">
            <div align="center">
                <h1>Log In</h1>
                <h4> To start using Visual OETPN Simulator </h4>
                <div class="wrapper">
                    <?php 
                    if(!empty($login_err)){
                        echo '<div class="alert alert-danger">' . $login_err . '</div>';
                    }        
                    ?>
                    <form action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>" method="post">
                        <div class="form-group">
                            <label>Username</label>
                            <input type="text" name="username" placeholder="Username..." class="form-control <?php echo (!empty($username_err)) ? 'is-invalid' : ''; ?>" value="<?php echo $username; ?>">
                            <span class="invalid-feedback"><?php echo $username_err; ?></span>
                        </div>    
                        <div class="form-group">
                            <label>Password</label>
                            <input type="password" name="password" placeholder="Password..." class="form-control <?php echo (!empty($password_err)) ? 'is-invalid' : ''; ?>">
                            <span class="invalid-feedback"><?php echo $password_err; ?></span>
                        </div>
                        <div class="form-group">
                            <input type="submit" class="btn btn-primary" value="Login">
                        </div>
                    </form>
                    <p>Don't have an account? <a href="signup.php">Sign Up</a>.</p>
                </div>
            </div>
        </section>
        <section class="first"></section>
        <div class="footer">
            Visual OETPN Simulator (VOS) @2021-2022.
        </div>
    </body>
</html>