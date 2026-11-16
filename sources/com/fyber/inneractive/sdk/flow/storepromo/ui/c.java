package com.fyber.inneractive.sdk.flow.storepromo.ui;

import android.content.Context;
import android.content.IntentFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.r;
import com.fyber.inneractive.sdk.util.o;
import defpackage.q63;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class c {
    public View a;
    public ViewGroup b;
    public final Animation c;
    public final Animation d;
    public b e;
    public com.fyber.inneractive.sdk.flow.storepromo.b f;
    public final float g;
    public int h = -1;
    public final a i = new a(this);

    public c(Context context, View view, com.fyber.inneractive.sdk.flow.storepromo.b bVar) {
        float f;
        this.a = view;
        this.c = AnimationUtils.loadAnimation(context, R.anim.store_promo_appear_anim);
        this.d = AnimationUtils.loadAnimation(context, R.anim.store_promo_disappear_anim);
        r rVar = IAConfigManager.Q.u.b;
        rVar.getClass();
        try {
            f = Float.parseFloat(rVar.a("dtx_store_promo_height", Float.toString(0.7f)));
        } catch (Throwable unused) {
            f = 0.7f;
        }
        this.g = Math.max(f, 0.7f);
        this.f = bVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.dt_store_promo_layout, (ViewGroup) null);
        this.b = viewGroup;
        viewGroup.setOnClickListener(null);
        this.b.setBackgroundColor(context.getResources().getColor(R.color.dtx_store_promo_bg_fade));
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        this.a.setLayoutParams(q63.c(-1, -2, 12));
        this.b.setVisibility(8);
        ViewGroup viewGroup2 = this.b;
        if (viewGroup2 != null) {
            viewGroup2.setLayoutParams(layoutParams);
            this.b.addView(this.a);
        }
        if (this.e == null) {
            b bVar2 = new b(this);
            this.e = bVar2;
            o.a.registerReceiver(bVar2, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
        }
    }

    public final void a() {
        View view;
        int iC;
        int iB = o.b();
        if (iB != this.h && (view = this.a) != null && view.getLayoutParams() != null) {
            this.h = iB;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.a.getLayoutParams();
            if (iB == 2) {
                iC = o.d();
            } else {
                iC = (int) (o.c() * this.g);
            }
            layoutParams.height = iC;
            this.a.setLayoutParams(layoutParams);
        }
    }
}
