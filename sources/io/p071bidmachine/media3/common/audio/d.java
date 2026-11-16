package io.p071bidmachine.media3.common.audio;

import defpackage.d31;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class d {
    public final d31 a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public final void e(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            for (int i = 0; i <= b(); i++) {
                if (!this.c[i].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    g gVar = (g) arrayList.get(i);
                    if (!gVar.isEnded()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : g.a;
                        long jRemaining = byteBuffer2.remaining();
                        gVar.queueInput(byteBuffer2);
                        this.c[i] = gVar.getOutput();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i].hasRemaining();
                    } else if (!this.c[i].hasRemaining() && i < b()) {
                        ((g) arrayList.get(i + 1)).queueEndOfStream();
                    }
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d31 d31Var = ((d) obj).a;
        d31 d31Var2 = this.a;
        if (d31Var2.size() != d31Var.size()) {
            return false;
        }
        for (int i = 0; i < d31Var2.size(); i++) {
            if (d31Var2.get(i) != d31Var.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final void a() {
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.d = false;
        int i = 0;
        while (true) {
            d31 d31Var = this.a;
            if (i >= d31Var.size()) {
                break;
            }
            g gVar = (g) d31Var.get(i);
            gVar.flush();
            if (gVar.isActive()) {
                arrayList.add(gVar);
            }
            i++;
        }
        this.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= b(); i2++) {
            this.c[i2] = ((g) arrayList.get(i2)).getOutput();
        }
    }

    public final int b() {
        return this.c.length - 1;
    }

    public final boolean c() {
        return this.d && ((g) this.b.get(b())).isEnded() && !this.c[b()].hasRemaining();
    }

    public final boolean d() {
        return !this.b.isEmpty();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public d(d31 d31Var) {
        this.a = d31Var;
        e eVar = e.e;
        this.d = false;
    }
}
