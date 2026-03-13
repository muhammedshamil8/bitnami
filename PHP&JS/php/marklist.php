<?php
// Database connection
$conn = pg_connect("host=localhost dbname=marklist user=postgres password=postgres");

if (!$conn) {
    die("Database connection failed!");
}

// Check if form is submitted
if (isset($_POST['roll_no'])) {
    $roll_no = $_POST['roll_no'];

    // Fetch student details
    $result = pg_query($conn, "SELECT * FROM student WHERE roll_no = $roll_no");

    if ($row = pg_fetch_assoc($result)) {
        echo "<h3>Student Mark List</h3>";
        echo "Roll No: " . $row['roll_no'] . "<br>";
        echo "Name: " . $row['name'] . "<br>";
        echo "Mark: " . $row['mark'] . "<br>";
        echo "Grade: " . $row['grade'] . "<br>";
    } else {
        echo "<p style='color: red;'>No student found with Roll No: $roll_no</p>";
    }
}
?>

<!DOCTYPE html>
<html>
<head>
    <title>Student Mark List</title>
</head>
<body>
    <h2>Enter Roll No to View Mark List</h2>
    <form method="POST">
        Roll No: <input type="number" name="roll_no" required>
        <input type="submit" value="Search">
    </form>
</body>
</html>
