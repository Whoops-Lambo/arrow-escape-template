package defpackage;

import android.util.Log;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.p003activity.OnBackPressedCallback;
import com.inmobi.media.E6;
import com.inmobi.media.Ej;
import com.inmobi.media.Fh;
import com.inmobi.media.Mj;
import com.ironsource.Ed;
import com.ironsource.T0;
import com.unity3d.ads.adplayer.FullScreenWebViewDisplay;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l6 implements wr0 {
    public final /* synthetic */ int a;

    public /* synthetic */ l6(int i) {
        this.a = i;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 2;
        int i3 = 6;
        int i4 = 1;
        int i5 = 3;
        int i6 = 0;
        az2 az2Var = az2.a;
        dy dyVar = null;
        switch (i) {
            case 0:
                ((HttpsURLConnection) obj).getClass();
                return az2Var;
            case 1:
                ((HttpURLConnection) obj).getClass();
                return az2Var;
            case 2:
                CharSequence charSequence = (CharSequence) obj;
                charSequence.getClass();
                return Integer.valueOf(charSequence.length());
            case 3:
                ks ksVar = (ks) obj;
                ksVar.getClass();
                ksVar.a(l71.e, new jj(3, null));
                ksVar.a(nl0.h, new kj(i2, dyVar, i6));
                return az2Var;
            case 4:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return new hh0(((ep) entry.getKey()).a, entry.getValue());
            case 5:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                String str = (String) entry2.getKey();
                str.getClass();
                return new hh0(new ep(str), entry2.getValue());
            case 6:
                ep epVar = (ep) obj;
                epVar.getClass();
                return epVar.a;
            case 7:
                String str2 = (String) obj;
                str2.getClass();
                return new ep(str2);
            case 8:
                vy0 vy0Var = (vy0) obj;
                vy0Var.getClass();
                return Integer.valueOf(vy0Var.a.length());
            case 9:
                qy qyVar = (qy) obj;
                if (qyVar instanceof uy) {
                    return (uy) qyVar;
                }
                return null;
            case 10:
                ox0 ox0Var = (ox0) obj;
                ox0Var.getClass();
                ox0Var.c = false;
                ox0Var.a.add(new y90(i2, dyVar));
                return az2Var;
            case 11:
                ks ksVar2 = (ks) obj;
                ksVar2.getClass();
                ksVar2.a.h.f(fz0.g, new s4(i5, dyVar));
                return az2Var;
            case 12:
                return E6.a(((Integer) obj).intValue());
            case 13:
                return Ed.a((T0) obj);
            case 14:
                return Ej.a((JSONObject) obj);
            case 15:
                return Ej.c((Mj) obj);
            case 16:
                return Ej.b((Mj) obj);
            case 17:
                return Ej.a((Mj) obj);
            case 18:
                return Fh.a((String) obj);
            case 19:
                CorruptionException corruptionException = (CorruptionException) obj;
                corruptionException.getClass();
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", corruptionException);
                return l71.h;
            case 20:
                return FullScreenWebViewDisplay.onCreate$lambda$8((OnBackPressedCallback) obj);
            case 21:
                MutablePreferences mutablePreferences = (MutablePreferences) obj;
                Preferences.Key key = bx0.c;
                long j = 0;
                for (Map.Entry entry3 : mutablePreferences.a().entrySet()) {
                    if (entry3.getValue() instanceof Set) {
                        Preferences.Key key2 = (Preferences.Key) entry3.getKey();
                        Set set = (Set) entry3.getValue();
                        String strB = bx0.b(System.currentTimeMillis());
                        if (set.contains(strB)) {
                            Object[] objArr = {strB};
                            HashSet hashSet = new HashSet(1);
                            Object obj2 = objArr[0];
                            Objects.requireNonNull(obj2);
                            if (!hashSet.add(obj2)) {
                                vq2.r(obj2, "duplicate element: ");
                                return null;
                            }
                            mutablePreferences.f(key2, Collections.unmodifiableSet(hashSet));
                            j++;
                        } else {
                            mutablePreferences.e(key2);
                        }
                    }
                }
                if (j == 0) {
                    mutablePreferences.e(key);
                } else {
                    mutablePreferences.f(key, Long.valueOf(j));
                }
                return null;
            case 22:
                ks ksVar3 = (ks) obj;
                ksVar3.getClass();
                ox0 ox0Var2 = (ox0) ksVar3.b;
                List listQ0 = du.q0(ox0Var2.a);
                List listQ1 = du.q0(ox0Var2.b);
                ksVar3.a(ng1.i, new rx0(ox0Var2.c, null));
                ksVar3.a(nl0.j, new s4(listQ0, dyVar, 4));
                ksVar3.a(xw0.b, new sx0(listQ1, dyVar, i6));
                ksVar3.a(t40.f, new sx0(listQ1, dyVar, i4));
                return az2Var;
            case 23:
                zx0 zx0Var = (zx0) obj;
                zx0Var.getClass();
                xf1 xf1Var = ua0.a;
                zx0Var.e.f(fz0.m, new sa0(i5, dyVar, i6));
                fz0 fz0Var = zx0Var.f;
                tx txVar = fz0.p;
                fz0Var.f(txVar, new ta0(zx0Var, null));
                fz0Var.f(txVar, new sa0(i5, dyVar, i4));
                return az2Var;
            case 24:
                obj.getClass();
                return az2Var;
            case 25:
                ((m6) obj).getClass();
                return az2Var;
            case 26:
                ks ksVar4 = (ks) obj;
                ksVar4.getClass();
                zy0 zy0Var = (zy0) ksVar4.b;
                List<dt1> listS0 = du.s0(qh1.e0(zy0Var.b), new zm(i3));
                Charset charset = zy0Var.c;
                LinkedHashSet linkedHashSet = zy0Var.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : linkedHashSet) {
                    if (!zy0Var.b.containsKey((Charset) obj3)) {
                        arrayList.add(obj3);
                    }
                }
                List<Charset> listS1 = du.s0(arrayList, new zm(5));
                StringBuilder sb = new StringBuilder();
                for (Charset charset2 : listS1) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    charset2.getClass();
                    String strName = charset2.name();
                    strName.getClass();
                    sb.append(strName);
                }
                for (dt1 dt1Var : listS0) {
                    Charset charset3 = (Charset) dt1Var.a;
                    float fFloatValue = ((Number) dt1Var.b).floatValue();
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    double d = fFloatValue;
                    if (0.0d > d || d > 1.0d) {
                        e32.i("Check failed.");
                        return null;
                    }
                    double dP = ((double) rd1.p(100.0f * fFloatValue)) / 100.0d;
                    StringBuilder sb2 = new StringBuilder();
                    charset3.getClass();
                    String strName2 = charset3.name();
                    strName2.getClass();
                    sb2.append(strName2);
                    sb2.append(";q=");
                    sb2.append(dP);
                    sb.append(sb2.toString());
                }
                if (sb.length() == 0) {
                    charset.getClass();
                    String strName3 = charset.name();
                    strName3.getClass();
                    sb.append(strName3);
                }
                String string = sb.toString();
                Charset charset4 = (Charset) du.c0(listS1);
                if (charset4 == null) {
                    dt1 dt1Var2 = (dt1) du.c0(listS0);
                    charset4 = dt1Var2 != null ? (Charset) dt1Var2.a : null;
                    if (charset4 == null) {
                        charset4 = er.a;
                    }
                }
                ksVar4.a(uf0.c, new bz0(string, charset4, null));
                ksVar4.a(xb2.f, new cz0(charset, null));
                return az2Var;
            case 27:
                ks ksVar5 = (ks) obj;
                ksVar5.getClass();
                ((gz0) ksVar5.b).getClass();
                ksVar5.a(nl0.j, new s4(ksVar5, dyVar, i3));
                return az2Var;
            case 28:
                ks ksVar6 = (ks) obj;
                ksVar6.getClass();
                ksVar6.a(xl1.f, new s4(ksVar6, dyVar, 7));
                return az2Var;
            default:
                ks ksVar7 = (ks) obj;
                ksVar7.getClass();
                sz0 sz0Var = (sz0) ksVar7.b;
                qz0 qz0Var = sz0Var.a;
                if (qz0Var == null) {
                    s71.D("shouldRetry");
                    throw null;
                }
                pz0 pz0Var = sz0Var.b;
                if (pz0Var == null) {
                    s71.D("shouldRetryOnException");
                    throw null;
                }
                dn0 dn0Var = sz0Var.c;
                if (dn0Var == null) {
                    s71.D("delayMillis");
                    throw null;
                }
                ksVar7.a(nl0.j, new uz0(qz0Var, pz0Var, sz0Var.f, dn0Var, sz0Var.e, ksVar7, sz0Var.d, null));
                return az2Var;
        }
    }

    public /* synthetic */ l6(Object obj, int i) {
        this.a = i;
    }
}
