<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>perhitungan ganjil genap</h1>
    <form action="" method="get">
        <label for="">masukan angka</label>
        <input type="number" name="number" id="">
        <input type="submit" value="kirim" name="proses">
    </form>

    <?php

        if(isset($_GET['proses'])){
            $number=$_GET['number'];

            if($number % 2){
                echo "$number adalah bilangan ganjil";
            }else{
                echo "$number adalah bilangan genap";
            }
        }

    ?>
</body>
</html>