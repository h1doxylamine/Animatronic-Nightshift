package doxylamine.animatronicnightshift.entities.WitheredChica;

import doxylamine.animatronicnightshift.entities.EntityAnimatronic;
import doxylamine.animatronicnightshift.utils.SoundsRegister;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class WitheredChica extends EntityAnimatronic {
    public WitheredChica(EntityType<? extends EntityAnimatronic> type, Level level) {
        super(type, level);
    }

    @Override
    public SoundEvent getJumpscareSound() {
        return SoundsRegister.FNAF2_JUMPSCARE.get();
    }
}
