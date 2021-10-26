# Game Map Generator

2D 遊戲地圖產生器

用於2D遊戲物件的地圖位置佈置。

以Netbaens的內建GUI Editor進行畫面的配置，
各按鈕及繪圖區進行個別的處理，

程式內容 主要處理 按鈕及滑鼠的判定及繪圖控制 及 BMP檔案修改及輸出輸入

## 程式執行

方式一 : 專案夾檔案的Dist內的 MapGenerator.jar，直接點擊執行。
方式二 : 開啟新專案後，將資料複製到新專案內，對程式碼進行優化後，再編譯執行。

## 程式重點內容

* jFileChooser 
	* 在圖片按鈕設定時，進行檔案的選擇，可使用Filter設定可看到的副檔名類型。
	* 在輸出/載入地圖資訊時，進行資料夾的選擇。
```
	JFileChooser chooser = new JFileChooser();
    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	//....
```

* jColorChooser
	* 在圖片按鈕設定時，進行顏色的選擇。
```
	color = JColorChooser.showDialog(null, "color", Color.black);
```
* jScrollPane 
	* 一個scrollPane僅能放入一個物件，因繪圖區須依照座標繪製按鈕或進行圖片繪製，
故在Scrollpane上，放一個JPanel處理。


* jPanel 
	* 物件可在Jpanel內，依據座標進行按鈕的放置，以及圖形繪製。
```
	jPanel3.add(jb);
	jPanel3.repaint();
	//...
	
	Graphics g = jPanel1.getGraphics();
    g.clearRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
	//...
	g.drawImage(tmp.get(0).Image(), i * paintHeight, j * paintHeight, tmp.get(0).iconW * paintHeight, tmp.get(0).iconH * paintHeight, null);
	//...
```

* BMP
	* 地圖物件的操作，與遊戲地圖相對應的座標，進行物件對應顏色的填入
```
	bitmap.setRGB(x + i, y + j, editJB.color().getRGB());//地圖相對位置
```

* jButton
	* 在進行 圖片選擇、顏色選擇、增加圖片物件、設定地圖尺寸、檔案輸出/載入、Zoom in/Zoom out等功能，都使用到按鈕操作。

## 使用說明

請參考   [使用說明]( https://github.com/HankGuo93/Game-Maploader-and-Generator/blob/master/mapgenerator-feature-mapgen/Map%20Generator%20user%20menual.md )

## 相關項目

需搭配 [地圖載入器](https://github.com/HankGuo93/Game-Maploader-and-Generator/tree/master/maploaderSample) 使用

## 團隊成員
* 呂健羽 郭漢均
