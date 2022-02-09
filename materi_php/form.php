<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <center>
        <form action="" method="post">
            <table>
                <tr>
                    <td colspan="3" align="center">Formulir</td>
                </tr>
                <tr>
                    <td>Nama lengkap</td>
                    <td>:</td>
                    <td><input type="text" name="nama" id=""></td>
                </tr>
                <tr>
                    <td>NIK</td>
                    <td>:</td>
                    <td><input type="number" name="nik" id=""></td>
                </tr>
                <tr>
                    <td>Alamat</td>
                    <td>:</td>
                    <td><input type="text" name="alamat" id=""></td>
                </tr>
                <tr>
                    <td>Jenis Mobil</td>
                    <td>:</td>
                    <td>
                        <select name="mobil" id="">
                            <option value="pilih"><--pilih jenis mobil--></option>
                            <option value="mobil1">Marcedes GLB</option>
                            <option value="mobil2">Mazda</option>
                            <option value="mobil3">Buggati</option>
                            <option value="mobil4">Avanza</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Durasi rental</td>
                    <td>:</td>
                    <td><input type="number" name="durasi" id=""></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td><input type="submit" value="kirim" name="kirim"></td>
                </tr>
            </table>

            <?php
            if(isset($_POST['kirim'])){
                $nama=$_POST['nama'];
                $nik=$_POST['nik'];
                $alamat=$_POST['alamat'];
                $mobil=$_POST['mobil'];
                $durasi=$_POST['durasi'];

                if ($mobil == "mobil1") {
                    $mobil=3450000;
                    $totalharga=$durasi*$mobil;
                    echo "=======================================<br>";
                    echo "Nama : $nama <br>";
                    echo "Nik : $nik <br>";
                    echo "Alamat: $alamat<br>";
                    echo "Jenis mobil : mobil 1<br>";
                    echo "harga 1/hari : $mobil <br>";
                    echo "Durasi : $durasi hari <br>";
                    echo "Total : $totalharga<br>";
                    echo 'Bayar : <input type="number" name="bayar" id="">';
                }
                elseif ($mobil == "mobil2") {
                    $mobil=2700000;
                    $totalharga=$durasi*$mobil;
                    echo "=======================================<br>";
                    echo "Nama : $nama <br>";
                    echo "Nik : $nik <br>";
                    echo "Alamat: $alamat<br>";
                    echo "Jenis mobil : mobil 1<br>";
                    echo "harga 1/hari : $mobil <br>";
                    echo "Durasi : $durasi hari <br>";
                    echo "Total : $totalharga<br>";
                    echo 'Bayar : <input type="number" name="bayar" id="">';
                }
                elseif ($mobil == "mobil3") {
                    $mobil=5550000;
                    $totalharga=$durasi*$mobil;
                    echo "=======1================================<br>";
                    echo "Nama : $nama <br>";
                    echo "Nik : $nik <br>";
                    echo "Alamat: $alamat<br>";
                    echo "Jenis mobil : mobil 1<br>";
                    echo "harga 1/hari : $mobil <br>";
                    echo "Durasi : $durasi hari <br>";
                    echo "Total : $totalharga<br>";
                    echo 'Bayar : <input type="number" name="bayar" id="">';
                }
                elseif ($mobil == "mobil4") {
                    $mobil=1250000;
                    $totalharga=$durasi*$mobil;
                    echo "=======================================<br>";
                    echo "Nama : $nama <br>";
                    echo "Nik : $nik <br>";
                    echo "Alamat: $alamat<br>";
                    echo "Jenis mobil : mobil 1<br>";
                    echo "harga 1/hari : $mobil <br>";
                    echo "Durasi : $durasi hari <br>";
                    echo "Total : $totalharga<br>";
                    echo 'Bayar : <input type="number" name="bayar" id="">';
                    echo '<input type="submit" value="kirim" name="proses">';
                }
            }
            if(isset($_POST['proses'])){
               $bayar=$_POST['bayar'];
                $kembalian=$bayar-$totalharga;
                echo "kembalian : $kembalian";
            }
            ?>
        </form>
    </center>
    
</body>
</html>