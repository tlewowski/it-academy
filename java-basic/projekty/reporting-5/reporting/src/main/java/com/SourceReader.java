package com;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class SourceReader {

    public List<Deal> fromCSV(Path p) throws IOException {
        return Files.lines(p).map(d -> d.split(", "))
                .map(d -> new Deal(Integer.parseInt(d[0])
                        , Integer.parseInt(d[1])
                        , Double.parseDouble(d[2])
                        , Double.parseDouble(d[3])))
                .collect(Collectors.toList());


    }

}
