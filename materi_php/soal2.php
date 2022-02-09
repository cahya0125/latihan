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
        <h3>penggajian karyawan</h3>
        <h1>PT.Selalu Makmur Jaya</h1>
        <form action="" method="get">
            <table>
                <tr>
                    <td>Nama Bendahara</td>
                    <td>:</td>
                    <td><input type="text" name="bendahara" id=""></td>
                </tr>
                <tr>
                    <td>Nama Pekerja</td>
                    <td>:</td>
                    <td><input type="text" name="pekerja" id=""></td>
                </tr>
                <tr>
                    <td>jenis Kelamin</td>
                    <td>:</td>
                    <td>
                        <input type="radio" name="jk" value="laki laki" id="">laki-laki
                        <input type="radio" name="jk" value="perempuan" id="">perempuan
                    </td>
                </tr>
                <tr>
                    <td>Tanggal Gajian</td>
                    <td>:</td>
                    <td><input type="date" name="tanggal" id=""></td>
                </tr>
                <tr>
                    <td>Jabatan</td>
                    <td>:</td>
                    <td>
                        <select name="jabatan" id="">
                            <option value="">jabatan</option>
                            <option value="Direktur">Direktur</option>
                            <option value="Manager">Manager</option>
                            <option value="Karyawan">Karyawan</option>
                            <option value="OB">OB</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Pendidikan Terakhir</td>
                    <td>:</td>
                    <td>
                        <select name="pendidikaan" id="">
                            <option value="SD">SD</option>
                            <option value="SMP">SMP</option>
                            <option value="SMA">SMA</option>
                            <option value="S1">S1</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Lembur</td>
                    <td>:</td>
                    <td><input type="number" name="lembur" id=""> Hari/RP.20.000</td>
                </tr>
                <tr>
                    <td>Potongan</td>
                    <td>:</td>
                    <td><input type="number" name="potongan" id=""></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td><input type="submit" value="Kirim" name="proses"></td>
                </tr>
            </table>
        </form>

        <?php

            if(isset($_GET['proses'])){
                $bendahara=$_GET['bendahara'];
                $karyawan=$_GET['pekerja'];
                $jk=$_GET['jk'];
                $pendidikaan=$_GET['pendidikaan'];
                $jabatan=$_GET['jabatan'];
                $lembur=$_GET['lembur'];
                $potongan=$_GET['potongan'];
                $tanggal=$_GET['tanggal'];

               
                
                
                if ($jabatan == "Direktur") {
                   $gaji=10000000;
                }elseif ($jabatan == "Manager") {
                    $gaji=7500000;
                }
                elseif ($jabatan == "Karyawan") {
                    $gaji=5000000;
                }
                elseif ($jabatan == "OB") {
                    $gaji=15000000;
                }
                else{
                    echo "gaji jabataan yg di input tidak ada<br>";
                }

               
                if ($pendidikaan == "SD") {
                    $tunjangan=200000;
                }elseif ($pendidikaan == "SMP"){
                    $tunjangan=500000;
                }
                elseif ($pendidikaan == "SMA") {
                    $tunjangan=1000000;
                }
                elseif ($pendidikaan == "S1") {
                    $tunjangan=1500000;
                }
                else{
                    echo "error";
                }
                $hsl_lembur=$lembur*20000;
                $total=($gaji + $tunjangan+$hsl_lembur)-$potongan;
                
                echo "<center>";
                echo "<br>";
                echo "<h2>Struk Gaji Karyawan</h2>";
                echo "===============================================================================<br>";
                echo "<table>";
                echo "<tr>";
                echo "<td></td><td></td><td><p align=right>Tanggal : $tanggal</p></td> ";
                echo "</tr>";
                echo "<tr>";
                echo "<td><h3>Gaji Pokok</h3></td>";
                echo "</tr>";
                echo "<tr>";
                echo "<td>Nama Karyawan </td><td>:</td><td>$karyawan</td>";
                echo "</tr>";
                echo "<tr>";
                echo "<td>Jenis Kelamin </td><td>:</td><td>$jk</td>";
                echo "</tr>";
                echo "<tr>";
                echo "<td>Pendidikan Terakhir </td><td>:</td><td>$pendidikaan</td>";
                echo "</tr>";
                echo "<tr>";
                echo "<td>Jabatan </td><td>:</td><td>$jabatan</td>";
                echo "</tr>";
                echo "<tr>";
                echo "<td>Gaji </td><td>:</td><td>Rp. $gaji</td>";
                echo "</tr>";
                echo "<tr>";
                echo "<td><h3>Tunjangan</h3></td>";
                echo "</tr>";
                echo "<tr>";
                echo "<td>Tunjangan Pendidikan </td><td>:</td><td>Rp. $tunjangan</td>";
                echo "</tr>";
                echo "<tr>";
                echo "<td>Vakasi Lembur </td><td>:</td><td>Rp. $hsl_lembur</td>";
                echo "</tr>";
                echo "<tr>";
                echo "<td><h3>Potongan</h3></td>";
                echo "</tr>";
                echo "<tr>";
                echo "<td>Potongan </td><td>:</td><td>Rp. $potongan</td>";
                echo "</tr>";
                echo "<tr>";
                echo "<td><h3>Total Gaji</h3></td><td>:</td><td>Rp. $total</td>";
                echo "</tr>";
                echo "<tr>";
                echo "<td></td><td></td><td><p align=right>Bendahara : $bendahara</p></td> ";
                echo "</tr>";
                echo "</table>";
                echo "===============================================================================<br>";
                echo "</center>";

                

            }


            
        ?>
    </center>
</body>
</html>