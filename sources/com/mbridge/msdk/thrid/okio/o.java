package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;
import defpackage.e32;
import io.p071bidmachine.media3.extractor.ts.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
final class o {
    final byte[] a;
    int b;
    int c;
    boolean d;
    boolean e;
    o f;
    o g;

    public final o c() {
        this.d = true;
        return new o(this.a, this.b, this.c, true, false);
    }

    public final void a(o oVar, int i) {
        if (!oVar.e) {
            e32.a();
            return;
        }
        int i2 = oVar.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (oVar.d) {
                e32.a();
                return;
            }
            int i4 = oVar.b;
            if (i3 - i4 > 8192) {
                e32.a();
                return;
            }
            byte[] bArr = oVar.a;
            System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
            oVar.c -= oVar.b;
            oVar.b = 0;
        }
        System.arraycopy(this.a, this.b, oVar.a, oVar.c, i);
        oVar.c += i;
        this.b += i;
    }

    @Nullable
    public final o b() {
        o oVar = this.f;
        o oVar2 = oVar != this ? oVar : null;
        o oVar3 = this.g;
        oVar3.f = oVar;
        this.f.g = oVar3;
        this.f = null;
        this.g = null;
        return oVar2;
    }

    public o() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public o(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    public final o a(int i) {
        o oVarA;
        if (i > 0 && i <= this.c - this.b) {
            if (i >= 1024) {
                oVarA = c();
            } else {
                oVarA = p.a();
                System.arraycopy(this.a, this.b, oVarA.a, 0, i);
            }
            oVarA.c = oVarA.b + i;
            this.b += i;
            this.g.a(oVarA);
            return oVarA;
        }
        e32.a();
        return null;
    }

    public final void a() {
        o oVar = this.g;
        if (oVar != this) {
            if (oVar.e) {
                int i = this.c - this.b;
                if (i > (8192 - oVar.c) + (oVar.d ? 0 : oVar.b)) {
                    return;
                }
                a(oVar, i);
                b();
                p.a(this);
                return;
            }
            return;
        }
        y.b();
    }

    public final o a(o oVar) {
        oVar.g = this;
        oVar.f = this.f;
        this.f.g = oVar;
        this.f = oVar;
        return oVar;
    }
}
