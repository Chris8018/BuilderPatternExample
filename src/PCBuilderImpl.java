public class PCBuilderImpl implements PCBuilder{
    private PC pcTmp;

    public PCBuilderImpl() {
        pcTmp = new PC();
    }

    @Override
    public PC build() {
        PC pc = new PC();
        pc.setName(pcTmp.getName());
        pc.setMotherboard(pcTmp.getMotherboard());
        pc.setCPU(pcTmp.getCPU());
        pc.setGPU(pcTmp.getGPU());

        return pc;
    }

    @Override
    public PCBuilder setName(final String name) {
        pcTmp.setName(name);
        return this;
    }

    @Override
    public PCBuilder setMotherboard(final String motherboard) {
        pcTmp.setMotherboard(motherboard);
        return this;
    }

    @Override
    public PCBuilder setCPU(final String cpu) {
        pcTmp.setCPU(cpu);
        return this;
    }

    @Override
    public PCBuilder setGPU(final String gpu) {
        pcTmp.setGPU(gpu);
        return this;
    }
}
