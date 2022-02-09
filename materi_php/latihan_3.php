<?php
    
    $ipk =-2;

    if ($ipk >4) {
        echo "anda tidak bisa mengambil 24 sks <br>";
        echo "Nilai yang anda masukan salah";
    }
    elseif ($ipk >= 3 ) {
        echo "anda bisa mengambil 24 sks";
    }elseif($ipk >= 2.5){
        echo "anda tidak bisa mengambil 24 sks <br>";
        echo "anda hanya bisa mengambil 21 sks";
    }elseif($ipk >=2){
        echo "anda tidak bisa mengambil 24 sks <br>";
        echo "anda hanya bisa mengambil 18 bsks";
    }elseif ($ipk >=1.5) {
        echo "anda tidak bisa mengambil 24 sks<br>";
        echo "anda hanya bisa mengambil 15 sks";
    }elseif ($ipk >= 0){
        echo "anda tidak bisa mengambil 24 sks <br>";
        echo "anda hanya bisa mengambil 12 sks";
    }else {
        echo "anda tidak bisa mengambil 24 sks <br>";
        echo "Nilai yang anda masukan salah";
    }


?>