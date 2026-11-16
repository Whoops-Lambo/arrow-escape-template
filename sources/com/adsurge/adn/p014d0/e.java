package com.adsurge.adn.p014d0;

import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.util.Property;
import com.adsurge.adn.p035k0.m;
import com.adsurge.adn.p038l0.i;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class e extends i.a {
    public final Property b = new a(Integer.class, "sameBorderRadius");
    public final Property c = new b(int[].class, "diffBorderRadius");

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends Property {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public void set(i iVar, Integer num) {
            int iIntValue = num.intValue();
            iVar.a(new int[]{iIntValue, iIntValue, iIntValue, iIntValue});
        }

        @Override // android.util.Property
        public Integer get(i iVar) {
            return 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b extends Property {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public int[] get(i iVar) {
            return new int[4];
        }

        @Override // android.util.Property
        public void set(i iVar, int[] iArr) {
            iVar.a(iArr);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class c implements TypeEvaluator {
        public final int[] a = {-1, -1, -1, -1};

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int[] evaluate(float f, int[] iArr, int[] iArr2) {
            int i = 0;
            while (true) {
                int[] iArr3 = this.a;
                if (i >= iArr3.length) {
                    return iArr3;
                }
                int i2 = iArr[i];
                if (i2 >= 0) {
                    iArr3[i] = (int) (((iArr2[i] - i2) * f) + i2);
                }
                i++;
            }
        }
    }

    public final PropertyValuesHolder a(JSONArray jSONArray, JSONArray jSONArray2) {
        int[] iArr = new int[4];
        iArr[0] = -1;
        iArr[1] = -1;
        iArr[2] = -1;
        iArr[3] = -1;
        int[] iArr2 = new int[4];
        iArr2[0] = -1;
        iArr2[1] = -1;
        iArr2[2] = -1;
        iArr2[3] = -1;
        int iMin = Math.min(jSONArray2.length(), 4);
        int i = 0;
        do {
            if (jSONArray != null && jSONArray.length() > 1) {
                iArr[i] = m.c(jSONArray.opt(0)).b(new JSONObject[0]).e();
                iArr2[i] = m.c(jSONArray.opt(1)).b(new JSONObject[0]).e();
            }
            i++;
            jSONArray = jSONArray2.optJSONArray(i);
        } while (i < iMin);
        return PropertyValuesHolder.ofObject(this.c, new c(), iArr, iArr2);
    }

    public final PropertyValuesHolder a(Object obj, JSONArray jSONArray) {
        return PropertyValuesHolder.ofInt((Property<?, Integer>) this.b, m.c(obj).b(new JSONObject[0]).e(), m.c(jSONArray.opt(1)).b(new JSONObject[0]).e());
    }

    @Override // com.adsurge.adn.d0.i.a
    public PropertyValuesHolder[] a(com.adsurge.adn.p026h0.a aVar) {
        JSONArray jSONArray = aVar.c;
        if (jSONArray.length() < 1) {
            return null;
        }
        Object objOpt = jSONArray.opt(0);
        if (!JSONObject.NULL.equals(objOpt) && !(objOpt instanceof JSONArray)) {
            if (jSONArray.length() >= 2) {
                return new PropertyValuesHolder[]{a(objOpt, jSONArray)};
            }
            return null;
        }
        return new PropertyValuesHolder[]{a(objOpt instanceof JSONArray ? (JSONArray) objOpt : null, jSONArray)};
    }
}
