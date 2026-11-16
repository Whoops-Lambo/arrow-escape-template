package androidx.constraintlayout.motion.widget;

import android.util.Log;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class KeyFrames {
    static {
        HashMap map = new HashMap();
        try {
            map.put("KeyAttribute", KeyAttributes.class.getConstructor(null));
            map.put("KeyPosition", KeyPosition.class.getConstructor(null));
            map.put("KeyCycle", KeyCycle.class.getConstructor(null));
            map.put("KeyTimeCycle", KeyTimeCycle.class.getConstructor(null));
            map.put("KeyTrigger", KeyTrigger.class.getConstructor(null));
        } catch (NoSuchMethodException e) {
            Log.e("KeyFrames", "unable to load", e);
        }
    }
}
