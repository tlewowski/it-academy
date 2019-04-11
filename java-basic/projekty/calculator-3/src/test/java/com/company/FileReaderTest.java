package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReaderTest {

    @Test
    public void testFileRead() throws IOException {
        List<String> lines = NodeReader.readLines(
                Paths.get("C:\\Users\\itaca\\calculator\\" +
                        "src\\main\\resources\\example_nodes")
        );

        Assert.assertEquals(2, lines.size());
        Assert.assertEquals("+ 2 3", lines.get(0));
        Assert.assertEquals("* 5 4", lines.get(1));
    }
}
