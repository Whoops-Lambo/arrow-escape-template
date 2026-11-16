package com.inmobi.media;

import com.inmobi.media.core.config.models.CrashConfig;
import defpackage.az2;
import defpackage.c91;
import defpackage.cg0;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.s71;
import defpackage.tb5;
import defpackage.wr0;
import defpackage.wz2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Kb implements Ng {
    public CrashConfig a;
    public M6 b;
    public final Da c;
    public final wr0 d;

    @Override // com.inmobi.media.Ng
    public final Object a(dy dyVar) {
        String string;
        Y5.a.getClass();
        int iN = Y5.n();
        CrashConfig crashConfig = this.a;
        int i = 1;
        int iA = (iN == 0 || iN != 1) ? crashConfig.getMobileConfig().a() : crashConfig.getWifiConfig().a();
        List<Ca> list = (List) tb5.y(cg0.a, new Eb(iA, null));
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Integer(((Ca) it.next()).d));
        }
        try {
            HashMap map = new HashMap(Y5.a.a(false));
            map.put("im-accid", AbstractC4221mk.c);
            map.put("version", "2.0.0");
            map.put("component", "crash");
            map.put("mk-version", AbstractC4249nk.a());
            map.putAll(U1.d);
            map.put("tp", AbstractC4249nk.b);
            String str = AbstractC4249nk.a;
            if (str == null) {
                str = "";
            }
            map.put("tpVer", str);
            JSONObject jSONObject = new JSONObject(map);
            JSONArray jSONArray = new JSONArray();
            for (Ca ca : list) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("eventId", ca.e);
                jSONObject2.put("eventType", ca.a);
                String str2 = ca.b;
                if (str2 == null) {
                    str2 = "";
                }
                int length = str2.length() - i;
                int i2 = 0;
                boolean z = false;
                while (i2 <= length) {
                    boolean z2 = s71.h(str2.charAt(!z ? i2 : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length--;
                    } else if (z2) {
                        i2++;
                    } else {
                        z = true;
                    }
                }
                if (str2.subSequence(i2, length + 1).toString().length() > 0) {
                    String str3 = ca.b;
                    if (str3 == null) {
                        str3 = "";
                    }
                    jSONObject2.put("crash_report", str3);
                }
                jSONObject2.put("ts", ca.c);
                jSONArray.put(jSONObject2);
                i = 1;
            }
            jSONObject.put("crash", jSONArray);
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = null;
        }
        if (string != null) {
            return new F6(string, arrayList);
        }
        return null;
    }

    public Kb(CrashConfig crashConfig) {
        crashConfig.getClass();
        this.a = crashConfig;
        this.c = new Da(crashConfig);
        this.d = new defpackage.h0(this, 26);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ae, code lost:
    
        if (r0.a(r1, (defpackage.fy) r2) == r10) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.inmobi.media.Kb r17, com.inmobi.media.Ca r18, defpackage.fy r19) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Kb.a(com.inmobi.media.Kb, com.inmobi.media.Ca, fy):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(Kb kb, fy fyVar) {
        Ib ib;
        kb.getClass();
        if (fyVar instanceof Ib) {
            ib = (Ib) fyVar;
            int i = ib.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ib.c = i - Integer.MIN_VALUE;
            } else {
                ib = new Ib(kb, fyVar);
            }
        } else {
            ib = new Ib(kb, fyVar);
        }
        Object objA = ib.a;
        int i2 = ib.c;
        if (i2 == 0) {
            wz2.a0(objA);
            C4569za c4569za = (C4569za) Ba.a.getValue();
            ib.c = 1;
            objA = c4569za.a(ib);
            dz dzVar = dz.a;
            if (objA == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(objA);
        }
        if (((Number) objA).intValue() > 0) {
            kb.a();
        }
        return az2.a;
    }

    public final void a() {
        Kb kb;
        D6 eventConfig = this.a.getEventConfig();
        eventConfig.k = this.a.getUrl();
        M6 m6 = this.b;
        if (m6 != null) {
            m6.i = eventConfig;
            kb = this;
        } else {
            kb = this;
            kb.b = new M6("crash", (C4569za) Ba.a.getValue(), kb, this.a.getEventConfig(), null);
        }
        M6 m7 = kb.b;
        if (m7 != null) {
            m7.a(false);
        }
    }

    public static final az2 a(Kb kb, C4009f3 c4009f3) {
        c4009f3.getClass();
        int i = c4009f3.a;
        if (i != 1 && i != 2) {
            switch (i) {
                case 150:
                case 151:
                case 152:
                    Map map = c4009f3.c;
                    if (map != null && map.containsKey("data")) {
                        Object obj = c4009f3.c.get("data");
                        obj.getClass();
                        kb.getClass();
                        AbstractC4447un.a(new Jb(kb, (Ca) obj, null));
                    }
                    break;
            }
        } else {
            M6 m6 = kb.b;
            if (m6 != null) {
                m6.f.set(false);
                m6.g.set(true);
                c91 c91Var = m6.j;
                if (c91Var != null) {
                    c91Var.cancel(null);
                }
                m6.j = null;
                m6.i = null;
            }
            kb.b = null;
            ((C4518xd) AbstractC4221mk.f.getValue()).a(kb.d);
        }
        return az2.a;
    }
}
