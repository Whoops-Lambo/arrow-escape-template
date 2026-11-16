package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajt;
import com.google.android.gms.internal.p002firebaseauthapi.zzaju;
import defpackage.gt3;
import defpackage.lr3;
import defpackage.pr3;
import defpackage.pv1;
import defpackage.vq2;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzaju<MessageType extends zzaju<MessageType, BuilderType>, BuilderType extends zzajt<MessageType, BuilderType>> implements zzamv {
    protected transient int zza = 0;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final lr3 a() {
        try {
            int iC = ((zzalt) this).c(null);
            lr3 lr3Var = zzakb.b;
            byte[] bArr = new byte[iC];
            pr3 pr3Var = new pr3(bArr, iC);
            ((zzalt) this).b(pr3Var);
            if (pr3Var.z() > 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (pr3Var.z() >= 0) {
                return new lr3(bArr);
            }
            throw new IllegalStateException("Wrote more data than expected.");
        } catch (IOException e) {
            vq2.n(pv1.n("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public final byte[] f() {
        try {
            int iC = ((zzalt) this).c(null);
            byte[] bArr = new byte[iC];
            pr3 pr3Var = new pr3(bArr, iC);
            ((zzalt) this).b(pr3Var);
            if (pr3Var.z() > 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (pr3Var.z() >= 0) {
                return bArr;
            }
            throw new IllegalStateException("Wrote more data than expected.");
        } catch (IOException e) {
            vq2.n(pv1.n("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public void d(int i) {
        throw new UnsupportedOperationException();
    }

    public int e() {
        throw new UnsupportedOperationException();
    }

    public int c(gt3 gt3Var) {
        int iE = e();
        if (iE == -1) {
            int iD = gt3Var.d(this);
            d(iD);
            return iD;
        }
        return iE;
    }
}
