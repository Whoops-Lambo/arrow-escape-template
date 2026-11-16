package defpackage;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.gms.internal.ads.zzayj;
import com.google.android.gms.internal.ads.zzazi;
import com.google.android.gms.internal.ads.zzazj;
import com.google.android.gms.internal.ads.zzazk;
import com.google.android.gms.internal.ads.zzggx;
import com.google.android.gms.internal.ads.zzgko;
import com.google.android.gms.internal.ads.zzglw;
import com.google.android.gms.internal.ads.zzgsw;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class cm4 extends zzglw {
    public final /* synthetic */ int f = 2;
    public final Object g;
    public final Object h;

    public cm4(zzayj zzayjVar, zzgko zzgkoVar, DisplayMetrics displayMetrics, View view, zzgsw zzgswVar) {
        super("v/A8hKoqflb8uQc/N8/cZr4I3bjbR2AHVOWoGsz3PlSJp85s+ljQhf9E1tYq+mhV", "HSv9AQAKi+xC3Vva/4/bEBGdao0CIwcQtGQZuJDap9c=", zzayjVar, zzgkoVar, zzgswVar.a(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE));
        this.g = displayMetrics;
        this.h = view;
    }

    @Override // com.google.android.gms.internal.ads.zzglw
    public final void a(Method method, zzayj zzayjVar) throws IllegalAccessException, InvocationTargetException {
        switch (this.f) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", (View) this.h, (Activity) this.g);
                objArr.getClass();
                synchronized (zzayjVar) {
                    long jLongValue = ((Long) objArr[0]).longValue();
                    zzayjVar.l();
                    ((zzazk) zzayjVar.b).n0(jLongValue);
                    long jLongValue2 = ((Long) objArr[1]).longValue();
                    zzayjVar.l();
                    ((zzazk) zzayjVar.b).o0(jLongValue2);
                    String str = (String) objArr[2];
                    zzayjVar.l();
                    ((zzazk) zzayjVar.b).p0(str);
                    break;
                }
                return;
            case 1:
                Long[] lArr = new Long[9];
                Arrays.fill((Object[]) lArr, (Object) (-1L));
                Map map = (Map) this.g;
                Long l = (Long) map.get("tcq");
                if (l == null) {
                    l = -1L;
                }
                lArr[0] = l;
                Long l2 = (Long) map.get("tpq");
                if (l2 == null) {
                    l2 = -1L;
                }
                lArr[1] = l2;
                Long l3 = (Long) map.get("tcv");
                if (l3 == null) {
                    l3 = -1L;
                }
                lArr[2] = l3;
                Long l4 = (Long) map.get("tpv");
                if (l4 == null) {
                    l4 = -1L;
                }
                lArr[3] = l4;
                Long l5 = (Long) map.get("tchv");
                if (l5 == null) {
                    l5 = -1L;
                }
                lArr[4] = l5;
                Long l6 = (Long) map.get("tphv");
                if (l6 == null) {
                    l6 = -1L;
                }
                lArr[5] = l6;
                Long l7 = (Long) map.get("tcc");
                if (l7 == null) {
                    l7 = -1L;
                }
                lArr[6] = l7;
                Long l8 = (Long) map.get("tpc");
                if (l8 == null) {
                    l8 = -1L;
                }
                lArr[7] = l8;
                Long l9 = (Long) map.get("tst");
                if (l9 == null) {
                    l9 = -1L;
                }
                lArr[8] = l9;
                for (int i = 0; i < 9; i++) {
                    if (lArr[i] == null) {
                        lArr[i] = -1L;
                    }
                }
                Long[] lArr2 = (Long[]) method.invoke("", lArr, Integer.valueOf(((zzggx) this.h).ordinal()));
                lArr2.getClass();
                synchronized (zzayjVar) {
                    long jLongValue3 = lArr2[0].longValue();
                    zzayjVar.l();
                    ((zzazk) zzayjVar.b).B0(jLongValue3);
                    long jLongValue4 = lArr2[1].longValue();
                    zzayjVar.l();
                    ((zzazk) zzayjVar.b).J(jLongValue4);
                    long jLongValue5 = lArr2[2].longValue();
                    zzayjVar.l();
                    ((zzazk) zzayjVar.b).E(jLongValue5);
                    long jLongValue6 = lArr2[3].longValue();
                    zzayjVar.l();
                    ((zzazk) zzayjVar.b).Z0(jLongValue6);
                    long jLongValue7 = lArr2[4].longValue();
                    zzayjVar.l();
                    ((zzazk) zzayjVar.b).v0(jLongValue7);
                    long jLongValue8 = lArr2[5].longValue();
                    zzayjVar.l();
                    ((zzazk) zzayjVar.b).w0(jLongValue8);
                    long jLongValue9 = lArr2[6].longValue();
                    zzayjVar.l();
                    ((zzazk) zzayjVar.b).Y(jLongValue9);
                    long jLongValue10 = lArr2[7].longValue();
                    zzayjVar.l();
                    ((zzazk) zzayjVar.b).Z(jLongValue10);
                    break;
                }
                return;
            default:
                View view = (View) this.h;
                if (view == null) {
                    return;
                }
                Object objInvoke = method.invoke("", (DisplayMetrics) this.g, view);
                objInvoke.getClass();
                Long[] lArr3 = (Long[]) objInvoke;
                zzazi zzaziVarE = zzazj.E();
                long jLongValue11 = lArr3[2].longValue();
                zzaziVarE.l();
                ((zzazj) zzaziVarE.b).G(jLongValue11);
                long jLongValue12 = lArr3[1].longValue();
                zzaziVarE.l();
                ((zzazj) zzaziVarE.b).H(jLongValue12);
                long jLongValue13 = lArr3[0].longValue();
                zzaziVarE.l();
                ((zzazj) zzaziVarE.b).I(jLongValue13);
                long jLongValue14 = lArr3[3].longValue();
                zzaziVarE.l();
                ((zzazj) zzaziVarE.b).F(jLongValue14);
                long jLongValue15 = lArr3[4].longValue();
                zzaziVarE.l();
                ((zzazj) zzaziVarE.b).J(jLongValue15);
                synchronized (zzayjVar) {
                    zzazj zzazjVar = (zzazj) zzaziVarE.m();
                    zzayjVar.l();
                    ((zzazk) zzayjVar.b).g0(zzazjVar);
                    break;
                }
                return;
        }
    }

    public cm4(zzayj zzayjVar, zzgko zzgkoVar, View view, Activity activity, zzgsw zzgswVar) {
        super("+SmdN/T+SJ12/2R6bMUr7VI7s72fTI6GlxddYMnYcTah9HUb6c8xGwTAeRr3Svpr", "4ulfbTBLXezZNDG60Q+yn+SWSNT5N/XNQ2Lpr21+nZ8=", zzayjVar, zzgkoVar, zzgswVar.a(111));
        this.h = view;
        this.g = activity;
    }

    public cm4(zzayj zzayjVar, zzgko zzgkoVar, zzggx zzggxVar, Map map, zzgsw zzgswVar) {
        super("0HpQ0gpbJST4ZNYwXPhTXeMjfSkRocBP5HfYRD8d4QYBJUIV4KBwbcsOrHSK7j7P", "LecovlaXlBWjYI3Nn3ZnbdZIgTmw6ukRhkZgN4vrXK0=", zzayjVar, zzgkoVar, zzgswVar.a(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE));
        this.g = map;
        this.h = zzggxVar;
    }
}
