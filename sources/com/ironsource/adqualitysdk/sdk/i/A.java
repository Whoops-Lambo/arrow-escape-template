package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.unity3d.services.core.request.WebRequestEvent;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class A implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ Y f72;

    public A(Y y) {
        this.f72 = y;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        Y y = this.f72;
        byte b = 0;
        String str = (String) arrayList.get(0);
        y.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 183181625) {
            if (iHashCode == 2066319421 && str.equals(StringFog.decrypt("zHAf7PWF\n", "ijFWoLDBfdQ=\n"))) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (!str.equals(StringFog.decrypt("Yfs7dFBYZIQ=\n", "IrR2JBwdMME=\n"))) {
            b = -1;
        }
        if (b == 0) {
            return WebRequestEvent.COMPLETE;
        }
        if (b != 1) {
            return null;
        }
        return WebRequestEvent.FAILED;
    }
}
