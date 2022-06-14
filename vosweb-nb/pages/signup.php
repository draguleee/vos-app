<?php

require_once "config.php";
 
$name = $username = $email = $password = $confirm_password = "";
$name_err = $username_err = $email_err = $password_err = $confirm_password_err = "";
 
if($_SERVER["REQUEST_METHOD"] == "POST"){
    
    // Validate name
    if(empty(trim($_POST["name"]))) {
        $name_err = 'Please enter full name.';
    }
    elseif(strlen(trim($_POST["name"])) < 6) {
        $name_err .= 'Full name must exceed 6 characters.';
    }
    else {
        $name = trim($_POST["name"]);
    }
 
    // Validate username
    if(empty(trim($_POST["username"]))) {
        $username_err .= 'Please enter a username.';
    } 
    elseif(!preg_match('/^[a-zA-Z0-9_]+$/', trim($_POST["username"]))){
        $username_err .= 'Username can only contain letters, numbers, and underscores.';
    } 
    else {
        $sql = "SELECT id FROM users WHERE username = ?";
        if($stmt = mysqli_prepare($link, $sql)){
            mysqli_stmt_bind_param($stmt, "s", $param_username);
            $param_username = trim($_POST["username"]);
            if(mysqli_stmt_execute($stmt)){
                mysqli_stmt_store_result($stmt);
                if(mysqli_stmt_num_rows($stmt) == 1){
                    $username_err = "This username is already taken.";
                } else{
                    $username = trim($_POST["username"]);
                }
            } 
            else{
                echo "Oops! Something went wrong. Please try again later.";
            }
            mysqli_stmt_close($stmt);
        }
    }
    
    // Validate e-mail
    if(empty(trim($_POST["email"]))) {
        $email_err .= 'Please enter e-mail.';
    }
    else {
        $SQL = "SELECT * FROM users WHERE email = ?";
        if($stmt = mysqli_prepare($link, $sql)){
            mysqli_stmt_bind_param($stmt, "s", $param_email);
            $param_email = trim($_POST["email"]);
            if(mysqli_stmt_execute($stmt)){
                mysqli_stmt_store_result($stmt);
                if(mysqli_stmt_num_rows($stmt) == 1){
                    $email_err .= 'This e-mail is already taken.';
                } else{
                    $email = trim($_POST["email"]);
                }
            } 
            else{
                echo "Oops! Something went wrong. Please try again later.";
            }
            mysqli_stmt_close($stmt);
        }
    }
    
    // Validate password
    if(empty(trim($_POST["password"]))){
        $password_err = "Please enter a password.";     
    } elseif(strlen(trim($_POST["password"])) < 6){
        $password_err = "Password must have atleast 6 characters.";
    } else{
        $password = trim($_POST["password"]);
    }
    
    // Validate confirm password
    if(empty(trim($_POST["confirm_password"]))){
        $confirm_password_err = "Please confirm password.";     
    } else{
        $confirm_password = trim($_POST["confirm_password"]);
        if(empty($password_err) && ($password != $confirm_password)){
            $confirm_password_err = "Password did not match.";
        }
    }
    
    // Check input errors before inserting in database
    if(empty($name_err) && empty($username_err) && empty($email_err) && empty($password_err) && empty($confirm_password_err)){
        $sql = "INSERT INTO users (name, username, email, password) VALUES (?, ?, ?, ?)";
        if($stmt = mysqli_prepare($link, $sql)){
            mysqli_stmt_bind_param($stmt, "ssss", $param_name, $param_username, $param_email, $param_password);
            $param_name = $name;
            $param_username = $username;
            $param_email = $email;
            $param_password = $password; 
            if(mysqli_stmt_execute($stmt)){
                header("location: login.php");
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
        <title> VOS - Sign Up </title>
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
            <li><a href="login.php"> Log In </a></li>
        </ul>
        <section class="first">
            <div align="center">
                <h1>Sign Up</h1>
                <h4> To start using Visual OETPN Simulator </h4>
                <div class="wrapper">
                    <form action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>" method="post">
                        <div class="form-group">
                            <label>Full Name</label>
                            <input type="text" name="name" placeholder="Full Name..." class="form-control <?php echo (!empty($name_err)) ? 'is-invalid' : ''; ?>" value="<?php echo $name; ?>">
                            <span class="invalid-feedback"><?php echo $name_err; ?></span>
                        </div>   
                        <div class="form-group">
                            <label>Username</label>
                            <input type="text" name="username" placeholder="Username..." class="form-control <?php echo (!empty($username_err)) ? 'is-invalid' : ''; ?>" value="<?php echo $username; ?>">
                            <span class="invalid-feedback"><?php echo $username_err; ?></span>
                        </div>    
                        <div class="form-group">
                            <label>E-mail</label>
                            <input type="email" name="email" placeholder="E-mail..." class="form-control <?php echo (!empty($email_err)) ? 'is-invalid' : ''; ?>" value="<?php echo $email; ?>">
                            <span class="invalid-feedback"><?php echo $email_err; ?></span>
                        </div>  
                        <div class="form-group">
                            <label>Password</label>
                            <input type="password" name="password" placeholder="Password..." class="form-control <?php echo (!empty($password_err)) ? 'is-invalid' : ''; ?>" value="<?php echo $password; ?>">
                            <span class="invalid-feedback"><?php echo $password_err; ?></span>
                        </div>
                        <div class="form-group">
                            <label>Confirm Password</label>
                            <input type="password" name="confirm_password" placeholder="Confirm Password..." class="form-control <?php echo (!empty($confirm_password_err)) ? 'is-invalid' : ''; ?>" value="<?php echo $confirm_password; ?>">
                            <span class="invalid-feedback"><?php echo $confirm_password_err; ?></span>
                        </div>
                        <div class="form-group">
                            <input style="margin-top: 20px;" type="submit" class="btn btnset btn-primary" value="Sign Up">
                            <input style="margin-top: 20px;" type="reset" class="btn btn-secondary ml-2" value="Reset">
                        </div>
                    </form>
                    <p>Already have an account? <a href="login.php">Log In</a>.</p>
                </div>  
            </div>  
        </section>
        <div class="footer">
            Visual OETPN Simulator (VOS) @2021-2022.
        </div>
    </body>
</html>