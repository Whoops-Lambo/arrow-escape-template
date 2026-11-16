package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfzh implements zzfyf {
    public static final zzfzh f = new zzfzh();
    public static final Handler g = new Handler(Looper.getMainLooper());
    public static Handler h = null;
    public static final defpackage.w i = new defpackage.w(10);
    public static final defpackage.w j = new defpackage.w(11);
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final zzfza d = new zzfza();
    public final zzfyh c = new zzfyh();
    public final zzfzb e = new zzfzb(new zzfzk());

    public static void b() {
        if (h == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            h = handler;
            handler.post(i);
            h.postDelayed(j, 200L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(View view, zzfyj zzfyjVar, JSONObject jSONObject, boolean z) {
        char c;
        Object obj;
        byte b;
        boolean z2;
        int i2;
        if (zzfyy.a(view) == null) {
            zzfza zzfzaVar = this.d;
            if (zzfzaVar.d.contains(view)) {
                c = 1;
            } else if (zzfzaVar.j) {
                c = 2;
            } else {
                c = 3;
            }
            if (c != 3) {
                JSONObject jSONObjectA = zzfyjVar.a(view);
                zzfyt.c(jSONObject, jSONObjectA);
                HashMap map = zzfzaVar.a;
                if (map.size() == 0) {
                    obj = null;
                } else {
                    Object obj2 = (String) map.get(view);
                    if (obj2 != null) {
                        map.remove(view);
                    }
                    obj = obj2;
                }
                boolean z3 = false;
                if (obj != null) {
                    try {
                        jSONObjectA.put("adSessionId", obj);
                    } catch (JSONException e) {
                        zzfyu.a("Error with setting ad session id", e);
                    }
                    WeakHashMap weakHashMap = zzfzaVar.i;
                    if (weakHashMap.containsKey(view)) {
                        weakHashMap.put(view, Boolean.TRUE);
                    } else {
                        z3 = true;
                    }
                    try {
                        jSONObjectA.put("hasWindowFocus", Boolean.valueOf(z3));
                    } catch (JSONException e2) {
                        zzfyu.a("Error with setting has window focus", e2);
                    }
                    boolean zContains = zzfzaVar.h.contains(obj);
                    Object objValueOf = Boolean.valueOf(zContains);
                    if (zContains) {
                        try {
                            jSONObjectA.put("isPipActive", objValueOf);
                        } catch (JSONException e3) {
                            zzfyu.a("Error with setting is picture-in-picture active", e3);
                        }
                    }
                    zzfzaVar.j = true;
                    return;
                }
                HashMap map2 = zzfzaVar.b;
                zzfyz zzfyzVar = (zzfyz) map2.get(view);
                if (zzfyzVar != null) {
                    map2.remove(view);
                }
                if (zzfyzVar != null) {
                    zzfxu zzfxuVar = zzfyzVar.a;
                    JSONArray jSONArray = new JSONArray();
                    ArrayList arrayList = zzfyzVar.b;
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        jSONArray.put((String) arrayList.get(i3));
                    }
                    try {
                        jSONObjectA.put("isFriendlyObstructionFor", jSONArray);
                        jSONObjectA.put("friendlyObstructionClass", zzfxuVar.b);
                        jSONObjectA.put("friendlyObstructionPurpose", zzfxuVar.c);
                        jSONObjectA.put("friendlyObstructionReason", zzfxuVar.d);
                    } catch (JSONException e4) {
                        zzfyu.a("Error with setting friendly obstruction", e4);
                    }
                    b = true;
                } else {
                    b = false;
                }
                if (z || b != false) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (c == 1) {
                        HashMap map3 = new HashMap();
                        for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                            View childAt = viewGroup.getChildAt(i4);
                            ArrayList arrayList2 = (ArrayList) map3.get(Float.valueOf(childAt.getZ()));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                map3.put(Float.valueOf(childAt.getZ()), arrayList2);
                            }
                            arrayList2.add(childAt);
                        }
                        ArrayList arrayList3 = new ArrayList(map3.keySet());
                        Collections.sort(arrayList3);
                        int size2 = arrayList3.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            ArrayList arrayList4 = (ArrayList) map3.get((Float) arrayList3.get(i5));
                            int size3 = arrayList4.size();
                            int i6 = 0;
                            while (true) {
                                i2 = i5 + 1;
                                if (i6 < size3) {
                                    a((View) arrayList4.get(i6), zzfyjVar, jSONObjectA, z2);
                                    i6++;
                                }
                            }
                            i5 = i2;
                        }
                        return;
                    }
                    for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                        a(viewGroup.getChildAt(i7), zzfyjVar, jSONObjectA, z2);
                    }
                }
            }
        }
    }
}
