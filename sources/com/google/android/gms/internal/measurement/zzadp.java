package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzadp;
import com.google.android.gms.internal.measurement.zzadu;
import defpackage.dz4;
import defpackage.f8;
import defpackage.so3;
import defpackage.vq2;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class zzadp<MessageType extends zzadu<MessageType, BuilderType>, BuilderType extends zzadp<MessageType, BuilderType>> extends zzaca<MessageType, BuilderType> {
    public final zzadu a;
    public zzadu b;

    @Override // com.google.android.gms.internal.measurement.zzafb
    public final zzadu G() {
        boolean zM = this.b.m();
        zzadu zzaduVar = this.b;
        if (!zM) {
            return zzaduVar;
        }
        zzaduVar.p();
        return this.b;
    }

    @Override // com.google.android.gms.internal.measurement.zzafd
    public final boolean g() {
        return zzadu.w(this.b, false);
    }

    public final void l() {
        if (this.b.m()) {
            return;
        }
        zzadu zzaduVarO = this.a.o();
        so3.c.a(zzaduVarO.getClass()).b(zzaduVarO, this.b);
        this.b = zzaduVarO;
    }

    @Override // com.google.android.gms.internal.measurement.zzaca
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzadp k() {
        zzadp zzadpVar = (zzadp) this.a.y(5);
        boolean zM = this.b.m();
        zzadu zzaduVar = this.b;
        if (zM) {
            zzaduVar.p();
            zzaduVar = this.b;
        }
        zzadpVar.b = zzaduVar;
        return zzadpVar;
    }

    public final zzadu n() {
        boolean zM = this.b.m();
        zzadu zzaduVar = this.b;
        if (zM) {
            zzaduVar.p();
            zzaduVar = this.b;
        }
        zzaduVar.getClass();
        if (zzadu.w(zzaduVar, true)) {
            return zzaduVar;
        }
        throw new zzafy(zzaduVar);
    }

    public final void o(zzadu zzaduVar) {
        zzadu zzaduVar2 = this.a;
        if (zzaduVar2.equals(zzaduVar)) {
            return;
        }
        if (!this.b.m()) {
            zzadu zzaduVarO = zzaduVar2.o();
            so3.c.a(zzaduVarO.getClass()).b(zzaduVarO, this.b);
            this.b = zzaduVarO;
        }
        zzadu zzaduVar3 = this.b;
        so3.c.a(zzaduVar3.getClass()).b(zzaduVar3, zzaduVar);
    }

    public final void p(byte[] bArr, int i, zzadf zzadfVar) throws zzaeh {
        if (!this.b.m()) {
            zzadu zzaduVarO = this.a.o();
            so3.c.a(zzaduVarO.getClass()).b(zzaduVarO, this.b);
            this.b = zzaduVarO;
        }
        try {
            so3.c.a(this.b.getClass()).c(this.b, bArr, 0, i, new f8(zzadfVar));
        } catch (zzaeh e) {
            throw e;
        } catch (IOException e2) {
            vq2.n("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            dz4.f("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public zzadp(zzadu zzaduVar) {
        this.a = zzaduVar;
        if (!zzaduVar.m()) {
            this.b = zzaduVar.o();
        } else {
            defpackage.d.r("Default instance must be immutable.");
            throw null;
        }
    }
}
