package com.adsurge.adn.p014d0;

import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import com.adsurge.adn.p038l0.i;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class q extends i.a {
    public final Property b = new a(Float.class, "scaleX");
    public final Property c = new b(Float.class, "scaleY");

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends Property {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(i iVar) {
            float scaleX;
            View viewC = iVar.C();
            if (viewC == null) {
                scaleX = 1.0f;
            } else {
                scaleX = viewC.getScaleX();
            }
            return Float.valueOf(scaleX);
        }

        @Override // android.util.Property
        public void set(i iVar, Float f) {
            iVar.a(f, (Float) null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b extends Property {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(i iVar) {
            float scaleY;
            View viewC = iVar.C();
            if (viewC == null) {
                scaleY = 1.0f;
            } else {
                scaleY = viewC.getScaleY();
            }
            return Float.valueOf(scaleY);
        }

        @Override // android.util.Property
        public void set(i iVar, Float f) {
            iVar.a((Float) null, f);
        }
    }

    @Override // com.adsurge.adn.d0.i.a
    public PropertyValuesHolder[] a(com.adsurge.adn.p026h0.a aVar) {
        JSONArray jSONArray = aVar.c;
        if (jSONArray.length() < 2) {
            return null;
        }
        PropertyValuesHolder propertyValuesHolderA = a(this.b, jSONArray);
        PropertyValuesHolder propertyValuesHolderA2 = a(this.c, jSONArray);
        if (propertyValuesHolderA == null && propertyValuesHolderA2 == null) {
            return null;
        }
        if (propertyValuesHolderA == null || propertyValuesHolderA2 == null) {
            return propertyValuesHolderA != null ? new PropertyValuesHolder[]{propertyValuesHolderA} : new PropertyValuesHolder[]{propertyValuesHolderA2};
        }
        return new PropertyValuesHolder[]{propertyValuesHolderA, propertyValuesHolderA2};
    }

    public final PropertyValuesHolder a(Property property, JSONArray jSONArray) {
        int i;
        if (this.b == property) {
            i = 0;
        } else {
            if (this.c != property) {
                return null;
            }
            i = 2;
        }
        if (jSONArray.length() <= i) {
            return null;
        }
        return PropertyValuesHolder.ofFloat((Property<?, Float>) property, (float) jSONArray.optDouble(i, 1.0d), (float) jSONArray.optDouble(i + 1, 1.0d));
    }
}
