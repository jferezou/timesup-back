package com.timesup.utils

import kotlin.collections.ArrayList


class NameList {
    companion object {
        var nameList: ArrayList<String> = ArrayList()
        lateinit var currentRound: Iterator<String>

        fun addName(newName: String) {
            this.nameList.add(newName)
        }

        fun shuffle() {
            this.nameList.shuffle()
            this.currentRound = this.nameList.iterator()
        }

        fun next(): String {
            return try {
                currentRound.next()
            } catch (e: NoSuchElementException) {
                "termine"
            }
        }

        fun pass(valueToPass: String) {
            var remainingElement = this.currentRound.asSequence().toList()
            remainingElement += valueToPass
            this.currentRound = remainingElement.iterator()
        }
    }
}