package io.p071bidmachine.core;

import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import io.p071bidmachine.BidMachine;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class k {
    public static final k a;
    public static final k b;
    public static final k c;
    public static final /* synthetic */ k[] d;

    static {
        k kVar = new k(BidMachine.NAME, 0);
        a = kVar;
        k kVar2 = new k(AndroidInitializeBoldSDK.MSG_NETWORK, 1);
        b = kVar2;
        k kVar3 = new k("All", 2);
        c = kVar3;
        d = new k[]{kVar, kVar2, kVar3};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) d.clone();
    }
}
