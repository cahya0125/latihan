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
    </form>    
        <?php
            if(isset($_POST['proses'])){
                $destinasi=$_POST['destinasi'];

                if($destinasi == "bukit bintang"){
                    echo "Bukit bintang <br>";
                    echo "Harga Pertiket:Rp10.000<br>";
                    echo '<from method="POST"><br>';
                    echo  '<table><br>';
                    echo '<tr><td>jumlah:</td><td><input type="number" name="jumlah"</td></tr><br>';
                    echo '<tr><td>bayar:</td><td><input type="number" name="bayar"</td></tr><br>';
                    echo '<tr><td><input type="submit" name="proses" value="proses"</td></tr><br>';
                    echo '</table><br>';
                    echo '</form><br>';
                        

                    if(isset($_POST['proses'])) {
                        $jumlah=$_POST['jumlah'];
                        $bayar=$_POST['bayar'];
                        $total=$jumlah*10000;
                        echo "<br>";
                        echo "total bayar: $total<br>";
                        echo "bayar : $bayar<br>";
                    }   
                }
            }
        ?>
</body>
</html>