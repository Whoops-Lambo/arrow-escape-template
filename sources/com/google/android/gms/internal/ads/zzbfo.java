package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzbfo {
    public final String a;
    public final JSONObject b;
    public final String c;
    public final String d;
    public final boolean e;

    public zzbfo(String str, VersionInfoParcel versionInfoParcel, String str2, JSONObject jSONObject, boolean z) {
        this.d = versionInfoParcel.afmaVersion;
        this.b = jSONObject;
        this.c = str;
        this.a = str2;
        this.e = z;
    }
}
