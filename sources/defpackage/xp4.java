package defpackage;

import com.google.android.gms.internal.ads.zzgvn;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgwo;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class xp4 implements Iterator {
    public String a;
    public final CharSequence c;
    public final zzgvn d;
    public final boolean e;
    public int b = 2;
    public int f = 0;
    public int g = Integer.MAX_VALUE;

    public abstract int a(int i);

    public abstract int b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int iB;
        zzgvn zzgvnVar;
        zzgvz.f(this.b != 4);
        int i = this.b;
        int i2 = i - 1;
        String string = null;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.b = 4;
            int i3 = this.f;
            while (true) {
                int i4 = this.f;
                if (i4 == -1) {
                    this.b = 3;
                    break;
                }
                int iA = a(i4);
                CharSequence charSequence = this.c;
                if (iA == -1) {
                    iA = charSequence.length();
                    this.f = -1;
                    iB = -1;
                } else {
                    iB = b(iA);
                    this.f = iB;
                }
                if (iB == i3) {
                    int i5 = iB + 1;
                    this.f = i5;
                    if (i5 > charSequence.length()) {
                        this.f = -1;
                    }
                } else {
                    while (true) {
                        zzgvnVar = this.d;
                        if (i3 >= iA || !zzgvnVar.a(charSequence.charAt(i3))) {
                            break;
                        }
                        i3++;
                    }
                    while (iA > i3) {
                        int i6 = iA - 1;
                        if (!zzgvnVar.a(charSequence.charAt(i6))) {
                            break;
                        }
                        iA = i6;
                    }
                    if (!this.e || i3 != iA) {
                        int i7 = this.g;
                        if (i7 == 1) {
                            iA = charSequence.length();
                            this.f = -1;
                            while (iA > i3) {
                                int i8 = iA - 1;
                                if (!zzgvnVar.a(charSequence.charAt(i8))) {
                                    break;
                                }
                                iA = i8;
                            }
                        } else {
                            this.g = i7 - 1;
                        }
                        string = charSequence.subSequence(i3, iA).toString();
                        break;
                    }
                    i3 = this.f;
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

    public xp4(zzgwo zzgwoVar, CharSequence charSequence) {
        this.d = zzgwoVar.a;
        this.e = zzgwoVar.b;
        this.c = charSequence;
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
