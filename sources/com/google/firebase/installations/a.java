package com.google.firebase.installations;

import defpackage.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends InstallationTokenResult.Builder {
    public String a;
    public long b;
    public byte c;

    @Override // com.google.firebase.installations.InstallationTokenResult.Builder
    public final a a(String str) {
        if (str != null) {
            this.a = str;
            return this;
        }
        d.w("Null token");
        return null;
    }
}
