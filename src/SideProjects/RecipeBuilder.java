package SideProjects;

public class RecipeBuilder {

    public static void main(String[] args) {

        /*

        EX: file to be generated:

        recipes.remove(<gregtech:machine:420>);
        val polarizer_lv = mods.modularmachinery.RecipeBuilder.newBuilder("polarizer_lv", "gt_crafter_lv", 40);
        polarizer_lv.addEnergyPerTickInput(1000);
        polarizer_lv.addItemOutput(<gregtech:machine:420>);
        var polarizer_lv_item = [
        <gregtech:meta_item_1:14033> * 4,
        <gregtech:cable:1079> * 4,
        <gregtech:meta_item_1:14297> * 2,
        <contenttweaker:material_part:4> * 2,
        <gregtech:meta_item_1:14189> * 2,
        <gregtech:cable:5071> * 2,
        <gregtech:meta_item_1:14071> * 2,
        <gregtech:machine:501>
        ] as IItemStack[];
        for item in polarizer_lv_item {
            polarizer_lv.addItemInput(item);
        }
        polarizer_lv.build();

        //process:
        //polarizer is the name of the machine being crafted
        // _lv is added for the tier, _mv, etc

        //name = NAME_VOLTAGEtIER is assigned name

        //create this code:
        val name = mods.modularmachinery.RecipeBuilder.newBuilder("name", "gt_crafter_lv", 40);
        name.addEnergyPerTickInput(1000);
        name.addItemOutput(output);
        val name_item = [
        items
        ] as IItemStack[];
        for item in name_item {
            name.addItemInput(item);
        }
        name.build()

        */

        //save as zs



    }

}
