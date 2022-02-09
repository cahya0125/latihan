<?php
//pengulangan for
    for ($x = 0; $x <5; $x++){
        echo "Data: $x <br>";
    }
//pengulangan bersarang
    for ($i =0; $i < 2; $i++){
        for ($j = 0; $j<3;$j++){
            echo "ini perulangan ke ($i,$j) <br>";
        }
    }
//perulangan while
    $x=0;
    while($x<5){
        echo "Data: $x <br>";
        $x++;
    }
//perulangan do while
    $x=0;
    do{
        echo "data: $x <br><br>";
        $x++;
    }while($x < 5);
?>