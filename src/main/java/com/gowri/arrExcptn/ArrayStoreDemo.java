package com.gowri.arrExcptn;

import java.util.Arrays;

/**
 * @author NaveenWodeyar
 * @date 09-May-2025 10:39:24 pm
 */

public class ArrayStoreDemo {
    @SuppressWarnings("removal")
	public static void main(String[] args) {
    	
        Object[] objArray = new String[2];
        objArray[0] = "1";
        objArray[1] = "Object";
        System.out.println("Object Array: "+ objArray);
        System.out.println("Object Array: " + Arrays.toString(objArray));
        
        try {
            objArray[0] = new Integer(10); // ArrayStoreException
            System.out.println("Array= "+objArray);
		} catch (Exception e) {
	        objArray[0] = new Integer(10);
	        System.out.println("Array= "+objArray);
	        System.out.println("ArrayStoreException= "+e);
		}finally {
	        System.out.println("Array= "+objArray);
	        System.out.println("Finally block");
		}
    }
}

