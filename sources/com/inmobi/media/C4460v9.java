package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import defpackage.gd1;
import defpackage.q63;
import defpackage.rd1;
import defpackage.s71;
import defpackage.vf3;
import java.lang.ref.WeakReference;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.v9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4460v9 implements Kg {
    public final WeakReference a;
    public D b;
    public U7 c;
    public RelativeLayout d;
    public C4346r6 e;
    public Hg f;
    public float g;
    public Y9 h;
    public final C4433u9 i;
    public final C4405t9 j;

    /* JADX WARN: Code duplicated, block: B:17:0x002b  */
    public final void b() {
        C4207m6 c4207m6D;
        Activity activity;
        if (this.e == null) {
            return;
        }
        D d = this.b;
        if (d == null) {
            c4207m6D = AbstractC4151k6.d();
        } else {
            if ((!(d instanceof Ej) ? false : ((Ej) d).Y0) || ((activity = (Activity) this.a.get()) != null && AbstractC4038g4.a(activity))) {
                c4207m6D = AbstractC4151k6.h();
            } else {
                c4207m6D = AbstractC4151k6.d();
            }
        }
        float f = c4207m6D.a;
        float f2 = c4207m6D.c;
        float f3 = f * f2;
        float f4 = c4207m6D.b * f2;
        boolean zB = Ig.b(this.f);
        float f5 = this.g;
        if (zB) {
            a(rd1.p((1.0f - f5) * f3), -1);
        } else {
            a(-1, rd1.p((1.0f - f5) * f4));
        }
    }

    public final void c() {
        try {
            C4346r6 c4346r6 = this.e;
            if (c4346r6 != null) {
                ViewParent parent = c4346r6.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(c4346r6);
                }
                ViewParent parent2 = c4346r6.getParent();
                ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                if (viewGroup2 != null) {
                    viewGroup2.post(new vf3(c4346r6, 6));
                }
            }
            C4346r6 c4346r7 = this.e;
            if (c4346r7 != null) {
                C4484w6 c4484w6 = c4346r7.c;
                if (c4484w6 != null) {
                    c4484w6.destroy();
                }
                c4346r7.c = null;
                c4346r7.d = null;
                c4346r7.e = null;
                Lq lq = c4346r7.g;
                if (lq != null) {
                    lq.a();
                }
                c4346r7.removeAllViews();
            }
            this.e = null;
            Ej.h1.getClass();
            a(C4164kj.a("IN_CUSTOM_EXPAND", "onClose"));
        } catch (Exception unused) {
        }
    }

    public C4460v9(InMobiAdActivity inMobiAdActivity) {
        inMobiAdActivity.getClass();
        this.a = new WeakReference(inMobiAdActivity);
        this.f = Ig.a(AbstractC4151k6.g());
        this.g = 1.0f;
        this.i = new C4433u9(this);
        this.j = new C4405t9(this);
    }

    public final void a(Intent intent, SparseArray sparseArray) {
        RelativeLayout relativeLayout;
        C4346r6 c4346r6;
        boolean z;
        InMobiAdActivity inMobiAdActivity;
        Window window;
        intent.getClass();
        sparseArray.getClass();
        if (intent.hasExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX")) {
            D d = (D) sparseArray.get(intent.getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", -1));
            if (d == null) {
                Activity activity = (Activity) this.a.get();
                if (activity instanceof InMobiAdActivity) {
                    ((InMobiAdActivity) activity).b();
                    return;
                }
                return;
            }
            int intExtra = intent.getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", 0);
            if (intExtra == 0) {
                C fullScreenEventsListener = ((Ej) d).getFullScreenEventsListener();
                if (fullScreenEventsListener != null) {
                    ((C4524xj) fullScreenEventsListener).a();
                }
                Activity activity2 = (Activity) this.a.get();
                if (activity2 instanceof InMobiAdActivity) {
                    ((InMobiAdActivity) activity2).b();
                    return;
                }
                return;
            }
            if (intent.getBooleanExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", false) && (this.a.get() instanceof InMobiAdActivity)) {
                Object obj = this.a.get();
                obj.getClass();
                if (!((InMobiAdActivity) obj).g) {
                    Object obj2 = this.a.get();
                    obj2.getClass();
                    ((InMobiAdActivity) obj2).g = true;
                    if (!(d instanceof Ej)) {
                        z = false;
                    } else {
                        z = ((Ej) d).Y0;
                    }
                    if (z) {
                        Y9 y9 = this.h;
                        if (y9 != null) {
                            ((Z9) y9).a("InMobiActivityViewHandler", "showInImmersiveMode");
                        }
                        Object obj3 = this.a.get();
                        if (obj3 instanceof InMobiAdActivity) {
                            inMobiAdActivity = (InMobiAdActivity) obj3;
                        } else {
                            inMobiAdActivity = null;
                        }
                        if (inMobiAdActivity != null && (window = inMobiAdActivity.getWindow()) != null) {
                            Y5.a.getClass();
                            if (Y5.t()) {
                                WindowManager.LayoutParams attributes = window.getAttributes();
                                attributes.layoutInDisplayCutoutMode = 3;
                                window.setAttributes(attributes);
                                WindowCompat.a(window, false);
                            } else if (Y5.r()) {
                                WindowManager.LayoutParams attributes2 = window.getAttributes();
                                attributes2.layoutInDisplayCutoutMode = 1;
                                window.setAttributes(attributes2);
                                WindowCompat.a(window, false);
                            }
                            if (Y5.t()) {
                                WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
                                windowInsetsControllerCompat.d();
                                windowInsetsControllerCompat.a(WindowInsetsCompat.Type.systemBars());
                                windowInsetsControllerCompat.a(WindowInsetsCompat.Type.displayCutout());
                            } else if (Y5.w()) {
                                window.getDecorView().setSystemUiVisibility(5638);
                            }
                        }
                    } else {
                        Activity activity3 = (Activity) this.a.get();
                        if (activity3 != null) {
                            try {
                                activity3.requestWindowFeature(1);
                                activity3.getWindow().setFlags(1024, 1024);
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
            if ((200 == intExtra && !CreativeInfo.al.equals(((Ej) d).getMarkupType())) || ((202 == intExtra && !"htmlUrl".equals(((Ej) d).getMarkupType())) || (201 == intExtra && !"inmobiJson".equals(((Ej) d).getMarkupType())))) {
                C fullScreenEventsListener2 = ((Ej) d).getFullScreenEventsListener();
                if (fullScreenEventsListener2 != null) {
                    ((C4524xj) fullScreenEventsListener2).a();
                }
                Activity activity4 = (Activity) this.a.get();
                if (activity4 instanceof InMobiAdActivity) {
                    ((InMobiAdActivity) activity4).b();
                    return;
                }
                return;
            }
            try {
                this.b = d;
                ((Ej) d).setFullScreenActivityContext((Activity) this.a.get());
                a();
                Activity activity5 = (Activity) this.a.get();
                if (activity5 != null) {
                    RelativeLayout relativeLayout2 = new RelativeLayout(activity5);
                    relativeLayout2.setId(65534);
                    this.d = relativeLayout2;
                }
                a(d);
                U7 u7 = this.c;
                if (u7 != null) {
                    u7.d();
                }
                Activity activity6 = (Activity) this.a.get();
                if (activity6 != null) {
                    FrameLayout frameLayout = (FrameLayout) activity6.findViewById(R.id.content);
                    if (frameLayout != null) {
                        relativeLayout = (RelativeLayout) frameLayout.findViewById(65519);
                    } else {
                        relativeLayout = null;
                    }
                    RelativeLayout relativeLayout3 = this.d;
                    if (relativeLayout3 != null && relativeLayout != null) {
                        RelativeLayout relativeLayout4 = (RelativeLayout) relativeLayout.findViewById(65534);
                        if (relativeLayout4 != null) {
                            relativeLayout.removeView(relativeLayout4);
                        }
                        relativeLayout.addView(relativeLayout3);
                        U7 u8 = this.c;
                        if (u8 != null) {
                            u8.c();
                        }
                    }
                }
                if (d instanceof Ej) {
                    ((Ej) d).setEmbeddedBrowserJsCallbacks(this.j);
                }
                if ((d instanceof Ej) && (c4346r6 = this.e) != null) {
                    c4346r6.setUserLeftApplicationListener(((Ej) d).getListener());
                    return;
                }
                return;
            } catch (Exception e) {
                Ej ej = (Ej) d;
                ej.setFullScreenActivityContext(null);
                C fullScreenEventsListener3 = ej.getFullScreenEventsListener();
                if (fullScreenEventsListener3 != null) {
                    ((C4524xj) fullScreenEventsListener3).a();
                }
                Activity activity7 = (Activity) this.a.get();
                if (activity7 instanceof InMobiAdActivity) {
                    ((InMobiAdActivity) activity7).b();
                }
                gd1 gd1Var = Ba.a;
                U9.a(e);
                return;
            }
        }
        Activity activity8 = (Activity) this.a.get();
        if (!(activity8 instanceof InMobiAdActivity)) {
            return;
        }
        ((InMobiAdActivity) activity8).b();
    }

    public final void b(Hg hg) {
        Objects.toString(hg);
        this.f = hg;
    }

    public final void a() {
        Activity activity = (Activity) this.a.get();
        if (activity == null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) activity.findViewById(R.id.content);
        if ((frameLayout != null ? (RelativeLayout) frameLayout.findViewById(65519) : null) != null) {
            return;
        }
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        relativeLayout.setId(65519);
        relativeLayout.setBackgroundColor(0);
        frameLayout.removeAllViews();
        frameLayout.addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -1));
    }

    public final void a(D d) {
        RelativeLayout relativeLayout;
        if (((Activity) this.a.get()) == null || (relativeLayout = this.d) == null) {
            return;
        }
        Ej ej = (Ej) d;
        String markupType = ej.getMarkupType();
        if (!s71.b(markupType, CreativeInfo.al) && !s71.b(markupType, "htmlUrl")) {
            defpackage.d.r("InMobiActivityViewHandler: Unknown Markup type");
            return;
        }
        U7 u7 = new U7(this.a, ej, relativeLayout);
        this.c = u7;
        u7.a(this.f);
        u7.c = this.g;
        u7.d = ej.Y0;
    }

    public final void a(JSONObject jSONObject) {
        jSONObject.getClass();
        D d = this.b;
        Ej ej = d instanceof Ej ? (Ej) d : null;
        if (ej != null) {
            ej.c(jSONObject);
        }
    }

    @Override // com.inmobi.media.Kg
    public final void a(Hg hg) {
        hg.getClass();
        if (((Activity) this.a.get()) == null) {
            return;
        }
        U7 u7 = this.c;
        if (u7 != null) {
            u7.a(hg);
        }
        Hg hg2 = this.f;
        if (hg2 != hg && Ig.b(hg2) != Ig.b(hg)) {
            b(hg);
            U7 u8 = this.c;
            if (u8 != null) {
                u8.c();
            }
            b();
            return;
        }
        b(hg);
    }

    public static final void a(C4460v9 c4460v9) {
        c4460v9.g = 1.0f;
        U7 u7 = c4460v9.c;
        if (u7 != null) {
            u7.c = 1.0f;
            u7.c();
        }
        C4346r6 c4346r6 = c4460v9.e;
        if (c4346r6 != null) {
            c4346r6.setLayoutParams(new RelativeLayout.LayoutParams(0, 0));
        }
        c4460v9.c();
    }

    public static final void a(C4346r6 c4346r6) {
        c4346r6.getParent().requestLayout();
    }

    public final void a(int i, int i2) {
        RelativeLayout.LayoutParams layoutParamsC;
        Activity activity = (Activity) this.a.get();
        if (activity == null) {
            return;
        }
        Ig.b(this.f);
        if (Ig.b(this.f)) {
            layoutParamsC = q63.c(i, i2, 11);
        } else {
            layoutParamsC = q63.c(i, i2, 12);
        }
        RelativeLayout relativeLayout = (RelativeLayout) ((FrameLayout) activity.findViewById(R.id.content)).findViewById(65519);
        relativeLayout.getClass();
        RelativeLayout relativeLayout2 = (RelativeLayout) relativeLayout.findViewById(65518);
        C4346r6 c4346r6 = this.e;
        if (relativeLayout2 != null) {
            if (c4346r6 != null) {
                c4346r6.setLayoutParams(layoutParamsC);
            }
        } else if (c4346r6 != null) {
            relativeLayout.addView(c4346r6, layoutParamsC);
        }
    }
}
