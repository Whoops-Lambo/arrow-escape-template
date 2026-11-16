package com.google.android.gms.internal.ads;

import android.content.Context;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzglp extends zzglw {
    public final Context f;

    public zzglp(zzayj zzayjVar, zzgko zzgkoVar, Context context, zzgsw zzgswVar) {
        super("kp8zvMvDuQEKQNS9y60L+4ulOuSXv+Gk6pn9TnrpCuaFxVpyjSfXV6pt9nOPICn2", "djkiTpDogfg+tiYFCIXATRgDiw6fJVwJuIupmpwzg0M=", zzayjVar, zzgkoVar, zzgswVar.a(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE));
        this.f = context;
    }

    @Override // com.google.android.gms.internal.ads.zzglw
    public final void a(Method method, zzayj zzayjVar) {
        Object[] objArr = (Object[]) method.invoke("", this.f);
        objArr.getClass();
        synchronized (zzayjVar) {
            long jLongValue = ((Long) objArr[0]).longValue();
            zzayjVar.l();
            ((zzazk) zzayjVar.b).R0(jLongValue);
            long jLongValue2 = ((Long) objArr[1]).longValue();
            zzayjVar.l();
            ((zzazk) zzayjVar.b).j0(jLongValue2);
        }
    }
}
