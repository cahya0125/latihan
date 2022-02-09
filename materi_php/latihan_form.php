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
        <h1>biodata diri sendiri</h1>
        <form action="">
            <table>
                <tr>
                    <td>Nama</td>
                    <td>:</td>
                    <td><input type="text" name="nama" id=""></td>
                </tr>
                <tr>
                    <td>Tempat Lahir</td>
                    <td>:</td>
                    <td><input type="text" name="tempat_lahir" id=""></td>
                </tr>
                <tr>
                    <td>Tanggal Lahir</td>
                    <td>:</td>
                    <td><input type="date" name="tanggal" id=""></td>
                </tr>
                <tr>
                    <td>Jenis Kelamin</td>
                    <td>:</td>
                    <td>
                        <input type="radio" name="jenis_kelamin" id=""value="laki laki">laki laki
                        <input type="radio" name="jenis_kelamin" id="" value="perempuan">perempuan
                    </td>
                </tr>
                <tr>
                    <td>Alamat</td>
                    <td>:</td>
                    <td><textarea name="alamat" id="" cols="30" rows="10"></textarea></td>
                </tr>
                <tr>
                    <td>Agama</td>
                    <td>:</td>
                    <td>
                        <select name="agama" id="">
                            <option value="Islam">Islam</option>
                            <option value="Kristen">Kristen</option>
                            <option value="Hindu">Hindu</option>
                            <option value="Bhudha">Bhudha</option>
                            <option value="Khonghucu">Khonghucu</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Pendidikan</td>
                    <td>:</td>
                    <td>
                        <select name="pendidikaan" id="">
                            <option value="SD">SD</option>
                            <option value="SMP">SMP</option>
                            <option value="SMA">SMA</option>
                            <option value="SMK">SMK</option>
                            <option value="S1">S1</option>
                            <option value="S2">S2</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Status</td>
                    <td>:</td>
                    <td>
                        <select name="status" id="">
                            <option value="menikah">menikah</option>
                            <option value="belum menikah">belum menikah</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Hobi</td>
                    <td>:</td>
                    <td>
                        <input type="checkbox" name="hobi[]" value="membaca"id="">membaca
                        <input type="checkbox" name="hobi[]" value="menulis" id="">menulis
                        <input type="checkbox" name="hobi[]" value="ngepush" id="">ngepush
                    </td>
                </tr>
                <tr>
                    <td>Cita-cita</td>
                    <td>:</td>
                    <td>
                        <select name="cita" id="">
                            <option value="Programer">Programer</option>
                            <option value="polisi">polisi</option>
                            <option value="tentara">tentara</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Kata kata Bijak</td>
                    <td>:</td>
                    <td><textarea name="kata" id="" cols="30" rows="10"></textarea></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td><input type="submit" value="kirim" name="proses" ></td>
                </tr>
            </table>
        </form>
    </center>
    <?php

        if (isset($_GET ['proses'])) {
            $nama =$_GET['nama'];
            $tempat_lahir =$_GET['tempat_lahir'];
            $date=$_GET['tanggal'];
            $jenis_kelamin=$_GET['jenis_kelamin'];
            $alamat=$_GET['alamat'];
            $agama=$_GET['agama'];
            $pendidikaan=$_GET['pendidikaan'];
            $status=$_GET['status'];
            $hobi=$_GET['hobi'];
            $cita=$_GET['cita'];
            $kata=$_GET['kata'];

            echo "=================================================<br>";
            echo "====================biodata======================<br>";
            echo "Nama: $nama <br>";
            echo "Email: $tempat_lahir <br>";
            echo "tanggal lahir: $date <br>";
            if ($jenis_kelamin == "laki laki") {
                echo "Jenis kelamin: laki laki<br>";
            }else {
                echo "Jenis kelamin: perempuan<br>";
            }
            echo "Alamat: $alamat<br>";
            echo "Agama: $agama<br>";
            echo "Pendidikaan: $pendidikaan<br>";
            echo "Status: $status<br>";
            for ($i=0; $i < count($hobi); $i++) { 
                echo "Hobi: $hobi[$i] <br>";
            }
            echo "CIta-Cita: $cita <br>";
            echo "kata kata bijak:$kata<br>";


            
        }

    ?>
</body>
</html>