package com.shanubhogh.todo.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.shanubhogh.todo.models.Todo;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<Todo>();
    private static int todoCount = 3;
    
    static {
        todos.add(new Todo(1, "Narayana", "Laearn Spring MVC", new Date(),
                false));
        todos.add(new Todo(2, "Manju", "Learn First", new Date(), false));
        todos.add(new Todo(3, "Pundi", "Learn Second", new Date(),false));
    }
    
    public List<Todo> getAllTodo(String user)
    {
    	 List<Todo> lst=new ArrayList<Todo>();
    	 for(Todo todo:todos)
    	 {
    		 if(todo.getUser().equalsIgnoreCase(user))
    		 {
    			 lst.add(todo);
    		 }
    	 }
    	return lst;
    }
    
    public Todo retrieveTodo(int id) {
        for (Todo todo : todos) {
            if (todo.getId()==id) {
                return todo;
            }
        }
        return null;
    }

    public void updateTodo(Todo todo){
    		todos.remove(todo);
    		todos.add(todo);
    }

    public void addTodo(String name, String desc, Date targetDate,
            boolean isDone) {
        todos.add(new Todo(++todoCount, name, desc, targetDate, isDone));
    }

    public void deleteTodo(int id) {
        Iterator<Todo> iterator = todos.iterator();
        while (iterator.hasNext()) {
            Todo todo = iterator.next();
            if (todo.getId() == id) {
                iterator.remove();
            }
        }
    }

	
}
