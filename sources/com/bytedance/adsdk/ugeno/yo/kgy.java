package com.bytedance.adsdk.ugeno.yo;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.singular.sdk.internal.Constants;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class kgy<T> extends FrameLayout implements com.bytedance.adsdk.ugeno.gf.rz.uq {
    private static final Interpolator uf = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.yo.kgy.1
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    protected com.bytedance.adsdk.ugeno.gf.rz ahm;
    private float at;
    private int ay;
    private final Runnable bmz;
    private int ct;
    private boolean dg;
    private int fi;
    private int fpp;
    private C0198kgy fpz;
    private Scroller ft;
    private int gf;
    private int gm;
    private FrameLayout ioy;
    private com.bytedance.adsdk.ugeno.yo.rz jpc;
    protected List<T> kgy;
    private boolean kus;
    private com.bytedance.adsdk.ugeno.yo.kgy.kgy lqi;
    private int noq;
    private String nu;
    private int ra;
    protected Context rz;
    private int sx;
    private boolean twf;
    private boolean um;
    private int uq;
    private final Runnable vg;
    private boolean vs;
    private boolean wy;
    private boolean xh;
    private int yo;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class ahm extends Scroller {
        public ahm(Context context, Interpolator interpolator) {
            super(context, interpolator);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i, int i2, int i3, int i4, int i5) {
            super.startScroll(i, i2, i3, i4, kgy.this.yo);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i, int i2, int i3, int i4) {
            super.startScroll(i, i2, i3, i4, kgy.this.yo);
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.yo.kgy$kgy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class C0198kgy extends com.bytedance.adsdk.ugeno.gf.ahm {
        public C0198kgy() {
        }

        @Override // com.bytedance.adsdk.ugeno.gf.ahm
        public Object kgy(ViewGroup viewGroup, int i) {
            View viewKgy = kgy.this.kgy(i, uq.kgy(kgy.this.vs, i, kgy.this.kgy.size()));
            viewGroup.addView(viewKgy);
            return viewKgy;
        }

        @Override // com.bytedance.adsdk.ugeno.gf.ahm
        public boolean kgy(View view, Object obj) {
            return view == obj;
        }

        @Override // com.bytedance.adsdk.ugeno.gf.ahm
        public int kgy() {
            if (kgy.this.vs) {
                return 1024;
            }
            return kgy.this.kgy.size();
        }

        @Override // com.bytedance.adsdk.ugeno.gf.ahm
        public int kgy(Object obj) {
            return -2;
        }

        @Override // com.bytedance.adsdk.ugeno.gf.ahm
        public void kgy(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // com.bytedance.adsdk.ugeno.gf.ahm
        public float kgy(int i) {
            if (kgy.this.at <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return 1.0f;
            }
            return 1.0f / kgy.this.at;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class rz extends com.bytedance.adsdk.ugeno.gf.rz {
        public rz(Context context) {
            super(context);
        }

        @Override // com.bytedance.adsdk.ugeno.gf.rz, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!kgy.this.dg) {
                return false;
            }
            try {
                if (kgy.this.ay != 1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(kgy(motionEvent));
                kgy(motionEvent);
                return zOnInterceptTouchEvent;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.gf.rz, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (!kgy.this.dg) {
                return false;
            }
            try {
                return kgy.this.ay == 1 ? super.onTouchEvent(kgy(motionEvent)) : super.onTouchEvent(motionEvent);
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        private MotionEvent kgy(MotionEvent motionEvent) {
            float width = getWidth();
            float height = getHeight();
            motionEvent.setLocation((motionEvent.getY() / height) * width, (motionEvent.getX() / width) * height);
            return motionEvent;
        }
    }

    public abstract View nu(int i);

    @Override // com.bytedance.adsdk.ugeno.gf.rz.uq
    public void twf(int i) {
        if (i == 1 && this.xh) {
            noq();
        }
        com.bytedance.adsdk.ugeno.yo.rz rzVar = this.jpc;
        if (rzVar != null) {
            rzVar.kgy(this.vs, i);
        }
    }

    private boolean yo() {
        return this.kgy.size() <= 2 && this.vs;
    }

    public kgy ahm(float f) {
        this.lqi.setIndicatorHeight((int) f);
        return this;
    }

    @Override // com.bytedance.adsdk.ugeno.gf.rz.uq
    public void at(int i) {
        int i2;
        if (this.jpc != null) {
            int iKgy = uq.kgy(this.vs, i, this.kgy.size());
            i2 = i;
            this.jpc.kgy(this.vs, iKgy, i2, iKgy == 0, iKgy == this.kgy.size() - 1);
        } else {
            i2 = i;
        }
        if (this.twf) {
            this.lqi.kgy(i2);
        }
    }

    public void ct() {
        int i;
        removeCallbacks(this.bmz);
        int i2 = this.ct;
        if (this.wy && (i = this.uq) > 0) {
            i2 = i;
        }
        postDelayed(this.bmz, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.kus) {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3 || action == 4) {
                if (!this.xh) {
                    ct();
                }
            } else if (action == 0) {
                noq();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public kgy fi(int i) {
        this.fi = i;
        kgy(this.nu, i, this.gf, this.ra, true);
        return this;
    }

    public com.bytedance.adsdk.ugeno.gf.ahm getAdapter() {
        return this.ahm.getAdapter();
    }

    public int getCurrentItem() {
        return this.ahm.getCurrentItem();
    }

    public com.bytedance.adsdk.ugeno.gf.rz getViewPager() {
        return this.ahm;
    }

    public kgy<T> gf(int i) {
        this.gf = i;
        kgy(this.nu, this.fi, i, this.ra, true);
        return this;
    }

    public void kgy(String str, int i, int i2, int i3, boolean z) {
        C0198kgy c0198kgy = this.fpz;
        if (c0198kgy != null) {
            c0198kgy.rz();
        }
        this.ahm.setPageMargin(i);
        if (i2 > 0 || i3 > 0) {
            int i4 = this.ay;
            com.bytedance.adsdk.ugeno.gf.rz rzVar = this.ahm;
            if (i4 == 1) {
                rzVar.setPadding(0, i2 + i, 0, i3 + i);
            } else {
                rzVar.setPadding(i2 + i, 0, i3 + i, 0);
            }
            this.ioy.setClipChildren(false);
            this.ahm.setClipChildren(false);
            this.ahm.setClipToPadding(false);
        }
        if (this.ay == 1) {
            com.bytedance.adsdk.ugeno.yo.ahm.uq uqVar = new com.bytedance.adsdk.ugeno.yo.ahm.uq();
            uqVar.kgy(str);
            this.ahm.kgy(true, (com.bytedance.adsdk.ugeno.gf.rz.ct) uqVar);
            this.ahm.setOverScrollMode(2);
        } else if (TextUtils.equals(str, "linear")) {
            this.ahm.kgy(false, (com.bytedance.adsdk.ugeno.gf.rz.ct) new com.bytedance.adsdk.ugeno.yo.ahm.rz());
        } else if (TextUtils.equals(str, "cube")) {
            this.ahm.kgy(false, (com.bytedance.adsdk.ugeno.gf.rz.ct) new com.bytedance.adsdk.ugeno.yo.ahm.kgy());
        } else {
            boolean zEquals = TextUtils.equals(str, "fade");
            com.bytedance.adsdk.ugeno.gf.rz rzVar2 = this.ahm;
            if (zEquals) {
                rzVar2.kgy(false, (com.bytedance.adsdk.ugeno.gf.rz.ct) new com.bytedance.adsdk.ugeno.yo.ahm.ahm());
            } else {
                rzVar2.kgy(false, (com.bytedance.adsdk.ugeno.gf.rz.ct) null);
            }
        }
        this.ahm.setOffscreenPageLimit((int) this.at);
    }

    public void kus(int i) {
        kgy(this.nu, this.fi, this.gf, this.ra, true);
        if (this.fpz == null) {
            this.fpz = new C0198kgy();
            this.ahm.kgy((com.bytedance.adsdk.ugeno.gf.rz.uq) this);
            this.ahm.setAdapter(this.fpz);
        }
        if (!this.vs) {
            if (i < 0 || i >= this.kgy.size()) {
                return;
            }
            this.ahm.kgy(i, true);
            return;
        }
        com.bytedance.adsdk.ugeno.gf.rz rzVar = this.ahm;
        if (i >= 1024) {
            rzVar.kgy(512, false);
        } else {
            rzVar.kgy(i, true);
        }
    }

    public kgy noq(int i) {
        this.lqi.setSelectedColor(i);
        return this;
    }

    public kgy ra(int i) {
        this.ra = i;
        kgy(this.nu, this.fi, this.gf, i, true);
        return this;
    }

    public void rz() {
        kgy(this.nu, this.fi, this.gf, this.ra, true);
        if (this.fpz == null) {
            this.fpz = new C0198kgy();
            this.ahm.kgy((com.bytedance.adsdk.ugeno.gf.rz.uq) this);
            this.ahm.setAdapter(this.fpz);
        }
        int i = this.fpp;
        if (i < 0 || i >= this.kgy.size()) {
            this.fpp = 0;
        }
        boolean z = this.vs;
        int i2 = this.fpp;
        if (z) {
            i2 += 512;
        }
        this.ahm.kgy(i2, true);
        if (!this.vs) {
            at(i2);
        }
        if (this.kus) {
            ct();
        }
    }

    public void setOnPageChangeListener(com.bytedance.adsdk.ugeno.yo.rz rzVar) {
        this.jpc = rzVar;
    }

    public void setTwoItems(boolean z) {
        this.um = z;
    }

    public kgy uq(boolean z) {
        this.lqi.setLoop(z);
        if (this.vs != z) {
            int iKgy = uq.kgy(z, this.ahm.getCurrentItem(), this.kgy.size());
            this.vs = z;
            C0198kgy c0198kgy = this.fpz;
            if (c0198kgy != null) {
                c0198kgy.rz();
                this.ahm.setCurrentItem(iKgy);
            }
        }
        return this;
    }

    public kgy(Context context) {
        super(context);
        this.kgy = new CopyOnWriteArrayList();
        this.uq = -1;
        this.ct = 2000;
        this.noq = 500;
        this.yo = 500;
        this.fi = 0;
        this.gf = -1;
        this.ra = -1;
        this.nu = Constants.NORMAL;
        this.at = 1.0f;
        this.twf = true;
        this.kus = true;
        this.vs = true;
        this.dg = true;
        this.fpp = 0;
        this.sx = 0;
        this.gm = 0;
        this.ay = 0;
        this.wy = true;
        this.vg = new Runnable() { // from class: com.bytedance.adsdk.ugeno.yo.kgy.2
            @Override // java.lang.Runnable
            public void run() {
                int currentItem = kgy.this.ahm.getCurrentItem() + 1;
                if (kgy.this.vs) {
                    kgy kgyVar = kgy.this;
                    if (currentItem >= 1024) {
                        kgyVar.ahm.kgy(512, false);
                        return;
                    } else {
                        kgyVar.ahm.kgy(currentItem, true);
                        return;
                    }
                }
                com.bytedance.adsdk.ugeno.gf.ahm adapter = kgy.this.ahm.getAdapter();
                if (adapter != null) {
                    int iKgy = adapter.kgy();
                    kgy kgyVar2 = kgy.this;
                    if (currentItem >= iKgy) {
                        kgyVar2.ahm.kgy(0, false);
                    } else {
                        kgyVar2.ahm.kgy(currentItem, true);
                    }
                }
            }
        };
        this.bmz = new Runnable() { // from class: com.bytedance.adsdk.ugeno.yo.kgy.3
            @Override // java.lang.Runnable
            public void run() {
                if (kgy.this.kus) {
                    kgy.this.wy = false;
                    int currentItem = kgy.this.ahm.getCurrentItem() + 1;
                    if (kgy.this.vs) {
                        kgy kgyVar = kgy.this;
                        if (currentItem >= 1024) {
                            kgyVar.ahm.kgy(512, false);
                        } else {
                            kgyVar.ahm.kgy(currentItem, true);
                        }
                        kgy kgyVar2 = kgy.this;
                        kgyVar2.postDelayed(kgyVar2.bmz, kgy.this.ct);
                        return;
                    }
                    com.bytedance.adsdk.ugeno.gf.ahm adapter = kgy.this.ahm.getAdapter();
                    if (adapter != null) {
                        int iKgy = adapter.kgy();
                        kgy kgyVar3 = kgy.this;
                        if (currentItem >= iKgy) {
                            kgyVar3.ahm.kgy(0, false);
                            kgy kgyVar4 = kgy.this;
                            kgyVar4.postDelayed(kgyVar4.bmz, kgy.this.ct);
                        } else {
                            kgyVar3.ahm.kgy(currentItem, true);
                            kgy kgyVar5 = kgy.this;
                            kgyVar5.postDelayed(kgyVar5.bmz, kgy.this.ct);
                        }
                    }
                }
            }
        };
        this.rz = context;
        this.ioy = new FrameLayout(context);
        this.ahm = kgy();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.ioy.addView(this.ahm, layoutParams);
        addView(this.ioy);
    }

    public void noq() {
        removeCallbacks(this.bmz);
    }

    public kgy ahm() {
        this.lqi.kgy();
        return this;
    }

    public kgy ahm(String str) {
        this.lqi.setIndicatorDirection(str);
        return this;
    }

    public kgy ahm(int i) {
        this.noq = i;
        return this;
    }

    public kgy ahm(boolean z) {
        this.dg = z;
        return this;
    }

    public kgy yo(int i) {
        this.lqi.setUnSelectedColor(i);
        return this;
    }

    public kgy ct(int i) {
        if (i < 0) {
            i = this.ct;
        }
        this.uq = i;
        ct();
        return this;
    }

    public kgy ct(float f) {
        this.at = f;
        return this;
    }

    public kgy ct(boolean z) {
        this.xh = z;
        return this;
    }

    public kgy uq(float f) {
        this.lqi.setIndicatorY(f);
        return this;
    }

    public kgy uq(int i) {
        this.ct = i;
        ct();
        return this;
    }

    public void uq() {
        noq();
        if (this.fpz != null) {
            this.ahm.ahm((com.bytedance.adsdk.ugeno.gf.rz.uq) this);
            this.ahm.setAdapter(null);
            this.fpz = null;
            this.ahm.removeAllViews();
            this.kgy.clear();
            this.lqi.rz();
        }
    }

    public kgy rz(float f) {
        this.lqi.setIndicatorX(f);
        return this;
    }

    public kgy rz(int i) {
        this.yo = i;
        if (this.ft == null) {
            this.ft = new ahm(this.rz, uf);
        }
        this.ahm.setScroller(this.ft);
        return this;
    }

    public kgy rz(boolean z) {
        this.twf = z;
        return this;
    }

    public kgy rz(String str) {
        this.nu = str;
        kgy(str, this.fi, this.gf, this.ra, true);
        return this;
    }

    public com.bytedance.adsdk.ugeno.gf.rz kgy() {
        return new rz(getContext());
    }

    public kgy kgy(String str) {
        if (TextUtils.equals(str, "rectangle")) {
            this.lqi = new com.bytedance.adsdk.ugeno.yo.kgy.rz(this.rz);
        } else {
            this.lqi = new com.bytedance.adsdk.ugeno.yo.kgy.ahm(this.rz);
        }
        addView(this.lqi, new FrameLayout.LayoutParams(-2, -2));
        return this;
    }

    public kgy kgy(float f) {
        this.lqi.setIndicatorWidth((int) f);
        return this;
    }

    public kgy kgy(int i) {
        this.ay = i;
        return this;
    }

    public kgy kgy(boolean z) {
        this.kus = z;
        ct();
        return this;
    }

    public View kgy(int i, int i2) {
        if (this.kgy.size() == 0) {
            return new View(getContext());
        }
        View viewNu = nu(i2);
        FrameLayout frameLayout = new FrameLayout(getContext());
        if (viewNu instanceof ViewGroup) {
            frameLayout.setClipChildren(true);
        }
        if (yo()) {
            viewNu.setTag("two_items_tag");
        }
        if (viewNu.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewNu.getParent()).removeView(viewNu);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(viewNu, layoutParams);
        frameLayout.addView(new View(getContext()), new FrameLayout.LayoutParams(-1, -1));
        if (yo()) {
            frameLayout.setTag(Integer.valueOf(i));
        }
        return frameLayout;
    }

    public kgy<T> kgy(T t) {
        if (t != null) {
            this.kgy.add(t);
            if (this.twf) {
                this.lqi.ahm();
            }
        }
        C0198kgy c0198kgy = this.fpz;
        if (c0198kgy != null) {
            c0198kgy.rz();
            this.lqi.kgy(this.fpp, this.ahm.getCurrentItem());
        }
        return this;
    }

    @Override // com.bytedance.adsdk.ugeno.gf.rz.uq
    public void kgy(int i, float f, int i2) {
        com.bytedance.adsdk.ugeno.yo.rz rzVar = this.jpc;
        if (rzVar != null) {
            boolean z = this.vs;
            rzVar.kgy(z, uq.kgy(z, i, this.kgy.size()), f, i2);
        }
        if (yo()) {
            kgy(i, findViewWithTag(Integer.valueOf(i)));
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int i3 = i + 1;
                kgy(i3, findViewWithTag(Integer.valueOf(i3)));
            }
        }
    }

    private void kgy(int i, View view) {
        View viewFindViewWithTag;
        if ((view instanceof ViewGroup) && (viewFindViewWithTag = view.findViewWithTag("two_items_tag")) == null) {
            T t = this.kgy.get(uq.kgy(true, i, this.kgy.size()));
            if (t == null) {
                return;
            }
            if (t instanceof com.bytedance.adsdk.ugeno.ahm.rz) {
                viewFindViewWithTag = ((com.bytedance.adsdk.ugeno.ahm.rz) t).nu();
            } else if (t instanceof View) {
                viewFindViewWithTag = (View) t;
            }
            if (viewFindViewWithTag == null) {
                return;
            }
            if (viewFindViewWithTag.getParent() instanceof ViewGroup) {
                ((ViewGroup) viewFindViewWithTag.getParent()).removeView(viewFindViewWithTag);
            }
            ((ViewGroup) view).addView(viewFindViewWithTag);
        }
    }
}
