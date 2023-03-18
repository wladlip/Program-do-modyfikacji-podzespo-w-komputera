package pl.aplikacje;

import pl.aplikacje.drive.Drive;
import pl.aplikacje.drive.HDDDrive;
import pl.aplikacje.drive.SSDDrive;
import pl.aplikacje.file.File;
import pl.aplikacje.file.imagefile.GIFImageFile;
import pl.aplikacje.file.imagefile.JPGImageFile;
import pl.aplikacje.file.musicfile.MP3MusicFile;

public class Main {

    public static void main(String[] args) {
        GIFImageFile gif1 = new GIFImageFile("nazwa1.gif", 100);
        JPGImageFile jpg1 = new JPGImageFile("nazwa1.jpg", 200, 80);

        MP3MusicFile mp3file = new MP3MusicFile("plik.mp3", 4000, "Marilyn Manson",
                "Broken Needle", 100);

        Drive drive = new HDDDrive();
        drive.addFile(gif1);
        drive.addFile(jpg1);
        drive.addFile(mp3file);

        drive.listFiles();
        File file = drive.findFile("plik.mp3");
        System.out.println(file.getSize());
    }
}
