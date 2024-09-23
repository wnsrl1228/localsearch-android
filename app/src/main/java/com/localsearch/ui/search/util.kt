package com.localsearch.ui.search

fun getRadiusByZoom(zoomLevel: Float): Double {
    return when (zoomLevel.toInt()) {
        2 -> 2590000.0
        3 -> 2590000.0
        4 -> 1280000.0
        5 -> 640000.0
        6 -> 320000.0
        7 -> 160000.0
        8 -> 80000.0
        9 -> 40000.0
        10 -> 20000.0
        11 -> 10000.0
        12 -> 5200.0
        13 -> 2600.0
        14 -> 1320.0
        15 -> 770.0
        16 -> 370.0
        17 -> 170.0
        18 -> 85.0
        19 -> 50.5
        20 -> 20.7
        else -> 1200000.0 // 기본값
    }
}