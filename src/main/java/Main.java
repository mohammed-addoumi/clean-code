import models.Guitar;
import models.GuitarSpec;
import models.Inventory;
import models.enums.Builder;
import models.enums.Type;
import models.enums.Wood;

public class Main {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        GuitarSpec guitarSpec = GuitarSpec.builder().builder(Builder.FENDER)
                                                    .type(Type.ACOUSTIC)
                                                    .model("model1")
                                                    .backWood(Wood.INDIAN)
                                                    .topWood(Wood.BRAZILIAN)
                                                    .build();
        Guitar guitar = Guitar.builder()
                                .serialNumber("123")
                                .price(200)
                                .guitarSpec(guitarSpec)
                                .build();
        Guitar guitar1 = Guitar.builder()
                                .serialNumber("1234")
                                .price(2000)
                                .guitarSpec(guitarSpec)
                                .build();

        inventory.addGuitar(guitar1);
        inventory.addGuitar(guitar);
        System.out.println(inventory);
        System.out.printf("guitar found " + inventory.search(guitarSpec));
    }
}
