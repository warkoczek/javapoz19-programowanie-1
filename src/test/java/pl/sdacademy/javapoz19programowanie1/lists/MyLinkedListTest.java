package pl.sdacademy.javapoz19programowanie1.lists;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class MyLinkedListTest {
    @Test
    public void addShouldAddElementToEmptyList(){

        //given
        MyLinkedList myLinkedList = new MyLinkedList();
        //when
        myLinkedList.add(5);
        //then
        Assert.assertEquals(1, myLinkedList.size());


    }
    @Test
    public void shouldAddElementToNonEmptyList(){
        //given
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(4);
        myLinkedList.add(6);
        //when
        myLinkedList.add(10);

        //then
        Assert.assertEquals(5, myLinkedList.size());
    }

    @Test
    public void getShouldReturnFirstElement(){
        //TODO
            //given
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(8);
        //when
        myLinkedList.get(0);
        //then
        Assert.assertEquals((Integer)3, myLinkedList.get(0));
    }

    @Test
    public void getShouldReturnLastElement(){
        //TODO
        //given
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(8);
        //when
        myLinkedList.get(2);
        //then
        Assert.assertEquals((Integer)8,myLinkedList.get(myLinkedList.size()-1));
    }

    @Test
    public void getShouldReturnMiddleElement(){
        //TODO
        //given
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(0);
        myLinkedList.add(10);
        myLinkedList.add(20);
        myLinkedList.add(30);
        myLinkedList.add(40);
        myLinkedList.add(50);

        //when
        Integer result = myLinkedList.get(3);

        //then

        Assert.assertEquals((Integer)30,result);
    }

    @Test
    public void removeShouldRemoveMiddleElement() {

        //given
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(0);
        myLinkedList.add(10);
        myLinkedList.add(20);
        myLinkedList.add(30);
        myLinkedList.add(40);

        //when
        myLinkedList.remove(2);
        //then
        Assert.assertEquals(4, myLinkedList.size());
        Assert.assertEquals((Integer)0, myLinkedList.get(0));
        Assert.assertEquals((Integer)10, myLinkedList.get(1));
        Assert.assertEquals((Integer)30, myLinkedList.get(2));
        Assert.assertEquals((Integer)40, myLinkedList.get(3));

    }
   /* @Test
    public void removeShouldRemoveFirstElement(){
        //given
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(10);
        myLinkedList.add(20);
        myLinkedList.add(30);
        myLinkedList.add(40);
        //when
        myLinkedList.remove(0);

        //then
        Assert.assertEquals(4,myLinkedList.size());
        Assert.assertEquals((Integer)10, myLinkedList.get(0));
        Assert.assertEquals((Integer)20, myLinkedList.get(1));
        Assert.assertEquals((Integer)30, myLinkedList.get(2));
        Assert.assertEquals((Integer)40, myLinkedList.get(3));

    }*/
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void removeOfNotExistingElementShouldReturnArrayOutOfBoundException(){
        //given
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(0);
        myLinkedList.add(10);
        myLinkedList.add(20);
        myLinkedList.add(30);
        myLinkedList.add(40);

        //when
        myLinkedList.remove(5);
    }

    @Test
    public void addAtIndexShouldAddElementToNotEmptyListAtGivenIndex(){
        //given
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(5);
        myLinkedList.add(10);

        myLinkedList.add(30);
        myLinkedList.add(40);

        //when//NOTWORKING when index is 0
        myLinkedList.addAtIndex(2,20);
        //then
        Assert.assertEquals(5,myLinkedList.size());

        Assert.assertEquals((Integer)5,myLinkedList.get(0));
        Assert.assertEquals((Integer)10,myLinkedList.get(1));
        Assert.assertEquals((Integer)20, myLinkedList.get(2));
        Assert.assertEquals((Integer)30, myLinkedList.get(3));
        Assert.assertEquals((Integer)40, myLinkedList.get(4));
    }

    @Test
    public void addAtIndexShouldAddElementToEmptyListAtFirstIndex(){
        //given
        MyLinkedList myLinkedList = new MyLinkedList();


        //when
        myLinkedList.addAtIndex(0,3);
        //then
        Assert.assertEquals(1,myLinkedList.size());

    }

    @Test
    public void addAtIndexShouldAddElementAtTheEndOfTheList(){
        //given
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(5);
        myLinkedList.add(10);
        myLinkedList.add(20);
        myLinkedList.add(30);
        myLinkedList.add(40);

        //when
        myLinkedList.addAtIndex(5,50);

        //then
        Assert.assertEquals(6, myLinkedList.size());
        Assert.assertEquals((Integer)5, myLinkedList.get(0));
        Assert.assertEquals((Integer)10, myLinkedList.get(1));
        Assert.assertEquals((Integer)20, myLinkedList.get(2));
        Assert.assertEquals((Integer)30, myLinkedList.get(3));
        Assert.assertEquals((Integer)40, myLinkedList.get(4));
        Assert.assertEquals((Integer)50, myLinkedList.get(5));

    }
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void addAtIndexShouldReturnArrayOutOfBoundExceptionWhenAddingAtNotExistingIndex(){

        //given
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(5);
        myLinkedList.add(10);
        myLinkedList.add(20);
        myLinkedList.add(30);
        myLinkedList.add(40);

        //when
        myLinkedList.addAtIndex(10, 100);

        //then
        Assert.assertEquals(5, myLinkedList.size());


    }
}