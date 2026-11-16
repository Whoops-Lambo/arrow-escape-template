package com.moloco.sdk.internal;

import com.moloco.sdk.publisher.MolocoAdError;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class f0 {
    public static final e0 a(String str, MolocoAdError.ErrorType errorType, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar, Map map) {
        str.getClass();
        errorType.getClass();
        cVar.getClass();
        return new e0(new MolocoAdError("Moloco", str, errorType, null, 8, null), cVar, map);
    }
}
