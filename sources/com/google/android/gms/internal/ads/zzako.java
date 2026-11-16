package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzako implements zzao {
    public final ArrayList a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzako.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((zzako) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.a.toString());
    }

    public zzako(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((zzakn) arrayList.get(0)).b;
            for (int i = 1; i < arrayList.size(); i++) {
                if (((zzakn) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                }
                j = ((zzakn) arrayList.get(i)).b;
            }
        }
        zzgvz.a(!z);
    }
}
