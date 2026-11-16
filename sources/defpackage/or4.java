package defpackage;

import com.google.android.gms.internal.identity_googleid.zza;
import com.google.android.gms.internal.identity_googleid.zzj;
import com.google.android.gms.internal.identity_googleid.zzm;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import io.p071bidmachine.media3.extractor.ts.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class or4 extends zzm {
    public final int a;
    public int b;
    public final zzj c;

    public final Object a(int i) {
        return this.c.get(i);
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    public or4(zzj zzjVar, int i) {
        int size = zzjVar.size();
        if (i >= 0 && i <= size) {
            this.a = size;
            this.b = i;
            this.c = zzjVar;
            return;
        }
        y.p(zza.c(i, size, TTEDPEventConstants.EDP_EVENT_PROPERTY_INDEX));
        throw null;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.b;
            this.b = i + 1;
            return a(i);
        }
        d.v();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.b - 1;
            this.b = i;
            return a(i);
        }
        d.v();
        return null;
    }
}
