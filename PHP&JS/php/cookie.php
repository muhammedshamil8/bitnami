<?php
date_default_timezone_set("Asia/Kolkata"); // Set your correct time zone

$last_visit = isset($_COOKIE['last_visit']) ? $_COOKIE['last_visit'] : "First time visiting!";
setcookie("last_visit", date("d/m/Y H:i:s"), time() + 86400); // Cookie expires in 1 day
?>

<!DOCTYPE html>
<html>
<head>
    <title>Last Visit</title>
</head>
<body>
    <h2>Last Visited: <?= htmlspecialchars($last_visit) ?></h2>
</body>
</html>
