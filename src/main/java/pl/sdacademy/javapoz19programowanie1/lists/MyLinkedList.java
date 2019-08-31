package pl.sdacademy.javapoz19programowanie1.lists;

public class MyLinkedList {

    private MyLinkedListItem head;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.size=0;
    }

    public void add(Integer value){
        MyLinkedListItem myLinkedListItem = new MyLinkedListItem(value);

        if(this.head == null){
            this.head = myLinkedListItem;
        }else {

            MyLinkedListItem lastItem = getLastItem();

            lastItem.nextItem = myLinkedListItem;
        }
        size++;


    }

    //TODO - obsulga pustej listy
    //TODO - obsluga blednego indexu ArrayIndexOutOfBoundsException

    public Integer get(int index){


        return getElement(index).value;
    }

    private MyLinkedListItem getElement(int index){
        MyLinkedListItem tmpItem = head;

        if(head == null){
            throw new NullPointerException();
        }
        for (int i = 0; i < index ; i++) {
            tmpItem = tmpItem.nextItem;
        }

        return tmpItem;
    }

    public void remove(int index){
            if (head == null){
                throw new NullPointerException();
            }
            if (index < 0 || index >= size){
                throw new ArrayIndexOutOfBoundsException();
            }
            /*???How to remove element at index 0*/
            if (index == 0){
                //get next element
               // MyLinkedListItem nextToTheRight = getElement(index+1);
                //get the element to remove(the first element)
                MyLinkedListItem toRemove = getElement(index);
                //Set references to nextItem

                toRemove.nextItem = null;

                size--;
            }
            //bedzie trzeba uzyc metody getElement

            //1. pobieramy poprzednik elementu index
            MyLinkedListItem previous = getElement(index - 1);
            //2. pobieramy element do usuniecia
            MyLinkedListItem toRemove = getElement(index);
            //3. zmieniamy nextValue w poprzedniku na nextValue elementu ktory usuwamy
            previous.nextItem = toRemove.nextItem;
            // previous.nextItem = previous.nextItem.nextItem;
            //4. w usuwanym elemencie nullujemy nextValue
            toRemove.nextItem = null;

            size--;


    }
    /*testy do get i remove zrobic obsluga nulli*/
    public void addAtIndex(int index, Integer value){
       // chcemy dodac 2 pod indeksem 2 , nastepnie 2 przepinamy na koleny, odwrotnosc remove
        MyLinkedListItem toAdd = new MyLinkedListItem(value);

        if (this.head == null){
            this.head = toAdd;
        }
        if (index < 0 || index > size ){
            throw new ArrayIndexOutOfBoundsException();
        }

            if ( index == 0){
                MyLinkedListItem previous = getElement(0);

                toAdd.nextItem = previous;


            }
            if (index > 0 && index < size) {

                MyLinkedListItem previous = getElement(index - 1);

                MyLinkedListItem current = previous.nextItem;

                toAdd.nextItem = current;

                previous.nextItem = toAdd;
            }

            if (index == size){

                MyLinkedListItem previous = getElement(index-1);
                previous.nextItem = toAdd;
                toAdd.nextItem = null;
            }



        size++;
    }

    /*public int countNodes (MyLinkedListItem head){
        MyLinkedListItem tmpItm = head;
        int count = 1;
        while(tmpItm.nextItem != null){
            tmpItm = tmpItm.nextItem;
            count++;
        }
    }*/
    public int size(){
        return size;
    }

    private MyLinkedListItem getLastItem(){
        MyLinkedListItem tmpItem = this.head;

        while(tmpItem.nextItem != null){
            tmpItem = tmpItem.nextItem;
        }
        return tmpItem;
    }

    static class MyLinkedListItem {

        private Integer value;
        private MyLinkedListItem nextItem;

        public MyLinkedListItem(Integer value) {
            this.value = value;
        }
    }
}
