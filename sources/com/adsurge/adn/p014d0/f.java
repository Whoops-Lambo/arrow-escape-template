package com.adsurge.adn.p014d0;

import android.animation.PropertyValuesHolder;
import android.util.Property;
import com.adsurge.adn.p035k0.m;
import com.adsurge.adn.p038l0.i;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class f extends i.a {
    public final Property b = new a(Integer.class, "borderWidth");

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends Property {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Integer get(i iVar) {
            return 0;
        }

        @Override // android.util.Property
        public void set(i iVar, Integer num) {
            iVar.h(num.intValue());
        }
    }

    @Override // com.adsurge.adn.d0.i.a
    public PropertyValuesHolder[] a(com.adsurge.adn.p026h0.a aVar) {
        JSONArray jSONArray = aVar.c;
        if (jSONArray.length() < 2) {
            return null;
        }
        return new PropertyValuesHolder[]{PropertyValuesHolder.ofInt((Property<?, Integer>) this.b, m.c(jSONArray.opt(0)).f(new JSONObject[0]), m.c(jSONArray.opt(1)).f(new JSONObject[0]))};
    }
}
