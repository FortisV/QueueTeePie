/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    Queue<Cutie> queue;
    int array_size = 5;
    @BeforeEach
    void init() {
        queue = new Queue<>(array_size);
    }

    @Test
    void enqueueAndPop1() {
        Puppy puppy = new Puppy();
        queue.enqueue(puppy);
        assertEquals(puppy, queue.dequeue());
    }
    @Test
    void enqueueAndPop2() {
        Kitty kitty = new Kitty();
        Puppy puppy = new Puppy();
        queue.enqueue(kitty);
        queue.enqueue(puppy);
        assertEquals(kitty, queue.dequeue());
        assertEquals(puppy, queue.dequeue());
    }
    @Test
    void enqueueAndPop3() {
        PygmyMarmoset pygmyMarmoset = new PygmyMarmoset();
        Kitty kitty = new Kitty();
        Puppy puppy = new Puppy();
        queue.enqueue(pygmyMarmoset);
        queue.enqueue(kitty);
        queue.enqueue(puppy);
        assertEquals(pygmyMarmoset, queue.dequeue());
        assertEquals(kitty, queue.dequeue());
        assertEquals(puppy, queue.dequeue());
    }
    @Test
    void enqueueAndPopMany() {
        PygmyMarmoset pygmyMarmoset = new PygmyMarmoset();
        Kitty kitty = new Kitty();
        Puppy puppy = new Puppy();
        for(int i = 0; i < array_size * 5; ++i) {
            queue.enqueue(pygmyMarmoset);
            queue.enqueue(kitty);
            queue.enqueue(puppy);
            assertEquals(pygmyMarmoset, queue.dequeue());
            assertEquals(kitty, queue.dequeue());
            assertEquals(puppy, queue.dequeue());
        }
    }
    @Test
    void size() {
        Puppy puppy = new Puppy();
        for(int i = 0; i < 3; ++i) {
            queue.enqueue(puppy);
        }
        assertEquals(3, queue.size());
    }
    @Test
    void overflow() {
        Puppy puppy = new Puppy();
        for(int i = 0; i < array_size + 10; ++i) {
            queue.enqueue(puppy);
        }
        assertEquals(array_size, queue.size());
    }
}
