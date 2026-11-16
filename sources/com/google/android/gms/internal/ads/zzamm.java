package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzamm implements zzahv {
    public static final zzamm b = new zzamm(true);
    public static final zzamm c = new zzamm(false);
    public final boolean a;

    public final String toString() {
        boolean z = !this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 33);
        sb.append("IncorrectFragmentation{expected=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public zzamm(boolean z) {
        this.a = z;
    }
}
