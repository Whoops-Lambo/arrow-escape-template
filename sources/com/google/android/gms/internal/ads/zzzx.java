package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzzx {
    public static final zzzx d = new zzzx(new zzbg[0]);
    public final int a;
    public final w b;
    public int c;

    static {
        String str = zzfq.a;
        Integer.toString(0, 36);
    }

    public final zzbg a(int i) {
        return (zzbg) this.b.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzzx.class != obj.getClass()) {
            return false;
        }
        zzzx zzzxVar = (zzzx) obj;
        return this.a == zzzxVar.a && this.b.equals(zzzxVar.b);
    }

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.b.hashCode();
        this.c = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.b.toString();
    }

    public zzzx(zzbg... zzbgVarArr) {
        this.b = zzgzb.C(zzbgVarArr);
        this.a = zzbgVarArr.length;
        int i = 0;
        while (i < this.b.d) {
            int i2 = i + 1;
            int i3 = i2;
            while (true) {
                w wVar = this.b;
                if (i3 < wVar.d) {
                    if (((zzbg) wVar.get(i)).equals(this.b.get(i3))) {
                        zzeh.f("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                    i3++;
                }
            }
            i = i2;
        }
    }
}
