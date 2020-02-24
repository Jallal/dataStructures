/*
* CIS566 Project 1
* Author : Jallal elhazzat
* */

package designPatterns.singltonPattern;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SingletonAbstractFactory_DesignPatterns_proj1 {


    /* The main entry to the program*/
    public static void main(String[] args) throws FileNotFoundException {

        Scanner readConfigurationFile = new Scanner(new File("configuration.txt"));

        String data = "";
        while (readConfigurationFile.hasNextLine()) {
            data = readConfigurationFile.nextLine();
            WordProcessingFactory factory = new WordProcessingFactory();
            WordProcessingTester test = new WordProcessingTester(factory);
            test.testWordProcessingGui(data);
        }
        readConfigurationFile.close();
    }

    /* Parent class to the word processing applications*/
    public abstract static class WordProcessingApplication {

        public String name;

        public abstract void panel();

        public abstract void button();

        public abstract void textbox();
    }




    public static class WordProcessingFactory {


        public WordProcessingApplication createWordProcessingApp(String generation) {
            WordProcessingApplication app = null;
            if (generation.equalsIgnoreCase("word00")) {
                app = Word00.getWord00Instance();

            } else if (generation.equalsIgnoreCase("word10")) {
                app = Word10.getWord10Instance();

            } else if (generation.equalsIgnoreCase("word20")) {
                app = Word20.getWord20Instance();

            } else if (generation.equalsIgnoreCase("word90")) {
                app = Word90.getWord90Instance();
            }
            return app;
        }
    }

    /* The object that that test each individual word processing*/
    public static class WordProcessingTester {

        private WordProcessingFactory factory;

        public WordProcessingTester(WordProcessingFactory factory) {
            this.factory = factory;
        }

        public void testWordProcessingGui(String generation) {
            WordProcessingApplication currentApp = this.factory.createWordProcessingApp(generation);
            if (null != currentApp) {
                System.out.println("Testing " + currentApp.name);
                currentApp.panel();
                currentApp.button();
                currentApp.textbox();
            } else {
                System.out.println("Testing this generation is not supported :" + generation);
            }
        }

    }

    /* Singleton Word00  the contractor is private to ensure we only have one instance*/
    public static class Word00 extends WordProcessingApplication {

        private static Word00 word00 = null;

        private Word00() {

            this.name = "Word00";

        }

        public static Word00 getWord00Instance() {
            if (null == word00) {
                word00 = new Word00();
            }
            return word00;
        }


        @Override
        public void panel() {
            System.out.print("Panel Word00 \n");

        }

        @Override
        public void button() {
            System.out.print("Button Word00 \n");
        }

        @Override
        public void textbox() {
            System.out.print("Textbox Word00 \n");
        }
    }

    /* Singleton Word10  the contractor is private to ensure we only have one instance*/
    public static class Word10 extends WordProcessingApplication {

        private static Word10 word10 = null;

        private Word10() {
            this.name = "Word10";
        }

        public static Word10 getWord10Instance() {
            if (null == word10) {
                word10 = new Word10();
            }
            return word10;
        }

        @Override
        public void panel() {
            System.out.print("Panel Word10 \n");

        }

        @Override
        public void button() {
            System.out.print("Button Word10 \n");

        }

        @Override
        public void textbox() {
            System.out.print("Textbox Word10 \n");

        }
    }

    /* Singleton Word20  the contractor is private to ensure we only have one instance*/
    public static class Word20 extends WordProcessingApplication {

        private static Word20 word20 = null;

        private Word20() {
            this.name = "Word20";

        }

        public static Word20 getWord20Instance() {
            if (null == word20) {
                word20 = new Word20();
            }
            return word20;
        }

        @Override
        public void panel() {
            System.out.print("Panel Word20 \n");

        }

        @Override
        public void button() {
            System.out.print("Button Word20 \n");

        }

        @Override
        public void textbox() {
            System.out.print("Textbox Word20 \n");

        }
    }

    /* Singleton Word90  the contractor is private to ensure we only have one instance*/
    public static class Word90 extends WordProcessingApplication {

        private static Word90 word90 = null;

        private Word90() {
            this.name = "Word90";
        }

        public static Word90 getWord90Instance() {
            if (null == word90) {
                word90 = new Word90();
            }
            return word90;
        }

        @Override
        public void panel() {
            System.out.print("Panel Word90 \n");

        }

        @Override
        public void button() {
            System.out.print("Button Word90 \n");

        }

        @Override
        public void textbox() {
            System.out.print("Textbox Word90 \n");

        }
    }
}



