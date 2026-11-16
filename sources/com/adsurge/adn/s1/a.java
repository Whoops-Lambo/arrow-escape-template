package com.adsurge.adn.s1;

import android.content.Context;
import com.singular.sdk.internal.Constants;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class a {
    public volatile Context a;
    public volatile com.adsurge.adn.t1.a b;
    public volatile com.adsurge.adn.E0.a c;

    /* JADX INFO: renamed from: com.adsurge.adn.s1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class C0137a {
        public static a a = new a();
    }

    public synchronized boolean b(Context context, JSONObject jSONObject) {
        a(context, jSONObject);
        return true;
    }

    public com.adsurge.adn.t1.a c() {
        return this.b;
    }

    public final void a(Context context, JSONObject jSONObject) {
        this.a = context.getApplicationContext();
        this.b = new com.adsurge.adn.t1.a(this.a);
        this.c = new com.adsurge.adn.E0.a(jSONObject.optString("appId"), context, jSONObject.optString(Constants.REVENUE_PRODUCT_NAME_KEY));
    }

    public static a b() {
        return C0137a.a;
    }

    public Context a() {
        return this.a;
    }
}
