package io.p071bidmachine.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ecffri.arrows.R;
import com.facebook.internal.v;
import com.facebook.internal.x0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.singular.sdk.internal.Constants;
import com.unity3d.services.UnityAdsConstants;
import defpackage.d31;
import defpackage.l93;
import defpackage.t21;
import defpackage.y32;
import io.p071bidmachine.iab.mraid.w;
import io.p071bidmachine.media3.common.b;
import io.p071bidmachine.media3.common.i0;
import io.p071bidmachine.media3.common.n;
import io.p071bidmachine.media3.common.n0;
import io.p071bidmachine.media3.common.p0;
import io.p071bidmachine.media3.common.q0;
import io.p071bidmachine.media3.common.r0;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.m;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.common.y0;
import io.p071bidmachine.media3.common.z;
import io.p071bidmachine.media3.exoplayer.trackselection.h;
import io.p071bidmachine.media3.exoplayer.u0;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class r extends FrameLayout {
    public static final float[] z0;
    public final View A;
    public final View B;
    public final TextView C;
    public final TextView D;
    public final e E;
    public final StringBuilder F;
    public final Formatter G;
    public final p0 H;
    public final q0 I;
    public final v J;
    public final Drawable K;
    public final Drawable L;
    public final Drawable M;
    public final Drawable N;
    public final Drawable O;
    public final String P;
    public final String Q;
    public final String R;
    public final Drawable S;
    public final Drawable T;
    public final float U;
    public final float V;
    public final String W;
    public final w a;
    public final String a0;
    public final Resources b;
    public final Drawable b0;
    public final g c;
    public final Drawable c0;
    public final CopyOnWriteArrayList d;
    public final String d0;
    public final RecyclerView e;
    public final String e0;
    public final l f;
    public final Drawable f0;
    public final i g;
    public final Drawable g0;
    public final n h;
    public final String h0;
    public final f i;
    public final String i0;
    public final w j;
    public n0 j0;
    public final PopupWindow k;
    public boolean k0;
    public final int l;
    public boolean l0;
    public final ImageView m;
    public boolean m0;
    public final ImageView n;
    public boolean n0;
    public final ImageView o;
    public boolean o0;
    public final View p;
    public boolean p0;
    public final View q;
    public int q0;
    public final TextView r;
    public int r0;
    public final TextView s;
    public int s0;
    public final ImageView t;
    public long[] t0;
    public final ImageView u;
    public boolean[] u0;
    public final ImageView v;
    public final long[] v0;
    public final ImageView w;
    public final boolean[] w0;
    public final ImageView x;
    public long x0;
    public final ImageView y;
    public boolean y0;
    public final View z;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void q() {
        RecyclerView recyclerView = this.e;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i = this.l;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i * 2));
        PopupWindow popupWindow = this.k;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i * 2), recyclerView.getMeasuredHeight()));
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(@Nullable h hVar) {
        boolean z = hVar != null;
        ImageView imageView = this.x;
        if (imageView != null) {
            if (z) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z2 = hVar != null;
        ImageView imageView2 = this.y;
        if (imageView2 == null) {
            return;
        }
        if (z2) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setProgressUpdateListener(@Nullable j jVar) {
    }

    static {
        z.a("media3.ui");
        z0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public r(Context context) {
        super(context, null, 0);
        this.n0 = true;
        this.q0 = 5000;
        this.s0 = 0;
        this.r0 = 200;
        LayoutInflater.from(context).inflate(R.layout.bm_exo_player_control_view, this);
        setDescendantFocusability(Constants.REFERRER_LINK_MAX_RESPONSE_CHARS);
        g gVar = new g(this);
        this.c = gVar;
        this.d = new CopyOnWriteArrayList();
        this.H = new p0();
        this.I = new q0();
        StringBuilder sb = new StringBuilder();
        this.F = sb;
        this.G = new Formatter(sb, Locale.getDefault());
        this.t0 = new long[0];
        this.u0 = new boolean[0];
        this.v0 = new long[0];
        this.w0 = new boolean[0];
        this.J = new v(this, 28);
        this.C = (TextView) findViewById(R.id.exo_duration);
        this.D = (TextView) findViewById(R.id.exo_position);
        ImageView imageView = (ImageView) findViewById(R.id.exo_subtitle);
        this.w = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(gVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.x = imageView2;
        int i = 6;
        x0 x0Var = new x0(this, i);
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(x0Var);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.y = imageView3;
        x0 x0Var2 = new x0(this, i);
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(x0Var2);
        }
        View viewFindViewById = findViewById(R.id.exo_settings);
        this.z = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(gVar);
        }
        View viewFindViewById2 = findViewById(R.id.exo_playback_speed);
        this.A = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(gVar);
        }
        View viewFindViewById3 = findViewById(R.id.exo_audio_track);
        this.B = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(gVar);
        }
        e eVar = (e) findViewById(R.id.exo_progress);
        View viewFindViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (eVar != null) {
            this.E = eVar;
        } else if (viewFindViewById4 != null) {
            e eVar2 = new e(context);
            eVar2.setId(R.id.exo_progress);
            eVar2.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(eVar2, iIndexOfChild);
            this.E = eVar2;
        } else {
            this.E = null;
        }
        e eVar3 = this.E;
        if (eVar3 != null) {
            eVar3.x.add(gVar);
        }
        Resources resources = context.getResources();
        this.b = resources;
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_play_pause);
        this.o = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(gVar);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_prev);
        this.m = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_previous, context.getTheme()));
            imageView5.setOnClickListener(gVar);
        }
        ImageView imageView6 = (ImageView) findViewById(R.id.exo_next);
        this.n = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_next, context.getTheme()));
            imageView6.setOnClickListener(gVar);
        }
        Typeface typefaceB = ResourcesCompat.b(context, R.font.roboto_medium_numbers);
        ImageView imageView7 = (ImageView) findViewById(R.id.exo_rew);
        TextView textView = (TextView) findViewById(R.id.exo_rew_with_amount);
        if (imageView7 != null) {
            imageView7.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_simple_rewind, context.getTheme()));
            this.q = imageView7;
            this.s = null;
        } else if (textView != null) {
            textView.setTypeface(typefaceB);
            this.s = textView;
            this.q = textView;
        } else {
            this.s = null;
            this.q = null;
        }
        View view = this.q;
        if (view != null) {
            view.setOnClickListener(gVar);
        }
        ImageView imageView8 = (ImageView) findViewById(R.id.exo_ffwd);
        TextView textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
        if (imageView8 != null) {
            imageView8.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_simple_fastforward, context.getTheme()));
            this.p = imageView8;
            this.r = null;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceB);
            this.r = textView2;
            this.p = textView2;
        } else {
            this.r = null;
            this.p = null;
        }
        View view2 = this.p;
        if (view2 != null) {
            view2.setOnClickListener(gVar);
        }
        ImageView imageView9 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.t = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(gVar);
        }
        ImageView imageView10 = (ImageView) findViewById(R.id.exo_shuffle);
        this.u = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(gVar);
        }
        this.U = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.V = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        ImageView imageView11 = (ImageView) findViewById(R.id.exo_vr);
        this.v = imageView11;
        if (imageView11 != null) {
            imageView11.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_vr, context.getTheme()));
            j(false, imageView11);
        }
        w wVar = new w(this);
        this.a = wVar;
        wVar.C = true;
        l lVar = new l(this, new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
        this.f = lVar;
        this.l = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.bm_exo_styled_settings_list, (ViewGroup) null);
        this.e = recyclerView;
        recyclerView.setAdapter(lVar);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.k = popupWindow;
        if (x.a < 23) {
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        }
        popupWindow.setOnDismissListener(gVar);
        this.y0 = true;
        this.j = new w(getResources());
        this.b0 = resources.getDrawable(R.drawable.exo_styled_controls_subtitle_on, context.getTheme());
        this.c0 = resources.getDrawable(R.drawable.exo_styled_controls_subtitle_off, context.getTheme());
        this.d0 = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.e0 = resources.getString(R.string.exo_controls_cc_disabled_description);
        this.h = new n(this);
        this.i = new f(this);
        this.g = new i(this, resources.getStringArray(R.array.exo_controls_playback_speeds), z0);
        this.K = resources.getDrawable(R.drawable.exo_styled_controls_play, context.getTheme());
        this.L = resources.getDrawable(R.drawable.exo_styled_controls_pause, context.getTheme());
        this.f0 = resources.getDrawable(R.drawable.exo_styled_controls_fullscreen_exit, context.getTheme());
        this.g0 = resources.getDrawable(R.drawable.exo_styled_controls_fullscreen_enter, context.getTheme());
        this.M = resources.getDrawable(R.drawable.exo_styled_controls_repeat_off, context.getTheme());
        this.N = resources.getDrawable(R.drawable.exo_styled_controls_repeat_one, context.getTheme());
        this.O = resources.getDrawable(R.drawable.exo_styled_controls_repeat_all, context.getTheme());
        this.S = resources.getDrawable(R.drawable.exo_styled_controls_shuffle_on, context.getTheme());
        this.T = resources.getDrawable(R.drawable.exo_styled_controls_shuffle_off, context.getTheme());
        this.h0 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.i0 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.P = resources.getString(R.string.exo_controls_repeat_off_description);
        this.Q = resources.getString(R.string.exo_controls_repeat_one_description);
        this.R = resources.getString(R.string.exo_controls_repeat_all_description);
        this.W = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.a0 = resources.getString(R.string.exo_controls_shuffle_off_description);
        int i2 = 1;
        wVar.h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        wVar.h(this.p, true);
        wVar.h(this.q, true);
        wVar.h(imageView5, true);
        wVar.h(imageView6, true);
        wVar.h(imageView10, false);
        wVar.h(imageView, false);
        wVar.h(imageView11, false);
        wVar.h(imageView9, this.s0 != 0);
        addOnLayoutChangeListener(new a0(this, i2));
    }

    public static boolean b(n0 n0Var, q0 q0Var) {
        r0 r0VarJ;
        int iO;
        io.p071bidmachine.media3.exoplayer.w wVar = (io.p071bidmachine.media3.exoplayer.w) n0Var;
        if (!wVar.r(17) || (iO = (r0VarJ = wVar.j()).o()) <= 1 || iO > 100) {
            return false;
        }
        for (int i = 0; i < iO; i++) {
            if (r0VarJ.m(i, q0Var, 0L).l == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        n0 n0Var = this.j0;
        if (n0Var == null || !((io.p071bidmachine.media3.exoplayer.w) n0Var).r(13)) {
            return;
        }
        io.p071bidmachine.media3.exoplayer.w wVar = (io.p071bidmachine.media3.exoplayer.w) this.j0;
        wVar.P();
        i0 i0Var = new i0(f, wVar.h0.o.b);
        wVar.P();
        if (wVar.h0.o.equals(i0Var)) {
            return;
        }
        u0 u0VarG = wVar.h0.g(i0Var);
        wVar.I++;
        wVar.l.h.a(4, i0Var).b();
        wVar.N(u0VarG, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009f  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00df  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f3  */
    public final boolean c(KeyEvent keyEvent) {
        io.p071bidmachine.media3.exoplayer.w wVar;
        int keyCode = keyEvent.getKeyCode();
        n0 n0Var = this.j0;
        if (n0Var == null || !(keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                io.p071bidmachine.media3.exoplayer.w wVar2 = (io.p071bidmachine.media3.exoplayer.w) n0Var;
                if (wVar2.o() != 4 && wVar2.r(12)) {
                    wVar2.P();
                    long jH = wVar2.h() + wVar2.w;
                    long jM = wVar2.m();
                    if (jM != -9223372036854775807L) {
                        jH = Math.min(jH, jM);
                    }
                    wVar2.B(Math.max(jH, 0L), wVar2.g(), false);
                }
            } else if (keyCode == 89) {
                io.p071bidmachine.media3.exoplayer.w wVar3 = (io.p071bidmachine.media3.exoplayer.w) n0Var;
                if (wVar3.r(11)) {
                    wVar3.P();
                    long jH2 = wVar3.h() + (-wVar3.v);
                    long jM2 = wVar3.m();
                    if (jM2 != -9223372036854775807L) {
                        jH2 = Math.min(jH2, jM2);
                    }
                    wVar3.B(Math.max(jH2, 0L), wVar3.g(), false);
                } else if (keyEvent.getRepeatCount() == 0) {
                    if (keyCode != 79 || keyCode == 85) {
                        if (x.V(n0Var, this.n0)) {
                            x.D(n0Var);
                        } else {
                            wVar = (io.p071bidmachine.media3.exoplayer.w) n0Var;
                            if (wVar.r(1)) {
                                wVar.G(false);
                            }
                        }
                    } else if (keyCode == 87) {
                        io.p071bidmachine.media3.exoplayer.w wVar4 = (io.p071bidmachine.media3.exoplayer.w) n0Var;
                        if (wVar4.r(9)) {
                            wVar4.C();
                        }
                    } else if (keyCode == 88) {
                        io.p071bidmachine.media3.exoplayer.w wVar5 = (io.p071bidmachine.media3.exoplayer.w) n0Var;
                        if (wVar5.r(7)) {
                            wVar5.D();
                        }
                    } else if (keyCode == 126) {
                        x.D(n0Var);
                    } else if (keyCode == 127) {
                        int i = x.a;
                        io.p071bidmachine.media3.exoplayer.w wVar6 = (io.p071bidmachine.media3.exoplayer.w) n0Var;
                        if (wVar6.r(1)) {
                            wVar6.G(false);
                        }
                    }
                }
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode != 79) {
                    if (x.V(n0Var, this.n0)) {
                        x.D(n0Var);
                    } else {
                        wVar = (io.p071bidmachine.media3.exoplayer.w) n0Var;
                        if (wVar.r(1)) {
                            wVar.G(false);
                        }
                    }
                } else if (x.V(n0Var, this.n0)) {
                    x.D(n0Var);
                } else {
                    wVar = (io.p071bidmachine.media3.exoplayer.w) n0Var;
                    if (wVar.r(1)) {
                        wVar.G(false);
                    }
                }
            }
        }
        return true;
    }

    public final void d(RecyclerView.Adapter adapter, View view) {
        this.e.setAdapter(adapter);
        q();
        this.y0 = false;
        PopupWindow popupWindow = this.k;
        popupWindow.dismiss();
        this.y0 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i = this.l;
        popupWindow.showAsDropDown(view, width - i, (-popupWindow.getHeight()) - i);
    }

    public final y32 e(y0 y0Var, int i) {
        l93.i(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        d31 d31Var = y0Var.a;
        int i2 = 0;
        for (int i3 = 0; i3 < d31Var.size(); i3++) {
            io.p071bidmachine.media3.common.x0 x0Var = (io.p071bidmachine.media3.common.x0) d31Var.get(i3);
            if (x0Var.b.c == i) {
                for (int i4 = 0; i4 < x0Var.a; i4++) {
                    if (x0Var.a(i4)) {
                        n nVar = x0Var.b.d[i4];
                        if ((nVar.e & 2) == 0) {
                            o oVar = new o(y0Var, i3, i4, this.j.J(nVar));
                            int i5 = i2 + 1;
                            int iF = t21.f(objArrCopyOf.length, i5);
                            if (iF > objArrCopyOf.length) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iF);
                            }
                            objArrCopyOf[i2] = oVar;
                            i2 = i5;
                        }
                    }
                }
            }
        }
        return d31.t(i2, objArrCopyOf);
    }

    public final void f() {
        w wVar = this.a;
        int i = wVar.z;
        if (i == 3 || i == 2) {
            return;
        }
        wVar.f();
        if (!wVar.C) {
            wVar.i(2);
        } else if (wVar.z == 1) {
            wVar.m.start();
        } else {
            wVar.n.start();
        }
    }

    public final boolean g() {
        w wVar = this.a;
        return wVar.z == 0 && wVar.a.h();
    }

    @Nullable
    public n0 getPlayer() {
        return this.j0;
    }

    public int getRepeatToggleModes() {
        return this.s0;
    }

    public boolean getShowShuffleButton() {
        return this.a.b(this.u);
    }

    public boolean getShowSubtitleButton() {
        return this.a.b(this.w);
    }

    public int getShowTimeoutMs() {
        return this.q0;
    }

    public boolean getShowVrButton() {
        return this.a.b(this.v);
    }

    public final void j(boolean z, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.U : this.V);
    }

    public final void k(boolean z) {
        if (this.k0 == z) {
            return;
        }
        this.k0 = z;
        String str = this.i0;
        Drawable drawable = this.g0;
        String str2 = this.h0;
        Drawable drawable2 = this.f0;
        ImageView imageView = this.x;
        if (imageView != null) {
            if (z) {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
        }
        ImageView imageView2 = this.y;
        if (imageView2 == null) {
            return;
        }
        if (z) {
            imageView2.setImageDrawable(drawable2);
            imageView2.setContentDescription(str2);
        } else {
            imageView2.setImageDrawable(drawable);
            imageView2.setContentDescription(str);
        }
    }

    public final void n() {
        i iVar;
        n0 n0Var = this.j0;
        if (n0Var == null) {
            return;
        }
        io.p071bidmachine.media3.exoplayer.w wVar = (io.p071bidmachine.media3.exoplayer.w) n0Var;
        wVar.P();
        float f = wVar.h0.o.a;
        float f2 = Float.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        while (true) {
            iVar = this.g;
            float[] fArr = iVar.k;
            if (i >= fArr.length) {
                break;
            }
            float fAbs = Math.abs(f - fArr[i]);
            if (fAbs < f2) {
                i2 = i;
                f2 = fAbs;
            }
            i++;
        }
        iVar.l = i2;
        String str = iVar.j[i2];
        l lVar = this.f;
        lVar.k[0] = str;
        j(lVar.a(1) || lVar.a(0), this.z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [io.bidmachine.media3.common.p0] */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r2v11, types: [io.bidmachine.media3.common.r0] */
    /* JADX WARN: Type inference failed for: r2v13, types: [io.bidmachine.media3.common.r0] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v9, types: [int] */
    /* JADX WARN: Type inference failed for: r5v16, types: [io.bidmachine.media3.common.b] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void s() {
        boolean z;
        long j;
        long jL;
        int i;
        long jX;
        ?? r4;
        ?? r2;
        ?? r24;
        boolean z2;
        ?? r3;
        boolean[] zArr;
        boolean z3;
        int length;
        n0 n0Var = this.j0;
        if (n0Var == null) {
            return;
        }
        boolean z4 = this.m0;
        q0 q0Var = this.I;
        boolean z5 = false;
        boolean z6 = true;
        this.o0 = z4 && b(n0Var, q0Var);
        long j2 = 0;
        this.x0 = 0L;
        io.p071bidmachine.media3.exoplayer.w wVar = (io.p071bidmachine.media3.exoplayer.w) n0Var;
        r0 r0VarJ = wVar.r(17) ? wVar.j() : r0.a;
        if (r0VarJ.p()) {
            z = true;
            if (wVar.r(16)) {
                r0 r0VarJ2 = wVar.j();
                if (r0VarJ2.p()) {
                    jX = -9223372036854775807L;
                    j = 0;
                } else {
                    j = 0;
                    jX = x.X(r0VarJ2.m(wVar.g(), wVar.a, 0L).l);
                }
                if (jX != -9223372036854775807L) {
                    jL = x.L(jX);
                }
                i = 0;
            } else {
                j = 0;
            }
            jL = j;
            i = 0;
        } else {
            int iG = wVar.g();
            boolean z7 = this.o0;
            int i2 = z7 ? 0 : iG;
            int iO = z7 ? r0VarJ.o() - 1 : iG;
            i = 0;
            long j3 = 0;
            ?? r5 = r0VarJ;
            while (i2 <= iO) {
                long j4 = -9223372036854775807L;
                if (i2 == iG) {
                    this.x0 = x.X(j3);
                }
                r5.n(i2, q0Var);
                if (q0Var.l == -9223372036854775807L) {
                    a.i(this.o0 ^ z6);
                    break;
                }
                int i3 = q0Var.m;
                ?? r6 = r5;
                boolean z8 = z5;
                while (i3 <= q0Var.n) {
                    ?? r10 = this.H;
                    r6.f(i3, r10, z8);
                    long j5 = j4;
                    b bVar = r10.g;
                    bVar.getClass();
                    int i4 = bVar.a;
                    while (r4 < i4) {
                        r10.d(r4);
                        long j6 = j2;
                        long j7 = r10.e;
                        if (j7 >= j6) {
                            long[] jArr = this.t0;
                            if (i == jArr.length) {
                                if (jArr.length == 0) {
                                    r2 = r6;
                                    r4 = z8;
                                    length = 1;
                                } else {
                                    r2 = r6;
                                    r4 = z8;
                                    length = jArr.length * 2;
                                }
                                this.t0 = Arrays.copyOf(jArr, length);
                                this.u0 = Arrays.copyOf(this.u0, length);
                            }
                            r2 = r6;
                            r4 = z8;
                            this.t0[i] = x.X(j7 + j3);
                            boolean[] zArr2 = this.u0;
                            io.p071bidmachine.media3.common.a aVarA = r10.g.a(r4);
                            int i5 = aVarA.a;
                            if (i5 != -1) {
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= i5) {
                                        r3 = r2;
                                        zArr = zArr2;
                                        r24 = r3;
                                        z2 = true;
                                        z3 = false;
                                        break;
                                    }
                                    zArr = zArr2;
                                    int i7 = aVarA.e[i6];
                                    ?? r25 = r3;
                                    z2 = true;
                                    if (i7 == 0) {
                                        r3 = r2;
                                    } else if (i7 != 1) {
                                        i6++;
                                        zArr2 = zArr;
                                        r3 = r25;
                                    }
                                    z3 = true;
                                    r24 = r25;
                                    break;
                                }
                            }
                            zArr = zArr2;
                            r24 = r2;
                            z2 = true;
                            z3 = true;
                            zArr[i] = !z3;
                            i++;
                        } else {
                            r2 = r6;
                            r4 = z8;
                            r24 = r2;
                            z2 = z6;
                        }
                        z6 = z2;
                        j2 = j6;
                        iG = iG;
                        r2 = r24;
                        r4++;
                    }
                    r2 = r6;
                    r4 = z8;
                    i3++;
                    j4 = j5;
                    r6 = r2;
                    z8 = false;
                }
                j3 += q0Var.l;
                i2++;
                z6 = z6;
                r5 = r6;
                z5 = false;
            }
            z = z6;
            jL = j3;
        }
        long jX2 = x.X(jL);
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(x.A(this.F, this.G, jX2));
        }
        e eVar = this.E;
        if (eVar != null) {
            eVar.setDuration(jX2);
            long[] jArr2 = this.v0;
            int length2 = jArr2.length;
            int i8 = i + length2;
            long[] jArr3 = this.t0;
            if (i8 > jArr3.length) {
                this.t0 = Arrays.copyOf(jArr3, i8);
                this.u0 = Arrays.copyOf(this.u0, i8);
            }
            System.arraycopy(jArr2, 0, this.t0, i, length2);
            System.arraycopy(this.w0, 0, this.u0, i, length2);
            long[] jArr4 = this.t0;
            boolean[] zArr3 = this.u0;
            if (i8 != 0 && (jArr4 == null || zArr3 == null)) {
                z = false;
            }
            a.c(z);
            eVar.M = i8;
            eVar.N = jArr4;
            eVar.O = zArr3;
            eVar.e();
        }
        o();
    }

    public void setAnimationEnabled(boolean z) {
        this.a.C = z;
    }

    public void setRepeatToggleModes(int i) {
        this.s0 = i;
        n0 n0Var = this.j0;
        if (n0Var != null && ((io.p071bidmachine.media3.exoplayer.w) n0Var).r(15)) {
            io.p071bidmachine.media3.exoplayer.w wVar = (io.p071bidmachine.media3.exoplayer.w) this.j0;
            wVar.P();
            int i2 = wVar.G;
            if (i == 0 && i2 != 0) {
                ((io.p071bidmachine.media3.exoplayer.w) this.j0).H(0);
            } else if (i == 1 && i2 == 2) {
                ((io.p071bidmachine.media3.exoplayer.w) this.j0).H(1);
            } else if (i == 2 && i2 == 1) {
                ((io.p071bidmachine.media3.exoplayer.w) this.j0).H(2);
            }
        }
        this.a.h(this.t, i != 0);
        p();
    }

    public void setShowFastForwardButton(boolean z) {
        this.a.h(this.p, z);
        l();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.m0 = z;
        s();
    }

    public void setShowNextButton(boolean z) {
        this.a.h(this.n, z);
        l();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.n0 = z;
        m();
    }

    public void setShowPreviousButton(boolean z) {
        this.a.h(this.m, z);
        l();
    }

    public void setShowRewindButton(boolean z) {
        this.a.h(this.q, z);
        l();
    }

    public void setShowShuffleButton(boolean z) {
        this.a.h(this.u, z);
        r();
    }

    public void setShowSubtitleButton(boolean z) {
        this.a.h(this.w, z);
    }

    public void setShowTimeoutMs(int i) {
        this.q0 = i;
        if (g()) {
            this.a.g();
        }
    }

    public void setShowVrButton(boolean z) {
        this.a.h(this.v, z);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.r0 = x.h(i, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        ImageView imageView = this.v;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            j(onClickListener != null, imageView);
        }
    }

    public final void t() {
        n nVar = this.h;
        nVar.getClass();
        List list = Collections.EMPTY_LIST;
        nVar.j = list;
        f fVar = this.i;
        fVar.getClass();
        fVar.j = list;
        n0 n0Var = this.j0;
        ImageView imageView = this.w;
        if (n0Var != null && ((io.p071bidmachine.media3.exoplayer.w) n0Var).r(30) && ((io.p071bidmachine.media3.exoplayer.w) this.j0).r(29)) {
            y0 y0VarK = ((io.p071bidmachine.media3.exoplayer.w) this.j0).k();
            y32 y32VarE = e(y0VarK, 1);
            fVar.j = y32VarE;
            r rVar = fVar.l;
            n0 n0Var2 = rVar.j0;
            l lVar = rVar.f;
            n0Var2.getClass();
            h hVarQ = ((io.p071bidmachine.media3.exoplayer.w) n0Var2).q();
            if (y32VarE.isEmpty()) {
                lVar.k[1] = rVar.getResources().getString(R.string.exo_track_selection_none);
            } else if (fVar.e(hVarQ)) {
                for (int i = 0; i < y32VarE.d; i++) {
                    o oVar = (o) y32VarE.get(i);
                    if (oVar.a.e[oVar.b]) {
                        lVar.k[1] = oVar.c;
                        break;
                    }
                }
            } else {
                lVar.k[1] = rVar.getResources().getString(R.string.exo_track_selection_auto);
            }
            if (this.a.b(imageView)) {
                nVar.e(e(y0VarK, 3));
            } else {
                nVar.e(y32.e);
            }
        }
        j(nVar.getItemCount() > 0, imageView);
        l lVar2 = this.f;
        j(lVar2.a(1) || lVar2.a(0), this.z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!c(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public final boolean h() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void i() {
        m();
        l();
        p();
        r();
        t();
        n();
        s();
    }

    public final void l() {
        boolean zR;
        boolean zR2;
        boolean zR3;
        boolean zR4;
        boolean zR5;
        long j;
        long j2;
        if (h() && this.l0) {
            n0 n0Var = this.j0;
            if (n0Var != null) {
                if (this.m0 && b(n0Var, this.I)) {
                    zR = ((io.p071bidmachine.media3.exoplayer.w) n0Var).r(10);
                } else {
                    zR = ((io.p071bidmachine.media3.exoplayer.w) n0Var).r(5);
                }
                io.p071bidmachine.media3.exoplayer.w wVar = (io.p071bidmachine.media3.exoplayer.w) n0Var;
                zR3 = wVar.r(7);
                zR4 = wVar.r(11);
                zR5 = wVar.r(12);
                zR2 = wVar.r(9);
            } else {
                zR = false;
                zR2 = false;
                zR3 = false;
                zR4 = false;
                zR5 = false;
            }
            Resources resources = this.b;
            View view = this.q;
            if (zR4) {
                n0 n0Var2 = this.j0;
                if (n0Var2 != null) {
                    io.p071bidmachine.media3.exoplayer.w wVar2 = (io.p071bidmachine.media3.exoplayer.w) n0Var2;
                    wVar2.P();
                    j2 = wVar2.v;
                } else {
                    j2 = 5000;
                }
                int i = (int) (j2 / 1000);
                TextView textView = this.s;
                if (textView != null) {
                    textView.setText(String.valueOf(i));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, i, Integer.valueOf(i)));
                }
            }
            View view2 = this.p;
            if (zR5) {
                n0 n0Var3 = this.j0;
                if (n0Var3 != null) {
                    io.p071bidmachine.media3.exoplayer.w wVar3 = (io.p071bidmachine.media3.exoplayer.w) n0Var3;
                    wVar3.P();
                    j = wVar3.w;
                } else {
                    j = 15000;
                }
                int i2 = (int) (j / 1000);
                TextView textView2 = this.r;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(i2));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, i2, Integer.valueOf(i2)));
                }
            }
            j(zR3, this.m);
            j(zR4, view);
            j(zR5, view2);
            j(zR2, this.n);
            e eVar = this.E;
            if (eVar != null) {
                eVar.setEnabled(zR);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    public final void m() {
        ImageView imageView;
        Drawable drawable;
        int i;
        boolean z;
        if (h() && this.l0 && (imageView = this.o) != null) {
            boolean zV = x.V(this.j0, this.n0);
            if (zV) {
                drawable = this.K;
            } else {
                drawable = this.L;
            }
            if (zV) {
                i = R.string.exo_controls_play_description;
            } else {
                i = R.string.exo_controls_pause_description;
            }
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(this.b.getString(i));
            n0 n0Var = this.j0;
            if (n0Var != null) {
                io.p071bidmachine.media3.exoplayer.w wVar = (io.p071bidmachine.media3.exoplayer.w) n0Var;
                z = true;
                if (!wVar.r(1) || (wVar.r(17) && wVar.j().p())) {
                    z = false;
                }
            } else {
                z = false;
            }
            j(z, imageView);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0099  */
    public final void o() {
        long j;
        int iO;
        long preferredUpdateDelay;
        long jX;
        if (h() && this.l0) {
            n0 n0Var = this.j0;
            long j2 = 0;
            if (n0Var != null) {
                io.p071bidmachine.media3.exoplayer.w wVar = (io.p071bidmachine.media3.exoplayer.w) n0Var;
                if (wVar.r(16)) {
                    long j3 = this.x0;
                    wVar.P();
                    long jD = wVar.d(wVar.h0) + j3;
                    long j4 = this.x0;
                    wVar.P();
                    if (wVar.h0.a.p()) {
                        jX = wVar.j0;
                    } else {
                        u0 u0Var = wVar.h0;
                        if (u0Var.k.d != u0Var.b.d) {
                            jX = x.X(u0Var.a.m(wVar.g(), wVar.a, 0L).l);
                        } else {
                            long j5 = u0Var.q;
                            if (wVar.h0.k.b()) {
                                u0 u0Var2 = wVar.h0;
                                u0Var2.a.g(u0Var2.k.a, wVar.o).d(wVar.h0.k.b);
                            } else {
                                j2 = j5;
                            }
                            u0 u0Var3 = wVar.h0;
                            r0 r0Var = u0Var3.a;
                            Object obj = u0Var3.k.a;
                            p0 p0Var = wVar.o;
                            r0Var.g(obj, p0Var);
                            jX = x.X(j2 + p0Var.e);
                        }
                    }
                    j = jX + j4;
                    j2 = jD;
                } else {
                    j = 0;
                }
            } else {
                j = 0;
            }
            TextView textView = this.D;
            if (textView != null && !this.p0) {
                textView.setText(x.A(this.F, this.G, j2));
            }
            e eVar = this.E;
            if (eVar != null) {
                eVar.setPosition(j2);
                this.E.setBufferedPosition(j);
            }
            removeCallbacks(this.J);
            if (n0Var == null) {
                iO = 1;
            } else {
                iO = ((io.p071bidmachine.media3.exoplayer.w) n0Var).o();
            }
            long j6 = 1000;
            if (n0Var != null) {
                io.p071bidmachine.media3.exoplayer.w wVar2 = (io.p071bidmachine.media3.exoplayer.w) n0Var;
                if (wVar2.o() == 3 && wVar2.n()) {
                    wVar2.P();
                    if (wVar2.h0.n == 0) {
                        e eVar2 = this.E;
                        if (eVar2 != null) {
                            preferredUpdateDelay = eVar2.getPreferredUpdateDelay();
                        } else {
                            preferredUpdateDelay = 1000;
                        }
                        long jMin = Math.min(preferredUpdateDelay, 1000 - (j2 % 1000));
                        wVar2.P();
                        float f = wVar2.h0.o.a;
                        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            j6 = (long) (jMin / f);
                        }
                        postDelayed(this.J, x.i(j6, this.r0, 1000L));
                        return;
                    }
                }
            }
            if (iO != 4 && iO != 1) {
                postDelayed(this.J, 1000L);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w wVar = this.a;
        wVar.a.addOnLayoutChangeListener(wVar.x);
        this.l0 = true;
        if (g()) {
            wVar.g();
        }
        i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        w wVar = this.a;
        wVar.a.removeOnLayoutChangeListener(wVar.x);
        this.l0 = false;
        removeCallbacks(this.J);
        wVar.f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.a.b;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public final void p() {
        ImageView imageView;
        if (h() && this.l0 && (imageView = this.t) != null) {
            if (this.s0 == 0) {
                j(false, imageView);
                return;
            }
            n0 n0Var = this.j0;
            String str = this.P;
            Drawable drawable = this.M;
            if (n0Var != null) {
                io.p071bidmachine.media3.exoplayer.w wVar = (io.p071bidmachine.media3.exoplayer.w) n0Var;
                if (wVar.r(15)) {
                    j(true, imageView);
                    wVar.P();
                    int i = wVar.G;
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                imageView.setImageDrawable(this.O);
                                imageView.setContentDescription(this.R);
                                return;
                            }
                            return;
                        }
                        imageView.setImageDrawable(this.N);
                        imageView.setContentDescription(this.Q);
                        return;
                    }
                    imageView.setImageDrawable(drawable);
                    imageView.setContentDescription(str);
                    return;
                }
            }
            j(false, imageView);
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(str);
        }
    }

    public final void r() {
        ImageView imageView;
        if (h() && this.l0 && (imageView = this.u) != null) {
            n0 n0Var = this.j0;
            if (!this.a.b(imageView)) {
                j(false, imageView);
                return;
            }
            String str = this.a0;
            Drawable drawable = this.T;
            if (n0Var != null) {
                io.p071bidmachine.media3.exoplayer.w wVar = (io.p071bidmachine.media3.exoplayer.w) n0Var;
                if (wVar.r(14)) {
                    j(true, imageView);
                    wVar.P();
                    if (wVar.H) {
                        drawable = this.S;
                    }
                    imageView.setImageDrawable(drawable);
                    wVar.P();
                    if (wVar.H) {
                        str = this.W;
                    }
                    imageView.setContentDescription(str);
                    return;
                }
            }
            j(false, imageView);
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(str);
        }
    }

    public void setPlayer(@Nullable n0 n0Var) {
        boolean z;
        boolean z2 = false;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        a.i(z);
        if (n0Var == null || ((io.p071bidmachine.media3.exoplayer.w) n0Var).t == Looper.getMainLooper()) {
            z2 = true;
        }
        a.c(z2);
        n0 n0Var2 = this.j0;
        if (n0Var2 == n0Var) {
            return;
        }
        g gVar = this.c;
        if (n0Var2 != null) {
            ((io.p071bidmachine.media3.exoplayer.w) n0Var2).z(gVar);
        }
        this.j0 = n0Var;
        if (n0Var != null) {
            m mVar = ((io.p071bidmachine.media3.exoplayer.w) n0Var).m;
            gVar.getClass();
            mVar.a(gVar);
        }
        i();
    }
}
