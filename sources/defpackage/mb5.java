package defpackage;

import com.google.android.gms.internal.p002firebaseauthapi.zzf;
import com.google.android.gms.internal.p002firebaseauthapi.zzm;
import com.google.android.gms.internal.p002firebaseauthapi.zzt;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class mb5 implements Iterator {
    public String b;
    public final CharSequence c;
    public final zzf d;
    public int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public int a = 2;
    public int e = 0;

    public mb5(zzt zztVar, CharSequence charSequence, Object obj, int i) {
        this.g = i;
        this.h = obj;
        this.d = zztVar.a;
        this.f = zztVar.c;
        this.c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        int iC;
        int iA;
        zzf zzfVar;
        int i = this.a;
        if (i == 4) {
            y.b();
            return false;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.a = 4;
            int i3 = this.e;
            while (true) {
                int i4 = this.e;
                if (i4 != -1) {
                    int i5 = this.g;
                    CharSequence charSequence = this.c;
                    Object obj = this.h;
                    switch (i5) {
                        case 0:
                            zzm zzmVar = (zzm) obj;
                            iC = !zzmVar.b(i4) ? -1 : zzmVar.c();
                            break;
                        default:
                            iC = ((zzf) obj).a(i4, charSequence);
                            break;
                    }
                    if (iC == -1) {
                        iC = charSequence.length();
                        this.e = -1;
                    } else {
                        switch (i5) {
                            case 0:
                                iA = ((zzm) obj).a();
                                break;
                            default:
                                iA = iC + 1;
                                break;
                        }
                        this.e = iA;
                    }
                    int i6 = this.e;
                    if (i6 == i3) {
                        int i7 = i6 + 1;
                        this.e = i7;
                        if (i7 > charSequence.length()) {
                            this.e = -1;
                        }
                    } else {
                        while (true) {
                            zzfVar = this.d;
                            if (i3 < iC && zzfVar.b(charSequence.charAt(i3))) {
                                i3++;
                            }
                        }
                        while (iC > i3 && zzfVar.b(charSequence.charAt(iC - 1))) {
                            iC--;
                        }
                        int i8 = this.f;
                        if (i8 == 1) {
                            iC = charSequence.length();
                            this.e = -1;
                            while (iC > i3 && zzfVar.b(charSequence.charAt(iC - 1))) {
                                iC--;
                            }
                        } else {
                            this.f = i8 - 1;
                        }
                        string = charSequence.subSequence(i3, iC).toString();
                    }
                } else {
                    this.a = 3;
                    string = null;
                }
            }
            this.b = string;
            if (this.a != 3) {
                this.a = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.a = 2;
            String str = this.b;
            this.b = null;
            return str;
        }
        d.v();
        return null;
    }
}
