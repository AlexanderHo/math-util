/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khai.mathutil;

/**
 *
 * @author ASUS
 */
public class MathUtity {
    //ta se tao cac ham trong class  fake y chang class math cua JDK
    //cac ham sai chung nhie noi, tien ich chung
    //cac ham sai chung nghi den static
    public static final double PI=3.1415;
    //ham tinh n1=1.2.3.4.5...n
    //qui uoc 0!=1;
    //ko cos giai thua am
    //giai thừa tăng cực nhanh về giá trị 21 gia thừa là tràn long
    //kiểu long 10^18, 18 con số 0 tối đa
    //sqrt(4)->2 u=f(x)=x^2
    public static long getFactorial(int n){
if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument , n must be between 0..20");
        if(n==0 || n==1)
            return 1;
        long result = 1;
        for ( int i=2 ; i<=n;i++)
            result = result*i;
        return result;
        
    }
}
