package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzacz {
    public final ByteBuffer a = ByteBuffer.allocateDirect(500);
    public zzha b;

    public final void a(ArrayList arrayList) {
        zzha zzhaVar;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((zzgz) arrayList.get(i)).a == 1) {
                try {
                    zzhaVar = new zzha((zzgz) arrayList.get(i));
                } catch (v unused) {
                    zzhaVar = null;
                }
                this.b = zzhaVar;
            }
        }
    }
}
