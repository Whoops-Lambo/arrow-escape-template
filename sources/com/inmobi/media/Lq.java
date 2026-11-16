package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import defpackage.n30;
import defpackage.rh1;
import defpackage.s71;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Lq implements Gq {
    public static final WeakHashMap g = new WeakHashMap();
    public final Iq a;
    public final Y9 b;
    public View c;
    public final ConcurrentHashMap d;
    public final WeakReference e;
    public Hg f;

    public Lq(Activity activity, Iq iq, Y9 y9) {
        View decorView;
        Window window;
        iq.getClass();
        this.a = iq;
        this.b = y9;
        this.d = new ConcurrentHashMap();
        WeakReference weakReference = new WeakReference(activity);
        this.e = weakReference;
        Y5.a.getClass();
        if (Y5.w()) {
            Activity activity2 = (Activity) weakReference.get();
            if (activity2 != null && (window = activity2.getWindow()) != null) {
                decorView = window.getDecorView();
            } else {
                decorView = null;
            }
            if (decorView != null) {
                this.c = decorView;
                if (y9 != null) {
                    ((Z9) y9).a("WindowInsetsHandler", "startListeningToInsets");
                }
                WeakHashMap weakHashMap = g;
                Object hq = weakHashMap.get(decorView);
                if (hq == null) {
                    hq = new Hq(decorView);
                    weakHashMap.put(decorView, hq);
                }
                ((Hq) hq).a.add(this);
                if (y9 != null) {
                    ((Z9) y9).a("WindowInsetsHandler_INSTANCE", this + " created - " + weakHashMap.size());
                    return;
                }
                return;
            }
            return;
        }
        if (y9 != null) {
            ((Z9) y9).a("WindowInsetsHandler", "WindowInsetsHandler is not supported for this version");
        }
    }

    public final void a(Jq jq, int i) {
        Hg hgA = Ig.a(AbstractC4151k6.g());
        Kq kq = (Kq) this.d.get(Integer.valueOf(i));
        if (kq == null) {
            kq = new Kq();
            this.d.put(Integer.valueOf(i), kq);
        }
        hgA.getClass();
        Jq jq2 = (Jq) kq.a.get(hgA);
        if (jq2 != null && s71.b(jq, jq2)) {
            Y9 y9 = this.b;
            if (y9 != null) {
                ((Z9) y9).a("WindowInsetsHandler", "SafeArea - Same value, no need to update");
            }
        } else {
            Y9 y10 = this.b;
            if (y10 != null) {
                ((Z9) y10).a("WindowInsetsHandler", "safeArea - New value, updating to KV store");
            }
            jq.getClass();
            kq.a.put(hgA, jq);
            ConcurrentHashMap concurrentHashMap = this.d;
            LinkedHashMap linkedHashMap = new LinkedHashMap(rh1.U(concurrentHashMap.size()));
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((Kq) entry.getValue()).a());
            }
            AbstractC4151k6.a(linkedHashMap);
        }
        if (this.f != hgA) {
            this.f = hgA;
            Iq iq = this.a;
            Object obj = this.d.get(Integer.valueOf(i));
            obj.getClass();
            iq.a(hgA, (Kq) obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Lq(Ej ej, Iq iq, Y9 y9) {
        this((Activity) null, iq, y9);
        ej.getClass();
        iq.getClass();
        Y5.a.getClass();
        if (!Y5.w()) {
            if (y9 != null) {
                ((Z9) y9).a("WindowInsetsHandler", "WindowInsetsHandler is not supported for this version");
                return;
            }
            return;
        }
        this.c = ej;
        if (y9 != null) {
            ((Z9) y9).a("WindowInsetsHandler", "startListeningToInsets");
        }
        WeakHashMap weakHashMap = g;
        Object hq = weakHashMap.get(ej);
        if (hq == null) {
            hq = new Hq(ej);
            weakHashMap.put(ej, hq);
        }
        ((Hq) hq).a.add(this);
        if (y9 != null) {
            ((Z9) y9).a("WindowInsetsHandler_INSTANCE", this + " created - " + weakHashMap.size());
        }
    }

    public final void a(WindowInsets windowInsets) {
        Jq jqA;
        try {
            Activity activity = (Activity) this.e.get();
            if (!this.a.a()) {
                Y9 y9 = this.b;
                if (y9 != null) {
                    ((Z9) y9).a("WindowInsetsHandler", "listener is not interested in computing insets, skipping");
                    return;
                }
                return;
            }
            if (activity == null) {
                Y9 y10 = this.b;
                if (y10 != null) {
                    ((Z9) y10).b("WindowInsetsHandler", "Activity is null, skipping safeArea computation");
                    return;
                }
                return;
            }
            if (AbstractC4038g4.a(activity)) {
                jqA = Vj.b(windowInsets);
            } else {
                jqA = Vj.a(windowInsets);
            }
            Integer numF = AbstractC4151k6.f();
            int iIntValue = numF != null ? numF.intValue() : AbstractC4151k6.a(windowInsets);
            AbstractC4151k6.a(Integer.valueOf(iIntValue));
            a(jqA, iIntValue);
        } catch (Error e) {
            Y9 y11 = this.b;
            if (y11 != null) {
                ((Z9) y11).b("WindowInsetsHandler", n30.y("Error in getting safeArea ", e.getMessage()));
            }
        } catch (Exception e2) {
            Y9 y12 = this.b;
            if (y12 != null) {
                ((Z9) y12).a("WindowInsetsHandler", "Exception in getting safeArea", e2);
            }
        }
    }

    public final void a() {
        View view = this.c;
        if (view != null) {
            WeakHashMap weakHashMap = g;
            Hq hq = (Hq) weakHashMap.get(view);
            if (hq != null) {
                hq.a.remove(this);
                if (hq.a.isEmpty()) {
                    hq.a();
                    weakHashMap.remove(view);
                }
            }
            Y9 y9 = this.b;
            if (y9 != null) {
                ((Z9) y9).a("WindowInsetsHandler_INSTANCE", this + " destroy - " + weakHashMap.size());
            }
        }
        this.c = null;
        this.d.clear();
    }
}
