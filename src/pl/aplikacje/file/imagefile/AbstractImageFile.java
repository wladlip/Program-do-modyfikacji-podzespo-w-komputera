package pl.aplikacje.file.imagefile;

import pl.aplikacje.file.AbstractFile;
import pl.aplikacje.file.FileType;

public abstract class AbstractImageFile extends AbstractFile {

    public AbstractImageFile(String name, int size) {
        super(name, size);
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}
