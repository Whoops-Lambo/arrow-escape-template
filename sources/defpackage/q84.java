package defpackage;

import com.google.android.gms.internal.consent_sdk.zzdj;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class q84 implements Iterator {
    public String a;
    public final String c;
    public int b = 2;
    public int d = 0;
    public int e = Integer.MAX_VALUE;

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
            int i4 = this.d;
            while (true) {
                int length = this.d;
                if (length == -1) {
                    this.b = 3;
                    break;
                }
                String str = this.c;
                int length2 = str.length();
                zzdj.b(length, length2);
                while (true) {
                    if (length >= length2) {
                        length = -1;
                        break;
                    }
                    if (str.charAt(length) == ',') {
                        break;
                    }
                    length++;
                }
                if (length == -1) {
                    length = str.length();
                    this.d = -1;
                    i = -1;
                } else {
                    i = length + 1;
                    this.d = i;
                }
                if (i != i4) {
                    if (i4 < length) {
                        str.charAt(i4);
                    }
                    if (i4 < length) {
                        str.charAt(length - 1);
                    }
                    int i5 = this.e;
                    if (i5 == 1) {
                        length = str.length();
                        this.d = -1;
                        if (length > i4) {
                            str.charAt(length - 1);
                        }
                    } else {
                        this.e = i5 - 1;
                    }
                    string = str.subSequence(i4, length).toString();
                    break;
                }
                int i6 = i + 1;
                this.d = i6;
                if (i6 > str.length()) {
                    this.d = -1;
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

    public q84(String str) {
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
