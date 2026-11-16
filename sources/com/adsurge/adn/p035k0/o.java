package com.adsurge.adn.p035k0;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import com.adsurge.adn.p011c0.e;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class o {
    public static final String a;
    public static final int[] b;
    public static final int c;
    public static final Map d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements com.adsurge.adn.p032j0.b.InterfaceC0117b {
        public final /* synthetic */ c a;

        public a(c cVar) {
            this.a = cVar;
        }

        @Override // com.adsurge.adn.p032j0.b.InterfaceC0117b
        public void a(int i) {
            this.a.a(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements c {
        public final /* synthetic */ SparseIntArray a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ JSONArray d;
        public final /* synthetic */ d e;

        public b(SparseIntArray sparseIntArray, int i, int i2, JSONArray jSONArray, d dVar) {
            this.a = sparseIntArray;
            this.b = i;
            this.c = i2;
            this.d = jSONArray;
            this.e = dVar;
        }

        @Override // com.adsurge.adn.k0.o.c
        public void a(int i) {
            this.a.put(this.b, i);
            int size = this.a.size();
            int i2 = this.c;
            if (size != i2) {
                return;
            }
            int[] iArr = new int[i2];
            int i3 = 0;
            while (true) {
                int i4 = this.c;
                if (i3 >= i4) {
                    o.a(this.d, iArr, i4, this.e);
                    return;
                } else {
                    iArr[i3] = this.a.valueAt(i3);
                    i3++;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface c {
        void a(int i);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface d {
        void a(Object[] objArr);
    }

    public static void a(h hVar, e eVar, d dVar) {
        int length;
        Object objD = hVar.d(new JSONObject[0]);
        if (objD instanceof String) {
            try {
                objD = new JSONArray(objD.toString());
            } catch (Throwable unused) {
                com.adsurge.adn.J0.a.b(a, "not a JSONArray");
            }
        }
        if (!(objD instanceof JSONArray)) {
            dVar.a(null);
            return;
        }
        JSONArray jSONArray = (JSONArray) objD;
        if (jSONArray.length() < 2) {
            dVar.a(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONArray.optJSONArray(0);
        if (jSONArrayOptJSONArray == null || (length = jSONArrayOptJSONArray.length()) < 2) {
            dVar.a(null);
            return;
        }
        SparseIntArray sparseIntArray = new SparseIntArray(length);
        for (int i = 0; i < length; i++) {
            Object objOpt = jSONArrayOptJSONArray.opt(i);
            if (objOpt == null) {
                dVar.a(null);
                return;
            }
            a(m.c(objOpt), eVar, new b(sparseIntArray, i, length, jSONArray, dVar));
        }
    }

    public static int[] b(h hVar, com.adsurge.adn.p038l0.b bVar) {
        int[] iArr = new int[4];
        Object objD = hVar.d(new JSONObject[0]);
        if (!(objD instanceof JSONArray)) {
            return null;
        }
        JSONArray jSONArray = (JSONArray) objD;
        if (jSONArray.length() != 4) {
            return null;
        }
        for (int i = 0; i < 3; i++) {
            iArr[i] = m.c(jSONArray.opt(i)).b(new JSONObject[0]).a(bVar);
        }
        iArr[2] = (int) (((double) iArr[2]) * 0.8d);
        iArr[3] = b(m.c(jSONArray.opt(3)));
        return iArr;
    }

    public static int c(h hVar) {
        int i = 0;
        int i2 = 0;
        for (int iE = hVar.e(new JSONObject[0]); iE > 0 && i < c; iE >>= 1) {
            if ((iE & 1) > 0) {
                i2 |= b[i];
            }
            i++;
        }
        return i2;
    }

    public static int[] d(h hVar) {
        Object objD = hVar.d(new JSONObject[0]);
        if (objD instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) objD;
            if (jSONArray.length() < 2) {
                return null;
            }
            int iOptInt = jSONArray.optInt(0);
            int iOptInt2 = jSONArray.optInt(1);
            if (iOptInt >= 0 && iOptInt2 > 0 && iOptInt2 >= iOptInt) {
                return new int[]{iOptInt, iOptInt2};
            }
        }
        return null;
    }

    public static Pair e(h hVar) {
        Object objD = hVar.d(new JSONObject[0]);
        if (!(objD instanceof JSONArray)) {
            float fA = hVar.a(new JSONObject[0]);
            return new Pair(Float.valueOf(fA), Float.valueOf(fA));
        }
        JSONArray jSONArray = (JSONArray) objD;
        if (jSONArray.length() == 0) {
            return null;
        }
        return new Pair(Float.valueOf((float) jSONArray.optDouble(0, 1.0d)), Float.valueOf((float) jSONArray.optDouble(1, 1.0d)));
    }

    public static Pair f(h hVar) {
        Object objD = hVar.d(new JSONObject[0]);
        if (!(objD instanceof JSONArray)) {
            Float fValueOf = Float.valueOf(hVar.b(new JSONObject[0]).e());
            return new Pair(fValueOf, fValueOf);
        }
        JSONArray jSONArray = (JSONArray) objD;
        if (jSONArray.length() == 0) {
            return null;
        }
        return new Pair(Float.valueOf(m.c(jSONArray.opt(0)).b(new JSONObject[0]).e()), Float.valueOf(m.c(jSONArray.opt(1)).b(new JSONObject[0]).e()));
    }

    static {
        a = com.adsurge.adn.J0.a.a ? "ValuesParser" : "o";
        b = new int[]{48, 80, 3, 5, 16, 1};
        c = 6;
        d = new HashMap();
    }

    public static int b(h hVar) {
        Integer numValueOf;
        String string = hVar.toString();
        if (TextUtils.isEmpty(string)) {
            numValueOf = null;
        } else {
            Map map = d;
            if (map.size() <= 0 || (numValueOf = (Integer) map.get(string)) == null) {
                numValueOf = Integer.valueOf(Color.parseColor(string));
                map.put(string, numValueOf);
            }
        }
        if (numValueOf == null) {
            return 0;
        }
        return numValueOf.intValue();
    }

    public static void a(h hVar, e eVar, c cVar) {
        String string = hVar.toString();
        if (TextUtils.isEmpty(string)) {
            cVar.a(0);
            return;
        }
        Map map = d;
        Integer num = (Integer) map.get(string);
        if (num != null) {
            cVar.a(num.intValue());
            return;
        }
        if ('#' != string.charAt(0)) {
            if (eVar == null) {
                cVar.a(0);
                return;
            } else {
                com.adsurge.adn.p032j0.b.a(eVar, string, new a(cVar));
                return;
            }
        }
        try {
            try {
                int color = Color.parseColor(string);
                map.put(string, Integer.valueOf(color));
                cVar.a(color);
            } catch (Exception e) {
                com.adsurge.adn.J0.a.a(a, e.getMessage());
                cVar.a(0);
            }
        } catch (Throwable th) {
            cVar.a(0);
            throw th;
        }
    }

    public static void a(JSONArray jSONArray, int[] iArr, int i, d dVar) {
        int length;
        int iOptInt = jSONArray.optInt(1);
        JSONArray jSONArrayOptJSONArray = jSONArray.optJSONArray(2);
        int length2 = jSONArrayOptJSONArray == null ? 0 : jSONArrayOptJSONArray.length();
        float[] fArr = null;
        float[] fArr2 = (length2 == 0 || length2 != i) ? null : new float[length2];
        if (fArr2 != null) {
            for (int i2 = 0; i2 < length2; i2++) {
                fArr2[i2] = (float) jSONArrayOptJSONArray.optDouble(i2);
            }
        }
        JSONArray jSONArrayOptJSONArray2 = jSONArray.optJSONArray(3);
        if (jSONArrayOptJSONArray2 != null && (length = jSONArrayOptJSONArray2.length()) >= 0) {
            fArr = new float[length];
            for (int i3 = 0; i3 < length; i3++) {
                fArr[i3] = (float) jSONArrayOptJSONArray2.optDouble(i3);
            }
        }
        dVar.a(new Object[]{iArr, Integer.valueOf(iOptInt), fArr2, fArr});
    }

    public static int[] a(h hVar, com.adsurge.adn.p038l0.b bVar) {
        int[] iArr = new int[4];
        boolean z = false;
        if (hVar.d(new JSONObject[0]) instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) hVar.d(new JSONObject[0]);
            int iMin = Math.min(4, jSONArray.length());
            boolean z2 = false;
            for (int i = 0; i < iMin; i++) {
                int iA = m.c(jSONArray.opt(i)).b(new JSONObject[0]).a(bVar);
                if (iA > 0) {
                    iArr[i] = iA;
                    z2 = true;
                }
            }
            z = z2;
        } else {
            int iA2 = hVar.b(new JSONObject[0]).a(bVar);
            if (iA2 > 0) {
                iArr[3] = iA2;
                iArr[2] = iA2;
                iArr[1] = iA2;
                iArr[0] = iA2;
                z = true;
            }
        }
        if (z) {
            return iArr;
        }
        return null;
    }

    public static int[] a(h hVar) {
        int[] iArr = new int[3];
        Object objD = hVar.d(new JSONObject[0]);
        if (!(objD instanceof JSONArray)) {
            return null;
        }
        JSONArray jSONArray = (JSONArray) objD;
        if (jSONArray.length() < 3) {
            return null;
        }
        for (int i = 0; i < 3; i++) {
            iArr[i] = m.c(jSONArray.opt(i)).e(new JSONObject[0]);
        }
        return iArr;
    }
}
