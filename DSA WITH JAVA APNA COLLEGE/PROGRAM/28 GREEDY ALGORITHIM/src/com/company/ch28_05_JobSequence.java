package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class ch28_05_JobSequence
{
    static class Job{
        int deadline;
        int profit;
        int id;
        Job(int id,int deadline,int profit){
this.id = id;
this.deadline=deadline;
this.profit=profit;

        }

    }
    public static void main(String[] args) {
        int jobInfo[][]={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job> jobs = new ArrayList<>();//Create arraylist of all JOB objects
// We can do it by native way , but here we wnat to do object sorting
        for(int i=0;i<jobInfo.length;i++){
            jobs.add(new Job(i,jobInfo[i][0],jobInfo[i][1]));
        }// all object are assign values

//        Collections.sort(jobs,(obj1,obj2)->obj1.profit-obj2.profit);//Sorting in asending oreder base on profit
        Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit);//Sorting in desending order base on profit

        ArrayList<Integer>seq = new ArrayList<>();
        int time=0;
        int maxprofit=0;
        for(int i=0;i< jobs.size();i++){
            Job currobj =  jobs.get(i);
            if(currobj.deadline>time){
                time++;
                maxprofit+= currobj.profit;
                seq.add(i);
            }
        }

        System.out.println("Maximum Jobs  = "+seq.size());
        System.out.println("Maximum Profit = "+maxprofit);
        System.out.println("Job Sequence :: "+seq);

    }
}
