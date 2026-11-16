package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ۊ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C0682 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C0604 f1743;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ LinkedHashMap f1744;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Context f1745;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0445 f1746;

    public C0682(C0604 c0604, C0445 c0445, Context context, LinkedHashMap linkedHashMap) {
        this.f1743 = c0604;
        this.f1746 = c0445;
        this.f1745 = context;
        this.f1744 = linkedHashMap;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        boolean zMo766;
        AbstractC4631n.m401(new C0692(this));
        C0604 c0604 = this.f1743;
        Context context = this.f1745;
        LinkedHashMap linkedHashMap = this.f1744;
        synchronized (c0604) {
            zMo766 = AbstractC1081.m765().mo766();
        }
        if (!zMo766) {
            AbstractC4631n.m406(new C0643(c0604), AbstractC1081.m765().mo783());
        }
        AbstractC4631n.m401(new C0613(c0604, context, linkedHashMap));
    }
}
