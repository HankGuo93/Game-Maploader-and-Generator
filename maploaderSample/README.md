- # MapLoader

  ### **Usage**

  MapLoader : 整合讀取資料
  ReadBmp : 讀取Bmp檔，獲取各個物件座標
  ReadFile : 讀取txt檔，獲取物件類名與尺寸
  MapInfo : 儲存單一位置地圖物件資訊

  - Operation Manual:

    1. 將建構器產生之bmp、txt放進載入器資料夾中。
    2. 在場景開始時使用創建MapLoader物件，並使用combineInfo()方法產生MapInfo陣列。
    3. 對照name，即可產生對應地圖物件。

  Data format : {String name, int x, int y, int xSize, int ySize}
   ```java
   ArrayList<MapInfo> test = new MapLoader("testMAP.bmp", "Test.txt").combineInfo();
   ```

  


  ### **Maintainers**

  -    **呂健羽 郭漢均**
