package script.theme_park.dungeon.mustafar_trials.mining_facility;

import script.library.sequencer;
import script.obj_id;

public class patrol_rt2 extends script.base_script
{
    public patrol_rt2()
    {
    }
    public int OnAttach(obj_id self) throws InterruptedException
    {
        sequencer.registerSequenceObject(self, "patrol_rt2");
        return SCRIPT_CONTINUE;
    }
}
