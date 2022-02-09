
<?php
error_reporting(0);

    if(isset($_POST['kirim'])){
        $nama=$_POST['nama'];
        $nik=$_POST['nik'];
        $alamat=$_POST['alamat'];
        $mobil=$_POST['mobil'];
        $durasi=$_POST['durasi'];
        $bayar=$_POST['bayar'];
        
        if ($mobil == "mobil1") {
            $total=$durasi*300000;
            $namamobil="Marcedes GLB";

        }elseif($mobil == "mobil2"){
            $total=$durasi*200000;
            $namamobil="Mazda";
        }elseif($mobil == "mobil3"){
            $total=$durasi*1000000;
            $namamobil="Buggati";
        }elseif($mobil == "mobil4"){
            $total=$durasi*200000;
            $namamobil="Avanza";
        }

        $kembalian = $bayar - $total;
          if($bayar < $total) {
              $kembalian1 = "Maaf Uang Anda Kurang Rp. $kembalian";
          }
        
    }
?>










<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/form.css">
    <title>Formulir</title>
</head>
<body>
    <center>
        <form action="" method="post">
            <div class="tabl" style="">
            <table>
                <tr>
                    <td colspan="3" align="center"><h3>Formulir</h3></td>
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
                            <option value="pilih" disable><--pilih jenis mobil--></option>
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
                    <td>Bayar</td>
                    <td>:</td>
                    <td><input type="number" name="bayar" id=""></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td><input type="submit" value="kirim" name="kirim"></td>
                </tr>
            </table>
            </div>

        <div class="output">
            <table>
                <tr>
                    <td colspan="3">==================================================</td>
                </tr>
                <tr>
                    <td>Nama Lengkap</td>
                    <td>:</td>
                    <td><?php echo $nama   ?></td>
                </tr>
                <tr>
                    <td>NIk</td>
                    <td>:</td>
                    <td><?php echo $nik;   ?></td>
                </tr>
                <tr>
                    <td>Alamat</td>
                    <td>:</td>
                    <td><?php echo $alamat;   ?></td>
                </tr>
                <tr>
                    <td>Jenis Mobil</td>
                    <td>:</td>
                    <td><?php echo $namamobil;   ?></td>
                </tr>
                <tr>
                    <td>Durasi per hari</td>
                    <td>:</td>
                    <td><?php echo $durasi;   ?></td>
                </tr>
                <tr>
                    <td>Total</td>
                    <td>:</td>
                    <td><?php echo "$total";   ?></td>
                </tr>
                <tr>
                    <td>Bayar</td>
                    <td>:</td>
                    <td><?php echo "$bayar";   ?></td>
                </tr>
                <tr>
                    <td>Kembalian</td>
                    <td>:</td>
                    <td><?php echo "$kembalian";   ?></td>
                </tr>
                <tr>
                    <td colspan="3">==================================================</td>
                </tr>
            </table>
            </div>    
        </form>
    </center>
</body>
</html>