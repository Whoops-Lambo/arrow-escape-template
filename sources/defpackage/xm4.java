package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.internal.ads.zzane;
import com.google.android.gms.internal.ads.zzblr;
import com.google.android.gms.internal.ads.zzbmr;
import com.google.android.gms.internal.ads.zzbqr;
import com.google.android.gms.internal.ads.zzcem;
import com.google.android.gms.internal.ads.zzcy;
import com.google.android.gms.internal.ads.zzcyy;
import com.google.android.gms.internal.ads.zzczg;
import com.google.android.gms.internal.ads.zzda;
import com.google.android.gms.internal.ads.zzdqz;
import com.google.android.gms.internal.ads.zzdup;
import com.google.android.gms.internal.ads.zzexd;
import com.google.android.gms.internal.ads.zzexj;
import com.google.android.gms.internal.ads.zzffb;
import com.google.android.gms.internal.ads.zzffy;
import com.google.android.gms.internal.ads.zzfgl;
import com.google.android.gms.internal.ads.zzfjb;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzgvq;
import com.google.android.gms.internal.ads.zzheh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class xm4 implements zzgvq {
    public final /* synthetic */ int a;
    public static final /* synthetic */ xm4 b = new xm4(0);
    public static final /* synthetic */ xm4 c = new xm4(1);
    public static final /* synthetic */ xm4 d = new xm4(2);
    public static final /* synthetic */ xm4 e = new xm4(5);
    public static final /* synthetic */ xm4 f = new xm4(6);
    public static final /* synthetic */ xm4 g = new xm4(7);
    public static final /* synthetic */ xm4 h = new xm4(8);
    public static final /* synthetic */ xm4 i = new xm4(9);
    public static final /* synthetic */ xm4 j = new xm4(10);
    public static final /* synthetic */ xm4 k = new xm4(11);
    public static final /* synthetic */ xm4 l = new xm4(12);
    public static final /* synthetic */ xm4 m = new xm4(13);
    public static final /* synthetic */ xm4 n = new xm4(14);
    public static final /* synthetic */ xm4 o = new xm4(15);
    public static final /* synthetic */ xm4 p = new xm4(16);
    public static final /* synthetic */ xm4 q = new xm4(17);
    public static final /* synthetic */ xm4 r = new xm4(18);
    public static final /* synthetic */ xm4 s = new xm4(19);
    public static final /* synthetic */ xm4 t = new xm4(20);
    public static final /* synthetic */ xm4 u = new xm4(21);
    public static final /* synthetic */ xm4 v = new xm4(23);
    public static final /* synthetic */ xm4 w = new xm4(24);
    public static final /* synthetic */ xm4 x = new xm4(25);
    public static final /* synthetic */ xm4 y = new xm4(26);
    public static final /* synthetic */ xm4 z = new xm4(27);
    public static final /* synthetic */ xm4 A = new xm4(28);
    public static final /* synthetic */ xm4 B = new xm4(29);

    public /* synthetic */ xm4(int i2) {
        this.a = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgvq
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return zm4.e;
            case 1:
                return zm4.d;
            case 2:
                return qn4.a(5);
            case 3:
                zzane zzaneVar = (zzane) obj;
                if (zzaneVar == null) {
                    return null;
                }
                return zzaneVar;
            case 4:
                zzane zzaneVar2 = (zzane) obj;
                if (zzaneVar2 == null) {
                    return null;
                }
                return zzaneVar2;
            case 5:
                Throwable th = (Throwable) obj;
                kz3 kz3Var = zzbqr.a;
                if (((Boolean) zzblr.i.c()).booleanValue()) {
                    zzt.zzh().d("prepareClickUrl.attestation1", th);
                }
                return "failure_click_attok";
            case 6:
                List list = zzcem.l;
                return null;
            case 7:
                return "failure_click_attok";
            case 8:
                pq4 pq4Var = zzda.a;
                return Integer.valueOf(((zzcy) obj).p);
            case 9:
                return new zzczg((zzcyy) obj);
            case 10:
                return new zzczg((List) obj);
            case 11:
                ArrayList arrayList = new ArrayList();
                for (zzbmr zzbmrVar : (List) obj) {
                    if (zzbmrVar != null) {
                        arrayList.add(zzbmrVar);
                    }
                }
                return arrayList;
            case 12:
                ArrayList arrayList2 = new ArrayList();
                for (zzdup zzdupVar : (List) obj) {
                    if (zzdupVar != null) {
                        arrayList2.add(zzdupVar);
                    }
                }
                return arrayList2;
            case 13:
                return Collections.singletonList(zzheh.a((zzdqz) obj));
            case 14:
                return new IndexOutOfBoundsException((String) obj);
            case 15:
                return new StringIndexOutOfBoundsException((String) obj);
            case 16:
                return new StringIndexOutOfBoundsException((String) obj);
            case 17:
                ArrayList arrayList3 = (ArrayList) obj;
                return new zzexd(true != arrayList3.isEmpty() ? arrayList3 : null);
            case 18:
                AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                return new zzexj(appSetIdInfo.getId(), appSetIdInfo.getScope());
            case 19:
                return new zzffb((String) obj);
            case 20:
                return new zzffy((Bundle) obj);
            case 21:
                return new zzfgl((String) obj);
            case 22:
                return null;
            case 23:
                return (zzfjb) obj;
            case 24:
                String str = ((zzfmc) obj).b;
                if (TextUtils.isEmpty(str)) {
                    return "";
                }
                return zzl.zzj() ? "fakeForAdDebugLog" : str;
            case 25:
                String str2 = ((zzfmc) obj).a;
                if (TextUtils.isEmpty(str2)) {
                    return "";
                }
                return zzl.zzj() ? "fakeForAdDebugLog" : str2;
            case 26:
                return null;
            case 27:
                return null;
            case 28:
                return Boolean.FALSE;
            default:
                return zm4.a;
        }
    }
}
