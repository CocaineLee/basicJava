package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> result=new ArrayList<>();
        for(String c1Str: collection1)
            for(List<String> value: collection2.values()){
                for(String c2Str:value){
                    if(c1Str.equals(c2Str))
                        result.add(c1Str);
                }
            }
        return result;
    }
}

