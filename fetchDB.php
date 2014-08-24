<?php
$item_name = $_GET['item_name'];
$con = mysql_connect("localhost","root","123");
if (!$con)
{
	die('Could not connect: ' . mysql_error());
}
mysql_select_db("shop", $con);
$sql = "select item_price from items where item_name=\"$item_name\"";

if (!($sql_re = mysql_query($sql,$con)))
{
	die('Error: ' . mysql_error());
}
$data = mysql_fetch_array($sql_re);
echo $data["item_price"];
mysql_close($con);
?>
