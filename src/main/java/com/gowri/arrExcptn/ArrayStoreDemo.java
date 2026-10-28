package com.gowri.arrExcptn;

/**
 * @author NaveenWodeyar
 * @date 09-May-2025 10:39:24 pm
 */

public class ArrayStoreDemo {
    @SuppressWarnings("removal")
	public static void main(String[] args) {
        Object[] objArray = new String[2];
        
        try {
            objArray[0] = new Integer(10); // ArrayStoreException
            System.out.println("Array= "+objArray);
		} catch (Exception e) {
	        objArray[0] = new Integer(10);
	        System.out.println("Array= "+objArray);
	        System.out.println("ArrayStoreException= "+e);
		}finally {
	        System.out.println("Array= "+objArray);
		}
    }
}

