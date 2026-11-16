package com.inmobi.media;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.la, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class RunnableC4183la implements Runnable {
    public final /* synthetic */ JSONObject a;

    public RunnableC4183la(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC3890an.c()) {
            return;
        }
        AbstractC4350ra.a(this.a);
    }
}
