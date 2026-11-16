package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import defpackage.az2;
import defpackage.ej1;
import defpackage.ig3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.r6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4346r6 extends RelativeLayout {
    public final Activity a;
    public int b;
    public C4484w6 c;
    public InterfaceC4430u6 d;
    public InterfaceC4224mn e;
    public Y9 f;
    public Lq g;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.i, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public static final boolean c(C4346r6 c4346r6, View view, MotionEvent motionEvent) {
        C4484w6 c4484w6 = c4346r6.c;
        if (c4484w6 == null) {
            return true;
        }
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        if (c4484w6.canGoForward()) {
            c4484w6.goForward();
        }
        return true;
    }

    @Nullable
    public final InterfaceC4224mn getUserLeftApplicationListener() {
        return this.e;
    }

    public final void setUserLeftApplicationListener(@Nullable InterfaceC4224mn interfaceC4224mn) {
        this.e = interfaceC4224mn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4346r6(Activity activity) {
        super(activity);
        activity.getClass();
        this.a = activity;
        this.b = -1;
    }

    public static final boolean b(C4346r6 c4346r6, View view, MotionEvent motionEvent) {
        C4457v6 c4457v6;
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            C4484w6 c4484w6 = c4346r6.c;
            if (c4484w6 != null && (c4457v6 = c4484w6.h) != null) {
                C4457v6.a(c4457v6, 5, true, null, 12);
            }
            InterfaceC4430u6 interfaceC4430u6 = c4346r6.d;
            if (interfaceC4430u6 != null) {
                C4460v9.a(((C4433u9) interfaceC4430u6).a);
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final boolean d(C4346r6 c4346r6, View view, MotionEvent motionEvent) {
        C4457v6 c4457v6;
        C4457v6 c4457v7;
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            C4484w6 c4484w6 = c4346r6.c;
            if (c4484w6 != null && (c4457v7 = c4484w6.h) != null) {
                C4457v6.a(c4457v7, 6, true, null, 12);
            }
            C4484w6 c4484w7 = c4346r6.c;
            if (c4484w7 != null && (c4457v6 = c4484w7.h) != null) {
                C4457v6.a(c4457v6, 6, true, null, 12);
            }
            C4484w6 c4484w8 = c4346r6.c;
            if (c4484w8 != null) {
                c4484w8.reload();
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public final void a(String str, EnumC4374s6 enumC4374s6, boolean z, long j, String str2, String str3, String str4, Yb yb) {
        str.getClass();
        enumC4374s6.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        if (this.c == null) {
            Context context = getContext();
            context.getClass();
            C4484w6 c4484w6 = new C4484w6(context, j, str2, str3, str4, new ej1(this, 17), this.f);
            this.c = c4484w6;
            c4484w6.setId(65517);
        }
        C4484w6 c4484w7 = this.c;
        if (c4484w7 != null) {
            c4484w7.setLandingPageTelemetryControlInfo(yb);
        }
        if (this.b != str.hashCode()) {
            EnumC4374s6 enumC4374s7 = EnumC4374s6.URL;
            C4484w6 c4484w8 = this.c;
            if (enumC4374s6 == enumC4374s7) {
                if (c4484w8 != null) {
                    c4484w8.loadUrl(str);
                }
            } else if (c4484w8 != null) {
                c4484w8.loadData(str, "text/html", "UTF-8");
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            layoutParams.addRule(2, 65533);
            C4484w6 c4484w9 = this.c;
            if (c4484w9 != null) {
                c4484w9.setLayoutParams(layoutParams);
            }
            if (findViewById(65517) == null) {
                addView(this.c, layoutParams);
            }
        }
        this.b = str.hashCode();
        if (z) {
            if (findViewById(65533) == null) {
                float f = AbstractC4151k6.d().c;
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setOrientation(0);
                linearLayout.setId(65533);
                linearLayout.setWeightSum(100.0f);
                linearLayout.setBackgroundResource(R.drawable.bottom_bar);
                linearLayout.setBackgroundColor(-7829368);
                setBackgroundColor(-7829368);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (48.0f * f));
                layoutParams2.addRule(12);
                addView(linearLayout, layoutParams2);
                if (AbstractC4038g4.a(this.a)) {
                    Lq lq = this.g;
                    if (lq != null) {
                        lq.a();
                    }
                    this.g = new Lq(this.a, new C4319q6(layoutParams2), this.f);
                }
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
                layoutParams3.weight = 25.0f;
                b(linearLayout, layoutParams3);
                d(linearLayout, layoutParams3);
                a(linearLayout, layoutParams3);
                c(linearLayout, layoutParams3);
                return;
            }
            return;
        }
        View viewFindViewById = findViewById(65533);
        if (viewFindViewById != null) {
            removeView(viewFindViewById);
        }
    }

    public final void setEmbeddedBrowserUpdateListener(@NotNull InterfaceC4430u6 interfaceC4430u6) {
        interfaceC4430u6.getClass();
        this.d = interfaceC4430u6;
    }

    public final void setLogger(@NotNull Y9 y9) {
        y9.getClass();
        this.f = y9;
    }

    public final void c(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        context.getClass();
        K5 k5 = new K5(context, (byte) 6, this.f);
        k5.setId(1048283);
        k5.setOnTouchListener(new ig3(this, 0));
        linearLayout.addView(k5, layoutParams);
    }

    public final void b(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        context.getClass();
        K5 k5 = new K5(context, (byte) 2, this.f);
        k5.setId(65516);
        k5.setOnTouchListener(new ig3(this, 2));
        linearLayout.addView(k5, layoutParams);
    }

    public final void d(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        context.getClass();
        K5 k5 = new K5(context, (byte) 3, this.f);
        k5.setId(65502);
        k5.setOnTouchListener(new ig3(this, 1));
        linearLayout.addView(k5, layoutParams);
    }

    public static final az2 a(C4346r6 c4346r6, JSONObject jSONObject) {
        jSONObject.getClass();
        InterfaceC4430u6 interfaceC4430u6 = c4346r6.d;
        if (interfaceC4430u6 != null) {
            D d = ((C4433u9) interfaceC4430u6).a.b;
            Ej ej = d instanceof Ej ? (Ej) d : null;
            if (ej != null) {
                ej.c(jSONObject);
            }
        }
        return az2.a;
    }

    public final void a(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        context.getClass();
        K5 k5 = new K5(context, (byte) 4, this.f);
        k5.setId(65503);
        k5.setOnTouchListener(new ig3(this, 3));
        linearLayout.addView(k5, layoutParams);
    }

    public static final boolean a(C4346r6 c4346r6, View view, MotionEvent motionEvent) {
        C4484w6 c4484w6 = c4346r6.c;
        if (c4484w6 == null) {
            InterfaceC4430u6 interfaceC4430u6 = c4346r6.d;
            if (interfaceC4430u6 != null) {
                C4460v9.a(((C4433u9) interfaceC4430u6).a);
            }
            return true;
        }
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            if (c4484w6.canGoBack()) {
                c4484w6.goBack();
            } else {
                InterfaceC4430u6 interfaceC4430u7 = c4346r6.d;
                if (interfaceC4430u7 != null) {
                    C4460v9.a(((C4433u9) interfaceC4430u7).a);
                }
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }
}
