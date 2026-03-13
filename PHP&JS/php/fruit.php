<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Fruit Selector</title>
</head>
<body>

    <h2>Select Your Favorite Fruits</h2>

    <form method="post">
        <select name="fruits[]" multiple size="5">
            <?php 
            $fruitList = ["Apple", "Banana", "Mango", "Orange", "Grapes"];
            foreach ($fruitList as $fruit) {
                echo "<option value='$fruit'>$fruit</option>";
            }
            ?>
        </select>
        <br><br>
        <input type="submit" name="submit" value="Submit">
    </form>

    <?php if (!empty($_POST['fruits'])): ?>
        <h2>You have selected:</h2>
        <ul>
            <?php foreach ($_POST['fruits'] as $fruit) echo "<li>" . htmlspecialchars($fruit) . "</li>"; ?>
        </ul>
    <?php elseif (isset($_POST['submit'])): ?>
        <h2>No fruit selected!</h2>
    <?php endif; ?>

</body>
</html>
