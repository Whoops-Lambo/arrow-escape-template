package com.bytedance.sdk.component.ahm.kgy.ahm;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
final class ct {
    int ahm;
    boolean ct;
    final byte[] kgy;
    ct noq;
    int rz;
    boolean uq;
    ct yo;

    public final ct kgy() {
        this.uq = true;
        return new ct(this.kgy, this.ahm, this.rz, true, false);
    }

    public final ct ahm() {
        ct ctVar = this.noq;
        ct ctVar2 = ctVar != this ? ctVar : null;
        ct ctVar3 = this.yo;
        if (ctVar3 != null) {
            ctVar3.noq = ctVar;
        }
        ct ctVar4 = this.noq;
        if (ctVar4 != null) {
            ctVar4.yo = ctVar3;
        }
        this.noq = null;
        this.yo = null;
        return ctVar2;
    }

    public ct() {
        this.kgy = new byte[8192];
        this.ct = true;
        this.uq = false;
    }

    public ct(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.kgy = bArr;
        this.ahm = i;
        this.rz = i2;
        this.uq = z;
        this.ct = z2;
    }

    public final ct kgy(ct ctVar) {
        ctVar.yo = this;
        ctVar.noq = this.noq;
        this.noq.yo = ctVar;
        this.noq = ctVar;
        return ctVar;
    }
}
