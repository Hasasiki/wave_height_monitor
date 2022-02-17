package utils;

import java.util.*;

import static java.lang.Double.*;

public class WaveCalculator {
    //List<Double> origin = new ArrayList<>();
    List<Integer> peakPositions = new ArrayList<>();
    List<Integer> valleyPositions = new ArrayList<>();
    List<Double> peakNums = new ArrayList<>();
    List<Double> valleyNums = new ArrayList<>();
    List<Double> waveHeight = new ArrayList<>();

    public List waveHeight(List<Double> origin) {
        int len = origin.size() - 1;
        int[] diff_v = new int[len];
        //sign(x) if x>0? 1:-1:0
        for (int i = 0; i < origin.size() - 1; i++) {
            if (compare(origin.get(i + 1),origin.get(i)) > 0) {
                //System.out.println("origin.get(i + 1) > origin.get(i)");
                diff_v[i] = 1;
            } else if (compare(origin.get(i + 1),origin.get(i)) < 0) {
                //System.out.println("origin.get(i + 1) < origin.get(i)");
                diff_v[i] = -1;
            } else {
                System.out.println("else");
                diff_v[i] = 0;
            }
        }
        //遍历trend
        /*
         * if Trend(i) = 0 && Trend(i+1) >=0 then trend(i) = 1
         * if Trend(i) = 0 and Trend(i+1) < 0 then trend(i) = -1*/
        for (int i = 0; i < diff_v.length - 1; i++) {
            //System.out.println(diff_v[i]);
            if (diff_v[i] == 0 && i == diff_v.length - 1) {
                diff_v[i] = 1;
            } else if (diff_v[i] == 0) {
                if (diff_v[i + 1] >= 0) {
                    diff_v[i] = 1;
                } else {
                    diff_v[i] = -1;
                }
            }
        }
        //get peak and valley position
        for (int i = 0; i < diff_v.length - 1; i++) {
            if (diff_v[i + 1] - diff_v[i] == -2){
                peakPositions.add(i+1);
                peakNums.add(origin.get(i+1));
                //System.out.println("PEAK POSITION IS:" + (i+1) + "PEAK NUMS IS: " + origin.get(i+1));
            }else if(diff_v[i + 1] - diff_v[i] == 2){
                valleyPositions.add(i+1);
                valleyNums.add(origin.get(i+1));
                //System.out.println("VALLEY POSITION IS:" + (i+1) + "VALLEY NUMS IS: " + origin.get(i+1));
            }
        }
        for (int i = 0; i < peakNums.size(); i++) {
            waveHeight.add(peakNums.get(i) - valleyNums.get(i));
        }


        return waveHeight;
    }
    /*有效浪高,将所有浪高降序排序,取前三分之一平均值*/
    public Double validWaveHeight(List<Double> waveHeight){
        Collections.sort(waveHeight);
        System.out.println(waveHeight);
        Double sum = 0.0;
        int startIndex = waveHeight.size() - 1;
        int endIndex = startIndex /3*2;
        int count = 0;
        for (int i = startIndex; i > endIndex; i--) {
            sum = sum+waveHeight.get(i);
            count++;
        }
        Double valid = sum / count;
        return valid;
    }

    //最高浪高,1/10
    public Double topWave(List<Double> waveHeight){
        Collections.sort(waveHeight);
        Double sum = 0.0;
        int startIndex = waveHeight.size() - 1;
        int endIndex;
        if(waveHeight.size() < 20){
            endIndex = startIndex -1;
        }else {
            endIndex = waveHeight.size() / 10 * 9;
        }
        int count = 0;
        for (int i = startIndex; i > endIndex; i--) {
            sum = sum+waveHeight.get(i);
            count++;
        }
        Double top = sum / count;
        return top;
    }
}
