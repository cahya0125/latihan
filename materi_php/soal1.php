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
        <h1>Syarat masuk ke MIKO MALL</h1>
        <form action="" method="get">
            <table>
                <tr>
                    <td>Nama Anda</td>
                    <td>:</td>
                    <td><input type="text" name="nama" id=""></td>
                </tr>
                <tr>
                    <td>Status Vaksin</td>
                    <td>:</td>
                    <td><select name="status" id="">
                        <option value="">---Status Vaksin---</option>
                        <option value="Sudah vaksin">Sudah vaksin</option>
                        <option value="belum vaksin">Belum vaksin</option>
                    </select></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td><input type="submit" value="KIRIM" name="proses"></td>
                </tr>
            </table>
        </form>

        <?php

            if(isset($_GET['proses'])){
                $nama=$_GET['nama'];
                $status=$_GET['status'];
                $url="https://www.pedulilindungi.id";

                echo "===============================<br>";
                echo "Nama Anda : $nama <br>";
                echo "Status Vaksin : $status<br>";

                if($status == "Sudah vaksin"){
                    echo "<h2>Di izinkan</h2>";
                }
                else{
                    echo "<h2>tidak di izin kaan</h2> <br>";
                    echo "<a href=$url>Silahkan Daftar Disinih</a>";
                }
            }
        ?>

    </center>
</body>
</html>
