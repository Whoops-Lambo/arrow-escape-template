package com.facebook.internal;

import android.content.Intent;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class j implements com.facebook.l {
    public static final com.facebook.appevents.n b = new com.facebook.appevents.n(4);
    public static final HashMap c = new HashMap();
    public final HashMap a = new HashMap();

    public final boolean a(int i, int i2, Intent intent) {
        i iVar;
        i iVar2 = (i) this.a.get(Integer.valueOf(i));
        if (iVar2 != null) {
            return iVar2.a(i2, intent);
        }
        synchronized (b) {
            iVar = (i) c.get(Integer.valueOf(i));
        }
        if (iVar != null) {
            return iVar.a(i2, intent);
        }
        return false;
    }
}
