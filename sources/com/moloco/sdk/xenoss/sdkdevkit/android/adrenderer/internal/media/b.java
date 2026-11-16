package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.inmobi.media.AbstractC4572zd;
import com.moloco.sdk.internal.MolocoLogger;
import defpackage.az2;
import defpackage.j01;
import defpackage.l01;
import defpackage.lz0;
import defpackage.zr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements zr0 {
    public final /* synthetic */ int a;

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        az2 az2Var = az2.a;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                ((j01) obj).getClass();
                return 100L;
            case 1:
                l01 l01Var = (l01) obj;
                l01Var.getClass();
                ((lz0) obj2).getClass();
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "ChunkedMediaDownloader", "Retry attempt #" + l01Var.b + " for " + l01Var.a.a, null, false, 12, null);
                return az2Var;
            case 2:
                ((Integer) obj2).intValue();
                ((j01) obj).getClass();
                return 100L;
            case 3:
                l01 l01Var2 = (l01) obj;
                l01Var2.getClass();
                ((lz0) obj2).getClass();
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "LegacyMediaDownloader", "Retry attempt #" + l01Var2.b + " for " + l01Var2.a.a, null, false, 12, null);
                return az2Var;
            case 4:
                return Boolean.valueOf(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.m.a((PackageManager) obj, (Intent) obj2));
            default:
                return AbstractC4572zd.a((Bundle) obj, (String) obj2);
        }
    }
}
