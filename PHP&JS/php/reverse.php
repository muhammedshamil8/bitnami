<!DOCTYPE html>
<html>
<body>
    <form method="POST">
        <input type="text" name="input_str" placeholder="Enter a string" required>
        <input type="submit" value="Reverse">
    </form>

    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $str = $_POST["input_str"];
        $rev = "";
        for ($i = strlen($str) - 1; $i >= 0; $i--) {
            $rev .= $str[$i];
        }
        echo "<p>Reversed String: $rev</p>";
    }
    ?>
</body>
</html>
