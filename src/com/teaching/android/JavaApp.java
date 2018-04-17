package com.teaching.android;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {
        char letra='a';
        byte n1=127;
        short n2=54;
        int n3=45643565;
        long n4=84543335353L;
        float n5=5432355.4F;
        double n6=554345.3545;
        boolean verdad=true;
        if (verdad){
            System.out.println("Char = "+letra +"\n"+
                    "byte = "+n1+"\n"+
                    "short = "+n2+"\n"+
                    "int = "+n3+"\n"+
                    "long = "+n4+"\n"+
                    "float = "+n5+"\n"+
                    "double = "+n6+"\n"+
                    "boolean = "+verdad+" esto esta en verdad, booleano"
            );
        }else{
            System.out.println("Char = "+letra +"\n"+
                    "byte = "+n1+"\n"+
                    "short = "+n2+"\n"+
                    "int = "+n3+"\n"+
                    "long = "+n4+"\n"+
                    "float = "+n5+"\n"+
                    "double = "+n6+"\n"+
                    "boolean = "+verdad+" esto esta en falso, booleano"
            );
        }

    }

}
