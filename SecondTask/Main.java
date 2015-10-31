package hackBulgariaSecondTask;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
	    char[][] table = {
	            {'I', 'V', 'A', 'N'},
	            {'V', 'V', 'N', 'H'},
	            {'A', 'N', 'A', 'V'},
	            {'N', 'V', 'V', 'N'},
	            };
	    
	    char[] word = {'I', 'V', 'A', 'N'};
	    char[] revWord = {'N', 'A', 'V', 'I'};
	    char[] diagonal = new char[4];
	    char[] column = new char[4];
	    
	    int count = 0;
	    int i = 0;
	    int j = 0;
	    
	    for(j = 0; j < 4; j++) {
	    	column[j] = table[j][i];
	    }
	    j = 0;
	    
    	for(i = 0; i < 4; i++) {
    		diagonal[i] = table[i][i];
    	}
    	i = 0;
    	
	    if(Arrays.equals(table[j], word)) {
	    	count++;
	    } else {
	    	if(Arrays.equals(table[j], revWord)) {
	    		count++;
	    	}
	    }
	    
	    if(Arrays.equals(diagonal, word)) {
	   		count++;
	   	} else {
	   		if(Arrays.equals(diagonal, revWord)) {
	   			count++;
	   		}
	    }
	    	
	   	if(Arrays.equals(column, word)) {
	   		count++;
	   	} else {
	   		if(Arrays.equals(column, revWord)) {
    			count++;
	   		}
	   	}
	   	
	   	System.out.println(count);
	}
}