package script.bubbajoe;

import script.*;
import script.library.create;
import script.library.loot;
import script.library.utils;
import script.library.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Vector;

public class gm extends script.base_script
{
    public gm()
    {
    }
    public int OnSpeaking(obj_id self, String text) throws InterruptedException
    {
        if (text.equals("froggy"))
        {
            obj_id frog = create.object("object/tangible/terminal/terminal_character_builder.iff", getLocation(self));
            setName(frog, "Character Builder Terminal (GM)");
        }
        return SCRIPT_CONTINUE;
    }
    public int cmdDeveloper(obj_id self, obj_id target, String params, float defaultTime) throws InterruptedException
    {
        if (params.equals(""))
        {
            sendSystemMessageTestingOnly(self, "y u no pay rent");
            return SCRIPT_CONTINUE;
        }

        StringTokenizer st = new StringTokenizer(params);
        String cmd = st.nextToken();
        if (cmd.equals("reload")) {
            reloadScript(st.nextToken());
        }
        if (cmd.equals("persistArea"))
        {
            float range = utils.stringToFloat(st.nextToken());
            location targetA = getLocation(self);
            obj_id[] objects = getAllObjectsWithObjVar(targetA, range, "persister");
            for (obj_id object : objects) {
                persistObject(object);
            }
        }
        if (cmd.equals(""))
        broadcast(self, "Cannot find command.");
        return SCRIPT_CONTINUE;
    }
    /*public void grantTapes(obj_id self, String type, String skillmod, float value)
    {
        obj_id pInv = utils.getInventoryContainer(self);
        String gem = "object/tangible/gem/" + type +".iff";
        obj_id statted = create.object(gem, pInv);
        setSkillModBonus(gem, skillmod, value);
    }*/
}
