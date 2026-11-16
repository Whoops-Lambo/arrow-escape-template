package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class W6 {

    @NotNull
    private final C4670ba a;

    public W6(@NotNull C4670ba c4670ba) {
        c4670ba.getClass();
        this.a = c4670ba;
    }

    public final void a(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        if (jSONObject.has(com.ironsource.mediationsdk.metadata.a.j)) {
            try {
                Object objRemove = jSONObject.remove(com.ironsource.mediationsdk.metadata.a.j);
                objRemove.getClass();
                ArrayList arrayList = (ArrayList) objRemove;
                if (!arrayList.isEmpty()) {
                    Object obj = arrayList.get(0);
                    obj.getClass();
                    this.a.e((String) obj);
                }
            } catch (ClassCastException e) {
                C4950r4.d().a(e);
                IronLog.INTERNAL.error("got the following error " + e.getMessage());
            }
        }
    }
}
