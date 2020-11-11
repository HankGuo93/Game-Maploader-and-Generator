/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametest7th.scene;

import gametest7th.gameobj.GameObject;
import gametest7th.gameobj.*;
import gametest7th.utils.CommandSolver;
import gametest7th.utils.Global;
import java.awt.Graphics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import maploader.MapInfo;
import maploader.MapLoader;

public class MapScene extends Scene {

    private ArrayList<TestObject1> gameObject1Arr = new ArrayList();
    private ArrayList<TestObject2> gameObject2Arr = new ArrayList();
    private ArrayList<TestObject3> gameObject3Arr = new ArrayList();
    private ArrayList<TestObject4> gameObject4Arr = new ArrayList();
    private ArrayList<TestObject5> gameObject5Arr = new ArrayList();
    private ArrayList<TestObject6> gameObject6Arr = new ArrayList();
    private ArrayList<TestObject7> gameObject7Arr = new ArrayList();
    private ArrayList<TestObject8> gameObject8Arr = new ArrayList();
    private ArrayList<TestObject9> gameObject9Arr = new ArrayList();
    private ArrayList<TestObject10> gameObject10Arr = new ArrayList();
    private ArrayList<TestObject11> gameObject11Arr = new ArrayList();

    @Override
    public void sceneBegin() {
        try {
            MapLoader mapLoader = new MapLoader("genMap.bmp", "genMap.txt");
            ArrayList<MapInfo> mapInfoArr = mapLoader.combineInfo();
            this.<TestObject1>addObject(mapLoader, gameObject1Arr, "1", 16, mapInfoArr);
            this.<TestObject2>addObject(mapLoader, gameObject2Arr, "2", 16, mapInfoArr);
            this.<TestObject3>addObject(mapLoader, gameObject3Arr, "3", 16, mapInfoArr);
            this.<TestObject4>addObject(mapLoader, gameObject4Arr, "4", 16, mapInfoArr);
            this.<TestObject5>addObject(mapLoader, gameObject5Arr, "5", 16, mapInfoArr);
            this.<TestObject6>addObject(mapLoader, gameObject6Arr, "6", 16, mapInfoArr);
            this.<TestObject7>addObject(mapLoader, gameObject7Arr, "7", 16, mapInfoArr);
            this.<TestObject8>addObject(mapLoader, gameObject8Arr, "8", 16, mapInfoArr);
            this.<TestObject9>addObject(mapLoader, gameObject9Arr, "9", 16, mapInfoArr);
            this.<TestObject10>addObject(mapLoader, gameObject10Arr, "10", 16, mapInfoArr);
            this.<TestObject11>addObject(mapLoader, gameObject11Arr, "11", 16, mapInfoArr);

            if (Global.IS_DEBUG) {
                for (int i = 0; i < mapInfoArr.size(); i++) {    //  這邊可以看array內容  {String name ,int x, int y, int xSize, int ySize}
                    System.out.println(mapInfoArr.get(i).getName());
                    System.out.println(mapInfoArr.get(i).getX());
                    System.out.println(mapInfoArr.get(i).getY());
                    System.out.println(mapInfoArr.get(i).getSizeX());
                    System.out.println(mapInfoArr.get(i).getSizeY());
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(MapScene.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void sceneEnd() {

    }

    @Override
    public void paint(Graphics g) {
        gameObject1Arr.forEach(a -> a.paint(g));
        gameObject2Arr.forEach(a -> a.paint(g));
        gameObject3Arr.forEach(a -> a.paint(g));
        gameObject4Arr.forEach(a -> a.paint(g));
        gameObject5Arr.forEach(a -> a.paint(g));
        gameObject6Arr.forEach(a -> a.paint(g));
        gameObject7Arr.forEach(a -> a.paint(g));
        gameObject8Arr.forEach(a -> a.paint(g));
        gameObject9Arr.forEach(a -> a.paint(g));
        gameObject10Arr.forEach(a -> a.paint(g));
        gameObject11Arr.forEach(a -> a.paint(g));
    }

    @Override
    public void update() {

    }

    @Override
    public CommandSolver.MouseCommandListener mouseListener() {
        return null;
    }

    @Override
    public CommandSolver.KeyListener keyListener() {
        return null;
    }

    public static <T> void addObject(MapLoader mapLoader, ArrayList<T> gameObjectArr, String s, int size, ArrayList<MapInfo> mapInfo) {
        ArrayList<T> tmp = new ArrayList();
        tmp = mapLoader.creatObjectArray(s, size, mapInfo, new MapLoader.CompareClass() {
            @Override
            public GameObject compareClassName(String gameObject, String name, MapInfo mapInfo, int size) {
                GameObject tmp = null;
                if (gameObject.equals(name)) {
                    try {
                        if (s.equals("1")) {
                            tmp = new TestObject1(mapInfo.getX() * size + size / 2 * mapInfo.getSizeX(), mapInfo.getY() * size + +size / 2 * mapInfo.getSizeY(),
                                    mapInfo.getSizeX() * size, mapInfo.getSizeY() * size);
                        }
                        if (s.equals("2")) {
                            tmp = new TestObject2(mapInfo.getX() * size + size / 2 * mapInfo.getSizeX(), mapInfo.getY() * size + +size / 2 * mapInfo.getSizeY(),
                                    mapInfo.getSizeX() * size, mapInfo.getSizeY() * size);
                        }
                        if (s.equals("3")) {
                            tmp = new TestObject3(mapInfo.getX() * size + size / 2 * mapInfo.getSizeX(), mapInfo.getY() * size + +size / 2 * mapInfo.getSizeY(),
                                    mapInfo.getSizeX() * size, mapInfo.getSizeY() * size);
                        }
                        if (s.equals("4")) {
                            tmp = new TestObject4(mapInfo.getX() * size + size / 2 * mapInfo.getSizeX(), mapInfo.getY() * size + +size / 2 * mapInfo.getSizeY(),
                                    mapInfo.getSizeX() * size, mapInfo.getSizeY() * size);
                        }
                        if (s.equals("5")) {
                            tmp = new TestObject5(mapInfo.getX() * size + size / 2 * mapInfo.getSizeX(), mapInfo.getY() * size + +size / 2 * mapInfo.getSizeY(),
                                    mapInfo.getSizeX() * size, mapInfo.getSizeY() * size);
                        }
                        if (s.equals("6")) {
                            tmp = new TestObject6(mapInfo.getX() * size + size / 2 * mapInfo.getSizeX(), mapInfo.getY() * size + +size / 2 * mapInfo.getSizeY(),
                                    mapInfo.getSizeX() * size, mapInfo.getSizeY() * size);
                        }
                        if (s.equals("7")) {
                            tmp = new TestObject7(mapInfo.getX() * size + size / 2 * mapInfo.getSizeX(), mapInfo.getY() * size + +size / 2 * mapInfo.getSizeY(),
                                    mapInfo.getSizeX() * size, mapInfo.getSizeY() * size);
                        }
                        if (s.equals("8")) {
                            tmp = new TestObject8(mapInfo.getX() * size + size / 2 * mapInfo.getSizeX(), mapInfo.getY() * size + +size / 2 * mapInfo.getSizeY(),
                                    mapInfo.getSizeX() * size, mapInfo.getSizeY() * size);
                        }
                        if (s.equals("9")) {
                            tmp = new TestObject9(mapInfo.getX() * size + size / 2 * mapInfo.getSizeX(), mapInfo.getY() * size + +size / 2 * mapInfo.getSizeY(),
                                    mapInfo.getSizeX() * size, mapInfo.getSizeY() * size);
                        }
                        if (s.equals("10")) {
                            tmp = new TestObject10(mapInfo.getX() * size + size / 2 * mapInfo.getSizeX(), mapInfo.getY() * size + +size / 2 * mapInfo.getSizeY(),
                                    mapInfo.getSizeX() * size, mapInfo.getSizeY() * size);
                        }
                        if (s.equals("11")) {
                            tmp = new TestObject11(mapInfo.getX() * size + size / 2 * mapInfo.getSizeX(), mapInfo.getY() * size + +size / 2 * mapInfo.getSizeY(),
                                    mapInfo.getSizeX() * size, mapInfo.getSizeY() * size);
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(MapScene.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    return tmp;
                }
                return null;
            }
        });
        tmp.forEach(a -> gameObjectArr.add(a));
    }
}
