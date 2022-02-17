package test;

import dataHandler.DataHandler;
import entity.WaveHeight;
import utils.WaveCalculator;
import utils.dataMaker;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class FunctionTester {
    static List<String> list = new ArrayList<String>();
    public static void dataProvider(){
        list.add("32.75,126.0,2020-11-26T03:00:00,0.28999999165534973");
    }

    public static void main(String[] args) {
        dataProvider();
        DataHandler handler = new DataHandler();
        WaveCalculator calculator = new WaveCalculator();
        //List<WaveHeight> result = handler.DataList(list);
/*        System.out.println(result.get(0).getData());
        System.out.println(result.get(0).getDate());*/
        dataMaker d = new dataMaker();
        List<String> makedata = d.makeData();
        //System.out.println(makedata);
        List<WaveHeight> dlist = handler.DataList(makedata);
        //System.out.println(dlist);
        List<Double> wavelist = handler.waveList(dlist);
        //System.out.println(wavelist);
        List<Double> waveHeight = calculator.waveHeight(wavelist);
        System.out.println(waveHeight);
        System.out.println(calculator.validWaveHeight(waveHeight));
        System.out.println(calculator.topWave(waveHeight));
    }
}
