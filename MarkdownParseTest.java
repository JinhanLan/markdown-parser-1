import static org.junit.Assert.*;
import org.junit.*;
public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    
      @Test
    public void testtestfile() throws IOException {
        String contents = Files.readString(Path.of("/Users/irislan/Documents/GitHub/markdown-parser-1/test-file.md"));
        List<String> expect = List.of("https://something.com", "some-thing.html");
        assertEquals(expect,MarkdownParse.getLinks(contents));
    }

    @Test
    public void testtestfile2() throws IOException {
        String contents = Files.readString(Path.of("/Users/irislan/Documents/GitHub/markdown-parser-1/test-file2.md"));
        List<String> expect = List.of("https://google.com", "some-thing.html");
        assertEquals(expect,MarkdownParse.getLinks(contents));
    }

    @Test
    public void testtestfile3() throws IOException {
        String contents = Files.readString(Path.of("/Users/irislan/Documents/GitHub/markdown-parser-1/test-file3.md"));
        List<String> expect = List.of("https://google.com", "some-thing.html");
        assertEquals(expect,MarkdownParse.getLinks(contents));
    }

}
