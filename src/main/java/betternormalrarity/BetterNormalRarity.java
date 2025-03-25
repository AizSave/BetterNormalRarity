package betternormalrarity;

import necesse.engine.modLoader.annotations.ModEntry;
import necesse.gfx.GameColor;

import java.awt.*;
import java.lang.reflect.Field;
import java.util.function.Supplier;

@ModEntry
public class BetterNormalRarity {

    public void postInit() {
        try {
            Supplier<Color> newColor = () -> new Color(100, 250, 250);

            Field description = GameColor.class.getDeclaredField("color");
            description.setAccessible(true);
            description.set(GameColor.ITEM_NORMAL, newColor);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }

}
