package defpackage;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.internal.ads.zzcem;
import com.google.android.gms.internal.ads.zzceq;
import com.google.android.gms.internal.ads.zzfwk;
import com.google.android.gms.internal.ads.zzfxr;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzfyb;
import com.google.android.gms.internal.ads.zzfyh;
import com.google.android.gms.internal.ads.zzfyi;
import com.google.android.gms.internal.ads.zzfyj;
import com.google.android.gms.internal.ads.zzfyt;
import com.google.android.gms.internal.ads.zzfyu;
import com.google.android.gms.internal.ads.zzfyy;
import com.google.android.gms.internal.ads.zzfyz;
import com.google.android.gms.internal.ads.zzfza;
import com.google.android.gms.internal.ads.zzfzb;
import com.google.android.gms.internal.ads.zzfzf;
import com.google.android.gms.internal.ads.zzfzg;
import com.google.android.gms.internal.ads.zzfzh;
import com.google.android.gms.internal.ads.zzfzj;
import com.google.android.gms.internal.ads.zzfzk;
import com.google.android.gms.internal.ads.zzfzl;
import com.google.android.gms.internal.ads.zzfzm;
import com.google.android.gms.internal.ads.zzfzn;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.unity3d.services.UnityAdsConstants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class w implements Runnable {
    public static final /* synthetic */ w b = new w(4);
    public static final /* synthetic */ w c = new w(13);
    public static final /* synthetic */ w d = new w(14);
    public final /* synthetic */ int a;

    private final void a() {
        while (true) {
        }
    }

    private final void c() {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }

    private final /* synthetic */ void f() {
    }

    private final /* synthetic */ void g() {
    }

    private final void h() {
    }

    private final /* synthetic */ void i() {
    }

    public /* synthetic */ w(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:202:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:59:0x0103  */
    /* JADX WARN: Code duplicated, block: B:65:0x0121  */
    /* JADX WARN: Code duplicated, block: B:67:0x0132  */
    /* JADX WARN: Code duplicated, block: B:74:0x0163 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0165  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        Point point;
        HashSet hashSet;
        KeyguardManager keyguardManager;
        IdentityHashMap identityHashMap;
        Iterator it;
        zzfzb zzfzbVar;
        Activity activity;
        Boolean bool;
        HashSet hashSet2;
        View view;
        String str;
        String strA;
        ArrayList arrayList;
        int size;
        int i;
        zzfxu zzfxuVar;
        View view2;
        zzfyz zzfyzVar;
        switch (this.a) {
            case 0:
            case 1:
                return;
            case 2:
                try {
                    jx3.c = MessageDigest.getInstance(SameMD5.TAG);
                    countDownLatch = jx3.f;
                } catch (NoSuchAlgorithmException unused) {
                    countDownLatch = jx3.f;
                } catch (Throwable th) {
                    jx3.f.countDown();
                    throw th;
                }
                countDownLatch.countDown();
                return;
            case 3:
                return;
            case 4:
                List list = zzcem.l;
                zzceq.a("Pinged SB successfully.");
                return;
            case 5:
                Looper.myLooper().quit();
                return;
            case 6:
            case 7:
            case 8:
                return;
            case 9:
                if (zzfyt.b != null) {
                    point = new Point(0, 0);
                    zzfyt.b.getDefaultDisplay().getRealSize(point);
                } else {
                    point = null;
                }
                if (point != null) {
                    zzfyt.c = point;
                    return;
                }
                return;
            case 10:
                zzfzh zzfzhVar = zzfzh.f;
                zzfza zzfzaVar = zzfzhVar.d;
                zzfzb zzfzbVar2 = zzfzhVar.e;
                zzfzhVar.b.clear();
                for (zzfwk zzfwkVar : Collections.unmodifiableCollection(zzfxr.c.b)) {
                }
                System.nanoTime();
                HashMap map = zzfzaVar.g;
                HashSet hashSet3 = zzfzaVar.e;
                HashMap map2 = zzfzaVar.b;
                HashMap map3 = zzfzaVar.a;
                HashSet hashSet4 = zzfzaVar.d;
                HashSet hashSet5 = zzfzaVar.h;
                HashSet<String> hashSet6 = zzfzaVar.f;
                HashMap map4 = zzfzaVar.c;
                zzfxr zzfxrVar = zzfxr.c;
                if (zzfxrVar != null) {
                    Iterator it2 = Collections.unmodifiableCollection(zzfxrVar.b).iterator();
                    while (it2.hasNext()) {
                        zzfwk zzfwkVar2 = (zzfwk) it2.next();
                        View view3 = (View) zzfwkVar2.c.get();
                        String str2 = zzfwkVar2.g;
                        if (!zzfwkVar2.e || zzfwkVar2.f) {
                            it = it2;
                            hashSet5 = hashSet5;
                            zzfzbVar = zzfzbVar2;
                            it2 = it;
                            zzfzbVar2 = zzfzbVar;
                            hashSet5 = hashSet5;
                        } else if (view3 != null) {
                            Context context = view3.getContext();
                            it = it2;
                            while (true) {
                                if (!(context instanceof ContextWrapper)) {
                                    activity = null;
                                } else if (context instanceof Activity) {
                                    activity = (Activity) context;
                                } else {
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                            boolean zIsInPictureInPictureMode = activity != null ? activity.isInPictureInPictureMode() : false;
                            if (zIsInPictureInPictureMode) {
                                hashSet5.add(str2);
                            }
                            boolean z = zIsInPictureInPictureMode;
                            if (view3.isAttachedToWindow()) {
                                boolean zHasWindowFocus = view3.hasWindowFocus();
                                WeakHashMap weakHashMap = zzfzaVar.i;
                                if (zHasWindowFocus) {
                                    weakHashMap.remove(view3);
                                    bool = Boolean.FALSE;
                                } else {
                                    if (weakHashMap.containsKey(view3)) {
                                        bool = (Boolean) weakHashMap.get(view3);
                                    } else {
                                        Boolean bool2 = Boolean.FALSE;
                                        weakHashMap.put(view3, bool2);
                                        bool = bool2;
                                    }
                                    if (bool.booleanValue() || z) {
                                        hashSet2 = new HashSet();
                                        view = view3;
                                        while (true) {
                                            if (view == null) {
                                                zzfzbVar = zzfzbVar2;
                                                hashSet4.addAll(hashSet2);
                                                str = null;
                                            } else {
                                                strA = zzfyy.a(view);
                                                if (strA != null) {
                                                    str = strA;
                                                } else {
                                                    hashSet2.add(view);
                                                    Object parent = view.getParent();
                                                    zzfzbVar2 = zzfzbVar2;
                                                    view = parent instanceof View ? (View) parent : null;
                                                }
                                            }
                                        }
                                        if (str == null) {
                                            hashSet3.add(str2);
                                            map3.put(view3, str2);
                                            arrayList = zzfwkVar2.b.a;
                                            size = arrayList.size();
                                            i = 0;
                                            while (i < size) {
                                                Object obj = arrayList.get(i);
                                                i++;
                                                zzfxuVar = (zzfxu) obj;
                                                view2 = (View) zzfxuVar.a.get();
                                                if (view2 != null) {
                                                    zzfyzVar = (zzfyz) map2.get(view2);
                                                    if (zzfyzVar != null) {
                                                        zzfyzVar.b.add(str2);
                                                    } else {
                                                        map2.put(view2, new zzfyz(zzfxuVar, str2));
                                                    }
                                                }
                                            }
                                        } else if (str != "noWindowFocus") {
                                            hashSet6.add(str2);
                                            map4.put(str2, view3);
                                            map.put(str2, str);
                                        }
                                        it2 = it;
                                        zzfzbVar2 = zzfzbVar;
                                        hashSet5 = hashSet5;
                                    } else {
                                        str = "noWindowFocus";
                                    }
                                }
                                if (bool.booleanValue()) {
                                    hashSet2 = new HashSet();
                                    view = view3;
                                    while (true) {
                                        if (view == null) {
                                            zzfzbVar = zzfzbVar2;
                                            hashSet4.addAll(hashSet2);
                                            str = null;
                                        } else {
                                            strA = zzfyy.a(view);
                                            if (strA != null) {
                                                str = strA;
                                            } else {
                                                hashSet2.add(view);
                                                Object parent2 = view.getParent();
                                                zzfzbVar2 = zzfzbVar2;
                                                if (parent2 instanceof View) {
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    hashSet2 = new HashSet();
                                    view = view3;
                                    while (true) {
                                        if (view == null) {
                                            zzfzbVar = zzfzbVar2;
                                            hashSet4.addAll(hashSet2);
                                            str = null;
                                        } else {
                                            strA = zzfyy.a(view);
                                            if (strA != null) {
                                                str = strA;
                                            } else {
                                                hashSet2.add(view);
                                                Object parent3 = view.getParent();
                                                zzfzbVar2 = zzfzbVar2;
                                                if (parent3 instanceof View) {
                                                }
                                            }
                                        }
                                    }
                                }
                                if (str == null) {
                                    hashSet3.add(str2);
                                    map3.put(view3, str2);
                                    arrayList = zzfwkVar2.b.a;
                                    size = arrayList.size();
                                    i = 0;
                                    while (i < size) {
                                        Object obj2 = arrayList.get(i);
                                        i++;
                                        zzfxuVar = (zzfxu) obj2;
                                        view2 = (View) zzfxuVar.a.get();
                                        if (view2 != null) {
                                            zzfyzVar = (zzfyz) map2.get(view2);
                                            if (zzfyzVar != null) {
                                                zzfyzVar.b.add(str2);
                                            } else {
                                                map2.put(view2, new zzfyz(zzfxuVar, str2));
                                            }
                                        }
                                    }
                                } else if (str != "noWindowFocus") {
                                    hashSet6.add(str2);
                                    map4.put(str2, view3);
                                    map.put(str2, str);
                                }
                                it2 = it;
                                zzfzbVar2 = zzfzbVar;
                                hashSet5 = hashSet5;
                            } else {
                                str = "notAttached";
                                hashSet5 = hashSet5;
                            }
                            zzfzbVar = zzfzbVar2;
                            if (str == null) {
                                hashSet3.add(str2);
                                map3.put(view3, str2);
                                arrayList = zzfwkVar2.b.a;
                                size = arrayList.size();
                                i = 0;
                                while (i < size) {
                                    Object obj3 = arrayList.get(i);
                                    i++;
                                    zzfxuVar = (zzfxu) obj3;
                                    view2 = (View) zzfxuVar.a.get();
                                    if (view2 != null) {
                                        zzfyzVar = (zzfyz) map2.get(view2);
                                        if (zzfyzVar != null) {
                                            zzfyzVar.b.add(str2);
                                        } else {
                                            map2.put(view2, new zzfyz(zzfxuVar, str2));
                                        }
                                    }
                                }
                            } else if (str != "noWindowFocus") {
                                hashSet6.add(str2);
                                map4.put(str2, view3);
                                map.put(str2, str);
                            }
                            it2 = it;
                            zzfzbVar2 = zzfzbVar;
                            hashSet5 = hashSet5;
                        } else {
                            hashSet6.add(str2);
                            map.put(str2, "noAdView");
                            it2 = it2;
                        }
                    }
                }
                HashSet hashSet7 = hashSet5;
                zzfzb zzfzbVar3 = zzfzbVar2;
                zzfyh zzfyhVar = zzfzhVar.c;
                long jNanoTime = System.nanoTime();
                zzfyi zzfyiVar = zzfyhVar.b;
                if (hashSet6.size() > 0) {
                    for (String str3 : hashSet6) {
                        HashSet hashSet8 = hashSet6;
                        JSONObject jSONObjectA = zzfyiVar.a(null);
                        View view4 = (View) map4.get(str3);
                        zzfyj zzfyjVar = zzfyhVar.a;
                        zzfyh zzfyhVar2 = zzfyhVar;
                        String str4 = (String) map.get(str3);
                        if (str4 != null) {
                            JSONObject jSONObjectA2 = zzfyjVar.a(view4);
                            try {
                                jSONObjectA2.put("adSessionId", str3);
                            } catch (JSONException e) {
                                zzfyu.a("Error with setting ad session id", e);
                            }
                            try {
                                jSONObjectA2.put("notVisibleReason", str4);
                            } catch (JSONException e2) {
                                zzfyu.a("Error with setting not visible reason", e2);
                            }
                            zzfyt.c(jSONObjectA, jSONObjectA2);
                        } else {
                            map4 = map4;
                        }
                        zzfyt.d(jSONObjectA);
                        HashSet hashSet9 = new HashSet();
                        hashSet9.add(str3);
                        zzfzbVar3.getClass();
                        zzfzb zzfzbVar4 = zzfzbVar3;
                        zzfzm zzfzmVar = new zzfzm(zzfzbVar4, hashSet9, jSONObjectA, jNanoTime);
                        zzfzk zzfzkVar = zzfzbVar4.b;
                        zzfzmVar.a = zzfzkVar;
                        ArrayDeque arrayDeque = zzfzkVar.b;
                        arrayDeque.add(zzfzmVar);
                        if (zzfzkVar.c == null) {
                            zzfzj zzfzjVar = (zzfzj) arrayDeque.poll();
                            zzfzkVar.c = zzfzjVar;
                            if (zzfzjVar != null) {
                                zzfzjVar.executeOnExecutor(zzfzkVar.a, new Object[0]);
                            }
                        }
                        zzfzbVar3 = zzfzbVar4;
                        hashSet6 = hashSet8;
                        map4 = map4;
                        zzfyhVar = zzfyhVar2;
                        break;
                    }
                }
                HashSet hashSet10 = hashSet6;
                HashMap map5 = map4;
                zzfzb zzfzbVar5 = zzfzbVar3;
                if (hashSet3.size() > 0) {
                    JSONObject jSONObjectA3 = zzfyiVar.a(null);
                    ArrayList arrayList2 = new ArrayList();
                    zzfxr zzfxrVar2 = zzfxr.c;
                    if (zzfxrVar2 != null) {
                        Collection collectionUnmodifiableCollection = Collections.unmodifiableCollection(zzfxrVar2.b);
                        int size2 = collectionUnmodifiableCollection.size();
                        IdentityHashMap identityHashMap2 = new IdentityHashMap(size2 + size2 + 3);
                        Iterator it3 = collectionUnmodifiableCollection.iterator();
                        while (it3.hasNext()) {
                            View view5 = (View) ((zzfwk) it3.next()).c.get();
                            if (view5 != null && view5.isAttachedToWindow() && view5.isShown()) {
                                View view6 = view5;
                                while (true) {
                                    if (view6 == null) {
                                        Iterator it4 = it3;
                                        zzfzb zzfzbVar6 = zzfzbVar5;
                                        View rootView = view5.getRootView();
                                        if (rootView != null && !identityHashMap2.containsKey(rootView)) {
                                            identityHashMap2.put(rootView, rootView);
                                            float z2 = rootView.getZ();
                                            int size3 = arrayList2.size();
                                            while (true) {
                                                if (size3 > 0) {
                                                    identityHashMap = identityHashMap2;
                                                    int i2 = size3 - 1;
                                                    if (((View) arrayList2.get(i2)).getZ() > z2) {
                                                        size3 = i2;
                                                        identityHashMap2 = identityHashMap;
                                                    }
                                                } else {
                                                    identityHashMap = identityHashMap2;
                                                }
                                            }
                                            arrayList2.add(size3, rootView);
                                            zzfzbVar5 = zzfzbVar6;
                                            it3 = it4;
                                            identityHashMap2 = identityHashMap;
                                        }
                                        zzfzbVar5 = zzfzbVar6;
                                        it3 = it4;
                                    }
                                    if (view6.getAlpha() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    }
                                    it3 = it3;
                                    Object parent4 = view6.getParent();
                                    zzfzbVar5 = zzfzbVar5;
                                    view6 = parent4 instanceof View ? (View) parent4 : null;
                                    break;
                                    break;
                                }
                            }
                        }
                    }
                    zzfzb zzfzbVar7 = zzfzbVar5;
                    int i3 = 0;
                    for (int size4 = arrayList2.size(); i3 < size4; size4 = size4) {
                        zzfzhVar.a((View) arrayList2.get(i3), zzfyiVar.a, jSONObjectA3, false);
                        i3++;
                    }
                    zzfyt.d(jSONObjectA3);
                    zzfzbVar7.getClass();
                    hashSet = hashSet3;
                    zzfzn zzfznVar = new zzfzn(zzfzbVar7, hashSet, jSONObjectA3, jNanoTime);
                    zzfzk zzfzkVar2 = zzfzbVar7.b;
                    zzfznVar.a = zzfzkVar2;
                    ArrayDeque arrayDeque2 = zzfzkVar2.b;
                    arrayDeque2.add(zzfznVar);
                    if (zzfzkVar2.c == null) {
                        zzfzj zzfzjVar2 = (zzfzj) arrayDeque2.poll();
                        zzfzkVar2.c = zzfzjVar2;
                        if (zzfzjVar2 != null) {
                            zzfzjVar2.executeOnExecutor(zzfzkVar2.a, new Object[0]);
                        }
                    }
                } else {
                    hashSet = hashSet3;
                    zzfzbVar5.getClass();
                    zzfzl zzfzlVar = new zzfzl(zzfzbVar5);
                    zzfzk zzfzkVar3 = zzfzbVar5.b;
                    zzfzlVar.a = zzfzkVar3;
                    ArrayDeque arrayDeque3 = zzfzkVar3.b;
                    arrayDeque3.add(zzfzlVar);
                    if (zzfzkVar3.c == null) {
                        zzfzj zzfzjVar3 = (zzfzj) arrayDeque3.poll();
                        zzfzkVar3.c = zzfzjVar3;
                        if (zzfzjVar3 != null) {
                            zzfzjVar3.executeOnExecutor(zzfzkVar3.a, new Object[0]);
                        }
                    }
                }
                map3.clear();
                map2.clear();
                map5.clear();
                hashSet4.clear();
                hashSet.clear();
                hashSet10.clear();
                map.clear();
                zzfzaVar.j = false;
                hashSet7.clear();
                System.nanoTime();
                ArrayList arrayList3 = zzfzhVar.a;
                if (arrayList3.size() > 0) {
                    int size5 = arrayList3.size();
                    int i4 = 0;
                    while (i4 < size5) {
                        Object obj4 = arrayList3.get(i4);
                        i4++;
                        zzfzg zzfzgVar = (zzfzg) obj4;
                        zzfzgVar.zzb();
                        if (zzfzgVar instanceof zzfzf) {
                            ((zzfzf) zzfzgVar).zza();
                        }
                    }
                }
                zzfyb zzfybVar = zzfyb.d;
                Context context2 = (Context) zzfybVar.a.get();
                if (context2 == null || (keyguardManager = (KeyguardManager) context2.getSystemService("keyguard")) == null) {
                    return;
                }
                boolean zIsDeviceLocked = keyguardManager.isDeviceLocked();
                zzfybVar.a(zzfybVar.b, zIsDeviceLocked);
                zzfybVar.c = zIsDeviceLocked;
                return;
            case 11:
                Handler handler = zzfzh.h;
                if (handler != null) {
                    handler.post(zzfzh.i);
                    zzfzh.h.postDelayed(zzfzh.j, 200L);
                    return;
                }
                return;
            case 12:
            case 13:
                return;
            default:
                throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
        }
    }
}
