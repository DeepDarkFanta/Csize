public class Malloc{
    HelperMethods helperMethods = new HelperMethods();
    //проверяем на положительное
    //выделение памяти из класса Memory
    //возвращаем указатель на первый элмент этой памяти
    //

    public HelperFields malloc(long bytes){
        HelperFields helperFields = new HelperFields();
        if (bytes < 0){
            return helperFields = null;
        }
        String oc = System.getProperty("sun.arch.data.model");
        if (oc.equals("64") == true & bytes % 8 != 0){
            bytes = bytes - bytes % 8 + 8;
            helperFields.heft = bytes;
        }else if (oc.equals("32") == true & bytes % 4 != 0){
            bytes = bytes - bytes % 4 + 4;
            helperFields.heft = bytes;
        }
        helperFields.pointerOfMemory = helperMethods.setMemory();
        return helperFields;
    }

    public static void main(String[] args) {
        Malloc mall = new Malloc();
        HelperFields helperFields  = new HelperFields();

        Object b = mall.malloc(214);

        helperFields = mall.malloc(214);

        System.out.println(helperFields.heft + "   " + helperFields.pointerOfMemory);
    }
}
