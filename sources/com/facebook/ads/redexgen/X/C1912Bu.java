package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C1912Bu extends AbstractC3045ik<C1908Bq> {
    public int A00;
    public final int A01;
    public final C7O A04;
    public final C2055Hi A05;
    public final ViewOnClickListenerC1981El A06;
    public final List<String> A08;
    public final Application.ActivityLifecycleCallbacks A02 = new Application.ActivityLifecycleCallbacks() { // from class: com.facebook.ads.internal.view.rewardedvideo.EndCardV2ScreenshotRecyclerAdapter$1
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            if (activity == this.A00.A05.A0E()) {
                this.A00.A03.removeCallbacks(this.A00.A07);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            this.A00.A03.post(this.A00.A07);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    };
    public final Handler A03 = new Handler(Looper.getMainLooper());
    public final Runnable A07 = new RunnableC2926gk(this);

    public C1912Bu(C2055Hi c2055Hi, List<String> screenshotUrls, int i, C7O c7o, ViewOnClickListenerC1981El viewOnClickListenerC1981El, int i2) {
        this.A08 = screenshotUrls;
        this.A01 = i;
        this.A05 = c2055Hi;
        this.A04 = c7o;
        this.A06 = viewOnClickListenerC1981El;
        this.A00 = i2;
        this.A03.post(this.A07);
        if (Build.VERSION.SDK_INT >= 29 && this.A05.A0E() != null) {
            this.A05.A0E().registerActivityLifecycleCallbacks(this.A02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC3045ik
    /* JADX INFO: renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final C1908Bq A0F(ViewGroup viewGroup, int i) {
        C1906Bo c1906Bo = new C1906Bo(this.A05);
        if (C3300mv.A1C(this.A05)) {
            c1906Bo.setOnClickListener(new ViewOnClickListenerC2925gj(this));
        }
        return new C1908Bq(c1906Bo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC3045ik
    /* JADX INFO: renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final void A0M(C1908Bq c1908Bq, int i) {
        String str = this.A08.get(i % this.A08.size());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(400, -1);
        int i2 = this.A01;
        int actualPosition = this.A01;
        marginLayoutParams.setMargins(i2, 0, actualPosition, 0);
        c1908Bq.A0w().setLayoutParams(marginLayoutParams);
        c1908Bq.A0w().setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC3045ik
    public final int A0B() {
        return this.A08.size() * 1000;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC3045ik
    public final void A0N(C7O c7o) {
        super.A0N(c7o);
        this.A03.removeCallbacks(this.A07);
        if (Build.VERSION.SDK_INT >= 29 && this.A05.A0E() != null) {
            this.A05.A0E().unregisterActivityLifecycleCallbacks(this.A02);
        }
    }

    public final void A0Q(int i) {
        this.A00 = i;
    }
}
