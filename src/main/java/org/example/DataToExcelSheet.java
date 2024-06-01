package org.example;

import java.io.File;
import java.sql.*;

public class DataToExcelSheet {
    public static void main(String[] args) throws Exception{
        String str="123456789";
        int sum = str.chars().map(Character::getNumericValue).map(n -> n * n).sum();
        System.out.println(sum);
        while(sum > 9) {
            int tempSum = 0;
            while (sum != 0) {
                int digit = sum % 10;
                tempSum += digit;
                sum /= 10;
            }
            sum = tempSum;
        }

        System.out.println(sum);
    }
}
