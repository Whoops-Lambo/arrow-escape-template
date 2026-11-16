package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᒣ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0820 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final C0820 f2176;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final C0774 f2177;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final C1130 m619(String str) {
        C0820 c0820;
        C1130 c1130 = (C1130) this.f2177.f2042.get(str);
        return (c1130 != null || (c0820 = this.f2176) == null) ? c1130 : c0820.m619(str);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final C1221 m621(String str) {
        C0820 c0820;
        C1221 c1221 = (C1221) this.f2177.f2043.get(str);
        return (c1221 != null || (c0820 = this.f2176) == null) ? c1221 : c0820.m621(str);
    }

    public C0820(C0774 c0774, C0820 c0820) {
        this.f2177 = c0774;
        this.f2176 = c0820;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final ArrayList m620() {
        ArrayList arrayList = new ArrayList(this.f2177.f2045);
        C0820 c0820 = this.f2176;
        if (c0820 != null) {
            arrayList.addAll(c0820.m620());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final ArrayList m622() {
        ArrayList arrayList = new ArrayList(this.f2177.f2044);
        C0820 c0820 = this.f2176;
        if (c0820 != null) {
            arrayList.addAll(c0820.m622());
        }
        return arrayList;
    }
}
