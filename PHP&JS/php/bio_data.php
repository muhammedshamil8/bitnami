<!DOCTYPE html>
<html>
<head><title>Bio Data</title></head>
<body>

<h1 style="text-align:center;">Bio DATA</h1>

<?php if ($_SERVER["REQUEST_METHOD"] == "POST") { ?>
    <h2>Submitted Bio Data:</h2>
    <?php foreach ($_POST as $key => $value) 
        echo ucfirst($key) . ": " . htmlspecialchars($value) . "<br>"; ?>
<?php } else { ?>
    <form method="POST">
        Name: <input type="text" name="name"><br>
        Address: <textarea name="address"></textarea><br>
        Age: <input type="text" name="age"><br>
        Mobile: <input type="text" name="mobile"><br>
        Email: <input type="text" name="email"><br>
        Qualification: <input type="text" name="qualification"><br><br>
        <input type="submit" value="Display">
    </form>
<?php } ?>

</body>
</html>
