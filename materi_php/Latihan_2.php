<?php
    $nilai=10;
    if($nilai >= 96){
        echo "Grade Nilai Anda A+<br>";
        echo "Selamat Anda LULUS<br>";
        echo "Dengan predikat SEMPURNA<br>";
        echo "KKM:75<br>";
    }elseif ($nilai >= 90) {
        echo "Grade Nilai Anda A <br>";
        echo "Selamat Anda LULUS<br>";
        echo "Dengan predikat SANGAT BAIK<br>";
        echo "KKM:75<br>";
    }
    elseif ($nilai >= 86) {
        echo "Grade Nilai Anda -A <br>";
        echo "Selamat Anda LULUS<br>";
        echo "Dengan predikat BAIK SEKALI<br>";
        echo "KKM:75<br>";
    }
    elseif ($nilai >= 80) {
        echo "Grade Nilai Anda B+<br>";
        echo "Selamat Anda LULUS<br>";
        echo "Dengan predikat BAIK<br>";
        echo "KKM:75<br>";
    }
    elseif ($nilai >= 75){
        echo "Grade Nilai Anda B<br>";
        echo "Selamat Anda LULUS<br>";
        echo "Dengan predikat BAIK<br>";
        echo "KKM:75<br>";
    }
    elseif ($nilai >= 70){
        echo "Grade Nilai Anda B-<br>";
        echo "Selamat Anda TIDAK LULUS<br>";
        echo "Dengan predikat BAIK <br>";
        echo "KKM:75<br>";
    }
    elseif ($nilai >= 66){
        echo "Grade Nilai Anda C+<br>";
        echo "Selamat Anda LULUS<br>";
        echo "Dengan predikat CUKUP <br>";
        echo "KKM:75<br>";

    }
    elseif ($nilai >= 60){
        echo "Grade Nilai Anda C <br>";
        echo "Selamat Anda TIDAK LULUS <br>";
        echo "Dengan predikat KURANG <br>";
        echo "KKM:75 <br>";
    }
    else {
        echo "Grade Nilai Anda D <br>";
        echo "Selamat Anda TIDAK LULUS <br>";
        echo "Dengan predikat SANGAT KURANG<br>";
        echo "KKM:75 <br>";
    }

?>