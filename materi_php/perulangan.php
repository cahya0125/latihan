<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="" method="post">
       <table>
           <tr>
               <td></td>
               <td></td>
               <td>1.program pengulangan kelipatan 2</td>
           </tr>
           <tr>
               <td></td>
               <td></td>
               <td>2.program pengulanag kelipatan 5 x 5</td>
           </tr>
           <tr>
               <td></td>
               <td></td>
               <td>3.program ganjil genap</td>
           </tr>
           <tr>
               <td></td>
               <td></td>
               <td>4.program pengulangan kuadrat</td>
           </tr>
           <tr>
               <td>pilih soal</td>
               <td>:</td>
               <td><input type="number" name="pilih" id="" placeholder="pilih angka soal"></td>
               <td><input type="submit" value="kirim" name="proses"></td>
           </tr>
       </table>

       <?php
            if (isset($_POST['proses'])) {
                $pilih=$_POST['pilih'];
                
                if ($pilih == 1) {
                    echo "<b>1.program pengulangan kelipatan 2</b><br><hr>";
                    echo "Masukan Jumlah Angka :";
                    echo '<input type="number" name="angka" id="">';
                    echo '<input type="submit" value="kirim" name="p1" >';
                    
                }elseif ($pilih == 2) {
                    echo "<b>2.program pengulanag kelipatan 5 x 5</b><br><hr>";
                    echo "Masukan Jumlah Angka :";
                    echo '<input type="number" name="angka" id="">';
                    echo '<input type="submit" value="kirim" name="p2">';
                    
                }elseif ($pilih == 3) {
                    echo "<b>3.program ganjil genap</b><br><hr>";
                    echo "Masukan Jumlah Angka :";
                    echo '<input type="number" name="angka" id="">';
                    echo '<input type="submit" value="kirim" name="p3">';
                    
                }elseif ($pilih ==4) {
                    echo "<b>4.program pengulangan kuadrat</b><br><hr>";
                    echo "Masukan Jumlah Angka :";
                    echo '<input type="number" name="angka" id="">';
                    echo '<input type="submit" value="kirim" name="p4">';
                    
                }
            }
            if(isset($_POST['p1'])){
                $angka=$_POST['angka'];
                for ($i=2; $i <=$angka ; $i+=2) { 
                    echo "$i<br>";
                }
            }    
            if (isset($_POST['p2'])){
                $angka=$_POST['angka'];
                for($x=5;$x <= $angka;$x+=5){
                    $hasil =$x*5;
                    echo "Nilai = $x x 5=$hasil<br>";
                }
            }
            if(isset($_POST['p3'])){
                $angka=$_POST['angka'];
                for ($z=1; $z <= $angka ; $z++) { 
                    if (($z%2)==0) {
                        echo "Genap=$z<br>";
                    }else {
                        echo "Ganjil=$z<br>";
                    }
                }
            }
            if(isset($_POST['p4'])){
                $angka=$_POST['angka'];
                for ($q=1; $q <=$angka ; $q++) { 
                    $hsl=$q*$q;
                    echo "$q x $q=$hsl<br>";
                }
            }
       ?>
    </form>
</body>
</html>