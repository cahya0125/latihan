<?php
//harga
$hargaSabun = 3000;
$hargaMinyakGOreng = 11000;
$hargaPepsodent = 4000;
 
//form pembelian
if(!isset($_POST['proses']) && !isset($_POST['bayar'])){
 echo '
 <center>
 <h1>PEMBELIAN</h1>
 <p><i>silahkan masukkan jumlah pembelian</p>
 <form action="" method="POST">
 <table>
 <tr><td>Sabun (pcs)</td><td><input type="text" name="p1"></td></tr>
 <tr><td>Minyak Goreng (kg)</td><td><input type="text" name="p2"></td></tr>
 <tr><td>Pepsodent (pcs)</td><td><input type="text" name="p3"></td></tr>
 <tr><td></td><td><input type="submit" name="proses" value="proses"></td></tr>
 </table>
 </form>
 </center>';
 
//jumlah bayar
}elseif(isset($_POST['proses'])){
 $sabun = $_POST['p1'] * $hargaSabun;
 $minyak = $_POST['p2'] * $hargaMinyakGOreng;
 $pepsodent = $_POST['p3'] * $hargaPepsodent;
 $total = $sabun+$minyak+$pepsodent;
 
echo '
 <center>
 <h1>JUMLAH BAYAR & KEMBALIAN</h1>
 <p><i>silahkan masukkan uang pembayaran</p>
 <form action="" method="POST">
 <table>
 <tr><td>Total Bayar</td><td><input type="text" name="totalBayar" value="'.$total.'"></td></tr>
 <tr><td>Jumlah Uang</td><td><input type="text" name="jumlahUang"></td></tr>
 <tr><td></td><td><input type="submit" name="bayar" value="bayar"></td></tr>
 </table>
 </form>
 </center>';
//jumlah bayar,jumlah uang,kembali
}elseif(isset($_POST['bayar'])){
 $totalBayar = $_POST['totalBayar'];
 $jumlahUang = $_POST['jumlahUang'];
 $kembalian = $jumlahUang - $totalBayar;
 echo '
 <center>
 <h1>JUMLAH BAYAR & KEMBALIAN</h1>
 <form action="" method="POST">
 <table>
 <tr><td>Total Bayar</td><td><input type="text" name="totalBayar" value="'.$totalBayar.'" readonly></td></tr>
 <tr><td>Jumlah Uang</td><td><input type="text" name="jumlahuang" value="'.$jumlahUang.'" readonly></td></tr>
 <tr><td>Kembali</td><td><input type="text" name="jumlahuang" value="'.$kembalian.'" readonly></td></tr>
 </table>
 </form>
 </center>';
}
?>