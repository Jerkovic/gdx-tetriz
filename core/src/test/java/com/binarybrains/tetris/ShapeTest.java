package com.binarybrains.tetris;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeTest {

    @Test
    public void rotateLeft() {

        Shape shape = new Shape();
        shape.setShape(Shape.Tetrominoes.MirroredLShape);
        System.out.println(shape);

        System.out.println("rotate Left:");
        shape = shape.rotateLeft();
        System.out.println(shape);


        System.out.println("rotate Left:");
        shape = shape.rotateLeft();
        System.out.println(shape);


        System.out.println("rotate Left:");
        shape = shape.rotateLeft();
        System.out.println(shape);

        System.out.println("rotate Right:");
        shape = shape.rotateRight();
        System.out.println(shape);

    }
}