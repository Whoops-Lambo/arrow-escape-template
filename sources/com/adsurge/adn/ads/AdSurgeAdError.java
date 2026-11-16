package com.adsurge.adn.ads;

import androidx.annotation.NonNull;
import defpackage.nj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class AdSurgeAdError {
    public static final int ERROR_CODE_AD_SERVER_ERROR = 3;
    public static final int ERROR_CODE_COMPLIANCE = 6;
    public static final int ERROR_CODE_DISPLAY_ERROR = 5;
    public static final int ERROR_CODE_INTERNAL_ERROR = 4;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 1;
    public final int a;
    public final String b;

    public int getErrorCode() {
        return this.a;
    }

    public String getErrorMsg() {
        return this.b;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AdSurgeAdError{errorCode=");
        sb.append(this.a);
        sb.append(", errorMsg=\"");
        return nj.q(sb, this.b, "\"}");
    }

    public AdSurgeAdError(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
