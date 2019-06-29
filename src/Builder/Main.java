package Builder;

public class Main {
    public static void main(String[] args) {

        PC gamingDesktop = new PCBuilderImpl()
                .setName("Ultimate Builder.PC")
                .setMotherboard("Asus motherboard")
                .setCPU("i7 gen 8 series K")
                .setGPU("Nvidia GTX 2080")
                .build();

        System.out.println(gamingDesktop);
    }
}
