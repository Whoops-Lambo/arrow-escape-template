package com.google.android.gms.internal.ads;

import defpackage.ak1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfov implements Cloneable {
    public boolean a;
    public int b;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzfov clone() {
        try {
            return (zzfov) super.clone();
        } catch (CloneNotSupportedException e) {
            ak1.l(e.getMessage(), e);
            return null;
        }
    }
}
