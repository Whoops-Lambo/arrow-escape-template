package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzfzi extends zzfzj {
    public final HashSet c;
    public final JSONObject d;
    public final long e;

    public zzfzi(zzfzb zzfzbVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfzbVar);
        this.c = new HashSet(hashSet);
        this.d = jSONObject;
        this.e = j;
    }
}
