package defpackage;

import com.google.android.gms.internal.measurement.zzas;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class vu3 implements Iterator {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ zzas c;

    public /* synthetic */ vu3(zzas zzasVar, int i) {
        this.a = i;
        this.c = zzasVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.b < this.c.a.length();
            default:
                return this.b < this.c.a.length();
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i = this.a;
        zzas zzasVar = this.c;
        switch (i) {
            case 0:
                String str = zzasVar.a;
                int i2 = this.b;
                if (i2 < str.length()) {
                    this.b = i2 + 1;
                    return new zzas(String.valueOf(i2));
                }
                d.v();
                return null;
            default:
                String str2 = zzasVar.a;
                int i3 = this.b;
                if (i3 < str2.length()) {
                    this.b = i3 + 1;
                    return new zzas(String.valueOf(zzasVar.a.charAt(i3)));
                }
                d.v();
                return null;
        }
    }
}
