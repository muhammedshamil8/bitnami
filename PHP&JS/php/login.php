<?php
// Database connection
$pdo = new PDO("pgsql:host=127.0.0.1;dbname=login_db", "postgres", "postgres", [
    PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION
]);

$msg = "";

// Handle login
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $stmt = $pdo->prepare("SELECT * FROM users WHERE username = ?");
    $stmt->execute([$_POST['username']]);
    $user = $stmt->fetch(PDO::FETCH_ASSOC);

    $msg = ($user && $_POST['password'] == $user['password']) 
        ? "Login successful! Welcome, " . htmlspecialchars($user['username']) . "." 
        : "Invalid username or password.";
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
</head>
<body>
    <h2>Login</h2>
    <form method="POST">
        <label>Username:</label><br>
        <input type="text" name="username" required><br><br>

        <label>Password:</label><br>
        <input type="password" name="password" required><br><br>

        <button type="submit">Login</button>
    </form>
    <p><?= $msg ?></p>
</body>
</html>
