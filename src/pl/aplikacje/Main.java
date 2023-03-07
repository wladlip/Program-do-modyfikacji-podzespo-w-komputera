package pl.aplikacje;

import pl.aplikacje.drive.HDDDrive;
import pl.aplikacje.drive.SSDDrive;
import pl.aplikacje.usbdevice.MemoryStick;
import pl.aplikacje.usbdevice.Mouse;

public class Main {

    public static void main(String[] args) {
        Monitor monitor = new Monitor();
//        HDDDrive drive = new HDDDrive();
        SSDDrive drive = new SSDDrive();
        Computer computer = new Computer(monitor, drive);

//        drive.addFile(new File("jnsp.jpg"));
//        drive.listFiles();

        MemoryStick memoryStick = new MemoryStick("Pendrive");
        Mouse mouse = new Mouse("Mysz");

        computer.addUSBDevice(memoryStick);
        computer.addUSBDevice(mouse);

        memoryStick.eject();
        computer.removeUSBDevice(memoryStick);
        computer.removeUSBDevice(mouse);
    }
}
