package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.SignalsConfig;
import defpackage.az2;
import defpackage.du;
import defpackage.dz;
import defpackage.e32;
import defpackage.eu;
import defpackage.f02;
import defpackage.fn0;
import defpackage.fy;
import defpackage.gd1;
import defpackage.kk2;
import defpackage.p32;
import defpackage.p92;
import defpackage.pp1;
import defpackage.pr2;
import defpackage.s71;
import defpackage.tb5;
import defpackage.wz2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.sync.Mutex;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.hi, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4080hi {
    public static final C4080hi a;
    public static final /* synthetic */ KProperty[] b;
    public static final List c;
    public static Rh d;
    public static final C3897b2 e;
    public static final C3897b2 f;
    public static volatile JSONObject g;
    public static final Object h;
    public static final Mutex i;
    public static final AtomicBoolean j;

    static {
        f02 f02Var = new f02(C4080hi.class, "cachedJson", "getCachedJson()Lorg/json/JSONObject;", 0);
        p32.a.getClass();
        b = new KProperty[]{f02Var, new f02(C4080hi.class, "impressionDepth", "getImpressionDepth()Lorg/json/JSONObject;", 0)};
        a = new C4080hi();
        c = eu.z("ban", com.safedk.android.analytics.brandsafety.m.w, "rew", "nat");
        e = new C3897b2(new JSONObject(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.d0(13), true, true);
        f = new C3897b2(new JSONObject(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.d0(14), true, true);
        g = new JSONObject();
        h = new Object();
        i = new pp1();
        j = new AtomicBoolean(false);
    }

    public static SignalsConfig.PublisherConfig d() {
        return ((SignalsConfig) AbstractC4563z4.a.a(SignalsConfig.class)).getPublisher();
    }

    public static final JSONObject g() {
        a.getClass();
        Context context = AbstractC4221mk.a;
        JSONObject jSONObject = null;
        if (context != null) {
            if (d == null) {
                d = new Rh(context, "pub_signals_store");
            }
            Rh rh = d;
            if (rh == null) {
                s71.D("prefDao");
                throw null;
            }
            String strA = rh.a("imp_depth");
            if (strA != null) {
                jSONObject = new JSONObject(strA);
            }
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(JSONObject jSONObject, fy fyVar) {
        C4024fi c4024fi;
        JSONObject jSONObject2;
        Mutex mutex;
        if (fyVar instanceof C4024fi) {
            c4024fi = (C4024fi) fyVar;
            int i2 = c4024fi.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4024fi.e = i2 - Integer.MIN_VALUE;
            } else {
                c4024fi = new C4024fi(this, fyVar);
            }
        } else {
            c4024fi = new C4024fi(this, fyVar);
        }
        Object obj = c4024fi.c;
        dz dzVar = dz.a;
        int i3 = c4024fi.e;
        try {
            if (i3 == 0) {
                wz2.a0(obj);
                Context context = AbstractC4221mk.a;
                if (context != null) {
                    a.getClass();
                    if (d == null) {
                        d = new Rh(context, "pub_signals_store");
                    }
                    Mutex mutex2 = i;
                    c4024fi.a = jSONObject;
                    c4024fi.b = mutex2;
                    c4024fi.e = 1;
                    pp1 pp1Var = (pp1) mutex2;
                    if (pp1Var.e(c4024fi) == dzVar) {
                        return dzVar;
                    }
                    jSONObject2 = jSONObject;
                    mutex = pp1Var;
                }
                return az2.a;
            }
            if (i3 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mutex = c4024fi.b;
            jSONObject2 = c4024fi.a;
            wz2.a0(obj);
            Rh rh = d;
            if (rh == null) {
                s71.D("prefDao");
                throw null;
            }
            String string = jSONObject2.toString();
            string.getClass();
            rh.a.a("saved_signals", string, true);
            ((pp1) mutex).g(null);
            C3897b2 c3897b2 = e;
            c3897b2.c = c3897b2.a.invoke();
            Kc.a((byte) 2, "PubSignals", "Publisher Signals saved successfully.");
            jSONObject2.toString();
            return az2.a;
        } catch (Throwable th) {
            ((pp1) mutex).g(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    public static void c(String str, String str2) {
        int i2;
        str.getClass();
        str2.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 97295) {
            if (iHashCode != 104431) {
                if (iHashCode != 108833) {
                    if (iHashCode == 112804 && str.equals("rew")) {
                        i2 = 2;
                    } else {
                        i2 = -1;
                    }
                } else if (str.equals("nat")) {
                    i2 = 3;
                } else {
                    i2 = -1;
                }
            } else if (str.equals(com.safedk.android.analytics.brandsafety.m.w)) {
                i2 = 1;
            } else {
                i2 = -1;
            }
        } else if (!str.equals("ban")) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        if (i2 == -1) {
            return;
        }
        synchronized (h) {
            try {
                JSONObject jSONObject = new JSONObject(g.toString());
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str2);
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = AbstractC4107ii.a();
                }
                jSONArrayOptJSONArray.put(i2, jSONArrayOptJSONArray.optInt(i2, 0) + 1);
                jSONObject.put(str2, jSONArrayOptJSONArray);
                g = jSONObject;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    public final void b(String str, String str2) throws JSONException {
        int i2;
        str.getClass();
        str2.getClass();
        C3897b2 c3897b2 = f;
        c3897b2.c = c3897b2.a.invoke();
        JSONObject jSONObject = (JSONObject) c3897b2.getValue(this, b[1]);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str2);
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = AbstractC4107ii.a();
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 97295) {
            if (iHashCode != 104431) {
                if (iHashCode != 108833) {
                    if (iHashCode == 112804 && str.equals("rew")) {
                        i2 = 2;
                    } else {
                        i2 = -1;
                    }
                } else if (str.equals("nat")) {
                    i2 = 3;
                } else {
                    i2 = -1;
                }
            } else if (str.equals(com.safedk.android.analytics.brandsafety.m.w)) {
                i2 = 1;
            } else {
                i2 = -1;
            }
        } else if (!str.equals("ban")) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        if (i2 != -1) {
            jSONArrayOptJSONArray.put(i2, jSONArrayOptJSONArray.optInt(i2, 0) + 1);
            a(jSONObject, str2, jSONArrayOptJSONArray);
        }
    }

    public final LinkedHashMap e() {
        JSONObject jSONObjectC = c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeysAnd = d().getObj().getAllowedKeysAnd();
        Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeys = d().getAuto().getAllowedKeys();
        List<String> list = c;
        SignalsConfig.PublisherConfig publisherConfigD = d();
        for (String str : list) {
            AbstractC4107ii.a(AbstractC4107ii.a(AbstractC4107ii.a(linkedHashMap, jSONObjectC, "obj_", str, AbstractC4107ii.c(allowedKeysAnd)), jSONObjectC, "auto_", str, AbstractC4107ii.c(allowedKeys)), jSONObjectC, "dir_", str, publisherConfigD.getDirect().getAllowedKeys());
        }
        return linkedHashMap;
    }

    public final JSONObject f() throws JSONException {
        JSONObject jSONObjectC = c();
        JSONObject jSONObject = new JSONObject();
        Iterator<String> itKeys = jSONObjectC.keys();
        itKeys.getClass();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            next.getClass();
            if (!kk2.L(next, "obj_", false) && !kk2.L(next, "auto_", false) && !kk2.L(next, "dir_", false)) {
                jSONObject.put(next, jSONObjectC.opt(next));
            }
        }
        for (String str : c) {
            a.getClass();
            if (d().getObj().getEnabled()) {
                Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeysAnd = d().getObj().getAllowedKeysAnd();
                ArrayList arrayList = new ArrayList(allowedKeysAnd.size());
                Iterator<Map.Entry<String, SignalsConfig.PublisherConfig.KeyData>> it = allowedKeysAnd.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getValue().getName());
                }
                AbstractC4107ii.a(jSONObject, jSONObjectC, str, "obj_", du.E0(arrayList));
            }
            a.getClass();
            if (d().getAuto().getEnabled()) {
                Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeys = d().getAuto().getAllowedKeys();
                ArrayList arrayList2 = new ArrayList(allowedKeys.size());
                Iterator<Map.Entry<String, SignalsConfig.PublisherConfig.KeyData>> it2 = allowedKeys.entrySet().iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next().getValue().getName());
                }
                AbstractC4107ii.a(jSONObject, jSONObjectC, str, "auto_", du.E0(arrayList2));
            }
            a.getClass();
            if (d().getDirect().getEnabled()) {
                AbstractC4107ii.a(jSONObject, jSONObjectC, str, "dir_", d().getDirect().getAllowedKeys().keySet());
            }
        }
        Boolean boolValueOf = Boolean.valueOf(d().getObj().getDepth().getEnabled());
        C3897b2 c3897b2 = f;
        KProperty[] kPropertyArr = b;
        for (pr2 pr2Var : eu.z(new pr2(boolValueOf, "o_i_dep", (JSONObject) c3897b2.getValue(this, kPropertyArr[1])), new pr2(Boolean.valueOf(d().getDirect().getDepth().getEnabled()), "d_i_dep", (JSONObject) c3897b2.getValue(this, kPropertyArr[1])), new pr2(Boolean.valueOf(d().getAuto().getDepth().getEnabled()), "a_i_dep", (JSONObject) c3897b2.getValue(this, kPropertyArr[1])), new pr2(Boolean.valueOf(d().getObj().getDepth().getSessionEnabled()), "o_s_dep", g), new pr2(Boolean.valueOf(d().getDirect().getDepth().getSessionEnabled()), "d_s_dep", g), new pr2(Boolean.valueOf(d().getAuto().getDepth().getSessionEnabled()), "a_s_dep", g))) {
            boolean zBooleanValue = ((Boolean) pr2Var.a).booleanValue();
            String str2 = (String) pr2Var.b;
            JSONObject jSONObject2 = (JSONObject) pr2Var.c;
            if (zBooleanValue) {
                JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(str2);
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = AbstractC4107ii.a();
                }
                jSONObject.put(str2, jSONArrayOptJSONArray);
            }
        }
        jSONObject.toString();
        return jSONObject;
    }

    public static final Object b(C4080hi c4080hi, Map map, SignalsConfig.PublisherConfig publisherConfig, C3996ei c3996ei) throws JSONException {
        c4080hi.getClass();
        boolean enabled = publisherConfig.getDirect().getEnabled();
        az2 az2Var = az2.a;
        if (!enabled) {
            Kc.a((byte) 1, "PubSignals", "Direct signals are disabled by InMobi");
            return az2Var;
        }
        int count = publisherConfig.getDirect().getCount();
        pr2 pr2VarC = AbstractC4107ii.c(map, publisherConfig);
        String str = (String) pr2VarC.a;
        JSONObject jSONObject = (JSONObject) pr2VarC.b;
        String str2 = (String) pr2VarC.c;
        if (jSONObject == null) {
            return az2Var;
        }
        c4080hi.b(str2, "d_i_dep");
        c(str2, "d_s_dep");
        Object objA = c4080hi.a(AbstractC4107ii.a(c4080hi.c(), str, jSONObject, count), c3996ei);
        return objA == dz.a ? objA : az2Var;
    }

    public static final void c(C4080hi c4080hi) {
        c4080hi.getClass();
        try {
            synchronized (h) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("d_s_dep", AbstractC4107ii.a());
                jSONObject.put("o_s_dep", AbstractC4107ii.a());
                jSONObject.put("a_s_dep", AbstractC4107ii.a());
                g = jSONObject;
            }
        } catch (Exception e2) {
            gd1 gd1Var = Ba.a;
            U9.a(e2);
        }
    }

    public final JSONObject c() {
        return (JSONObject) e.getValue(this, b[0]);
    }

    public static final Object c(C4080hi c4080hi, Map map, SignalsConfig.PublisherConfig publisherConfig, C3996ei c3996ei) throws JSONException {
        c4080hi.getClass();
        boolean enabled = publisherConfig.getObj().getEnabled();
        az2 az2Var = az2.a;
        if (!enabled) {
            Kc.a((byte) 1, "PubSignals", "Object signals are disabled by InMobi");
            return az2Var;
        }
        int count = publisherConfig.getObj().getCount();
        pr2 pr2VarB = AbstractC4107ii.b(map, publisherConfig);
        String str = (String) pr2VarB.a;
        JSONObject jSONObject = (JSONObject) pr2VarB.b;
        String str2 = (String) pr2VarB.c;
        if (jSONObject == null) {
            return az2Var;
        }
        c4080hi.b(str2, "o_i_dep");
        c(str2, "o_s_dep");
        Object objA = c4080hi.a(AbstractC4107ii.a(c4080hi.c(), str, jSONObject, count), c3996ei);
        return objA == dz.a ? objA : az2Var;
    }

    public static void b() {
        try {
            Rh rh = d;
            if (rh == null) {
                s71.D("prefDao");
                throw null;
            }
            String strA = rh.a("imp_depth");
            if (strA != null) {
                JSONObject jSONObject = new JSONObject(strA);
                Iterator<String> itKeys = jSONObject.keys();
                itKeys.getClass();
                Iterator it = p92.N(new fn0(p92.F(itKeys), false, new com.moloco.sdk.internal.publisher.d(21))).iterator();
                while (it.hasNext()) {
                    jSONObject.remove((String) it.next());
                }
                Rh rh2 = d;
                if (rh2 != null) {
                    String string = jSONObject.toString();
                    string.getClass();
                    Db db = rh2.a;
                    ConcurrentHashMap concurrentHashMap = Db.b;
                    db.a("imp_depth", string, false);
                    return;
                }
                s71.D("prefDao");
                throw null;
            }
        } catch (Exception unused) {
            Rh rh3 = d;
            if (rh3 != null) {
                rh3.a.a("imp_depth");
            } else {
                s71.D("prefDao");
                throw null;
            }
        }
    }

    public static final JSONObject b(C4080hi c4080hi) {
        c4080hi.getClass();
        JSONObject jSONObject = new JSONObject();
        Iterator<String> itKeys = a.c().keys();
        itKeys.getClass();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            next.getClass();
            if (kk2.L(next, "obj_", false) || kk2.L(next, "auto_", false) || kk2.L(next, "dir_", false)) {
                jSONObject.put(next, a.c().opt(next));
            }
        }
        return jSONObject;
    }

    public static final Object a(C4080hi c4080hi, Map map, SignalsConfig.PublisherConfig publisherConfig, C3996ei c3996ei) throws JSONException {
        c4080hi.getClass();
        boolean enabled = publisherConfig.getAuto().getEnabled();
        az2 az2Var = az2.a;
        if (!enabled) {
            return az2Var;
        }
        int count = publisherConfig.getAuto().getCount();
        pr2 pr2VarA = AbstractC4107ii.a(map, publisherConfig);
        String str = (String) pr2VarA.a;
        JSONObject jSONObject = (JSONObject) pr2VarA.b;
        String str2 = (String) pr2VarA.c;
        if (jSONObject == null) {
            return az2Var;
        }
        c4080hi.b(str2, "a_i_dep");
        c(str2, "a_s_dep");
        Object objA = c4080hi.a(AbstractC4107ii.a(c4080hi.c(), str, jSONObject, count), c3996ei);
        return objA == dz.a ? objA : az2Var;
    }

    public static final JSONObject a() {
        a.getClass();
        Context context = AbstractC4221mk.a;
        JSONObject jSONObject = null;
        if (context != null) {
            if (d == null) {
                d = new Rh(context, "pub_signals_store");
            }
            Rh rh = d;
            if (rh == null) {
                s71.D("prefDao");
                throw null;
            }
            String strA = rh.a("saved_signals");
            if (strA != null) {
                jSONObject = new JSONObject(strA);
            }
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public static void a(Map map) {
        map.getClass();
        try {
            SignalsConfig.PublisherConfig publisherConfigD = d();
            Map map2 = AbstractC4107ii.a;
            publisherConfigD.getClass();
            if (!publisherConfigD.getEnableMCO() && !publisherConfigD.getEnableAB()) {
                Kc.a((byte) 1, "PubSignals", "Publisher signals are disabled from InMobi");
                return;
            }
            tb5.t(AbstractC4211ma.f, null, null, new C3996ei(map, publisherConfigD, null), 3);
        } catch (Exception e2) {
            gd1 gd1Var = Ba.a;
            Ba.a(new C4120j3(e2));
            Kc.a((byte) 1, "PubSignals", "Publisher signals could not be saved due to an Internal Error.");
        }
    }

    public static final void a(C4080hi c4080hi) {
        c4080hi.getClass();
        synchronized (h) {
            try {
                JSONArray jSONArrayOptJSONArray = g.optJSONArray("a_s_dep");
                JSONObject jSONObject = new JSONObject();
                if (jSONArrayOptJSONArray != null) {
                    jSONObject.put("a_s_dep", jSONArrayOptJSONArray);
                }
                g = jSONObject;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final boolean a(String str, String str2) {
        return s71.b(str2, str);
    }

    public static void a(JSONObject jSONObject, String str, JSONArray jSONArray) throws JSONException {
        jSONObject.getClass();
        str.getClass();
        jSONArray.getClass();
        jSONObject.put(str, jSONArray);
        Context context = AbstractC4221mk.a;
        if (context != null) {
            a.getClass();
            if (d == null) {
                d = new Rh(context, "pub_signals_store");
            }
            jSONObject.toString();
            Rh rh = d;
            if (rh != null) {
                String string = jSONObject.toString();
                string.getClass();
                Db db = rh.a;
                ConcurrentHashMap concurrentHashMap = Db.b;
                db.a("imp_depth", string, false);
                C3897b2 c3897b2 = f;
                c3897b2.c = c3897b2.a.invoke();
                return;
            }
            s71.D("prefDao");
            throw null;
        }
    }
}
