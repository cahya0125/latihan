<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>projek</title>
</head>
<body>
    <link rel="stylesheet" href="css.css">
<center>
    <h1>#Cafetaria Bandung</h1>
    <h2>Daftar Makanan & Minuman</h2>
    <form action="" method="post">
    <table cellspacing="15">
        <tr>
            <th>pilih</th>
            <th>Menu</th>
            <th>Harga</th>
        </tr>
        <tr>
            <th colspan="4">Makanan</th>
        </tr>
        <tr>
            <td>1.</td>
            <td>Nasi Goreng Special</td>
            <td>Rp.12.000</td>
        </tr>
        <tr>
            <td>2.</td>
            <td>Mie Kocok Putus Cinta</td>
            <td>Rp.10.000</td>
        </tr>
        <tr>
            <td>3.</td>
            <td>Nasi Geprek Lv3</td>
            <td>Rp.12.000</td>
        </tr>
        <tr>
            <th colspan="4">Minuman</th>
        </tr>
        <tr>
            <td>4.</td>
            <td>Es Campur </td>
            <td>Rp.8.000</td>
        </tr>
        <tr>
            <td>5.</td>
            <td>Es Capucino Cincau</td>
            <td>Rp.10.000</td>
        </tr>
        <tr>
            <td>6.</td>
            <td>Juice Jeruk</td>
            <td>Rp.8.000</td>
        </tr>
    </table>
    <div class="pilih">
        <label>Tanggal</label>
        <input type="date" name="tgl">
        <label>Pilih Menu</label>
        <input type="number" name="pilih">
        <label>Jumlah Pesanan</label>
        <input type="number" name="jumlah">
        <label>Bayar</label>
        <input type="number" name="bayar">
        <input type="submit" name="submit" value="DONE">
    </div>
    </form>
    <?php
    if(isset($_POST['submit'])) {
        $pilih  = $_POST['pilih'];
        $jumlah = $_POST['jumlah'];
        $bayar  = $_POST['bayar'];
        $date   = $_POST['tgl'];

         if($pilih == 1){
            $total = $jumlah * 12000;
            $menu = "Nasi Goreng Special";
            
          }else if($pilih == 2){
            $total = $jumlah * 10000;
            
          }else if($pilih == 3){
            $total = $jumlah * 12000;
            
          }else if($pilih == 4){
            $total = $jumlah * 8000;
            
          }else if($pilih == 5){
            $total = $jumlah * 10000;
            
          }else if($pilih == 6){
            $total = $jumlah * 8000;
            
          }
          $kembalian = $bayar - $total;
          if($bayar < $total) {
              $kembalian1 = "Maaf Uang Anda Kurang Rp. $kembalian";
          }
      ?>
           <hr>
           <table align="center" class="hasil" cellspacing ="10">
             <tr>
               <td></td>
               <td></td>
               <td>Date <?=$date?></td>
             </tr>
             <tr>
               <td>Menu</td>
               <td>:</td>
               <td><?=$menu?></td>
             </tr>
             <tr>
               <td>Total Bayar</td>
               <td>:</td>
               <td><?php echo "Rp. ".$total;?></td>
             </tr>
             <tr>
               <td>Uang Pembayaran</td>
               <td>:</td>
               <td><?php echo "Rp. ".$bayar;?></td>
             </tr>
             <tr>
               <td>Kembalian</td>
               <td>:</td>
               <td><?php echo $kembalian;?></td>
             </tr>
           </table>
      <?php } ?>
    </center>
</body>
</html>