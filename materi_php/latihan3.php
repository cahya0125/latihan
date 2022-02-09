<?php

    for($a=1;$a<=5;$a++){
        for($b=1;$b<=$a;$b++){
            echo "*";
        }
        echo "<br>";
    }    

    echo "<br>";
    echo "<br>";

    for($i=0;$i<=4;$i++){
        for($j=4;$j>=$i;$j--){
            echo "*";
        }
        echo "<br>";
    }

    echo "<br>";
    echo "<br>";

    for ($c=0;$c<=4;$c++){
        for ($d=4;$d>=$c;$d--){
            echo " &nbsp";
        }
        for ($e=0;$e<=$c;$e++){
            echo "* &nbsp";
        }
        echo "<br>";
    }

    echo "<br>";
    echo "<br>";

    for($f=4;$f>=0;$f--){
        for($g=4;$g>=$f;$g--){
            echo " &nbsp";
        }
        for($h=0;$h<=$f;$h++){
            echo "* &nbsp";
        }
        echo "<br>";
    }

    echo "<br>";
    echo "<br>";

    for($k=10;$k>0;$k--){
        for($l=1;$l<=$k;$l++){
            echo " &nbsp";
        }
        for($m=10;$m>$k;$m--){
            echo "x";
        }
        echo "<br/>";
    }

    echo "<br>";
    echo "<br>";

    for( $n=0;$n<=10;$n++) {
        for($o=1; $o<=$n; $o++){
            echo "&nbsp ";
        }
        for($p=10;$p>=$n;$p--){
            echo "*";
        }
        echo "<br/> ";
    }

?>