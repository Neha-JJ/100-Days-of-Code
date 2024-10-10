import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String reversedA = new StringBuilder(A).reverse().toString();
        
        if (A.equals(reversedA)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}