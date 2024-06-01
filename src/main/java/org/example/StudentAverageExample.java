package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentAverageExample {
    public static void main(String[] args) {
        String[][] studentNameAndMarks= {{"Charles", "84"},
            {"John", "100"},
            {"Andy", "37"},
            {"John", "23"},
            {"Charles", "20"}};

        Map<String, List<Integer>> marksMap=new HashMap<>();
       for(String[] str:studentNameAndMarks){
           String name=str[0];
           Integer marks=Integer.parseInt(str[1]);
          if(!marksMap.containsKey(name)){
              marksMap.put(name,new ArrayList<>());
          }
          marksMap.get(name).add(marks);
       }
        System.out.println(marksMap);

       double highestAverageMarks=0.0;
       for(Map.Entry<String,List<Integer>> entry:marksMap.entrySet()){
           List<Integer> marks=entry.getValue();
           double sum=0;
           for(int num:marks){
               sum+=num;
           }
           double average=sum/marks.size();
           if(average>highestAverageMarks){
               highestAverageMarks = average;
           }
       }
        System.out.println(highestAverageMarks);

    }
}
