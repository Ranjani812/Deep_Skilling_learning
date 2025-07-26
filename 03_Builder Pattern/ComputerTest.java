public class ComputerTest {
    public static void main(String[] args) {
        Computer basicPC = new Computer.Builder("Intel i5", "8GB").build();

        Computer gamingPC = new Computer.Builder("Intel i9", "32GB")
                .setStorage("1TB NVMe SSD")
                .setGraphicsCard("NVIDIA RTX 4090")
                .setOperatingSystem("Windows 11 Pro")
                .build();

        Computer linuxWorkstation = new Computer.Builder("AMD Ryzen 9", "64GB")
                .setStorage("2TB SSD")
                .setOperatingSystem("Ubuntu 24.04 LTS")
                .build();

        basicPC.showConfig();
        gamingPC.showConfig();
        linuxWorkstation.showConfig();
    }
}
