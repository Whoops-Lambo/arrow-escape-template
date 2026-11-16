package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzef;
import com.google.android.gms.internal.play_billing.zzeg;
import defpackage.ef4;
import defpackage.mv4;
import defpackage.pv1;
import defpackage.tf4;
import defpackage.vq2;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzeg<MessageType extends zzeg<MessageType, BuilderType>, BuilderType extends zzef<MessageType, BuilderType>> implements zzhb {
    protected transient int zza = 0;

    public final byte[] b() {
        try {
            zzfu zzfuVar = (zzfu) this;
            int iZzn = zzfuVar.zzn();
            byte[] bArr = new byte[iZzn];
            boolean z = zzfc.b;
            tf4 tf4Var = new tf4(bArr, iZzn);
            zzfuVar.a(tf4Var);
            tf4Var.a();
            return bArr;
        } catch (IOException e) {
            vq2.n(pv1.n("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public int c(mv4 mv4Var) {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhb
    public final ef4 zzj() {
        try {
            zzfu zzfuVar = (zzfu) this;
            int iZzn = zzfuVar.zzn();
            ef4 ef4Var = zzev.b;
            byte[] bArr = new byte[iZzn];
            boolean z = zzfc.b;
            tf4 tf4Var = new tf4(bArr, iZzn);
            zzfuVar.a(tf4Var);
            tf4Var.a();
            return new ef4(bArr);
        } catch (IOException e) {
            vq2.n(pv1.n("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
            return null;
        }
    }
}
