<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h2>Tutorial Belajar form HTML - PHP</h2>
    <form action="" method="get">
        Nama: <input type="text" name="nama">
        <br>
        Email: <input type="email" name="email" id="">
        <br>
        <input type="submit" name="proses"value="Proses Data">
    </form>
    <?php

        if (isset($_GET ['proses'])) {
            $nama =$_GET['nama'];
            $email =$_GET['email'];
            
            echo "Nama: $nama <br>";
            echo "Email: $email <br>";
        }

    ?>
</body>
</html>
<?php
        if (isset($_POST['proses'])) {
            $nama=$_POST['nama'];
            $lahir=$_POST['tempat_lahir'];
            $date=$_POST['tanggal'];
            $laki=$_POST['laki_laki'];
            $perem=$_POST['perempuan'];
            $alamat=$_POST['alamat'];
            $agama=$_POST['agama'];
            $pendidikaan=$_POST['pendidikaan'];
            $status=$_POST['status'];



            echo "Nama:$nama<br>";
            
            
        }
    ?>