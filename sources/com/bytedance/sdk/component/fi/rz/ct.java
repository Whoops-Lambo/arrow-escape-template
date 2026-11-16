package com.bytedance.sdk.component.fi.rz;

import defpackage.n30;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class ct {
    public boolean kgy = false;
    public int ahm = 10;
    public long rz = 1800000;

    public String toString() {
        StringBuilder sb = new StringBuilder("NetDomainConfig{enable=");
        sb.append(this.kgy);
        sb.append(", failCount=");
        sb.append(this.ahm);
        sb.append(", intervalMs=");
        return n30.o(sb, this.rz, '}');
    }
}
