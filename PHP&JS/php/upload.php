<?php
if ($_SERVER["REQUEST_METHOD"] == "POST" && isset($_FILES["file"])) {
    $upload_dir = "uploads/";  // Upload directory
    if (!is_dir($upload_dir)) mkdir($upload_dir, 0777, true); // Create if not exists

    $file_path = $upload_dir . basename($_FILES["file"]["name"]);

    if (move_uploaded_file($_FILES["file"]["tmp_name"], $file_path)) 
        echo "<h3>File uploaded successfully: <a href='$file_path'>" . $_FILES["file"]["name"] . "</a></h3>";
    else 
        echo "<h3>File upload failed!</h3>";
}
?>

<!DOCTYPE html>
<html>
<head><title>File Upload</title></head>
<body>
    <form method="POST" enctype="multipart/form-data">
        <label>Select File:</label>
        <input type="file" name="file" required>
        <input type="submit" value="Upload">
    </form>
</body>
</html>
