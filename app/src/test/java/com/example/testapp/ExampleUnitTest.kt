package com.example.testapp

import org.junit.Assert.*
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
//これをテスト
//class Calc {
//    fun add(a: Int, b: Int): Int {
//        return a + b
//    }
//}

internal class CalcTest {
    @Test
        fun addメソッドに2と3を渡すと5を返すCalcクラスのテスト() {
        //テスト対象のCalcクラスをsutに代入、expected：期待される
        //Calcクラスをpublicにしておく（値が読み出せずにエラーになる為）
        val sut = Calc()
        val expected = 5
        //addのaとbに数字を入れる、actual：実際
        val actual = sut.add(2, 3)
        //検証
        assertEquals(expected, actual)
        /*【後処理】
         * インスタンスの破棄やファイルのcloseなど
         * 必要があれば処理を書く
         */
    }
    @Test
        fun aたすbと合計はイコールか() {

        val sut = Calc()
        val expected = 5
        var okNg = false
        val actual = sut.add(2, 3)

        if(expected == actual){
            okNg = true
        }else{
            okNg = false
        }
        assertTrue(okNg)
    }
}

class ExampleUnitTest {
    @org.junit.Test
    fun addition_isCorrect2() {
        val expected = 2 + 2
        val actual = 4
        assertEquals(expected,actual)
    }
    @org.junit.Test
    fun addition_isCorrect() {
        val flag123 = true
        assertTrue(flag123)
    }
}