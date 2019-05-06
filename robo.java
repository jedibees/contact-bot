import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class robo
{
    public static void main(String[] args) throws IOException, AWTException, InterruptedException
    {
        String[] s = {"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe" , "www.mrgcompsci.weebly.com"};
        Runtime.getRuntime().exec(s);
        Thread.sleep(2000);
        Robot r = new Robot();
        Thread.sleep(2000);
        for (int i = 0; i < 11; i++)
        {
            r.keyPress(KeyEvent.VK_TAB);
            Thread.sleep(100);
        }
        r.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        for (int i = 0; i < 7; i++)
        {
            r.keyPress(KeyEvent.VK_TAB);
            Thread.sleep(1000);
        }
        String str = "Jack and Vedant";
        StringSelection text = new StringSelection(str);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(text, text);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(500);
        str = "Bernstein and Tapiavala";
        text = new StringSelection(str);
        clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(text, text);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(500);
        str = "vtapiavala2005@gmail.com";
        text = new StringSelection(str);
        clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(text, text);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(500);
        str = "You made us too powerful. We wrote this using BlueJ. Will show you code on Monday.";
        text = new StringSelection(str);
        clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(text, text);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(500);
        str = " - Jack and Vedant.";
        text = new StringSelection(str);
        clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(text, text);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        //r.keyPress(KeyEvent.VK_ENTER);
        //r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(500);
    }
}