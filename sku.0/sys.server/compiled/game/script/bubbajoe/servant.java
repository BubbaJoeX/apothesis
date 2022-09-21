package script.bubbajoe;
import script.*;
import script.library.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Vector;

public class servant extends script.base_script
{
    public servant()
    {
    }
    public int OnObjectMenuRequest(obj_id self, obj_id player, menu_info mi) throws InterruptedException
    {
        menu_info_data data = mi.getMenuItemByType(menu_info_types.ITEM_USE);
        if (data != null)
        {
            data.setServerNotify(true);
        }
        return SCRIPT_CONTINUE;
    }
    public int OnObjectMenuSelect(obj_id self, obj_id player, int item) throws InterruptedException
    {
        if (item == menu_info_types.ITEM_USE)
        {
            if(hasObjVar(self, "servant.claimed"))
            {
                broadcast(player, "This servant has already been employed.");
            }
            setObjVar(self, "servant.owner", getFirstName(player));
            setScale(self, 0.95f);
        }
        return SCRIPT_CONTINUE;
    }
}
