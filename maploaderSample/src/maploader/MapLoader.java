package maploader;

import java.io.IOException;
import java.util.ArrayList;
import gametest7th.gameobj.GameObject;
import java.awt.Graphics;

public class MapLoader {

    private final ArrayList<int[][]> mapArr;
    private final ArrayList<String[]> txtArr;

    public MapLoader(String MapPath, String txtPath) throws IOException { //txt檔名  bmp檔名
        mapArr = new ReadBmp().readBmp(MapPath);
        txtArr = new ReadFile().readFile(txtPath);
    }

    public static interface CompareClass<T> {

        public T compareClassName(String gameObject, String name, MapInfo mapInfo, int MapObjectSize);
    }

    public <T> ArrayList<T> creatObjectArray(String gameObject, int mapObjectSize, ArrayList<MapInfo> mapInfo, CompareClass<T> compare) {
        ArrayList<T> tmp = new ArrayList();
        mapInfo.forEach((e) -> {
            T tmpObject = compare.compareClassName(gameObject, e.getName(), e, mapObjectSize);
            if (tmpObject != null) {
                tmp.add(tmpObject);
            }
        });
        return tmp;
    }

    public ArrayList<MapInfo> combineInfo() {  //整合需要資料   類名  x座標  y座標 尺寸(e.g. 1 * 1)
        ArrayList<MapInfo> result = new ArrayList();
        for (int i = 0; i < mapArr.size(); i++) {
            for (int j = 0; j < txtArr.size(); j++) {
                if (mapArr.get(i)[1][0] == Integer.parseInt(txtArr.get(j)[1])) {
                    MapInfo tmp = new MapInfo(txtArr.get(j)[0],
                            mapArr.get(i)[0][0],
                            mapArr.get(i)[0][1],
                            Integer.parseInt(txtArr.get(j)[2]),
                            Integer.parseInt(txtArr.get(j)[3]));
                    result.add(tmp);
                }
            }
        }
        return result;
    }

    public ArrayList<int[][]> getMapArr() {
        return mapArr;
    }

    public ArrayList getTxtArr() {
        return txtArr;
    }

}
