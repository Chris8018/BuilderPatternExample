public class PC {
    private String name;
    private String motherboard;
    private String cpu;
    private String gpu;

    public PC() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getCPU() {
        return cpu;
    }

    public void setCPU(String cpu) {
        this.cpu = cpu;
    }

    public String getGPU() {
        return gpu;
    }

    public void setGPU(String gpu) {
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        return name + " [motherboard: " + motherboard + ", cpu: " + cpu + ", gpu: " + gpu + "]";
    }
}
