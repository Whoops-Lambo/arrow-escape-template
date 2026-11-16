package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import com.google.android.gms.internal.ads.zzayj;
import com.google.android.gms.internal.ads.zzazk;
import com.google.android.gms.internal.ads.zzazv;
import com.google.android.gms.internal.ads.zzgfx;
import com.google.android.gms.internal.ads.zzggx;
import com.google.android.gms.internal.ads.zzgko;
import com.google.android.gms.internal.ads.zzglw;
import com.google.android.gms.internal.ads.zzgsw;
import com.google.android.gms.internal.ads.zzhbw;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class em4 extends zzglw {
    public final Map f;
    public final Context g;
    public final zzggx h;
    public final zzgsw i;
    public final long j;
    public final long k;

    public em4(zzayj zzayjVar, zzgko zzgkoVar, Map map, Context context, zzggx zzggxVar, zzgfx zzgfxVar, zzgsw zzgswVar) {
        super("kXv0ENGOypCSvw/QoVNHw70O+PaytBAWRDd5U4noknAjfuV1QTZ/52HgaGUZXFee", "O9fx1nhHvikvIrQ//tjUB0SSdZu8nQq/4KiqLm3acrQ=", zzayjVar, zzgkoVar, zzgswVar.a(113));
        this.g = context;
        this.f = map;
        this.h = zzggxVar;
        this.i = zzgswVar;
        this.j = zzgfxVar.g0();
        this.k = zzgfxVar.h0();
    }

    @Override // com.google.android.gms.internal.ads.zzglw
    public final void a(Method method, zzayj zzayjVar) {
        String strEncodeToString;
        zzazk zzazkVar;
        Object[] objArr = (Object[]) method.invoke("", this.g, Integer.valueOf(this.h.ordinal()));
        objArr.getClass();
        String strG0 = "E";
        try {
            ListenableFuture listenableFuture = (ListenableFuture) this.f.get("gs");
            if (listenableFuture != null && ((Build.VERSION.SDK_INT < 31 || listenableFuture.isDone()) && (zzazkVar = (zzazk) listenableFuture.get(this.j, TimeUnit.MILLISECONDS)) != null && zzazkVar.G0().length() > 1)) {
                strG0 = zzazkVar.G0();
            }
        } catch (ClassCastException | ExecutionException unused) {
        } catch (InterruptedException unused2) {
            Thread.currentThread().interrupt();
        } catch (TimeoutException unused3) {
            this.i.b(128);
        }
        if (strG0.equals("E")) {
            try {
                ListenableFuture listenableFuture2 = (ListenableFuture) this.f.get("ai");
                if (listenableFuture2 != null) {
                    String str = (String) listenableFuture2.get(this.k, TimeUnit.MILLISECONDS);
                    if (!ep0.Q(str)) {
                        strG0 = str;
                    }
                }
            } catch (ClassCastException | ExecutionException unused4) {
            } catch (InterruptedException unused5) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused6) {
                this.i.b(129);
            }
        }
        Boolean bool = (Boolean) objArr[5];
        Long l = (Long) objArr[6];
        synchronized (zzayjVar) {
            try {
                Object obj = objArr[4];
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    strEncodeToString = Base64.encodeToString(zzhbw.c.j().f(bArr.length, bArr).getBytes(StandardCharsets.UTF_8), 11);
                } else {
                    strEncodeToString = (String) obj;
                }
                long jLongValue = ((Long) objArr[0]).longValue();
                zzayjVar.l();
                ((zzazk) zzayjVar.b).L(jLongValue);
                String str2 = (String) objArr[1];
                zzayjVar.l();
                ((zzazk) zzayjVar.b).K(str2);
                String str3 = (String) objArr[2];
                zzayjVar.l();
                ((zzazk) zzayjVar.b).U(str3);
                String str4 = (String) objArr[3];
                zzayjVar.l();
                ((zzazk) zzayjVar.b).V(str4);
                zzayjVar.l();
                ((zzazk) zzayjVar.b).G(strEncodeToString);
                zzayjVar.l();
                ((zzazk) zzayjVar.b).F(strG0);
                if (bool != null) {
                    zzazv zzazvVar = bool.booleanValue() ? zzazv.ENUM_TRUE : zzazv.ENUM_FALSE;
                    zzayjVar.l();
                    ((zzazk) zzayjVar.b).r0(zzazvVar);
                }
                if (l != null) {
                    zzazv zzazvVarA = zzazv.a(l.intValue());
                    if (zzazvVarA == null) {
                        throw null;
                    }
                    zzayjVar.l();
                    ((zzazk) zzayjVar.b).D0(zzazvVarA);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
