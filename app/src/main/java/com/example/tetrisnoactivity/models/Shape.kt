package com.example.tetrisnoactivity.models

enum class Shape(val frameCount: Int, val startPosition: Int) {
    Tetromino(2,2){
        override fun getFrame(frameNumber: Int): Frame{
            return when(frameNumber){
                0->Frame(4).addRow("1111")
                1->Frame(1)
                    .addRow("1")
                    .addRow("1")
                    .addRow("1")
                    .addRow("1")
                else ->throw IllegalArgumentException("$frameNumber is an invalid frame number")
            }
        }
    },
    Tetromino1(1,1){
        override fun getFrame(frameNumber: Int): Frame {
            return Frame(2).addRow("11").addRow("11")
        }
    },
    Tetromino2(2,1){
        override fun getFrame(frameNumber: Int): Frame {
            return when(frameNumber){
                0->Frame(3)
                    .addRow("110")
                    .addRow("011")
                1->Frame(2)
                    .addRow("01")
                    .addRow("11")
                    .addRow("10")
                else->throw  IllegalArgumentException("$frameNumber is an invalid frame number")
            }
        }
    };



    abstract fun getFrame(frameNumber: Int):Frame
}
