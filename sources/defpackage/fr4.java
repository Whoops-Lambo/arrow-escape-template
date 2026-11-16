package defpackage;

import com.google.android.gms.internal.ads.zzgyx;
import com.google.android.gms.internal.ads.zzgzj;
import com.google.android.gms.internal.ads.zzhbp;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class fr4 extends zzhbp {
    public final ar4 a;
    public Object b;
    public zzhbp c;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext() || this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            this.b = entry.getKey();
            this.c = ((zzgyx) entry.getValue()).iterator();
        }
        Object obj = this.b;
        Objects.requireNonNull(obj);
        return new AbstractMap.SimpleImmutableEntry(obj, this.c.next());
    }

    public fr4(zzgzj zzgzjVar) {
        Objects.requireNonNull(zzgzjVar);
        this.a = zzgzjVar.d.entrySet().n().listIterator(0);
        this.b = null;
        this.c = ir4.d;
    }
}
