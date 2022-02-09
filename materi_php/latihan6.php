<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="style.css">
</head>
<body >
    <form action="" method="post">
        <table align=center>
            <th>no</th>
            <th></th>
            <th>Destinasi</th>
            <tr>
                <td>1</td>
                <td>.</td>
                <td>Bukit bintang</td>
            </tr>
            <tr>
                <td>2</td>
                <td>.</td>
                <td>pantai sadrana</td>
            </tr>
            <tr>
                <td>3</td>
                <td>.</td>
                <td>candi borobudur</td>
            </tr>
            <tr>
                <td>4</td>
                <td>.</td>
                <td>candi prambanan</td>
            </tr>
            <tr>
                <td>5</td>
                <td>.</td>
                <td>keraton yogyakarta</td>
            </tr>
            <tr>
                <td>6</td>
                <td>.</td>
                <td>marioboro</td>
            </tr>
            <tr>
                <td>7</td>
                <td>.</td>
                <td>pendopo lawas => cafe</td>
            </tr>
            <tr>
                <td>8</td>
                <td>.</td>
                <td>goa pindul</td>
            </tr>
            <tr>
                <td></td>
                <td></td>
                <td><select name="destinasi" id="">
                    <option value="0">--pilih destinasi--</option>
                    <option value="bukit bintang">bukit bintang</option>
                    <option value="pantai sadrana">pantai sadrana</option>
                    <option value="candi borobudur">candi borobudur</option>
                    <option value="candi prambanan">candi prambanan</option>
                    <option value="keraton yogyakarta">keraton yogyakarta</option>
                    <option value="marioboro">marioboro</option>
                    <option value="pendopo lawas">pendopo lawas</option>
                    <option value="goa pindul">goa pindul</option>
                </select></td>
                <td><input type="submit" value="kirim" name="proses"></td>
            </tr>
        </table>
        <?php
            if(isset($_POST['proses'])){
                $destinasi=$_POST['destinasi'];
                if($destinasi == "bukit bintang"){
                    echo "Bukit bintang <br>";
                    echo "Harga Pertiket:Rp10.000";
                    echo '<table>';
                    echo '<tr><td>jumlah ticket:</td><td><input type="number" name="jumlah"></td></tr><br>';
                    echo '<tr><td>total:</td><td><input type="number" name="bayar"></td></tr><br>';
                    echo '<tr><td><input type="submit" name="kirim" value="proses"></td></tr><br>';
                    echo '</table>';             
                }elseif($destinasi == "pantai sadrana"){
                    echo "<h2>pantai sadrana</h2>";
                    echo "Harga Pertiket:Rp15.000";
                    echo '<table>';
                    echo '<tr><td>jumlah ticket:</td><td><input type="number" name="jumlah"></td></tr><br>';
                    echo '<tr><td>bayar:</td><td><input type="number" name="bayar"></td></tr><br>';
                    echo '<tr><td><input type="submit" name="submit" value="proses"></td></tr><br>';
                    echo '</table>';
                    
                }elseif($destinasi == "candi borobudur"){
                    echo "<h2>candi borobudur</h2>";
                    echo "Harga Pertiket:Rp50.000";
                    echo '<table>';
                    echo '<tr><td>jumlah ticket:</td><td><input type="number" name="jumlah"></td></tr><br>';
                    echo '<tr><td>bayar:</td><td><input type="number" name="bayar"></td></tr><br>';
                    echo '<tr><td><input type="submit" name="ok" value="proses"></td></tr><br>';
                    echo '</table>';
                    
                }
                elseif($destinasi == "candi prambanan"){
                    echo "<h2>candi prambanan</h2>";
                    echo "Harga Pertiket:Rp50.000";
                    echo '<table>';
                    echo '<tr><td>jumlah ticket:</td><td><input type="number" name="jumlah"></td></tr><br>';
                    echo '<tr><td>bayar:</td><td><input type="number" name="bayar"></td></tr><br>';
                    echo '<tr><td><input type="submit" name="ok" value="proses"></td></tr><br>';
                    echo '</table>';
                } 
                elseif($destinasi == "keraton yogyakarta"){
                    echo "<h2>keraton yogyakarta</h2>";
                    echo "Harga Pertiket:Rp5.000";
                    echo '<table>';
                    echo '<tr><td>jumlah ticket:</td><td><input type="number" name="jumlah"></td></tr><br>';
                    echo '<tr><td>bayar:</td><td><input type="number" name="bayar"></td></tr><br>';
                    echo '<tr><td><input type="submit" name="ya" value="proses"></td></tr><br>';
                    echo '</table>';
                   
                }   
                elseif($destinasi == "marioboro"){
                    echo "<h2>marioboro</h2>";
                    echo "Harga Pertiket:Rp5.000";
                    echo '<table>';
                    echo '<tr><td>jumlah ticket:</td><td><input type="number" name="jumlah"></td></tr><br>';
                    echo '<tr><td>bayar:</td><td><input type="number" name="bayar"></td></tr><br>';
                    echo '<tr><td><input type="submit" name="ya" value="proses"></td></tr><br>';
                    echo '</table>';
                }   
                elseif($destinasi == "pendopo lawas"){
                    echo '<table align="center">
                    <tr>
                        <td></td>
                        <td><h1>cafe menu pendopo lawas</h1></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><h2>menu</h2></td>
                        <td></td>
                    </tr>
                    <tr>
                        <th>Makana</th>
                        <th></th>
                        <th>Minuman</th>
                    </tr>
                    <tr>
                        <td>Mie goreng</td>
                        <td></td>
                        <td>es teh manis</td>
                    </tr>
                    <tr>
                        <td>Nasi goreng</td>
                        <td></td>
                        <td>teh manis hangat</td>
                    </tr>
                    <tr>
                        <td>kwetiaw</td>
                        <td></td>
                        <td>susu coklat</td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>SILAHKAN PILIH MENU DI BAWAH INI</td>
                        <td></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>====================================</td>
                        <td></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><select name="Makan">
                            <option value="makanan">PILIH MAKANAN</option>
                            <option value="mie goreng">Mie goreng</option>
                            <option value="nasi goreng">Nasi goreng</option>
                            <option value="kwetiaw">Kwetiaw</option>
                        </select>
                        <input type="number" name="qty_makan" id="" placeholder="Jumlah makanan"></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><select name="Minum">
                            <option value="minuman">PILIH MINUMAN</option>
                            <option value="es teh manis">es teh manis</option>
                            <option value="teh manis hangat">teh manis hangat</option>
                            <option value="susu coklat">susu coklat</option>
                        </select>
                        <input type="number" name="qty_minum" id="" placeholder="Jumlah minuman"></td>
                        <td><input type="submit" value="pesan" name="pesan"></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>====================================</td>
                        <td></td>
                    </tr>
                </table>';

                }   
                elseif($destinasi == "goa pindul"){
                    echo "<h2>goa pindul</h2>";
                    echo "Harga Pertiket:Rp100.000";
                    echo '<table>';
                    echo '<tr><td>jumlah ticket:</td><td><input type="number" name="jumlah"></td></tr><br>';
                    echo '<tr><td>bayar:</td><td><input type="number" name="bayar"></td></tr><br>';
                    echo '<tr><td><input type="submit" name="goa" value="proses"></td></tr><br>';
                    echo '</table>';
                    
                }
            }
            if(isset($_POST['kirim'])) {
                $jumlah=$_POST['jumlah'];
                $bayar=$_POST['bayar'];
                $total=$jumlah*10000;
                if ($jumlah >= 6) {
                    $diskon=$total*0.15;
                    $totalakhir=$total-$diskon;
                }elseif ($jumlah >=4) {
                    $diskon=$total*0.1;
                    $totalakhir=$total-$diskon;
                }elseif ($jumlah<4) {
                    $diskon=$total*0.05;
                    $totalakhir=$total-$diskon;
                }
                else {
                    $diskon=0;
                    $totalakhir=$total;
                }
                $kembalian=$bayar-$totalakhir;
                echo "<br>";
                echo "total bayar: $totalakhir<br>";
                echo "diskon: $diskon<br>";
                echo "bayar : $bayar<br>";
                echo "kembalian :$kembalian<br>";
            }
            if(isset($_POST['submit'])) {
                $jumlah=$_POST['jumlah'];
                $bayar=$_POST['bayar'];
                $total=$jumlah*15000;
                if ($jumlah >= 6) {
                    $diskon=$total*0.15;
                    $totalakhir=$total-$diskon;
                }elseif ($jumlah >=4) {
                    $diskon=$total*0.1;
                    $totalakhir=$total-$diskon;
                }elseif ($jumlah<4) {
                    $diskon=$total*0.05;
                    $totalakhir=$total-$diskon;
                }
                else {
                    $diskon=0;
                    $totalakhir=$total;
                }
                $kembalian=$bayar-$totalakhir;
                echo "<br>";
                echo "total bayar: $totalakhir<br>";
                echo "diskon: $diskon<br>";
                echo "bayar : $bayar<br>";
                echo "kembalian :$kembalian<br>";
            }
            if(isset($_POST['ok'])) {
                $jumlah=$_POST['jumlah'];
                $bayar=$_POST['bayar'];
                $total=$jumlah*50000;
                if ($jumlah >= 6) {
                    $diskon=$total*0.15;
                    $totalakhir=$total-$diskon;
                }elseif ($jumlah >=4) {
                    $diskon=$total*0.1;
                    $totalakhir=$total-$diskon;
                }elseif ($jumlah<4) {
                    $diskon=$total*0.05;
                    $totalakhir=$total-$diskon;
                }
                else {
                    $diskon=0;
                    $totalakhir=$total;
                }
                $kembalian=$bayar-$totalakhir;
                echo "<br>";
                echo "total bayar: $totalakhir<br>";
                echo "diskon: $diskon<br>";
                echo "bayar : $bayar<br>";
                echo "kembalian :$kembalian<br>";
            }
            if(isset($_POST['ya'])) {
                $jumlah=$_POST['jumlah'];
                $bayar=$_POST['bayar'];
                $total=$jumlah*5000;
                if ($jumlah >= 6) {
                    $diskon=$total*0.15;
                    $totalakhir=$total-$diskon;
                }elseif ($jumlah >=4) {
                    $diskon=$total*0.1;
                    $totalakhir=$total-$diskon;
                }elseif ($jumlah<4) {
                    $diskon=$total*0.05;
                    $totalakhir=$total-$diskon;
                }
                else {
                    $diskon=0;
                    $totalakhir=$total;
                }
                $kembalian=$bayar-$totalakhir;
                echo "<br>";
                echo "total bayar: $totalakhir<br>";
                echo "diskon: $diskon<br>";
                echo "bayar : $bayar<br>";
                echo "kembalian :$kembalian<br>";
            }
            if(isset($_POST['goa'])) {
                $jumlah=$_POST['jumlah'];
                $bayar=$_POST['bayar'];
                $total=$jumlah*100000;
                if ($jumlah >= 6) {
                    $diskon=$total*0.15;
                    $totalakhir=$total-$diskon;
                }elseif ($jumlah >=4) {
                    $diskon=$total*0.1;
                    $totalakhir=$total-$diskon;
                }elseif ($jumlah<4) {
                    $diskon=$total*0.05;
                    $totalakhir=$total-$diskon;
                }
                else {
                    $diskon=0;
                    $totalakhir=$total;
                }
                $kembalian=$bayar-$totalakhir;
                echo "<br>";
                echo "total bayar: $totalakhir<br>";
                echo "diskon: $diskon<br>";
                echo "bayar : $bayar<br>";
                echo "kembalian :$kembalian<br>";
            }
            if(isset($_POST['pesan'])){
                $makan=$_POST['Makan'];
                $minum=$_POST['Minum'];
                $qty_makan=$_POST['qty_makan'];
                $qty_minum=$_POST['qty_minum'];

                if($makan=="mie goreng"){
                    $harga=13000;
                }
                elseif($makan=="nasi goreng"){
                    $harga=12000;
                }
                elseif($makan=="kwetiaw"){
                    $harga=14000;
                }
                elseif($minum=="es teh manis"){
                    $harga=5000;
                }
                elseif($minum=="teh manis hangat"){
                    $harga=4000;
                }
                elseif($minum=="susu coklat"){
                    $harga==8000;
                }

                $totalmakan=$qty_makan*$harga;
                $totalminum=$qty_minum*$harga;
                $total=$totalmakan+$totalminum;

                echo "<table><tr>";
                echo  "<td></td>";
                echo "<td>NOTA PEMBELIAN<br></td>";
                echo "<td></td>";
                echo"</tr>";
                echo"<tr>";
                echo    "<td></td>";
                echo    "<td>===================================<br></td>";
                echo    "<td></td>";
                echo"</tr>";
                echo"<tr>";
                echo    "<td></td>";
                echo    "<td>Makan : $makan<br></td>";
                echo    "<td></td>";
                echo"</tr>";
                echo"<tr>";
                echo    "<td></td>";
                echo    "<td>Minum : $minum<br></td>";
                echo    "<td></td>";
                echo"</tr>";
                echo"<tr>";
                echo    "<td></td>";
                echo    "<td>Total : Rp.$total<br></td>";
                echo    "<td></td>";
                echo"</tr>";
                echo"<tr>";
                echo    "<td></td>";
                echo    "<td>====================================<br></td>";
                echo    "<td></td>";
                echo"</tr>";
                echo    "</table>";

                
                
                
            }
        ?>
    </form>    
</body>
</html>