package com.ironsource.adqualitysdk.sdk.i;

import java.util.Calendar;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᴰ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C0979 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0969 f2634;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ String f2635;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f2636;

    public C0979(C0969 c0969, String str, String str2) {
        this.f2634 = c0969;
        this.f2636 = str;
        this.f2635 = str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        C0969 c0969 = this.f2634;
        String str = this.f2636;
        c0969.m742(str, this.f2635);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String strM868 = AbstractC1156.m868("VNMW+pER6QgbyxI=\n", "er93ieVkmWw=\n", sb);
        String str2 = AbstractC0388.f814;
        c0969.m742(strM868, Long.toString(Calendar.getInstance().getTimeInMillis()));
        this.f2634.getClass();
    }
}
