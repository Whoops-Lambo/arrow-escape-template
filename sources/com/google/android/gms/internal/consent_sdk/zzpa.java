package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzoz;
import com.google.android.gms.internal.consent_sdk.zzpa;
import defpackage.pv1;
import defpackage.u75;
import defpackage.vq2;
import defpackage.x55;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzpa<MessageType extends zzpa<MessageType, BuilderType>, BuilderType extends zzoz<MessageType, BuilderType>> implements zzrq {
    protected int zza = 0;

    public int c(u75 u75Var) {
        throw null;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrq
    public final x55 zzk() {
        try {
            zzqm zzqmVar = (zzqm) this;
            int iZzn = zzqmVar.zzn();
            x55 x55Var = zzpm.b;
            byte[] bArr = new byte[iZzn];
            Logger logger = zzpv.b;
            c cVar = new c(bArr, iZzn);
            zzqmVar.a(cVar);
            if (cVar.e - cVar.f == 0) {
                return new x55(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            vq2.n(pv1.n("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public final void b(OutputStream outputStream) throws IOException {
        zzqm zzqmVar = (zzqm) this;
        int iZzn = zzqmVar.zzn();
        Logger logger = zzpv.b;
        if (iZzn > 4096) {
            iZzn = 4096;
        }
        d dVar = new d(outputStream, iZzn);
        zzqmVar.a(dVar);
        if (dVar.f > 0) {
            dVar.A();
        }
    }
}
