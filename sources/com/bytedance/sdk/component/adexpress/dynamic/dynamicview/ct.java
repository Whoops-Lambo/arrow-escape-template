package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.q63;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class ct extends FrameLayout implements IAnimation, muf, uxe {
    private static final View.OnTouchListener ay = new View.OnTouchListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct.2
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    };
    private static final View.OnClickListener ioy = new View.OnClickListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct.3
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    };
    private float ahm;
    protected com.bytedance.sdk.component.adexpress.dynamic.uq.yo at;
    protected float ct;
    protected boolean dg;
    protected int fi;
    private float fpp;
    protected int gf;
    private com.bytedance.sdk.component.utils.lqi gm;
    private float kgy;
    protected DynamicRootView kus;
    protected float noq;
    protected Context nu;
    protected int ra;
    protected float rz;
    private float sx;
    protected com.bytedance.sdk.component.adexpress.dynamic.uq.fi twf;
    com.bytedance.sdk.component.adexpress.dynamic.animation.view.rz um;
    protected float uq;
    protected View vs;
    protected com.bytedance.sdk.component.adexpress.dynamic.animation.kgy.ahm xh;
    protected int yo;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    public Drawable getBackgroundDrawable() {
        return kgy(false, "");
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    private List<String> ahm(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (str.charAt(i3) == '(') {
                i++;
                z = true;
            } else if (str.charAt(i3) == ')' && (i = i - 1) == 0 && z) {
                int i4 = i3 + 1;
                arrayList.add(str.substring(i2, i4));
                i2 = i4;
                z = false;
            }
        }
        return arrayList;
    }

    public boolean ct() {
        com.bytedance.sdk.component.adexpress.dynamic.uq.yo yoVar = this.at;
        return (yoVar == null || yoVar.ft() == 0) ? false : true;
    }

    public boolean fi() {
        com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar = this.twf;
        return fiVar == null || fiVar.ra() == null || this.twf.ra().ct() == null || this.twf.ra().ct().sa() == null;
    }

    public boolean getBeginInvisibleAndShow() {
        return this.dg;
    }

    public int getClickArea() {
        return this.at.ft();
    }

    public GradientDrawable getDrawable() {
        return new GradientDrawable();
    }

    public com.bytedance.sdk.component.adexpress.dynamic.noq.kgy getDynamicClickListener() {
        return this.kus.getDynamicClickListener();
    }

    public int getDynamicHeight() {
        return this.fi;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.uq.noq getDynamicLayoutBrickValue() {
        com.bytedance.sdk.component.adexpress.dynamic.uq.ct ctVarRa;
        com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar = this.twf;
        if (fiVar == null || (ctVarRa = fiVar.ra()) == null) {
            return null;
        }
        return ctVarRa.ct();
    }

    public int getDynamicWidth() {
        return this.yo;
    }

    public String getImageObjectFit() {
        return this.at.dpp();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.fpp;
    }

    public Drawable getMutilBackgroundDrawable() {
        try {
            return new LayerDrawable(kgy(ahm(this.at.vrj().replaceAll("/\\*.*\\*/", ""))));
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6QxVe8gnACqYMKX", "f/cjlA61auWBWdJqhRWnLU8=", "XOs5uBaoYMuiS9RWiwOvPVXqCYcCq2jFjE8=", 394);
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.kgy;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.ahm;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.sx;
    }

    public Drawable kgy(boolean z, String str) {
        String[] strArrSplit;
        int[] iArr;
        if (!TextUtils.isEmpty(this.at.vrj())) {
            try {
                String strVrj = this.at.vrj();
                String strSubstring = strVrj.substring(strVrj.indexOf("(") + 1, strVrj.length() - 1);
                if (strSubstring.contains("rgba") && strSubstring.contains("%")) {
                    strArrSplit = new String[]{strSubstring.substring(0, strSubstring.indexOf(",")).trim(), strSubstring.substring(strSubstring.indexOf(",") + 1, strSubstring.indexOf("%") + 1).trim(), strSubstring.substring(strSubstring.indexOf("%") + 2).trim()};
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.uq.yo.kgy(strArrSplit[1]), com.bytedance.sdk.component.adexpress.dynamic.uq.yo.kgy(strArrSplit[2])};
                } else {
                    strArrSplit = strSubstring.split(", ");
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.uq.yo.kgy(strArrSplit[1].substring(0, 7)), com.bytedance.sdk.component.adexpress.dynamic.uq.yo.kgy(strArrSplit[2].substring(0, 7))};
                }
                int[] iArr2 = iArr;
                String[] strArr = strArrSplit;
                try {
                    double d = Double.parseDouble(strSubstring.substring(strSubstring.indexOf("linear-gradient(") + 1, strSubstring.indexOf("deg")));
                    if (d > 225.0d && d < 315.0d) {
                        int i = iArr2[1];
                        iArr2[1] = iArr2[0];
                        iArr2[0] = i;
                    }
                } catch (Exception e) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6QxVe8gnACqYMKX", "f/cjlA61auWBWdJqhRWnLU8=", "XOs5twK/YsCSRcJTiDWyKUzvL5kG", Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE);
                }
                GradientDrawable gradientDrawableKgy = kgy(kgy(strArr[0]), iArr2);
                gradientDrawableKgy.setShape(0);
                gradientDrawableKgy.setCornerRadius(com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.nu, this.at.vs()));
                return gradientDrawableKgy;
            } catch (Exception e2) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e2, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6QxVe8gnACqYMKX", "f/cjlA61auWBWdJqhRWnLU8=", "XOs5twK/YsCSRcJTiDWyKUzvL5kG", Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE);
                Drawable mutilBackgroundDrawable = getMutilBackgroundDrawable();
                if (mutilBackgroundDrawable != null) {
                    return mutilBackgroundDrawable;
                }
            }
        }
        GradientDrawable drawable = getDrawable();
        drawable.setShape(0);
        float fKgy = com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.nu, this.at.vs());
        drawable.setCornerRadius(fKgy);
        if (fKgy < 1.0f) {
            float fKgy2 = com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.nu, this.at.vg());
            float fKgy3 = com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.nu, this.at.bmz());
            float fKgy4 = com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.nu, this.at.ikw());
            float fKgy5 = com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.nu, this.at.uxe());
            float[] fArr = new float[8];
            if (fKgy2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fArr[0] = fKgy2;
                fArr[1] = fKgy2;
            }
            if (fKgy3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fArr[2] = fKgy3;
                fArr[3] = fKgy3;
            }
            if (fKgy4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fArr[4] = fKgy4;
                fArr[5] = fKgy4;
            }
            if (fKgy5 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fArr[6] = fKgy5;
                fArr[7] = fKgy5;
            }
            drawable.setCornerRadii(fArr);
        }
        drawable.setColor(z ? Color.parseColor(str) : this.at.wy());
        if (this.at.xh() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            drawable.setStroke((int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.nu, this.at.xh()), this.at.dg());
            return drawable;
        }
        if (this.at.um() <= 0) {
            return drawable;
        }
        drawable.setStroke(this.at.um(), this.at.dg());
        drawable.setAlpha(50);
        if (!q63.B(this.twf, "video-vd")) {
            return drawable;
        }
        setLayerType(1, null);
        return new fpp((int) fKgy, this.at.um());
    }

    public void noq() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.yo, this.fi);
        layoutParams.topMargin = this.ra;
        int i = this.gf;
        layoutParams.leftMargin = i;
        layoutParams.setMarginStart(i);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f) {
        this.fpp = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f) {
        this.kgy = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f) {
        this.ahm = f;
        postInvalidate();
    }

    public void setShouldInvisible(boolean z) {
        this.dg = z;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f) {
        this.sx = f;
        this.um.kgy(this, f);
    }

    public boolean uq() {
        View.OnTouchListener onTouchListener;
        View.OnClickListener onClickListener;
        View view = this.vs;
        View view2 = view;
        if (view == null) {
            view2 = this;
        }
        if (ct()) {
            onTouchListener = (View.OnTouchListener) getDynamicClickListener();
            onClickListener = (View.OnClickListener) getDynamicClickListener();
        } else {
            onTouchListener = ay;
            onClickListener = ioy;
        }
        if (onTouchListener != null && onClickListener != null) {
            view2.setOnTouchListener(onTouchListener);
            view2.setOnClickListener(onClickListener);
            int iKgy = com.bytedance.sdk.component.adexpress.dynamic.ahm.kgy.kgy(this.at);
            if (iKgy == 2 || iKgy == 3) {
                view2.setOnClickListener(ioy);
            } else {
                view2.setOnClickListener(onClickListener);
            }
        }
        kgy(view2);
        ahm(view2);
        return true;
    }

    public ct(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar) {
        boolean z;
        super(context);
        this.nu = context;
        this.kus = dynamicRootView;
        this.twf = fiVar;
        this.rz = fiVar.noq();
        this.uq = fiVar.yo();
        this.ct = fiVar.fi();
        this.noq = fiVar.gf();
        this.gf = (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.nu, this.rz);
        this.ra = (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.nu, this.uq);
        this.yo = (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.nu, this.ct);
        this.fi = (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.nu, this.noq);
        com.bytedance.sdk.component.adexpress.dynamic.uq.yo yoVar = new com.bytedance.sdk.component.adexpress.dynamic.uq.yo(fiVar.ra());
        this.at = yoVar;
        if (yoVar.um() > 0) {
            this.yo = (this.at.um() * 2) + this.yo;
            this.fi = (this.at.um() * 2) + this.fi;
            this.gf -= this.at.um();
            this.ra -= this.at.um();
            List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi> listNu = fiVar.nu();
            if (listNu != null) {
                for (com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar2 : listNu) {
                    fiVar2.rz(fiVar2.noq() + com.bytedance.sdk.component.adexpress.uq.yo.ahm(this.nu, this.at.um()));
                    fiVar2.uq(fiVar2.yo() + com.bytedance.sdk.component.adexpress.uq.yo.ahm(this.nu, this.at.um()));
                    fiVar2.kgy(com.bytedance.sdk.component.adexpress.uq.yo.ahm(this.nu, this.at.um()));
                    fiVar2.ahm(com.bytedance.sdk.component.adexpress.uq.yo.ahm(this.nu, this.at.um()));
                }
            }
        }
        if (this.at.kus() > 0.0d) {
            z = true;
        } else {
            z = false;
        }
        this.dg = z;
        this.um = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.rz();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        yo();
        kgy();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ahm();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.um.kgy(canvas, this, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.bytedance.sdk.component.adexpress.dynamic.animation.view.rz] */
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
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ?? r3 = this.um;
        View view = this.vs;
        ?? r0 = this;
        if (view != null) {
            r0 = view;
        }
        r3.kgy(r0, i, i2);
    }

    public boolean rz() {
        gf();
        noq();
        uq();
        return true;
    }

    public void yo() {
        if (fi()) {
            return;
        }
        View view = this.vs;
        if (view == null) {
            view = this;
        }
        this.xh = new com.bytedance.sdk.component.adexpress.dynamic.animation.kgy.ahm(view, this.twf.ra().ct().sa());
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.adexpress.dynamic.animation.kgy.ahm ahmVar = ct.this.xh;
                if (ahmVar != null) {
                    ahmVar.kgy();
                }
            }
        });
    }

    public void ahm(@NonNull View view) {
        com.bytedance.sdk.component.adexpress.dynamic.uq.noq noqVarCt;
        com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar = this.twf;
        if (fiVar == null || (noqVarCt = fiVar.ra().ct()) == null) {
            return;
        }
        view.setTag(2097610716, Boolean.valueOf(noqVarCt.wn()));
    }

    public void ahm() {
        com.bytedance.sdk.component.adexpress.dynamic.animation.kgy.ahm ahmVar = this.xh;
        if (ahmVar != null) {
            ahmVar.ahm();
        }
    }

    public void kgy(View view) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.twf.fi());
            jSONObject.put("height", this.twf.gf());
            if (com.bytedance.sdk.component.adexpress.uq.ahm()) {
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.kgy.sx, this.at.mw());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.kgy.gm, this.twf.ra().ahm());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.kgy.ay, this.twf.rz());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.kgy.ioy, jSONObject.toString());
                return;
            }
            view.setTag(2097610717, this.at.mw());
            view.setTag(2097610715, this.twf.ra().ahm());
            view.setTag(2097610714, this.twf.rz());
            view.setTag(2097610713, jSONObject.toString());
            int iKgy = com.bytedance.sdk.component.adexpress.dynamic.ahm.kgy.kgy(this.at);
            if (iKgy == 1) {
                view.setTag(2097610707, new Pair(this.at.fpz(), Long.valueOf(this.at.jpc())));
                view.setTag(2097610708, Integer.valueOf(iKgy));
            }
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6QxVe8gnACqYMKX", "f/cjlA61auWBWdJqhRWnLU8=", "WuoptgyxZMiOftZa", 228);
        }
    }

    public ahm kgy(Bitmap bitmap) {
        return new kgy(bitmap, null);
    }

    private Drawable[] kgy(List<String> list) {
        Drawable[] drawableArr = new Drawable[list.size()];
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.contains("linear-gradient")) {
                String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.length() - 1).split(", ");
                int length = strArrSplit.length - 1;
                int[] iArr = new int[length];
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i2 + 1;
                    iArr[i2] = com.bytedance.sdk.component.adexpress.dynamic.uq.yo.kgy(strArrSplit[i3].substring(0, 7));
                    i2 = i3;
                }
                GradientDrawable gradientDrawableKgy = kgy(kgy(strArrSplit[0]), iArr);
                gradientDrawableKgy.setShape(0);
                gradientDrawableKgy.setCornerRadius(com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.nu, this.at.vs()));
                drawableArr[(list.size() - 1) - i] = gradientDrawableKgy;
            }
        }
        return drawableArr;
    }

    public GradientDrawable kgy(GradientDrawable.Orientation orientation, @ColorInt int[] iArr) {
        if (iArr != null && iArr.length != 0) {
            if (iArr.length == 1) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(iArr[0]);
                return gradientDrawable;
            }
            return new GradientDrawable(orientation, iArr);
        }
        return new GradientDrawable();
    }

    public GradientDrawable.Orientation kgy(String str) {
        try {
            int i = (int) Float.parseFloat(str.substring(0, str.length() - 3));
            if (i <= 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (i <= 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (i <= 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            return GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6QxVe8gnACqYMKX", "f/cjlA61auWBWdJqhRWnLU8=", "XOs5uhG1fcaUQ9hT", 473);
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    private void kgy() {
        if (isShown()) {
            int iKgy = com.bytedance.sdk.component.adexpress.dynamic.ahm.kgy.kgy(this.at);
            if (iKgy == 2) {
                if (this.gm == null) {
                    this.gm = new com.bytedance.sdk.component.utils.lqi(getContext().getApplicationContext(), 1);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct.4
                };
                com.bytedance.sdk.component.adexpress.ahm.twf renderRequest = this.kus.getRenderRequest();
                if (renderRequest != null) {
                    renderRequest.vs();
                    renderRequest.gm();
                    renderRequest.fpp();
                    return;
                }
                return;
            }
            if (iKgy == 3) {
                if (this.gm == null) {
                    this.gm = new com.bytedance.sdk.component.utils.lqi(getContext().getApplicationContext(), 2);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct.5
                };
                com.bytedance.sdk.component.adexpress.ahm.twf renderRequest2 = this.kus.getRenderRequest();
                if (renderRequest2 != null) {
                    renderRequest2.xh();
                    renderRequest2.ay();
                    renderRequest2.um();
                    renderRequest2.sx();
                }
            }
        }
    }
}
