/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametest7th.utils;

/**
 *
 * @author user1
 */
public class Path {

    public static abstract class Flow {

        private String path;

        public Flow(String path) {
            this.path = path;
        }

        public Flow(Flow flow, String path) {
            this.path = flow.path + path;
        }

        @Override
        public String toString() {
            return path;
        }
    }

    private static class Resources extends Flow {

        private Resources() {
            super("/resources");
        }

    }

    public static class Imgs extends Flow {

        private Imgs() {
            super(new Resources(), "/imgs");
        }

        public String testImg1() {
            return this + "/1.png";
        }

        public String testImg2() {
            return this + "/2.png";
        }

        public String testImg3() {
            return this + "/3.png";
        }

        public String testImg4() {
            return this + "/4.png";
        }

        public String testImg5() {
            return this + "/5.png";
        }

        public String testImg6() {
            return this + "/6.png";
        }

        public String testImg7() {
            return this + "/7.png";
        }

        public String testImg8() {
            return this + "/8.png";
        }

        public String testImg9() {
            return this + "/9.png";
        }

        public String testImg10() {
            return this + "/10.png";
        }

        public String testImg11() {
            return this + "/11.png";
        }

        public String testImg12() {
            return this + "/12.png";
        }

        public static class Actors extends Flow {

            private Actors(Flow flow) {
                super(flow, "/actors");
            }

            public String aircraft() {
                return this + "/airplane1.png";
            }

            public String enemy() {
                return this + "/enemy1.png";
            }
        }

        public static class Objs extends Flow {

            private Objs(Flow flow) {
                super(flow, "/objs");
            }

            public String boom() {
                return this + "/boom.png";
            }

            public String boom2() {
                return this + "/boom2.png";
            }
        }

        public static class Backgrounds extends Flow {

            private Backgrounds(Flow flow) {
                super(flow, "/backgrounds");
            }

            public String sea() {
                return this + "/sea.png";
            }

            public String cloud() {
                return this + "/cloud.png";
            }
        }

        public Actors actors() {
            return new Actors(this);
        }

        public Objs objs() {
            return new Objs(this);
        }

        public Backgrounds backgrounds() {
            return new Backgrounds(this);
        }
    }

    public static class Sounds extends Flow {

        private Sounds() {
            super(new Resources(), "/sounds");
        }
    }

    public Imgs img() {
        return new Imgs();
    }

    public Sounds sound() {
        return new Sounds();
    }
}
