package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.InputEvent;
import com.google.android.gms.internal.ads.zzayj;
import com.google.android.gms.internal.ads.zzays;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzazk;
import com.google.android.gms.internal.ads.zzazv;
import com.google.android.gms.internal.ads.zzgko;
import com.google.android.gms.internal.ads.zzglw;
import com.google.android.gms.internal.ads.zzgsw;
import com.google.common.util.concurrent.ListenableFuture;
import com.safedk.android.analytics.brandsafety.b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class km4 extends zzglw {
    public final /* synthetic */ int f;
    public final Context g;
    public final Map h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km4(zzayj zzayjVar, zzgko zzgkoVar, Map map, Context context, zzgsw zzgswVar, int i) {
        super("dPrB1FLd/Bbo5RxKgSdvfibnIOv6FMtX1AY/D2kPsF68xRbDLjx5GOOKLLT66SVV", "W8iCLPrCMGpmWfg7tHbzyws4cx7ybwue/Yte0DtmBT8=", zzayjVar, zzgkoVar, zzgswVar.a(126));
        this.f = i;
        switch (i) {
            case 1:
                super("vNyRaB4zU49iDzJI9btlnJqCQsi6E6aIS+iXWanlIyAREoli+vP8FFBlQwxQKV4e", "7M9jM0waRvG3HUTqX6pvU9vQVA2SV4G9z9f3c0DPHGQ=", zzayjVar, zzgkoVar, zzgswVar.a(b.v));
                this.g = context;
                this.h = map;
                break;
            default:
                this.h = map;
                this.g = context;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzglw
    public final void a(Method method, zzayj zzayjVar) throws IllegalAccessException, InvocationTargetException {
        zzazk zzazkVar;
        switch (this.f) {
            case 0:
                Object objInvoke = method.invoke("", (InputEvent) this.h.get("evt"), this.g);
                objInvoke.getClass();
                Object[] objArr = (Object[]) objInvoke;
                zzays zzaysVarE = zzayt.E();
                long jLongValue = ((Long) objArr[0]).longValue();
                zzaysVarE.l();
                ((zzayt) zzaysVarE.b).F(jLongValue);
                zzazv zzazvVarA = zzazv.a(((Long) objArr[1]).intValue());
                zzazvVarA.getClass();
                zzaysVarE.l();
                ((zzayt) zzaysVarE.b).G(zzazvVarA);
                zzazv zzazvVarA2 = zzazv.a(((Long) objArr[2]).intValue());
                zzazvVarA2.getClass();
                zzaysVarE.l();
                ((zzayt) zzaysVarE.b).H(zzazvVarA2);
                synchronized (zzayjVar) {
                    zzayt zzaytVar = (zzayt) zzaysVarE.m();
                    zzayjVar.l();
                    ((zzazk) zzayjVar.b).y0(zzaytVar);
                    break;
                }
                return;
            default:
                Long lValueOf = -1L;
                try {
                    if (Build.VERSION.SDK_INT >= 30) {
                        Long l = (Long) method.invoke("", this.g);
                        if (l == null) {
                            throw null;
                        }
                        lValueOf = l;
                    } else {
                        ListenableFuture listenableFuture = (ListenableFuture) this.h.get("gs");
                        if (listenableFuture != null && listenableFuture.isDone() && (zzazkVar = (zzazk) listenableFuture.get()) != null) {
                            lValueOf = Long.valueOf(zzazkVar.J0());
                        }
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (ExecutionException unused2) {
                }
                synchronized (zzayjVar) {
                    long jLongValue2 = lValueOf.longValue();
                    zzayjVar.l();
                    ((zzazk) zzayjVar.b).m0(jLongValue2);
                    break;
                }
                return;
        }
    }
}
