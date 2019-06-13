package com;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class ReportConfigurator {
   public CompositeReporter configure(Path p) throws IOException {

       List<Reporter> lista = Files.lines(p)
               .map(s->Factory.getInstance().createReporter(s))
               .filter(r->r!=null)
               .collect(Collectors.toList());

        return new CompositeReporter(lista);
   }
}
