package com.company;

import java.util.DuplicateFormatFlagsException;

interface TestInterface{
    void testInterface();
}

interface DummyInterface extends TestInterface {
    void bestInterface();
}                       //any interface can extends any interface

abstract class TestAbstract implements DummyInterface {
    abstract void best();
}

abstract class DummyAbstract extends TestAbstract {
    abstract void best1();
}
public class DayFour  extends Object{

    public static void main(String[] args){

    }


}
