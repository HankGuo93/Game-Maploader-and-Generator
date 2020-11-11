package gametest7th.gameobj;

import gametest7th.controllers.SceneController;
import gametest7th.utils.Path;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

public class TestObject11 extends gametest7th.gameobj.GameObject implements gametest7th.utils.GameKernel.GameInterface {
    private Image img;
    public TestObject11(int x, int y, int width, int height) throws IOException {
        super(x, y, width, height);
        img = SceneController.instance().irc().tryGetImage(new Path().img().testImg11());
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(img, painter().left(), painter().top(),
                painter().width(), painter().height(), null);
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
