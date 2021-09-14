package chapter_four.text49_7;

/**
 * Data:2021/9/14
 * Time:15:54
 * Author:hgw
 * Description:
 */
public class client {
    public static void main(String[] args) {
        ImageReaderFactory factory;
        ImageReader imageReader;
        factory = new GifReaderFactory();
        imageReader = factory.createImageReader();
        imageReader.reader();
    }
}
