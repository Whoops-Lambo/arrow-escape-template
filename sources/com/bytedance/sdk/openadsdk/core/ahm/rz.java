package com.bytedance.sdk.openadsdk.core.ahm;

import android.graphics.Point;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.bytedance.sdk.openadsdk.core.xh;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class rz implements View.OnClickListener, View.OnTouchListener {
    protected static int uf = 8;
    protected View bmz;
    protected float sx = -1.0f;
    protected float gm = -1.0f;
    protected float ay = -1.0f;
    protected float ioy = -1.0f;
    protected long lqi = -1;
    protected long fpz = -1;
    protected int jpc = -1;
    protected int ft = BackupConstant.UNFINISHED_FAIL_CODE;
    protected int wy = -1;
    protected boolean vg = true;
    public SparseArray<kgy> ikw = new SparseArray<>();
    private float kgy = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private float ahm = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private float rz = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private float uq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private long ct = 0;
    private int noq = 0;
    private int yo = 0;

    public abstract void kgy(View view, float f, float f2, float f3, float f4, SparseArray<kgy> sparseArray, boolean z);

    public abstract void kgy(View view, boolean z);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/ahm/rz;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(h.u, view);
        safedk_rz_onClick_91a2d3ea846b9e9c367e36e4aa632d18(view);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/ahm/rz;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        CreativeInfoManager.onViewTouched(h.u, view, motionEvent);
        return safedk_rz_onTouch_3b9cd4374e0dd02299213c5f42b8db1e(view, motionEvent);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        public double ahm;
        public int kgy;
        public double rz;
        public long uq;

        public kgy(int i, double d, double d2, long j) {
            this.kgy = i;
            this.ahm = d;
            this.rz = d2;
            this.uq = j;
        }
    }

    private boolean kgy(View view, Point point) {
        int i;
        int i2;
        int i3;
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                View childAt = viewGroup.getChildAt(i5);
                if (ahm.rz(childAt)) {
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    return view.isShown() && (i = point.x) >= (i2 = iArr[0]) && i <= childAt.getWidth() + i2 && (i3 = point.y) >= (i4 = iArr[1]) && i3 <= childAt.getHeight() + i4;
                }
                if (kgy(childAt, point)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean yo() {
        return this.vg;
    }

    static {
        if (xh.kgy() != null) {
            uf = xh.ahm();
        }
    }

    public void safedk_rz_onClick_91a2d3ea846b9e9c367e36e4aa632d18(View p0) {
        if (!com.bytedance.sdk.openadsdk.core.settings.yo.kgy()) {
            return;
        }
        kgy(p0, this.vg);
        kgy(p0, this.sx, this.gm, this.ay, this.ioy, this.ikw, this.vg);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    public boolean safedk_rz_onTouch_3b9cd4374e0dd02299213c5f42b8db1e(View p0, MotionEvent p1) {
        this.ft = p1.getDeviceId();
        this.jpc = p1.getToolType(0);
        this.wy = p1.getSource();
        int actionMasked = p1.getActionMasked();
        int i = 1;
        if (actionMasked != 0) {
            int i2 = 3;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    i2 = actionMasked != 3 ? -1 : 4;
                } else {
                    this.rz = Math.abs(p1.getX() - this.kgy) + this.rz;
                    this.uq = Math.abs(p1.getY() - this.ahm) + this.uq;
                    this.kgy = p1.getX();
                    this.ahm = p1.getY();
                    if (System.currentTimeMillis() - this.ct > 200) {
                        float f = this.rz;
                        int i3 = uf;
                        if (f <= i3 && this.uq <= i3) {
                            i = 2;
                        }
                    } else {
                        i = 2;
                    }
                    this.ay = p1.getRawX();
                    this.ioy = p1.getRawY();
                    if (Math.abs(this.ay - this.noq) >= uf || Math.abs(this.ioy - this.yo) >= uf) {
                        this.vg = false;
                    }
                }
            } else {
                this.ay = p1.getRawX();
                this.ioy = p1.getRawY();
                this.fpz = System.currentTimeMillis();
                if (Math.abs(this.ay - this.noq) >= uf || Math.abs(this.ioy - this.yo) >= uf) {
                    this.vg = false;
                }
                Point point = new Point((int) this.ay, (int) this.ioy);
                if (p0 != null && !ahm.rz(p0) && kgy((View) p0.getParent(), point)) {
                    return true;
                }
            }
            i = i2;
        } else {
            this.noq = (int) p1.getRawX();
            this.yo = (int) p1.getRawY();
            this.sx = p1.getRawX();
            this.gm = p1.getRawY();
            this.lqi = System.currentTimeMillis();
            this.jpc = p1.getToolType(0);
            this.ft = p1.getDeviceId();
            this.wy = p1.getSource();
            this.rz = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.uq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.ct = System.currentTimeMillis();
            this.vg = true;
            this.bmz = p0;
            com.bytedance.sdk.openadsdk.core.nu.rz.kgy(p1);
            this.kgy = p1.getX();
            this.ahm = p1.getY();
            i = 0;
        }
        this.ikw.put(p1.getActionMasked(), new kgy(i, p1.getSize(), p1.getPressure(), System.currentTimeMillis()));
        return false;
    }
}
