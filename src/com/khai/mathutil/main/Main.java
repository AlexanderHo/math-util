/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khai.mathutil.main;

import com.khai.mathutil.MathUtity;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int n=5;  //5! coi bằng mấy
     long excepted =120;// kì vọng tính ra 120
     long actual= MathUtity.getFactorial(n) ;
     
        System.out.println("5! excepted : "+excepted
                                 +"; actual "+actual);
     //xưt trường hợp 2 0! bằng mấy
      n=0;  //5! coi bằng mấy
     excepted =1;// kì vọng tính ra 120
     actual= MathUtity.getFactorial(n) ;
     
        System.out.println("0! excepted : "+excepted
                                 +"; actual "+actual);
    }
      
}
//TRONG QUY TRINH LAM PHAN MEM , DAN DEV CO TRACH NGHIEM TEST TUNG HAM 
    // TRUOC KHI DONG GOI CHO BEN QA/QC TEST
    //DOC LAP , TUNG HAM , TUNG CLASS PHAI DOI DUOC TEST CAN THAN TRUOC KHI CHUNG
    // DUOC DUNG DE PHOI HOP VOI CAC CLASS KHAC , TEST NGAY MUC HAM , MUC CLASS
    // VUA HOAN THIEN , CHUA THEM BAN VE UI , THI MUC DO TEST SOM NAY GOI LA
    // UNIT TEST LEVEL - TEST TUNG DON THE , DON VI CODE
    
    //vậy làm sao để test từng hàm , từng class??
    // có nhiều cách dùng để test từng hàm , từng class
    // cách 1 : Dùng sout(gọi hàm cần test) để in ra giá trị xử lí của hàm
    // DÙng trong OOP
    
    // Cách 2 : DÙng Jop của môn java desktop để pop-up một cửa sổ
    // in ra kết quả xử lí hàm để kiểm tra coi hàm chạy đúng hay sai
    
    // cách 3: Dùng LOG FILE . trang web inra kết quả xử lí của hàm ( java web)
    
    // DÙ gọi cách nào thì ta cũng cần phải in ra giá trị hàm xử lí
    // gọi là ACTUAL VALUE
    // rồi ta đi so sách trá trị trả về của hàm có giống như ta tính toán //
    // trước đó hay kp , cái ta hy vọng hàm sẽ trả về - gọi là EXOECTED VALUE
    
    // nếu ACTUAL VALUE == EXPECTED VALUE--> hàm chạy ngon
    //                     KHÁC     -->Hàm sai
    // nguyên tắc của việc test : so sánh ACTUAL với EXPECTED
    // Gọi hàm để sử lí kq 
// sau đóa dùng mắt để so sánh actual và expected rồi rút ra kết luận
//cách này tiềm ẩn quá nhiều sai sót vì phải xét nhiều cặp value
//mỗi N để test ta gọi là 1 tình huống xài hàm,1 tình huống test
//TEST CASE 

//Cách 4 không thèm nhìn bằng mắt từng trường hợp
//sd máy , vì máy biết so sánh
//máy sẽ quét qua các cặp value
//nếu khớp báo màu xanh ĐƯỜNG THÔNG CODE TỐT
//báo màu đỏ ĐƯỜNG KẸT do code trrucj trặc tính toán
//Mún làm việc này ta câng thư viện hỗ trợ
//JAVA Junit,testNG
//C# NUnit,MStest,xunit
//PHP PHPUnit..
//mọi ngôn ngũ đều có thư viện xanh đỏ để giúp hàm tốt hơn


