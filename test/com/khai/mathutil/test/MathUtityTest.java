/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khai.mathutil.test;

import com.khai.mathutil.MathUtity;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class MathUtityTest {
    @Test
public void testFactorialGiveRightArgumentReturnGoodResult(){   
    int n=5;
    long expected=120;
    long actual=MathUtity.getFactorial(n);
    assertEquals(expected, actual);
    assertEquals(720, MathUtity.getFactorial(6));
    assertEquals(24, MathUtity.getFactorial(4));
    assertEquals(6, MathUtity.getFactorial(3));
    assertEquals(2, MathUtity.getFactorial(2));
    assertEquals(1, MathUtity.getFactorial(1));
    assertEquals(1, MathUtity.getFactorial(0));
    //màu đỏ đến theo 2 nghĩa
    //hàm tính đúng kì vọng sai
    //hàm tính sai kì vọng đúng
    //mỗi lời gọi hàm trên gọi là test case 
    //mỗi tình huống test hàm, 1 đầu vào, nhận đầu ra
}

//test ngoại lệ là test như thế nào/
//vì khi ngoại lệ xải ra app dừng liền
//vì có điều không ổn sải fra
//ngoại lệ không là value so sánh
//ngoại lệ là ước lượng , chạm nó khi nó sải ra
//test ngoại lệ đọc/ diễn giải như sau
//tui đưa dl cà chớn vd -5,22.40
//tui mún nhìn xem ngoại lệ có sải ra trong tình huống này
//hay ko, nếu có nên mừng vì app chạy đúng
//IllegalEx có nghĩa là hàm đúng
//xanh vì thiết kế -5 là ngoại lệ
@Test(expected = IllegalArgumentException.class)
public void testFactorialGivenWrongArgumentThrowsException(){
    MathUtity.getFactorial(-5); //chạy hàm chưa test
    MathUtity.getFactorial(21); //hammf ném ra exception
    MathUtity.getFactorial(-1); //ta phải chụp lại Ex
    MathUtity.getFactorial(40); //nếu có hàm đúng ,màu xanh
}



}
//việc test nhiều màu sắc dùng thư viện unit
//nếu tất cả các cặp bằng nhau(expected equal actual)
//coi như hàm chạy đúng mọi tình huống
//nếu trong tca các cặp mà ta đang sử lí có ít nhất 1 cặp không khớp nhau,màu đỏ
//coi như hàm không ổn
//Đẻ đảm bảo rằng hàm đã test các tình huống thì phải đúng hết
//những gì ta chủ động liệt kê ra thì phải thấy đúng
//file build.Imp.xml dòng 1005 thêm test sau  compile nếu đỏ sẽ ko ra file .jar