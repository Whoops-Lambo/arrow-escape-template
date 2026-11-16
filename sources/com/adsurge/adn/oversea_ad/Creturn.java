package com.adsurge.adn.oversea_ad;

import defpackage.nj;

/* JADX INFO: renamed from: com.adsurge.adn.oversea_ad.return, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class Creturn {
    public String a;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CertInfo{certDerBase64=");
        if (this.a != null) {
            str = this.a.length() + "chars";
        } else {
            str = "null";
        }
        return nj.q(sb, str, "}");
    }
}
