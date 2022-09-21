package script.bubbajoe;
import script.*;
import script.library.*;

public class slavery extends script.base_script {
    public slavery() {
    }

    public int OnObjectMenuRequest(obj_id self, obj_id player, menu_info mi) throws InterruptedException {
        return SCRIPT_CONTINUE;
    }

    public int OnObjectMenuSelect(obj_id self, obj_id player, int item) throws InterruptedException {
        if (item == menu_info_types.ITEM_USE) {
            obj_id[] targetLocs = getAllObjectsWithTemplate(getLocation(self), getFloatObjVar(self, "teleporter.range"), getStringObjVar(self, "teleporter.target"));
            location dest = getLocation(targetLocs[0]);
            //warpPlayer(player, getCurrentSceneName(), dest);
            systemMsg(self, "HI!");
        }
        return SCRIPT_CONTINUE;
    }
    /*public int OnAttach(obj_id self) throws InterruptedException {
        String template = getTemplateName(self);

    }*/
}
