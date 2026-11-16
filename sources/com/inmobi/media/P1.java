package com.inmobi.media;

import defpackage.hg0;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class P1 {
    public final B1 a;
    public final LinkedHashMap b;
    public final Set c;
    public volatile Map d;

    public P1(B1 b1) {
        b1.getClass();
        this.a = b1;
        this.b = new LinkedHashMap();
        Set setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        setNewSetFromMap.getClass();
        this.c = setNewSetFromMap;
        this.d = hg0.a;
    }
}
