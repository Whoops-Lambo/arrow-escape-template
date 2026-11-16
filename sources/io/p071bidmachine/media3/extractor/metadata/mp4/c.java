package io.p071bidmachine.media3.extractor.metadata.mp4;

import io.p071bidmachine.media3.common.c0;
import io.p071bidmachine.media3.common.util.a;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class c implements c0 {
    public final ArrayList a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.a;
    }

    public c(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((b) arrayList.get(0)).b;
            for (int i = 1; i < arrayList.size(); i++) {
                if (((b) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                }
                j = ((b) arrayList.get(i)).b;
            }
        }
        a.c(!z);
    }
}
