package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfxc {
    public static final zzfxh a(Context context, String str) {
        if (str != null && context != null) {
            try {
                if ("FireTVFOSDAT".equals(str)) {
                    return new zzfxh(context);
                }
            } catch (Exception e) {
                zzfyu.a("Error creating attestation mechanism: ".concat(str), e);
                return null;
            }
        }
        return null;
    }
}
