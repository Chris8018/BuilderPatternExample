interface PCBuilder {
    PC build();

    PCBuilder setName(final String name);
    PCBuilder setMotherboard(final String motherboard);
    PCBuilder setCPU(final String cpu);
    PCBuilder setGPU(final String gpu);

}
