package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class LinkedList<T> extends LinkedListBase<T> {

    private Node lastNode;
    private List<Node> linkedList = null;


    public class Node<T> {
        T mValue;
        T mNext;
    
    
        public T getValue(){ return mValue; }
    
        public void setValue(T value){
            mValue = value;
         }
    
        public T getNext(){ return mNext; }
    
        public void setNext(T string){ 
            mNext = string;
        }
    }

    @Override
    public void print() {

        for(Integer i = 0; i < linkedList.size(); i++ ) {
            System.out.println(linkedList.get(i).getValue() + " | " +         
            linkedList.get(i).getNext());
        }
    }

    @Override
    public void create() {
        lastNode = null;
        linkedList = new ArrayList<Node>();
    }

   @Override
   public void destroy() {
        linkedList = null;   
   }

    // TODO: empty state
    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        try{
            Node node = new Node();
            node = null;
            return false;

        } catch(ExceptionInInitializerError e) {
            return true;
        }
    }

  @SuppressWarnings("unchecked")
  @Override
  public void insert(T item) {
    if( isFull() ) {
        System.out.println("You can`t add item in full list");
    } else {
        Node node = new Node<T>();
        node.mValue = item;
        node.mNext = null;

        if(linkedList.size() > 0 ){
            linkedList.get(linkedList.size() - 1).setNext(item);
        }

        linkedList.add(node);
    }
  }

  @SuppressWarnings("unchecked")
  @Override
  public void insert(T item, int index) {
    if( isFull() ) {
        System.out.println("You can`t add item in full list");
    } else {

        Node node = new Node<T>();
        node.mValue = item;

        if(index == 0 ) {insert(item);}
        else {
            T previous_next = (T)linkedList.get(index - 1).getNext();
            linkedList.get(index - 1).setNext(item);
            node.mNext = previous_next;
            linkedList.add(index, node);
        }
    }
  }

  @Override
  public T remove(int index) {
      
    if( isEmpty() ) { System.out.println("You can`t remove item from empty list");}
    else {
        
        if(index < 1){ 
            T temp_next = (T)linkedList.get(index - 1).getNext();
            linkedList.get(index - 2).setNext(temp_next);
            linkedList.remove(index);
        }

    }

    return null;
  }
}