package toolbox.fpinscala

import scala.annotation.tailrec

object Ch2 {
    /**
     * EXERCISE 2.1
     *
     * @param n
     * @return
     */
    def fib(n: Int): Int = {
        @tailrec
        def go(n: Int, prev: Int, cur: Int): Int =
            if (n == 0) prev
            else go(n - 1, cur, prev + cur)

        go(n, 0, 1)
    }

    /**
     * EXERCISE 2.1
     *
     * @param as
     * @param ordered
     * @tparam A
     * @return
     */
    def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
        @tailrec
        def loop(n: Int): Boolean = {
            if (n >= as.length - 1) true
            else if (!ordered(as(n), as(n + 1))) false
            else loop(n + 1)
        }

        loop(0)
    }

    def areIntsSorted(i: Int, j: Int): Boolean = {
        i < j
    }

    def partial1[A, B, C](a: A, f: (A, B) => C): B => C =
        (b: B) => f(a, b)

    /**
     * EXERCISE 2.3
     *
     * @param f
     * @tparam A
     * @tparam B
     * @tparam C
     * @return
     */
    def curry[A, B, C](f: (A, B) => C): A => (B => C) = {
        a: A => B => f(a, B)
    }

    /**
     * EXERCISE 2.4
     *
     * @param f
     * @tparam A
     * @tparam B
     * @tparam C
     * @return
     */
    def uncurry[A, B, C](f: A => B => C): (A, B) => C =
        (a: A, b: B) => f(a).apply(b)

    /**
     * EXERCISE 2.5
     *
     * @param f
     * @param g
     * @tparam A
     * @tparam B
     * @tparam C
     * @return
     */
    def compose[A, B, C](f: B => C, g: A => B): A => C = {
        a: A => f.apply(g.apply(a))
    }
}
