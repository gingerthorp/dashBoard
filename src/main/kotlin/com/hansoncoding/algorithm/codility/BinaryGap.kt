package com.hansoncoding.algorithm.codility

import java.util.Collections.max


fun solution(N: Int): Int{

    var binary: String = N.toUInt().toString(radix = 2)

    var binaryGap: Int = 0
    var binaryGapMax: Int = 0
    var index: Int = 0
    var size = binary.length


    for(bin in binary){
        index += 1

        if(bin == '1'){

            binaryGapMax = if(binaryGap > binaryGapMax) binaryGap else binaryGapMax

            binaryGap = 0

            if ( binaryGapMax > (size - index) ){
                break
            }
        } else {
            binaryGap += 1
        }

    }

    return binaryGapMax
}

fun main(){
    solution(1041)
}
