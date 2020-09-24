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
public class CircularDoubleLinkedList<T extends Number & Comparable<T>> implements Ilist<T> {

    DoubleNode<T> head;

    public CircularDoubleLinkedList() {
        head = null;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void add(T d) {
        DoubleNode<T> newNode= new DoubleNode<>(d);
        if(isEmpty()){
            head= newNode;
            newNode.setNextNode(newNode);
            newNode.setPreviousNode(newNode);
        }else{
            newNode.setPreviousNode(head.getPreviousNode());
            newNode.setNextNode(head);
            head.getPreviousNode().setNextNode(newNode);
            head.setPreviousNode(newNode);
            head=newNode;
            
        }
    }

    @Override
    public void addLast(T d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    			    	    

    @Override
    public void delete() {
    	if (isEmpty()) {
            System.out.println("Lista vacia");
    	}else {
    		DoubleNode<T> tail = head.getPreviousNode();
    		tail.setNextNode(head.getNextNode());
    		head.getNextNode().setPreviousNode(tail);
    		head=tail.getNextNode();
    	}
    }

    @Override
    public void deleteLast() {
    	if (isEmpty()) {
            System.out.println("Lista vacia");
    	}else {
    		head.setPreviousNode(head.getPreviousNode().getPreviousNode());
    		head.getPreviousNode().getPreviousNode().setNextNode(head);
    	}
    }

    public String showDataDesc(){
    	if (isEmpty()) {
            return "Lista vacia";
    	}else {
    		String data = "";
    		DoubleNode<T> tail = head.getPreviousNode();
    		for (DoubleNode<T> i = tail; i != head; i = i.getPreviousNode()) {
    			data += i.getData() + " ";    			
    		}
    		return data+=head.getData();
    	}
        
        
    }
    
    @Override
    public String showData() {
        if (isEmpty()) {
            return "Lista vacia";
        } else {
            String data = "";
            DoubleNode<T> tail = head.getPreviousNode();
            for (DoubleNode<T> i = head; i != tail; i = i.getNextNode()) {
                data += i.getData() + " ";
            }
            return data += tail.getData();

        }
    }

	@Override
	public void addOrdered(T d) {
		// TODO Auto-generated method stub
		/**
	        if (isEmpty()) {
	            add(d);
	            return; 
	        }else{
	        	if(head.getPreviousNode()==head) {
	        		int resultado=head.getData().compareTo(d);
	        		if(resultado==0) {
	        			System.out.println("El dato ya se encuentra en la lista y no se puede agregar");
	        			return;	
	        		}else if(resultado<0){
	        			DoubleNode<T> newNode = new DoubleNode<T>(d);
	        			head.setNextNode(newNode);
	        			head.setPreviousNode(newNode);
	        			newNode.setPreviousNode(head);
	        			newNode.setNextNode(head);
	        		}else {
	        			DoubleNode<T> newNode = new DoubleNode<T>(d);
	        			DoubleNode<T> temp = head;
	        			head=newNode;
	        			head.setNextNode(temp);
	        			head.setPreviousNode(temp);
	        			newNode.setPreviousNode(head);
	        			newNode.setNextNode(head);
	        		}
	        		
	        		}else {
	        		DoubleNode<T> current = head;
	        		int resultado2=head.getData().compareTo(d);
	        		if (resultado2==0) {
	        			System.out.println("El dato ya se encuentra en la lista y no se puede agregar");
	        			return;
	        		}else if (resultado2<0){
	        			while (current.getData().compareTo(d) < 0) {
	                        current = current.getNextNode();
	                    }
	                    DoubleNode<T> anterior = current.getPreviousNode();
	                    DoubleNode<T> newNode = new DoubleNode<>(anterior, d, current);
	                    anterior.setNextNode(newNode);
	                    current.setPreviousNode(newNode);
	            	}else {
	            		while (current.getData().compareTo(d) > 0) {
	                        current = current.getPreviousNode();
	                    }
	                    DoubleNode<T> siguiente = current.getNextNode();
	                    DoubleNode<T> newNode = new DoubleNode<>(current, d, siguiente);
	                    siguiente.setPreviousNode(newNode);
	                    current.setNextNode(newNode);
	            		}
	        		
	        		}
	        			
	        		}
	                
	**/        	
	    	
	}

}
