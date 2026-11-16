package com.iab.omid.library.vungle.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends b {
    public final HashSet<String> c;
    public final JSONObject d;
    public final long e;

    public a(b.InterfaceC0356b interfaceC0356b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0356b);
        this.c = new HashSet<>(hashSet);
        this.d = jSONObject;
        this.e = j;
    }
}
