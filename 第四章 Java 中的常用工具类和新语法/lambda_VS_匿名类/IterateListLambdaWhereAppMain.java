package lambda_VS_匿名类;

import java.util.ArrayList;
import java.util.List;

public class IterateListLambdaWhereAppMain {
    public static void main(String[] args) {
        List<String> myList = addElementsToList(new ArrayList<>());
        // TODO  action.accept 就直接跳到了我们的方法，其实中间 Java 一顿后台操作帮我们生成了一个匿名类来实现接口，并调用我们提供的方法
        myList.forEach(IterateListLambdaWhereAppMain::processString);

    }

    public static List<String> addElementsToList(List<String> list) {
        for (int i = 0; i < 10; i++) {
            list.add("str" + (i % 5));
        }
        return list;
    }

    private static void processString(String str) {
        throw new RuntimeException();
    }

}
