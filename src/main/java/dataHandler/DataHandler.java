package dataHandler;

import entity.WaveHeight;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*DATA TYPE MAYBE [X,Y,DATE,DATA]
 * DATE INDEX IS DID
 * DATA INDEX IS HID
 * EXAMPLE: [32.75,126.0,"2020-11-26T03:00:00",0.28999999165534973]
 * GET THE DATE AND DATA FROM THIS KIND OF TYPE*/
public class DataHandler {
    Date date;
    Double height;
    int did = 2;
    int hid = 3;


    public List<WaveHeight> DataList(List<String> list) {
        List<WaveHeight> resultList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            WaveHeight wave = new WaveHeight();
            wave.setDate(list.get(i).split(",")[did].trim());
            wave.setData(Double.parseDouble(list.get(i).split(",")[hid].trim()));
            resultList.add(wave);
        }
        return resultList;
    }
    public List waveList(List<WaveHeight> list){
        List<Double> origin = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            origin.add(list.get(i).getData());
        }
        return origin;
    }
}
