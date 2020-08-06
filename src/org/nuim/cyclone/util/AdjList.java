package org.nuim.cyclone.util;
import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;

public class AdjList <T> {
    private int size;
    private Head[] head;

    private class Head{
        Node head_link;
        Node tail_link;
        int size;
    }

    private class Node{
        T info;
        Node next;
    }

    public AdjList(int size){
        this.size=size;
        initialise();
    }

    private void initialise(){
       head = (Head[])Array.newInstance(Head.class,this.size);    
    }
    
    public void set_head(T t, int index){
        Head h = new Head();
        Node node = new Node();
        node.info = t;
        node.next = null;
        head[index] = h;
        h.head_link = node;
        h.tail_link = node;
    }

    public void add(T t, int index){
        if (head[index]==null){
            set_head(t, index);
            size=1;
            return;
        }

        Head hl = head[index];
        Node node = new Node();
        node.info = t;
        node.next = null;
        hl.tail_link.next = node;
        hl.tail_link=node;
        hl.size++;
    }

    public T get_head(int index){
        if (head[index]==null) return null;

        if (head[index].head_link==null){
            return null;
        }

        return head[index].head_link.info;
    }

    public int get_head_size(int index){
        if (head[index]==null) return 0;
        return head[index].size;
    }

    public List<T> get_head_all(int index){
        List<T> list = new ArrayList<T>();
        if (head[index]==null) return list;

        Node hl = head[index].head_link;

        while (hl!=null){
            list.add(hl.info);
            hl = hl.next;
        }
        return list;
    }
}