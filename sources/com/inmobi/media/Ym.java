package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.az2;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.pp1;
import defpackage.wz2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlinx.coroutines.sync.Mutex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class Ym {
    public static final Mutex c = new pp1();
    public final Of a;
    public final LinkedHashSet b;

    /* JADX WARN: Code duplicated, block: B:38:0x00a1 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:35:0x0082, B:36:0x009b, B:38:0x00a1, B:40:0x00a9, B:41:0x00b4, B:42:0x00b8, B:24:0x0058, B:28:0x0067), top: B:49:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r8v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public final Object a(JSONObject jSONObject, fy fyVar) {
        Xm xm;
        ?? r1;
        Mutex mutex;
        ?? r0;
        JSONObject jSONObjectA;
        if (fyVar instanceof Xm) {
            xm = (Xm) fyVar;
            int i = xm.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                xm.e = i - Integer.MIN_VALUE;
            } else {
                xm = new Xm(this, fyVar);
            }
        } else {
            xm = new Xm(this, fyVar);
        }
        Object obj = xm.c;
        int i2 = xm.e;
        az2 az2Var = az2.a;
        dz dzVar = dz.a;
        try {
            if (i2 == 0) {
                wz2.a0(obj);
                Mutex mutex2 = c;
                xm.a = jSONObject;
                xm.b = mutex2;
                xm.e = 1;
                pp1 pp1Var = (pp1) mutex2;
                if (pp1Var.e(xm) != dzVar) {
                    r1 = jSONObject;
                    mutex = pp1Var;
                }
                return dzVar;
            }
            if (i2 == 1) {
                Mutex mutex3 = xm.b;
                JSONObject jSONObject2 = xm.a;
                wz2.a0(obj);
                r1 = jSONObject2;
                mutex = mutex3;
            } else {
                if (i2 != 2) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Mutex mutex4 = xm.b;
                JSONObject jSONObject3 = xm.a;
                wz2.a0(obj);
                r0 = jSONObject3;
                jSONObject = mutex4;
            }
            AbstractC4350ra.b(AbstractC3890an.a(r0, AbstractC4350ra.b()));
            jSONObjectA = AbstractC3890an.a(AbstractC4350ra.b());
            for (InMobiUnifiedIdInterface inMobiUnifiedIdInterface : this.b) {
                if (jSONObjectA == null) {
                    AbstractC3890an.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.NO_LOCAL_DATA_PRESENT));
                } else {
                    AbstractC3890an.a(inMobiUnifiedIdInterface, jSONObjectA, null);
                }
            }
            this.b.clear();
            ((pp1) jSONObject).g(null);
            return az2Var;
            int iC = this.a.c();
            C4565z6 c4565z6 = B6.b;
            if (iC != 192 && iC != 0) {
                Vm vm = Vm.a;
                xm.a = r1;
                xm.b = mutex;
                xm.e = 2;
                Object objA = AbstractC4038g4.a(Vm.b, new Qm(null), xm);
                if (objA != dzVar) {
                    objA = az2Var;
                }
                if (objA != dzVar) {
                    r0 = r1;
                    jSONObject = mutex;
                    AbstractC4350ra.b(AbstractC3890an.a(r0, AbstractC4350ra.b()));
                    jSONObjectA = AbstractC3890an.a(AbstractC4350ra.b());
                    while (r0.hasNext()) {
                        if (jSONObjectA == null) {
                            AbstractC3890an.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.NO_LOCAL_DATA_PRESENT));
                        } else {
                            AbstractC3890an.a(inMobiUnifiedIdInterface, jSONObjectA, null);
                        }
                    }
                    this.b.clear();
                    ((pp1) jSONObject).g(null);
                    return az2Var;
                }
                return dzVar;
            }
            ((pp1) mutex).g(null);
            return az2Var;
        } catch (Throwable th) {
            ((pp1) jSONObject).g(null);
            throw th;
        }
    }

    public Ym(Of of, LinkedHashSet linkedHashSet) {
        of.getClass();
        linkedHashSet.getClass();
        this.a = of;
        this.b = linkedHashSet;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, String str, fy fyVar) throws Throwable {
        Wm wm;
        String str2;
        Mutex mutex;
        Mutex mutex2;
        String str3;
        if (fyVar instanceof Wm) {
            wm = (Wm) fyVar;
            int i2 = wm.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wm.f = i2 - Integer.MIN_VALUE;
            } else {
                wm = new Wm(this, fyVar);
            }
        } else {
            wm = new Wm(this, fyVar);
        }
        Object obj = wm.d;
        int i3 = wm.f;
        az2 az2Var = az2.a;
        dz dzVar = dz.a;
        try {
            if (i3 == 0) {
                wz2.a0(obj);
                Mutex mutex3 = c;
                wm.b = str;
                wm.c = mutex3;
                wm.a = i;
                wm.f = 1;
                pp1 pp1Var = (pp1) mutex3;
                if (pp1Var.e(wm) != dzVar) {
                    str2 = str;
                    mutex = pp1Var;
                }
                return dzVar;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mutex2 = wm.c;
                str3 = wm.b;
                try {
                    wz2.a0(obj);
                    a(str3);
                    ((pp1) mutex2).g(null);
                    return az2Var;
                } catch (Throwable th) {
                    th = th;
                    mutex = mutex2;
                    ((pp1) mutex).g(null);
                    throw th;
                }
            }
            i = wm.a;
            mutex = wm.c;
            str2 = wm.b;
            wz2.a0(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
            C4111im c4111im = C4111im.a;
            C4111im.b("UnifiedIdNetworkResponseFailure", linkedHashMap, EnumC4223mm.SDK);
            int iC = this.a.c();
            C4565z6 c4565z6 = B6.b;
            if (iC != 192 && iC != 0) {
                Vm vm = Vm.a;
                wm.b = str2;
                wm.c = mutex;
                wm.f = 2;
                Object objA = AbstractC4038g4.a(Vm.b, new Qm(null), wm);
                if (objA != dzVar) {
                    objA = az2Var;
                }
                if (objA != dzVar) {
                    mutex2 = mutex;
                    str3 = str2;
                    a(str3);
                    ((pp1) mutex2).g(null);
                    return az2Var;
                }
                return dzVar;
            }
            ((pp1) mutex).g(null);
            return az2Var;
        } catch (Throwable th2) {
            th = th2;
            ((pp1) mutex).g(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0037 A[Catch: all -> 0x0033, JSONException -> 0x0035, Merged into TryCatch #0 {all -> 0x0033, JSONException -> 0x0035, blocks: (B:4:0x000d, B:6:0x0013, B:8:0x001d, B:9:0x0023, B:11:0x0029, B:16:0x0037, B:17:0x003d, B:19:0x0043, B:23:0x005a), top: B:28:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0043 A[Catch: all -> 0x0033, JSONException -> 0x0035, LOOP:0: B:17:0x003d->B:19:0x0043, LOOP_END, Merged into TryCatch #0 {all -> 0x0033, JSONException -> 0x0035, blocks: (B:4:0x000d, B:6:0x0013, B:8:0x001d, B:9:0x0023, B:11:0x0029, B:16:0x0037, B:17:0x003d, B:19:0x0043, B:23:0x005a), top: B:28:0x000b }, TRY_LEAVE] */
    public final void a(String str) {
        Iterator it;
        JSONObject jSONObjectA = AbstractC3890an.a(AbstractC4350ra.b());
        try {
            if (jSONObjectA != null) {
                if (jSONObjectA.has("ufids") && jSONObjectA.getJSONArray("ufids").length() > 0) {
                    Iterator it2 = this.b.iterator();
                    while (it2.hasNext()) {
                        AbstractC3890an.a((InMobiUnifiedIdInterface) it2.next(), jSONObjectA, null);
                    }
                } else {
                    it = this.b.iterator();
                    while (it.hasNext()) {
                        AbstractC3890an.a((InMobiUnifiedIdInterface) it.next(), null, new Error(InMobiUnifiedIdInterface.NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT));
                    }
                }
            } else {
                it = this.b.iterator();
                while (it.hasNext()) {
                    AbstractC3890an.a((InMobiUnifiedIdInterface) it.next(), null, new Error(InMobiUnifiedIdInterface.NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        } finally {
            this.b.clear();
        }
    }
}
