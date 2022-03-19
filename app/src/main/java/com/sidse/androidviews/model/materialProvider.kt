package com.sidse.androidviews.model

import com.sidse.androidviews.dataModel.material

class materialProvider {
    companion object {
        val productList = listOf(
            material("Spiderman", 123, 321, 456),
            material("Daredevil", 123, 321, 456),
            material("Wolverine", 123, 321, 456),
            material("Batman", 123, 321, 456),
            material("Thor", 123, 321, 456),
            material("Flash", 123, 321, 456),
            material("Green Lantern", 123, 321, 456),
            material("Wonder Woman", 123, 321, 456)

        )
    }
}