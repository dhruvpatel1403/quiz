package quiz;
import unittest;
public class test{
    def test_assignto(){
        Task ts = new Task();
        expected= "Dhruv";
        result = ts.assignto("Dhruv");
        self.assertEqual(expected,result);
    }
}
