package pl.aplikacje.drive;

import pl.aplikacje.file.File;

public interface Drive {
    void addFile (File file);
    void listFiles();
    File findFile(String name);
}
