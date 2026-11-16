package com.adsurge.adn.p014d0;

import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import com.adsurge.adn.p035k0.j;
import com.adsurge.adn.p035k0.m;
import com.adsurge.adn.p038l0.i;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class t extends i.a {
    public final Property b = new a(Float.class, "width");

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends Property {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public void set(i iVar, Float f) {
            if (f != null) {
                iVar.l(f.intValue());
            }
        }

        @Override // android.util.Property
        public Float get(i iVar) {
            float width;
            View viewC = iVar.C();
            if (viewC == null) {
                width = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            } else {
                width = viewC.getWidth();
            }
            return Float.valueOf(width);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b extends Property {
        public final boolean a;
        public final d.InterfaceC0105d b;
        public int c;

        public b(boolean z, d.InterfaceC0105d interfaceC0105d) {
            super(Float.class, "widthP");
            this.a = z;
            this.b = interfaceC0105d;
        }

        @Override // android.util.Property
        public void set(i iVar, Float f) {
            if (this.c <= 0) {
                int iA = this.b.a(iVar, this.a);
                this.c = iA;
                if (iA <= 0) {
                    return;
                }
            }
            iVar.l((int) (f.floatValue() * this.c));
        }

        @Override // android.util.Property
        public Float get(i iVar) {
            return null;
        }
    }

    private PropertyValuesHolder a(JSONArray jSONArray) {
        j jVarB = m.c(jSONArray.opt(0)).b(new JSONObject[0]);
        j jVarB2 = m.c(jSONArray.opt(1)).b(new JSONObject[0]);
        d.c cVarA = d.a(jVarB);
        d.c cVarA2 = d.a(jVarB2);
        if (cVarA == null && cVarA2 == null) {
            return PropertyValuesHolder.ofFloat((Property<?, Float>) this.b, jVarB.e(), jVarB2.e());
        }
        if (cVarA == null) {
            if (jVarB.b() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return null;
            }
            cVarA = cVarA2;
        } else if (cVarA2 == null) {
            if (jVarB2.b() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return null;
            }
        } else if (!cVarA.a(cVarA2)) {
            if (com.adsurge.adn.J0.a.a) {
                com.adsurge.adn.J0.a.a("WidthAnimator", "动画依赖父容器/根容器宽高的起始截止单位不一致,需要调整一致");
            }
            return null;
        }
        return PropertyValuesHolder.ofFloat(new b(cVarA.a, d.a(cVarA)), jVarB.b() / 100.0f, jVarB2.b() / 100.0f);
    }

    @Override // com.adsurge.adn.d0.i.a
    public PropertyValuesHolder[] a(com.adsurge.adn.p026h0.a aVar) {
        PropertyValuesHolder propertyValuesHolderA;
        JSONArray jSONArray = aVar.c;
        if (jSONArray.length() == 2 && (propertyValuesHolderA = a(jSONArray)) != null) {
            return new PropertyValuesHolder[]{propertyValuesHolderA};
        }
        return null;
    }
}
