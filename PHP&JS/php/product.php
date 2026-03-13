<?php
$conn = pg_connect("host=localhost dbname=productdetails user=postgres password=postgres") or die("Connection failed!");

// Fetch and display records
$result = pg_query($conn, "SELECT * FROM product");
?>
<!DOCTYPE html>
<html>
<head><title>Product List</title></head>
<body>
    <h2>Product Table</h2>
    <table border="1">
        <tr><th>Item Code</th><th>Item Name</th><th>Unit Price</th></tr>
        <?php while ($row = pg_fetch_assoc($result)) 
            echo "<tr><td>{$row['itemcode']}</td><td>{$row['itemname']}</td><td>{$row['unitprice']}</td></tr>"; ?>
    </table>
</body>
</html>
<?php pg_close($conn); ?>
