package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import defpackage.kk2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.rf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4961rf implements F1 {

    @NotNull
    public static final C4961rf a = new C4961rf();

    @NotNull
    private static final String b = "anr_reporter_watermark";

    private C4961rf() {
    }

    @Override // com.ironsource.F1
    public long a() {
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext == null) {
            return -1L;
        }
        String strC = IronSourceUtils.c(applicationContext, b, "");
        strC.getClass();
        Long lN = kk2.N(strC);
        if (lN == null) {
            return -1L;
        }
        return lN.longValue();
    }

    @Override // com.ironsource.F1
    public void a(long j) {
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        IronSourceUtils.f(applicationContext, b, String.valueOf(j));
    }
}
