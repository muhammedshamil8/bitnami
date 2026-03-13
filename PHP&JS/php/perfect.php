<?php
function checkNumber($num) {
    $sum = 0;
    for ($i = 1; $i < $num; $i++) 
        if ($num % $i == 0) $sum += $i;

    return ($sum == $num) ? "Perfect Number" : (($sum > $num) ? "Abundant Number" : "Deficient Number");
}

if (isset($_POST['number'])) 
    echo "<h3>Result: " . checkNumber($_POST['number']) . "</h3>";
?>

<!DOCTYPE html>
<html>
<head><title>Number Checker</title></head>
<body>
    <form method="POST">
        Enter a Number: <input type="number" name="number" required>
        <input type="submit" value="Check">
    </form>
</body>
</html>
