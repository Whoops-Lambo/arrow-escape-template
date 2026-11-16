package defpackage;

import com.google.android.gms.internal.ads.zzayj;
import com.google.android.gms.internal.ads.zzazk;
import com.google.android.gms.internal.ads.zzglw;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class im4 extends zzglw {
    @Override // com.google.android.gms.internal.ads.zzglw
    public final void a(Method method, zzayj zzayjVar) {
        synchronized (zzayjVar) {
            zzayjVar.l();
            ((zzazk) zzayjVar.b).P0("E");
            zzayjVar.l();
            ((zzazk) zzayjVar.b).S(0L);
            zzayjVar.l();
            ((zzazk) zzayjVar.b).s0("D");
        }
        Object[] objArr = (Object[]) method.invoke("", null);
        objArr.getClass();
        synchronized (zzayjVar) {
            String str = (String) objArr[0];
            zzayjVar.l();
            ((zzazk) zzayjVar.b).P0(str);
            long jLongValue = ((Long) objArr[1]).longValue();
            zzayjVar.l();
            ((zzazk) zzayjVar.b).S(jLongValue);
            String str2 = (String) objArr[2];
            zzayjVar.l();
            ((zzazk) zzayjVar.b).s0(str2);
        }
    }
}
