<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        body{
            background-color: aqua;
        }
    </style>
</head>
<body>
    <center>
        <h1>Form Pengulangan</h1>
        <form action="" method="get">
            <table>
                <tr>
                    <td></td>
                    <td></td>
                    <td>1.Deret bilangan Ganjil</td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td>2.Segitiga Sama Kaki Terbalik</td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td>3.Deret bilangan kelipataan 3</td>
                </tr>
                <tr>
                    <td>pilih</td>
                    <td>:</td>
                    <td><input type="number" name="pilih" id=""></td>
                </tr>
                <tr>
                    <td>Masukin Angka</td>
                    <td>:</td>
                    <td><input type="number" name="angka" id=""></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td><input type="submit" value="kirim" name="proses"></td>
                </tr>
            </table>
        </form>

        <?php

            if (isset($_GET['proses'])) {
                $pilih=$_GET['pilih'];
                $angka=$_GET['angka'];

                if ($pilih == 1) {
                    echo "Deret Bilangan Ganjil<br>";
                    for ($i=0; $i < $angka; $i++) { 
                        if($i % 2==1){
                            echo "$i,";
                        }
                    }
                }
                elseif ($pilih == 2) {
                    echo "Segitiga Sama Kaki terbalik<br>";
                    for ($f = 1; $f <= $angka; $f++) {
                        for ($g = 1; $g <= $f; $g++) {
                        echo " ";
                        }
                        for ($h = $angka; $h >= $f; $h--) {
                        echo "* ";
                        }
                         echo "<br>";
                }

                }elseif ($pilih == 3) {
                    echo "Deret Bilangan kelipataan 3<br>";
                    for ($i = 1; $i <= $angka; $i++) {
                        if ($i % 3==0) {

                            echo "$i,";
                        }
                    }

                }
            }
        ?>
    </center>
</body>
</html>