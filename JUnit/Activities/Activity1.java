package activities;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
public class Activity1 {
	

	
	    // Test fixtures
	    static ArrayList<String> list;

	    // Initialize test fixtures before each test method
	    @BeforeEach
	    void setUp() throws Exception {
	        list = new ArrayList<String>();
	        list.add("alpha"); // at index 0
	        list.add("beta"); // at index 1
	    }

	    // Test method to test the insert operation
	    @Test
	    public void insertTest() {
	    	//expected list
	    	List<String> expectedList = Arrays.asList("alpha","beta","charlie");
	        // Assert size of the list before adding an element
	        assertEquals(2, list.size());
	        // Add new element to the list
	        list.add(2, "charlie");
	        // Assert size of the list after adding an element
	        assertEquals(3, list.size());

	        // Assert individual elements
	        /*assertEquals("alpha", list.get(0), "Wrong element");
	        assertEquals("beta", list.get(1), "Wrong element");
	        assertEquals("charlie", list.get(2), "Wrong element");
	        */
	        //assert list elements
	        assertIterableEquals(expectedList ,list);
	    }

	    
		

		// Test method to test the replace operation
	    @Test
	    public void replaceTest() {
	    	/*
	        // Replace new element
	        list.set(1, "charlie");

	        // Assert size of list
	        assertEquals(2, list.size(), "Wrong size");
	        // Assert individual elements
	        assertEquals("alpha", list.get(0), "Wrong element");
	        assertEquals("charlie", list.get(1), "Wrong element");
	        */
	    	
	    	//expected list
	    	List<String> expectedList = Arrays.asList("alpha","beta","gamma");
	        // Assert size of the list before adding an element
	        assertEquals(2, list.size());
	        // Add new element to the list
	        list.add(2, "charlie");
	        list.set(2, "gamma");
	        // Assert size of the list after adding an element
	        assertEquals(3, list.size());

	        // Assert individual elements
	        /*assertEquals("alpha", list.get(0), "Wrong element");
	        assertEquals("beta", list.get(1), "Wrong element");
	        assertEquals("charlie", list.get(2), "Wrong element");
	        */
	        //assert list elements
	        assertIterableEquals(expectedList ,list);
	    	
	    }
	   
	}

