package com.inmobi.media;

import defpackage.ar1;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Nl {
    public static JSONObject a(List list) {
        list.getClass();
        JSONObject jSONObject = new JSONObject();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Dl dl = (Dl) it.next();
            if (dl instanceof Al) {
                try {
                    AbstractC4553yl abstractC4553yl = ((Al) dl).b;
                    if (abstractC4553yl instanceof C4526xl) {
                        jSONObject.put(((Al) dl).a, ((C4526xl) abstractC4553yl).a);
                    } else if (abstractC4553yl instanceof C4499wl) {
                        jSONObject.put(((Al) dl).a, ((C4499wl) abstractC4553yl).a);
                    } else {
                        throw new ar1();
                    }
                } catch (Exception e) {
                    e.getMessage();
                }
            }
        }
        return jSONObject;
    }
}
