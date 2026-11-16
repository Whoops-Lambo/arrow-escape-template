package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Qa {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(InterfaceC4940qb<LevelPlayAdInfo> interfaceC4940qb) {
        if (interfaceC4940qb instanceof InterfaceC4940qb.b) {
            return "success";
        }
        if (interfaceC4940qb instanceof InterfaceC4940qb.a) {
            return "failure";
        }
        io.p071bidmachine.ads.networks.adaptiverendering.e.b();
        return null;
    }
}
