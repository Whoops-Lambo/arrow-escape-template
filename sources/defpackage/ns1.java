package defpackage;

import android.os.Looper;
import com.facebook.internal.v0;
import com.facebook.share.model.GameRequestContent;
import com.google.android.gms.internal.ads.w;
import com.google.android.gms.internal.ads.zzagu;
import com.google.android.gms.internal.ads.zzajj;
import com.google.android.gms.internal.ads.zzfz;
import com.google.android.gms.internal.ads.zzgyy;
import com.google.android.gms.internal.ads.zzgzb;
import com.google.android.gms.internal.ads.zzhcz;
import com.unity3d.services.UnityAdsConstants;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class ns1 implements zzagu {
    public static final xl1 a = new xl1(12);
    public static final String[] b = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] c = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] d = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};
    public static final /* synthetic */ int e = 0;

    public static jn1 c(JSONObject jSONObject) {
        float[] fArr;
        float[] fArr2;
        if (jSONObject == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("use_case");
            String string2 = jSONObject.getString("asset_uri");
            String strOptString = jSONObject.optString("rules_uri", null);
            int i = jSONObject.getInt("version_id");
            kn1 kn1Var = kn1.a;
            JSONArray jSONArray = jSONObject.getJSONArray("thresholds");
            Set set = lz.a;
            if (set.contains(kn1.class)) {
                fArr2 = null;
            } else {
                try {
                    if (set.contains(kn1Var) || jSONArray == null) {
                        fArr = null;
                        fArr2 = fArr;
                    } else {
                        try {
                            fArr = new float[jSONArray.length()];
                            int length = jSONArray.length();
                            for (int i2 = 0; i2 < length; i2++) {
                                try {
                                    String string3 = jSONArray.getString(i2);
                                    string3.getClass();
                                    fArr[i2] = Float.parseFloat(string3);
                                } catch (JSONException unused) {
                                }
                            }
                        } catch (Throwable th) {
                            lz.a(kn1Var, th);
                            fArr = null;
                        }
                        fArr2 = fArr;
                    }
                } catch (Throwable th2) {
                    lz.a(kn1.class, th2);
                    fArr2 = null;
                }
            }
            string.getClass();
            string2.getClass();
            return new jn1(string, string2, strOptString, i, fArr2);
        } catch (Exception unused2) {
            return null;
        }
    }

    public static void d(int i) {
        if (2 > i || i >= 37) {
            StringBuilder sbS = jc1.s(i, "radix ", " was not in valid range ");
            sbS.append(new j71(2, 36, 1));
            throw new IllegalArgumentException(sbS.toString());
        }
    }

    public static boolean m(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public abstract void G(rt4 rt4Var, Thread thread);

    public abstract void H(rt4 rt4Var, rt4 rt4Var2);

    public abstract boolean J(st4 st4Var, rt4 rt4Var, rt4 rt4Var2);

    public abstract boolean K(zzhcz zzhczVar, it4 it4Var, it4 it4Var2);

    public abstract rt4 L(zzhcz zzhczVar);

    public abstract it4 M(zzhcz zzhczVar);

    public abstract boolean N(st4 st4Var, Object obj, Object obj2);

    public static final long A(long j) {
        uf0 uf0Var = xe0.b;
        boolean z = j > 0;
        if (z) {
            return xe0.e(xe0.h(j, vk3.x(999999L, af0.NANOSECONDS)));
        }
        if (!z) {
            return 0L;
        }
        e.b();
        return 0L;
    }

    public static final pg1 D(pg1 pg1Var) {
        if (lz.a.contains(ns1.class)) {
            return null;
        }
        try {
            int[] iArr = pg1Var.a;
            int i = iArr[0];
            int i2 = iArr[1];
            pg1 pg1Var2 = new pg1(new int[]{i2, i});
            float[] fArr = pg1Var.c;
            float[] fArr2 = pg1Var2.c;
            for (int i3 = 0; i3 < i; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    fArr2[(i4 * i) + i3] = fArr[(i3 * i2) + i4];
                }
            }
            return pg1Var2;
        } catch (Throwable th) {
            lz.a(ns1.class, th);
            return null;
        }
    }

    public static final pg1 E(pg1 pg1Var) {
        if (lz.a.contains(ns1.class)) {
            return null;
        }
        try {
            int[] iArr = pg1Var.a;
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            pg1 pg1Var2 = new pg1(new int[]{i3, i2, i});
            float[] fArr = pg1Var.c;
            float[] fArr2 = pg1Var2.c;
            for (int i4 = 0; i4 < i; i4++) {
                for (int i5 = 0; i5 < i2; i5++) {
                    for (int i6 = 0; i6 < i3; i6++) {
                        fArr2[pv1.v(i5, i, i6 * i * i2, i4)] = fArr[pv1.v(i5, i3, i4 * i2 * i3, i6)];
                    }
                }
            }
            return pg1Var2;
        } catch (Throwable th) {
            lz.a(ns1.class, th);
            return null;
        }
    }

    public static void F(GameRequestContent gameRequestContent) {
        v0.N(gameRequestContent.a, "message");
        boolean z = gameRequestContent.g != null;
        kt0 kt0Var = gameRequestContent.f;
        if (z ^ (kt0Var == kt0.b || kt0Var == kt0.a)) {
            d.r("Object id should be provided if and only if action type is send or askfor");
            return;
        }
        int i = gameRequestContent.c != null ? 1 : 0;
        if (gameRequestContent.i != null) {
            i++;
        }
        if (gameRequestContent.h != null) {
            i++;
        }
        if (i <= 1) {
            return;
        }
        d.r("Parameters to, filters and suggestions are mutually exclusive");
    }

    public static w I(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        ar4 ar4Var = zzgzb.b;
        zzgyy zzgyyVar = new zzgyy();
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (zzfz.b(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strC = zzfz.c(xmlPullParser, strConcat2);
                String strC2 = zzfz.c(xmlPullParser, strConcat3);
                String strC3 = zzfz.c(xmlPullParser, strConcat4);
                String strC4 = zzfz.c(xmlPullParser, strConcat5);
                if (strC == null || strC2 == null) {
                    return w.e;
                }
                zzgyyVar.c(new zzajj(strC, strC3 != null ? Long.parseLong(strC3) : 0L, strC4 != null ? Long.parseLong(strC4) : 0L));
            }
        } while (!zzfz.a(xmlPullParser, str.concat(":Directory")));
        return zzgyyVar.f();
    }

    public static final void b(pg1 pg1Var, pg1 pg1Var2) {
        if (lz.a.contains(ns1.class)) {
            return;
        }
        try {
            pg1Var.getClass();
            pg1Var2.getClass();
            int[] iArr = pg1Var.a;
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            float[] fArr = pg1Var.c;
            float[] fArr2 = pg1Var2.c;
            for (int i4 = 0; i4 < i; i4++) {
                for (int i5 = 0; i5 < i2; i5++) {
                    for (int i6 = 0; i6 < i3; i6++) {
                        int iV = pv1.v(i5, i3, i4 * i2 * i3, i6);
                        fArr[iV] = fArr[iV] + fArr2[i6];
                    }
                }
            }
        } catch (Throwable th) {
            lz.a(ns1.class, th);
        }
    }

    public static final pg1 f(pg1[] pg1VarArr) {
        if (lz.a.contains(ns1.class)) {
            return null;
        }
        try {
            int i = pg1VarArr[0].a[0];
            int i2 = 0;
            for (pg1 pg1Var : pg1VarArr) {
                i2 += pg1Var.a[1];
            }
            pg1 pg1Var2 = new pg1(new int[]{i, i2});
            float[] fArr = pg1Var2.c;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * i2;
                for (pg1 pg1Var3 : pg1VarArr) {
                    float[] fArr2 = pg1Var3.c;
                    int i5 = pg1Var3.a[1];
                    System.arraycopy(fArr2, i3 * i5, fArr, i4, i5);
                    i4 += i5;
                }
            }
            return pg1Var2;
        } catch (Throwable th) {
            lz.a(ns1.class, th);
            return null;
        }
    }

    public static boolean g(yq2 yq2Var, Object obj) {
        Iterator it = yq2Var.b;
        if (obj == null) {
            while (it.hasNext()) {
                if (yq2Var.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(yq2Var.next())) {
                return true;
            }
        }
        return false;
    }

    public static final pg1 h(pg1 pg1Var, pg1 pg1Var2) {
        pg1 pg1Var3;
        pg1 pg1Var4 = null;
        if (lz.a.contains(ns1.class)) {
            return null;
        }
        try {
            pg1Var.getClass();
            pg1Var2.getClass();
            int[] iArr = pg1Var.a;
            int i = 0;
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int[] iArr2 = pg1Var2.a;
            int i5 = iArr2[0];
            int i6 = (i3 - i5) + 1;
            int i7 = iArr2[2];
            pg1 pg1Var5 = new pg1(new int[]{i2, i6, i7});
            float[] fArr = pg1Var.c;
            float[] fArr2 = pg1Var5.c;
            float[] fArr3 = pg1Var2.c;
            int i8 = 0;
            while (i8 < i2) {
                int i9 = i;
                while (i9 < i7) {
                    int i10 = i;
                    while (i10 < i6) {
                        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        pg1Var3 = pg1Var4;
                        int i11 = i;
                        while (i11 < i5) {
                            while (i < i4) {
                                try {
                                    f = (fArr[((i11 + i10) * i4) + (i3 * i4 * i8) + i] * fArr3[(((i11 * i4) + i) * i7) + i9]) + f;
                                    i++;
                                } catch (Throwable th) {
                                    th = th;
                                    lz.a(ns1.class, th);
                                    return pg1Var3;
                                }
                            }
                            i11++;
                            i = 0;
                        }
                        fArr2[pv1.v(i10, i7, i6 * i7 * i8, i9)] = f;
                        i10++;
                        pg1Var4 = pg1Var3;
                        i = 0;
                    }
                    i9++;
                    i = 0;
                }
                i8++;
                i = 0;
            }
            return pg1Var5;
        } catch (Throwable th2) {
            th = th2;
            pg1Var3 = null;
        }
    }

    public static final Object i(long j, dy dyVar) {
        if (j > 0) {
            qo qoVar = new qo(1, kc2.q(dyVar));
            qoVar.s();
            if (j < Long.MAX_VALUE) {
                r(qoVar.e).G(j, qoVar);
            }
            Object objR = qoVar.r();
            if (objR == dz.a) {
                return objR;
            }
        }
        return az2.a;
    }

    public static final pg1 k(pg1 pg1Var, pg1 pg1Var2, pg1 pg1Var3) {
        if (lz.a.contains(ns1.class)) {
            return null;
        }
        try {
            pg1Var.getClass();
            pg1Var2.getClass();
            pg1Var3.getClass();
            int i = pg1Var.a[0];
            int i2 = pg1Var3.a[0];
            pg1 pg1VarW = w(pg1Var, pg1Var2);
            float[] fArr = pg1Var3.c;
            float[] fArr2 = pg1VarW.c;
            for (int i3 = 0; i3 < i; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    int i5 = (i3 * i2) + i4;
                    fArr2[i5] = fArr2[i5] + fArr[i4];
                }
            }
            return pg1VarW;
        } catch (Throwable th) {
            lz.a(ns1.class, th);
            return null;
        }
    }

    public static final pg1 l(String[] strArr, pg1 pg1Var) {
        if (lz.a.contains(ns1.class)) {
            return null;
        }
        try {
            pg1Var.getClass();
            int length = strArr.length;
            int i = pg1Var.a[1];
            pg1 pg1Var2 = new pg1(new int[]{length, 128, i});
            float[] fArr = pg1Var2.c;
            float[] fArr2 = pg1Var.c;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArrC = j43.a.c(strArr[i2]);
                for (int i3 = 0; i3 < 128; i3++) {
                    System.arraycopy(fArr2, iArrC[i3] * i, fArr, (i * i3) + (i * 128 * i2), i);
                }
            }
            return pg1Var2;
        } catch (Throwable th) {
            lz.a(ns1.class, th);
            return null;
        }
    }

    public static void p(jn1 jn1Var, ArrayList arrayList) {
        File[] fileArrListFiles;
        String str = jn1Var.a;
        int i = jn1Var.d;
        File fileA = j43.a();
        if (fileA != null && (fileArrListFiles = fileA.listFiles()) != null && fileArrListFiles.length != 0) {
            String str2 = str + '_' + i;
            for (File file : fileArrListFiles) {
                String name = file.getName();
                name.getClass();
                if (kk2.L(name, str, false) && !kk2.L(name, str2, false)) {
                    file.delete();
                }
            }
        }
        String str3 = str + '_' + i;
        String str4 = jn1Var.b;
        sj0 sj0Var = new sj0(arrayList, 15);
        File file2 = new File(j43.a(), str3);
        if (file2.exists()) {
            sj0Var.a(file2);
        } else {
            new mm0(str4, file2, sj0Var).execute(new String[0]);
        }
    }

    public static final void q(pg1 pg1Var) {
        if (lz.a.contains(ns1.class)) {
            return;
        }
        try {
            pg1Var.getClass();
            int[] iArr = pg1Var.a;
            if (1 >= iArr.length) {
                return;
            }
            int length = iArr.length;
            int i = 1;
            for (int i2 = 1; i2 < length; i2++) {
                i *= pg1Var.a[i2];
            }
            int i3 = pg1Var.a[0];
            int[] iArr2 = {i3, i};
            pg1Var.a = iArr2;
            i71 it = new j71(1, 1, 1).iterator();
            while (it.d) {
                i3 *= iArr2[it.nextInt()];
            }
            float[] fArr = new float[i3];
            System.arraycopy(pg1Var.c, 0, fArr, 0, Math.min(pg1Var.b, i3));
            pg1Var.c = fArr;
            pg1Var.b = i3;
        } catch (Throwable th) {
            lz.a(ns1.class, th);
        }
    }

    public static final ab0 r(sy syVar) {
        qy qyVar = syVar.get(h42.c);
        ab0 ab0Var = qyVar instanceof ab0 ? (ab0) qyVar : null;
        return ab0Var == null ? o80.a : ab0Var;
    }

    public static final pg1 v(pg1 pg1Var, int i) {
        pg1 pg1Var2;
        pg1 pg1Var3 = null;
        if (lz.a.contains(ns1.class)) {
            return null;
        }
        try {
            pg1Var.getClass();
            int[] iArr = pg1Var.a;
            int i2 = 0;
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = (i4 - i) + 1;
            pg1 pg1Var4 = new pg1(new int[]{i3, i6, i5});
            float[] fArr = pg1Var.c;
            float[] fArr2 = pg1Var4.c;
            int i7 = 0;
            while (i7 < i3) {
                int i8 = i2;
                while (i8 < i5) {
                    int i9 = i2;
                    while (i9 < i6) {
                        int i10 = i9 * i5;
                        int i11 = (i7 * i6 * i5) + i10 + i8;
                        int i12 = (i7 * i4 * i5) + i10 + i8;
                        fArr2[i11] = Float.MIN_VALUE;
                        int i13 = i2;
                        while (i13 < i) {
                            pg1Var2 = pg1Var3;
                            try {
                                fArr2[i11] = Math.max(fArr2[i11], fArr[(i13 * i5) + i12]);
                                i13++;
                                pg1Var3 = pg1Var2;
                            } catch (Throwable th) {
                                th = th;
                                lz.a(ns1.class, th);
                                return pg1Var2;
                            }
                        }
                        i9++;
                        i2 = 0;
                    }
                    i8++;
                    i2 = 0;
                }
                i7++;
                i2 = 0;
            }
            return pg1Var4;
        } catch (Throwable th2) {
            th = th2;
            pg1Var2 = pg1Var3;
        }
    }

    public static final pg1 w(pg1 pg1Var, pg1 pg1Var2) {
        if (lz.a.contains(ns1.class)) {
            return null;
        }
        try {
            pg1Var.getClass();
            pg1Var2.getClass();
            int i = pg1Var.a[0];
            int[] iArr = pg1Var2.a;
            int i2 = iArr[0];
            int i3 = iArr[1];
            pg1 pg1Var3 = new pg1(new int[]{i, i3});
            float[] fArr = pg1Var.c;
            float[] fArr2 = pg1Var2.c;
            float[] fArr3 = pg1Var3.c;
            for (int i4 = 0; i4 < i; i4++) {
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = (i4 * i3) + i5;
                    fArr3[i6] = 0.0f;
                    for (int i7 = 0; i7 < i2; i7++) {
                        fArr3[i6] = (fArr[(i4 * i2) + i7] * fArr2[(i7 * i3) + i5]) + fArr3[i6];
                    }
                }
            }
            return pg1Var3;
        } catch (Throwable th) {
            lz.a(ns1.class, th);
            return null;
        }
    }

    public static final void x(pg1 pg1Var) {
        if (lz.a.contains(ns1.class)) {
            return;
        }
        try {
            pg1Var.getClass();
            float[] fArr = pg1Var.c;
            int length = fArr.length;
            for (int i = 0; i < length; i++) {
                if (fArr[i] < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    fArr[i] = 0.0f;
                }
            }
        } catch (Throwable th) {
            lz.a(ns1.class, th);
        }
    }

    public static final void y(pg1 pg1Var) {
        if (lz.a.contains(ns1.class)) {
            return;
        }
        try {
            pg1Var.getClass();
            int[] iArr = pg1Var.a;
            int i = iArr[0];
            int i2 = iArr[1];
            float[] fArr = pg1Var.c;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * i2;
                int i5 = i4 + i2;
                float f = Float.MIN_VALUE;
                for (int i6 = i4; i6 < i5; i6++) {
                    float f2 = fArr[i6];
                    if (f2 > f) {
                        f = f2;
                    }
                }
                float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                for (int i7 = i4; i7 < i5; i7++) {
                    float fExp = (float) Math.exp(fArr[i7] - f);
                    fArr[i7] = fExp;
                    f3 += fExp;
                }
                while (i4 < i5) {
                    fArr[i4] = fArr[i4] / f3;
                    i4++;
                }
            }
        } catch (Throwable th) {
            lz.a(ns1.class, th);
        }
    }

    public static String B(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c2 = charArray[i];
                    if (c2 >= 'A' && c2 <= 'Z') {
                        charArray[i] = (char) (c2 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String C(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c2 = charArray[i];
                    if (c2 >= 'a' && c2 <= 'z') {
                        charArray[i] = (char) (c2 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static final a13 a(String str) {
        str.getClass();
        jy2 jy2Var = new jy2();
        my2.b(jy2Var, str);
        return jy2Var.b();
    }

    public static void e(Iterator it) {
        it.getClass();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static final Object j(long j, fy fyVar) {
        Object objI = i(A(j), fyVar);
        if (objI == dz.a) {
            return objI;
        }
        return az2.a;
    }

    public static boolean n(String str, String str2) {
        char c2;
        int length = str.length();
        if (str != str2) {
            if (length == str2.length()) {
                for (int i = 0; i < length; i++) {
                    char cCharAt = str.charAt(i);
                    char cCharAt2 = str2.charAt(i);
                    if (cCharAt == cCharAt2 || ((c2 = (char) ((cCharAt | ' ') - 97)) < 26 && c2 == ((char) ((cCharAt2 | ' ') - 97)))) {
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean s(Comparator comparator, Collection collection) {
        Object objComparator;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            objComparator = ((SortedSet) collection).comparator();
            if (objComparator == null) {
                objComparator = gq1.a;
            }
        } else if (collection instanceof t31) {
            objComparator = ((t31) collection).d;
        } else {
            return false;
        }
        return comparator.equals(objComparator);
    }

    public static boolean t(char c2) {
        if (!Character.isWhitespace(c2) && !Character.isSpaceChar(c2)) {
            return false;
        }
        return true;
    }

    public static boolean u() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return true;
        }
        return false;
    }

    public static final void z(jy2 jy2Var, jy2 jy2Var2) {
        jy2Var.getClass();
        jy2Var2.getClass();
        jy2Var.d = jy2Var2.d;
        String str = jy2Var2.a;
        str.getClass();
        jy2Var.a = str;
        jy2Var.d(jy2Var2.c);
        List list = jy2Var2.h;
        list.getClass();
        jy2Var.h = list;
        jy2Var.e = jy2Var2.e;
        jy2Var.f = jy2Var2.f;
        bu1 bu1Var = new bu1(3);
        vk3.b(bu1Var, jy2Var2.i);
        jy2Var.i = bu1Var;
        jy2Var.j = new dw((au1) bu1Var);
        String str2 = jy2Var2.g;
        str2.getClass();
        jy2Var.g = str2;
        jy2Var.b = jy2Var2.b;
    }
}
