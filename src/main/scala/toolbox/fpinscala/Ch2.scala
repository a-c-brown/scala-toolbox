package toolbox.fpinscala

import scala.annotation.tailrec

object Ch2 {

    // EXERCISE 2.1
    def fib(n: Int): Int = {
        @tailrec
        def go(n: Int, prev: Int, cur: Int): Int =
            if (n == 0) prev
            else go(n - 1, cur, prev + cur)

        go(n, 0, 1)
    }


    // EXERCISE 2.2
    def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
        @tailrec
        def loop(n: Int): Boolean = {
            if (n >= as.length - 1) true
            else if (!ordered(as(n), as(n + 1))) false
            else loop(n + 1)
        }

        loop(0)
    }

    def partial[A, B, C](a: A, f: (A, B) => C): B => C = (b: B) => f(a, b)

    // EXERCISE 2.3
    def curry[A, B, C](f: (A, B) => C): A => (B => C) = null


    // EXERCISE 2.4
    def uncurry[A, B, C](f: A => B => C): (A, B) => C = null


    // EXERCISE 2.5
    def compose[A, B, C](f: B => C, g: A => B): A => C = null
}
