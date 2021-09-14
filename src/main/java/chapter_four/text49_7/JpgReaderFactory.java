package chapter_four.text49_7;

/**
 * Data:2021/9/14
 * Time:15:52
 * Author:hgw
 * Description:
 */
public class JpgReaderFactory implements ImageReaderFactory{
    @Override
    public ImageReader createImageReader() {
        ImageReader imageReader = new JpgReader();
        return imageReader;
    }
}
