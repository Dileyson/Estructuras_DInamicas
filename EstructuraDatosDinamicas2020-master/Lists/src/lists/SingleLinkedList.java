/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

/**
 *
 * @author samaniw
 */
public class SingleLinkedList<T extends Number & Comparable<T>> implements Ilist<T> {

    private Node<T> head;
    private int maj;
    private int min;    
    private int sum;    
    private int size;

    public SingleLinkedList() {
        this.head=null;
        this.size=0;
        this.maj = 0;
        this.min = Integer.MAX_VALUE;
        
    }   
    
    @Override
    public boolean isEmpty() {
        return this.head==null;
    }
    
    public double getAverage(){
        return this.sum/this.size;
    }
    
    @Override
    public void add(T d) {
        Node<T> newNode = new Node<>(d);
        newNode.setNextNode(head);
        this.head = newNode;
        this.size++;

        this.sum += d.intValue();
        if(d.intValue()<this.min) {
        	this.min=d.intValue();
        }
        
        else if(d.intValue()>this.maj) {
        	this.maj=d.intValue();
        }
        
        
    }

    @Override	
    public void addLast(T d) {
        if(isEmpty()){
            add(d);
        }else{
            Node<T> current=this.head;
            while(current.getNextNode()!=null){
                current = current.getNextNode();
            }
            Node<T> newNode = new Node<>(d);
            current.setNextNode(newNode);
        }    
        this.size++;
        if(d.intValue()<this.min) {
        	this.min=d.intValue();
        }
        
        else if(d.intValue()>this.maj) {
        	this.maj=d.intValue();
        }
        this.sum += d.intValue();
    }

    @Override
    public void addOrdered(T d) {      
        if(isEmpty() || this.head.getData().compareTo(d)>0){
            add(d);
        }else{
        Node<T> current = this.head;
        while(current.getNextNode()!=null
              && current.getNextNode().getData().compareTo(d)<0
                ){
            current = current.getNextNode();
        }        
        Node<T> newNode = new Node<>(d);
        newNode.setNextNode(current.getNextNode());
        current.setNextNode(newNode);        
        }
        this.size++;
        if(d.intValue()<this.min) {
        	this.min=d.intValue();
        }
        else {
        	this.maj=d.intValue();
        }
        this.sum += d.intValue();
        
    }

    @Override
    public void delete() {
    	int temp=0;
        if(isEmpty()){
            System.out.println("Lista vacia");
        }else{
        	temp=this.head.getData().intValue();
            this.head = this.head.getNextNode();
            
        }
        
        if(temp==this.maj) {
        	this.maj=0;
        	getMaj();
        }
        if(temp==this.min) {
        	this.min=Integer.MAX_VALUE;
        	getMin();
        }
        this.sum -= temp;
        this.size--;
 
        
        
    }

    @Override
    public void deleteLast() {
    	
    	int temp=0;
    	if (isEmpty()) {
            System.out.println("Lista vacia");
        } else if (head.getNextNode().getData()==null) {
            this.head = null;
        } else { 
        	Node<T> current = this.head;
            while(current.getNextNode().getNextNode()!=null) {
            	current=current.getNextNode();
            	temp=current.getNextNode().getData().intValue();
            	
            }
        	current.setNextNode(null);
        	
        }
    	this.size--;
    	
    	if(temp==this.maj) {
        	this.maj=0;
        	getMaj();
        }
        if(temp==this.min) {
        	this.min=Integer.MAX_VALUE;
        	getMin();
        }
        this.sum -= temp;
        

    }

    @Override
    public String showData() {        
        if(isEmpty()){
            return "Lista vacia";
        }else{
            String data = "";        
            for(Node<T> i=this.head;i!=null;i = i.getNextNode()){
                data += i.getData() + " ";
            } 
            return data;
            
        }
    }

    
    public int getSize() {
        return this.size;
    }

    
    public void getMaj() {
    	Node<T> current = this.head;
        while(current!=null){
        	int tempo=current.getData().intValue();
        	if (tempo>this.maj) {
        		this.maj=tempo;
        	}
            current = current.getNextNode();            
        }       
    }

    public void getMin() {
    	Node<T> current = this.head;
        while(current!=null){
        	int tempo= current.getData().intValue();
        	if (tempo<this.min) {
        		this.min=tempo;
        	}
            current = current.getNextNode();            
        }
        
    }
    
    public int showMaj(){
        return this.maj;
    }
    public int showMin(){
        return this.min;
    }
 
}
