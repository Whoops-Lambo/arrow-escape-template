package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.vungle.ads.internal.protos.Sdk;
import java.util.EnumMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzba {
    public static final zzba f = new zzba((Boolean) null, 100, (Boolean) null, (String) null);
    public final int a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final EnumMap e;

    public static zzba c(int i, Bundle bundle) {
        if (bundle == null) {
            return new zzba((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(zzjk.class);
        for (zzjk zzjkVar : zzjj.DMA.a) {
            enumMap.put(zzjkVar, zzjl.d(bundle.getString(zzjkVar.a)));
        }
        return new zzba(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static zzba b(String str) {
        if (str == null || str.length() <= 0) {
            return f;
        }
        String[] strArrSplit = str.split(":");
        int i = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(zzjk.class);
        zzjk[] zzjkVarArr = zzjj.DMA.a;
        int length = zzjkVarArr.length;
        int i2 = 1;
        int i3 = 0;
        while (i3 < length) {
            enumMap.put(zzjkVarArr[i3], zzjl.e(strArrSplit[i2].charAt(0)));
            i3++;
            i2++;
        }
        return new zzba(enumMap, i, (Boolean) null, (String) null);
    }

    public final zzji a() {
        zzji zzjiVar = (zzji) this.e.get(zzjk.AD_USER_DATA);
        return zzjiVar == null ? zzji.UNINITIALIZED : zzjiVar;
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        for (zzjk zzjkVar : zzjj.DMA.a) {
            sb.append(":");
            sb.append(zzjl.h((zzji) this.e.get(zzjkVar)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzba)) {
            return false;
        }
        zzba zzbaVar = (zzba) obj;
        if (this.b.equalsIgnoreCase(zzbaVar.b) && Objects.equals(this.c, zzbaVar.c)) {
            return Objects.equals(this.d, zzbaVar.d);
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Boolean bool = this.c;
        if (bool == null) {
            i = 3;
        } else {
            i = true != bool.booleanValue() ? 13 : 7;
        }
        String str = this.d;
        return ((str == null ? 17 : str.hashCode()) * Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE) + this.b.hashCode() + (i * 29);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(zzjl.a(this.a));
        for (zzjk zzjkVar : zzjj.DMA.a) {
            sb.append(",");
            sb.append(zzjkVar.a);
            sb.append("=");
            zzji zzjiVar = (zzji) this.e.get(zzjkVar);
            if (zzjiVar == null) {
                sb.append("uninitialized");
            } else {
                int iOrdinal = zzjiVar.ordinal();
                if (iOrdinal == 0) {
                    sb.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb.append("denied");
                } else if (iOrdinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public zzba(Boolean bool, int i, Boolean bool2, String str) {
        zzji zzjiVar;
        EnumMap enumMap = new EnumMap(zzjk.class);
        this.e = enumMap;
        if (bool == null) {
            zzjiVar = zzji.UNINITIALIZED;
        } else if (bool.booleanValue()) {
            zzjiVar = zzji.GRANTED;
        } else {
            zzjiVar = zzji.DENIED;
        }
        enumMap.put(zzjk.AD_USER_DATA, zzjiVar);
        this.a = i;
        this.b = d();
        this.c = bool2;
        this.d = str;
    }

    public zzba(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(zzjk.class);
        this.e = enumMap2;
        enumMap2.putAll(enumMap);
        this.a = i;
        this.b = d();
        this.c = bool;
        this.d = str;
    }
}
