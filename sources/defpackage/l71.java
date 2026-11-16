package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.UncloseableOutputStream;
import com.explorestack.protobuf.adcom.c;
import com.facebook.a0;
import com.facebook.appevents.o;
import com.facebook.k0;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.internal.ads.zzaof;
import com.google.android.gms.internal.ads.zzaoh;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzdjz;
import com.google.android.gms.internal.ads.zzv;
import com.google.android.gms.internal.consent_sdk.zzqp;
import com.google.android.gms.internal.measurement.zzaef;
import com.google.android.gms.internal.measurement.zzags;
import com.google.android.gms.internal.measurement.zzaic;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.C4664b4;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class l71 implements fs, Serializer, zzqp, rr1, SuccessContinuation, fl0, ry, uc2, zzaof, zzbvg, hz3, zzdjz {
    public static boolean c;
    public static boolean d;
    public final /* synthetic */ int a;
    public static final l71 b = new l71(0);
    public static final l71 e = new l71(1);
    public static final l71 f = new l71(2);
    public static final l71 g = new l71(3);
    public static final eb2 h = new eb2(null, null, null, null, null);
    public static final l71 i = new l71(4);
    public static final l71 j = new l71(5);
    public static final l71 k = new l71(6);
    public static final l71 l = new l71(7);
    public static final l71 m = new l71(8);
    public static final /* synthetic */ l71 n = new l71(21);
    public static final /* synthetic */ l71 o = new l71(22);
    public static final /* synthetic */ l71 p = new l71(23);
    public static final /* synthetic */ l71 q = new l71(24);
    public static final /* synthetic */ l71 r = new l71(25);
    public static final /* synthetic */ l71 s = new l71(26);
    public static final /* synthetic */ l71 t = new l71(27);
    public static final /* synthetic */ l71 u = new l71(28);

    @Override // com.google.android.gms.internal.ads.zzbve
    public /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzaof
    public boolean b(zzv zzvVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaof
    public int c(zzv zzvVar) {
        return 1;
    }

    public /* synthetic */ l71(int i2) {
        this.a = i2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008b  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void g(String str, String str2, HashMap map) {
        List listY;
        HashMap map2 = fm1.e;
        switch (str.hashCode()) {
            case 3585:
                if (str.equals("r3")) {
                    str2 = (!kk2.L(str2, "m", false) && !kk2.L(str2, "b", false) && !kk2.L(str2, "ge", false)) ? InneractiveMediationDefs.GENDER_FEMALE : "m";
                }
                break;
            case 3586:
                if (str.equals("r4")) {
                    Pattern patternCompile = Pattern.compile("[^a-z]+");
                    patternCompile.getClass();
                    str2 = patternCompile.matcher(str2).replaceAll("");
                    str2.getClass();
                }
                break;
            case 3587:
                if (str.equals("r5")) {
                    Pattern patternCompile2 = Pattern.compile("[^a-z]+");
                    patternCompile2.getClass();
                    str2 = patternCompile2.matcher(str2).replaceAll("");
                    str2.getClass();
                }
                break;
            case 3588:
                if (str.equals("r6") && dk2.O(str2, "-", false)) {
                    Pattern patternCompile3 = Pattern.compile("-");
                    patternCompile3.getClass();
                    dk2.j0(0);
                    Matcher matcher = patternCompile3.matcher(str2);
                    if (matcher.find()) {
                        ArrayList arrayList = new ArrayList(10);
                        int iEnd = 0;
                        do {
                            arrayList.add(str2.subSequence(iEnd, matcher.start()).toString());
                            iEnd = matcher.end();
                        } while (matcher.find());
                        arrayList.add(str2.subSequence(iEnd, str2.length()).toString());
                        listY = arrayList;
                    } else {
                        listY = eu.y(str2.toString());
                    }
                    str2 = ((String[]) listY.toArray(new String[0]))[0];
                }
                break;
        }
        map.put(str, str2);
    }

    public static final boolean h(String str, String str2) {
        HashSet hashSet = h63.e;
        ny1 ny1Var = ny1.a;
        String str3 = null;
        if (!lz.a.contains(ny1.class)) {
            try {
                LinkedHashMap linkedHashMap = ny1.b;
                if (linkedHashMap.containsKey(str)) {
                    str3 = (String) linkedHashMap.get(str);
                }
            } catch (Throwable th) {
                lz.a(ny1.class, th);
            }
        }
        int i2 = 0;
        if (str3 == null) {
            return false;
        }
        if (!str3.equals("other")) {
            try {
                a0.c().execute(new g63(str3, str2, i2));
            } catch (Exception unused) {
            }
        }
        return true;
    }

    public static void k(String str, String str2, float[] fArr) {
        boolean zContains;
        boolean zContains2;
        ml2 ml2Var = ml2.a;
        if (lz.a.contains(ml2.class)) {
            zContains = false;
        } else {
            try {
                str.getClass();
                zContains = ml2.c.contains(str);
            } catch (Throwable th) {
                lz.a(ml2.class, th);
                zContains = false;
            }
        }
        if (zContains) {
            o oVar = new o(a0.a(), (String) null);
            if (lz.a.contains(oVar)) {
                return;
            }
            try {
                Bundle bundle = new Bundle();
                bundle.putString("_is_suggested_event", "1");
                bundle.putString("_button_text", str2);
                oVar.e(str, bundle);
                return;
            } catch (Throwable th2) {
                lz.a(oVar, th2);
                return;
            }
        }
        if (lz.a.contains(ml2.class)) {
            zContains2 = false;
        } else {
            try {
                str.getClass();
                zContains2 = ml2.d.contains(str);
            } catch (Throwable th3) {
                lz.a(ml2.class, th3);
                zContains2 = false;
            }
        }
        if (zContains2) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putString("event_name", str);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb = new StringBuilder();
                for (float f2 : fArr) {
                    sb.append(f2);
                    sb.append(",");
                }
                jSONObject.put("dense", sb.toString());
                jSONObject.put("button_text", str2);
                bundle2.putString("metadata", jSONObject.toString());
                String str3 = k0.j;
                k0 k0VarN = c.n(null, String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{a0.b()}, 1)), null, null);
                k0VarN.d = bundle2;
                k0VarN.c();
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fs
    public void d(zx0 zx0Var, ul2 ul2Var) throws a81 {
        wx wxVar;
        tx txVar;
        as0 as0Var = (as0) ul2Var;
        zx0Var.getClass();
        tx txVar2 = new tx("ObservableContent", 4);
        fz0 fz0Var = zx0Var.e;
        tx txVar3 = fz0.m;
        ArrayList arrayList = fz0Var.a;
        txVar3.getClass();
        dy dyVar = null;
        if (!fz0Var.e(txVar2)) {
            int iC = fz0Var.c(txVar3);
            if (iC == -1) {
                throw new a81("Phase " + txVar3 + " was not registered for this pipeline");
            }
            int i2 = iC + 1;
            int iO = eu.o(arrayList);
            if (i2 <= iO) {
                while (true) {
                    Object obj = arrayList.get(i2);
                    lu1 lu1Var = obj instanceof lu1 ? (lu1) obj : null;
                    if (lu1Var != null && (wxVar = lu1Var.b) != null) {
                        ru1 ru1Var = wxVar instanceof ru1 ? (ru1) wxVar : null;
                        if (ru1Var != null && (txVar = ru1Var.e) != null && txVar == txVar3) {
                            iC = i2;
                        }
                        if (i2 == iO) {
                            break;
                        } else {
                            i2++;
                        }
                    } else {
                        break;
                    }
                }
            }
            arrayList.add(iC + 1, new lu1(txVar2, new ru1(txVar3)));
        }
        fz0Var.f(txVar2, new t4(as0Var, dyVar, 0));
    }

    @Override // defpackage.uc2
    public oc2 e(uf0 uf0Var, JSONObject jSONObject) throws JSONException {
        long jCurrentTimeMillis;
        int i2 = 0;
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        nc2 nc2Var = jSONObject.has("session") ? new nc2(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8), i2) : new nc2(new JSONObject().optInt("max_custom_exception_events", 8), i2);
        JSONObject jSONObject2 = jSONObject.getJSONObject(C4664b4.a.v);
        mc2 mc2Var = new mc2(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j2 = iOptInt;
        if (jSONObject.has("expires_at")) {
            jCurrentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            jCurrentTimeMillis = (j2 * 1000) + System.currentTimeMillis();
        }
        return new oc2(jCurrentTimeMillis, nc2Var, mc2Var, dOptDouble, dOptDouble2, iOptInt2);
    }

    @Override // com.google.android.gms.internal.ads.zzaof
    public zzaoh f(zzv zzvVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // defpackage.q02
    public Object get() {
        return new b72(Executors.newSingleThreadExecutor(), 0);
    }

    @Override // androidx.datastore.core.Serializer
    public /* bridge */ /* synthetic */ Object getDefaultValue() {
        return h;
    }

    @Override // defpackage.rr1
    public Object i() {
        return new ConcurrentHashMap();
    }

    public boolean l(String str) {
        Set set = lz.a;
        if (set.contains(this)) {
            return false;
        }
        try {
            String str2 = null;
            if (!set.contains(this)) {
                try {
                    float[] fArr = new float[30];
                    for (int i2 = 0; i2 < 30; i2++) {
                        fArr[i2] = 0.0f;
                    }
                    String[] strArrF = kn1.f(1, new float[][]{fArr}, new String[]{str});
                    if (strArrF == null || (str2 = strArrF[0]) == null) {
                        str2 = "none";
                    }
                } catch (Throwable th) {
                    lz.a(this, th);
                }
            }
            return !"none".equals(str2);
        } catch (Throwable th2) {
            lz.a(this, th2);
            return false;
        }
    }

    @Override // androidx.datastore.core.Serializer
    public Object readFrom(InputStream inputStream, dy dyVar) throws CorruptionException {
        try {
            q91 q91Var = r91.d;
            String strB = kk2.B(h00.p(inputStream));
            q91Var.getClass();
            return (eb2) q91Var.a(strB, eb2.Companion.serializer());
        } catch (Exception e2) {
            throw new CorruptionException("Cannot parse session configs", e2);
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override // androidx.datastore.core.Serializer
    public Object writeTo(Object obj, OutputStream outputStream, dy dyVar) throws IOException {
        byte[] bytes = r91.d.b(eb2.Companion.serializer(), (eb2) obj).getBytes(er.a);
        bytes.getClass();
        ((UncloseableOutputStream) outputStream).a.write(bytes);
        return az2.a;
    }

    @Override // defpackage.hz3, com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zza */
    public Object mo1232zza() {
        switch (this.a) {
            case 21:
                List list = zzfy.a;
                return zzags.b.get().zzO();
            case 22:
                List list2 = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().g());
            case 23:
                List list3 = zzfy.a;
                return Long.valueOf(zzags.b.get().j());
            case 24:
                List list4 = zzfy.a;
                return Long.valueOf(zzags.b.get().D());
            case 25:
                List list5 = zzfy.a;
                return Long.valueOf(zzags.b.get().zzo());
            case 26:
            default:
                List list6 = zzfy.a;
                return zzaic.b.get().zzf();
            case 27:
                List list7 = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().zzv());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public /* bridge */ /* synthetic */ JSONObject zzb(Object obj) {
        return (JSONObject) obj;
    }

    public static void j(View view, View view2, String str) {
        HashSet hashSet;
        Field declaredField;
        Field declaredField2;
        Object obj;
        view.getClass();
        int iHashCode = view.hashCode();
        HashSet hashSet2 = h63.e;
        HashSet hashSet3 = null;
        if (lz.a.contains(h63.class)) {
            hashSet = null;
        } else {
            try {
                hashSet = h63.e;
            } catch (Throwable th) {
                lz.a(h63.class, th);
                hashSet = null;
            }
        }
        if (!hashSet.contains(Integer.valueOf(iHashCode))) {
            h63 h63Var = new h63(view, view2, str);
            if (!lz.a.contains(b63.class)) {
                try {
                    try {
                        declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                        try {
                            declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                        } catch (ClassNotFoundException | NoSuchFieldException unused) {
                            declaredField2 = null;
                        }
                    } catch (Exception unused2) {
                    } catch (Throwable th2) {
                        lz.a(b63.class, th2);
                    }
                } catch (ClassNotFoundException | NoSuchFieldException unused3) {
                    declaredField = null;
                }
                if (declaredField != null && declaredField2 != null) {
                    declaredField.setAccessible(true);
                    declaredField2.setAccessible(true);
                    try {
                        declaredField.setAccessible(true);
                        obj = declaredField.get(view);
                    } catch (IllegalAccessException unused4) {
                        obj = null;
                    }
                    if (obj == null) {
                        view.setOnClickListener(h63Var);
                    } else {
                        declaredField2.set(obj, h63Var);
                    }
                } else {
                    view.setOnClickListener(h63Var);
                }
            }
            if (!lz.a.contains(h63.class)) {
                try {
                    hashSet3 = h63.e;
                } catch (Throwable th3) {
                    lz.a(h63.class, th3);
                }
            }
            hashSet3.add(Integer.valueOf(iHashCode));
        }
    }

    public static void m(Activity activity) {
        View viewV;
        activity.getClass();
        int iHashCode = activity.hashCode();
        HashMap map = null;
        if (!lz.a.contains(fm1.class)) {
            try {
                map = fm1.e;
            } catch (Throwable th) {
                lz.a(fm1.class, th);
            }
        }
        Integer numValueOf = Integer.valueOf(iHashCode);
        Object fm1Var = map.get(numValueOf);
        if (fm1Var == null) {
            fm1Var = new fm1(activity);
            map.put(numValueOf, fm1Var);
        }
        fm1 fm1Var2 = (fm1) fm1Var;
        Set set = lz.a;
        if (!set.contains(fm1.class)) {
            try {
                if (!set.contains(fm1Var2)) {
                    try {
                        if (!fm1Var2.d.getAndSet(true) && (viewV = j7.V((Activity) fm1Var2.c.get())) != null) {
                            ViewTreeObserver viewTreeObserver = viewV.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.addOnGlobalFocusChangeListener(fm1Var2);
                                return;
                            }
                            return;
                            lz.a(fm1.class, th);
                        }
                    } catch (Throwable th2) {
                        lz.a(fm1Var2, th2);
                    }
                }
            } catch (Throwable th3) {
                lz.a(fm1.class, th3);
            }
        }
    }

    public static final zzaef n(long j2, Object obj) {
        int i2;
        zzaef zzaefVar = (zzaef) mp3.i(j2, obj);
        if (!zzaefVar.zza()) {
            int size = zzaefVar.size();
            if (size == 0) {
                i2 = 10;
            } else {
                i2 = size + size;
            }
            zzaef zzaefVarZzg = zzaefVar.zzg(i2);
            mp3.j(j2, obj, zzaefVarZzg);
            return zzaefVarZzg;
        }
        return zzaefVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdjz
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo82zza(Object obj) {
        ((zzr) obj).zzdq();
    }
}
