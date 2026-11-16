package defpackage;

import com.google.android.gms.internal.common.zzs;
import com.google.android.gms.internal.common.zzx;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class m85 implements Iterator {
    public String a;
    public final String c;
    public final boolean d;
    public int f;
    public final /* synthetic */ m35 g;
    public int b = 2;
    public int e = 0;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2 = this.b;
        if (i2 == 4) {
            y.b();
            return false;
        }
        int i3 = i2 - 1;
        String string = null;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            return true;
        }
        if (i3 != 2) {
            this.b = 4;
            int i4 = this.e;
            while (true) {
                int length = this.e;
                if (length == -1) {
                    this.b = 3;
                    break;
                }
                String str = this.c;
                int length2 = str.length();
                zzs.b(length, length2);
                while (true) {
                    if (length >= length2) {
                        length = -1;
                        break;
                    }
                    if (str.charAt(length) == this.g.a) {
                        break;
                    }
                    length++;
                }
                if (length == -1) {
                    length = str.length();
                    this.e = -1;
                    i = -1;
                } else {
                    i = length + 1;
                    this.e = i;
                }
                if (i == i4) {
                    int i5 = i + 1;
                    this.e = i5;
                    if (i5 > str.length()) {
                        this.e = -1;
                    }
                } else {
                    if (i4 < length) {
                        str.charAt(i4);
                    }
                    if (i4 < length) {
                        str.charAt(length - 1);
                    }
                    if (!this.d || i4 != length) {
                        int i6 = this.f;
                        if (i6 == 1) {
                            length = str.length();
                            this.e = -1;
                            if (length > i4) {
                                str.charAt(length - 1);
                            }
                        } else {
                            this.f = i6 - 1;
                        }
                        string = str.subSequence(i4, length).toString();
                        break;
                    }
                    i4 = this.e;
                }
            }
            this.a = string;
            if (this.b != 3) {
                this.b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public m85(zzx zzxVar, String str, m35 m35Var) {
        this.g = m35Var;
        zzxVar.getClass();
        this.d = zzxVar.a;
        this.f = Integer.MAX_VALUE;
        this.c = str;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.b = 2;
            String str = this.a;
            this.a = null;
            return str;
        }
        d.v();
        return null;
    }
}
