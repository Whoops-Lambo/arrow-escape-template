package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfgg implements zzipf {
    public final zzfga a;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzipu
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer zzb() {
        Bundle bundle = this.a.a.a.getBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS);
        int i = -1;
        if (bundle != null && !bundle.isEmpty()) {
            String string = bundle.getString("query_info_type", "");
            switch (string.hashCode()) {
                case 1743582862:
                    if (string.equals("requester_type_0")) {
                        i = 0;
                    }
                    break;
                case 1743582863:
                    if (string.equals("requester_type_1")) {
                        i = 1;
                    }
                    break;
                case 1743582864:
                    if (string.equals("requester_type_2")) {
                        i = 2;
                    }
                    break;
                case 1743582865:
                    if (string.equals("requester_type_3")) {
                        i = 3;
                    }
                    break;
                case 1743582866:
                    if (string.equals("requester_type_4")) {
                        i = 4;
                    }
                    break;
                case 1743582867:
                    if (string.equals("requester_type_5")) {
                        i = 5;
                    }
                    break;
                case 1743582868:
                    if (string.equals("requester_type_6")) {
                        i = 6;
                    }
                    break;
                case 1743582869:
                    if (string.equals("requester_type_7")) {
                        i = 7;
                    }
                    break;
                case 1743582870:
                    if (string.equals("requester_type_8")) {
                        i = 8;
                    }
                    break;
            }
        }
        return Integer.valueOf(i);
    }

    public zzfgg(zzfga zzfgaVar) {
        this.a = zzfgaVar;
    }
}
