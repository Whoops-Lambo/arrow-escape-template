package com.bytedance.sdk.component.adexpress.noq;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class at extends View {
    Rect ahm;
    private Xfermode at;
    private int ct;
    private int fi;
    private int[] gf;
    Rect kgy;
    private LinearGradient kus;
    private int noq;
    private Paint nu;
    private Bitmap ra;
    private int rz;
    private PorterDuff.Mode twf;
    private int uq;
    private final List<kgy> vs;
    private int yo;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        private int ahm = 0;
        private final int kgy;

        public void kgy() {
            this.ahm += this.kgy;
        }

        public kgy(int i) {
            this.kgy = i;
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public at(Context context) {
        super(context);
        this.twf = PorterDuff.Mode.DST_IN;
        this.vs = new ArrayList();
        kgy();
    }

    private void kgy() {
        this.rz = com.bytedance.sdk.component.utils.ay.uq(getContext(), "tt_splash_unlock_image_arrow");
        this.uq = Color.parseColor("#00ffffff");
        this.ct = Color.parseColor("#ffffffff");
        int color = Color.parseColor("#00ffffff");
        this.noq = color;
        this.yo = 10;
        this.fi = 40;
        this.gf = new int[]{this.uq, this.ct, color};
        setLayerType(1, null);
        this.nu = new Paint(1);
        this.ra = BitmapFactory.decodeResource(getResources(), this.rz);
        this.at = new PorterDuffXfermode(this.twf);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.ra, this.kgy, this.ahm, this.nu);
        canvas.save();
        Iterator<kgy> it = this.vs.iterator();
        while (it.hasNext()) {
            kgy next = it.next();
            this.kus = new LinearGradient(next.ahm, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, next.ahm + this.fi, this.yo, this.gf, (float[]) null, Shader.TileMode.CLAMP);
            this.nu.setColor(-1);
            this.nu.setShader(this.kus);
            Canvas canvas2 = canvas;
            canvas2.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), getHeight(), this.nu);
            this.nu.setShader(null);
            next.kgy();
            if (next.ahm > getWidth()) {
                it.remove();
            }
            canvas = canvas2;
        }
        Canvas canvas3 = canvas;
        this.nu.setXfermode(this.at);
        canvas3.drawBitmap(this.ra, this.kgy, this.ahm, this.nu);
        this.nu.setXfermode(null);
        canvas3.restore();
        invalidate();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.ra == null) {
            return;
        }
        this.kgy = new Rect(0, 0, this.ra.getWidth(), this.ra.getHeight());
        this.ahm = new Rect(0, 0, getWidth(), getHeight());
    }

    public void kgy(int i) {
        this.vs.add(new kgy(i));
        postInvalidate();
    }
}
