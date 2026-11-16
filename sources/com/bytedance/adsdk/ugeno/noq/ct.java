package com.bytedance.adsdk.ugeno.noq;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.fi.yo;
import com.unity3d.services.UnityAdsConstants;
import defpackage.d;
import defpackage.e32;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class ct extends ViewGroup implements com.bytedance.adsdk.ugeno.noq.kgy {
    private int ahm;
    private int at;
    private int ct;
    private List<rz> dg;
    private Drawable fi;
    private int gf;
    private int kgy;
    private SparseIntArray kus;
    private int noq;
    private int nu;
    private int ra;
    private int rz;
    private int[] twf;
    private uq.kgy um;
    private int uq;
    private uq vs;
    private com.bytedance.adsdk.ugeno.ct xh;
    private Drawable yo;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy extends ViewGroup.MarginLayoutParams implements ahm {
        public static final Parcelable.Creator<kgy> CREATOR = new Parcelable.Creator<kgy>() { // from class: com.bytedance.adsdk.ugeno.noq.ct.kgy.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
            public kgy createFromParcel(Parcel parcel) {
                return new kgy(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
            public kgy[] newArray(int i) {
                return new kgy[i];
            }
        };
        private float ahm;
        private float ct;
        private int fi;
        private int gf;
        private int kgy;
        private int noq;
        private boolean ra;
        private float rz;
        private int uq;
        private int yo;

        public kgy(Parcel parcel) {
            super(0, 0);
            this.kgy = 1;
            this.ahm = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.rz = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.uq = -1;
            this.ct = -1.0f;
            this.noq = -1;
            this.yo = -1;
            this.fi = 16777215;
            this.gf = 16777215;
            this.kgy = parcel.readInt();
            this.ahm = parcel.readFloat();
            this.rz = parcel.readFloat();
            this.uq = parcel.readInt();
            this.ct = parcel.readFloat();
            this.noq = parcel.readInt();
            this.yo = parcel.readInt();
            this.fi = parcel.readInt();
            this.gf = parcel.readInt();
            this.ra = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.bytedance.adsdk.ugeno.noq.ahm
        public int ahm() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.bytedance.adsdk.ugeno.noq.ahm
        public float at() {
            return this.ct;
        }

        @Override // com.bytedance.adsdk.ugeno.noq.ahm
        public float ct() {
            return this.rz;
        }

        @Override // com.bytedance.adsdk.ugeno.noq.ahm
        public int dg() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.noq.ahm
        public int fi() {
            return this.yo;
        }

        @Override // com.bytedance.adsdk.ugeno.noq.ahm
        public int gf() {
            return this.fi;
        }

        @Override // com.bytedance.adsdk.ugeno.noq.ahm
        public int kgy() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.bytedance.adsdk.ugeno.noq.ahm
        public int kus() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.noq.ahm
        public int noq() {
            return this.uq;
        }

        @Override // com.bytedance.adsdk.ugeno.noq.ahm
        public boolean nu() {
            return this.ra;
        }

        @Override // com.bytedance.adsdk.ugeno.noq.ahm
        public int ra() {
            return this.gf;
        }

        @Override // com.bytedance.adsdk.ugeno.noq.ahm
        public int rz() {
            return this.kgy;
        }

        @Override // com.bytedance.adsdk.ugeno.noq.ahm
        public int twf() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.noq.ahm
        public float uq() {
            return this.ahm;
        }

        @Override // com.bytedance.adsdk.ugeno.noq.ahm
        public int vs() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.kgy);
            parcel.writeFloat(this.ahm);
            parcel.writeFloat(this.rz);
            parcel.writeInt(this.uq);
            parcel.writeFloat(this.ct);
            parcel.writeInt(this.noq);
            parcel.writeInt(this.yo);
            parcel.writeInt(this.fi);
            parcel.writeInt(this.gf);
            parcel.writeByte(this.ra ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.bytedance.adsdk.ugeno.noq.ahm
        public int yo() {
            return this.noq;
        }

        public void ahm(float f) {
            this.rz = f;
        }

        public void kgy(float f) {
            this.ahm = f;
        }

        public void rz(int i) {
            this.kgy = i;
        }

        public void uq(int i) {
            this.uq = i;
        }

        @Override // com.bytedance.adsdk.ugeno.noq.ahm
        public void ahm(int i) {
            this.yo = i;
        }

        @Override // com.bytedance.adsdk.ugeno.noq.ahm
        public void kgy(int i) {
            this.noq = i;
        }

        public void rz(float f) {
            this.ct = f;
        }

        public kgy(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.kgy = 1;
            this.ahm = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.rz = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.uq = -1;
            this.ct = -1.0f;
            this.noq = -1;
            this.yo = -1;
            this.fi = 16777215;
            this.gf = 16777215;
        }

        public kgy(int i, int i2) {
            super(new ViewGroup.LayoutParams(i, i2));
            this.kgy = 1;
            this.ahm = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.rz = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.uq = -1;
            this.ct = -1.0f;
            this.noq = -1;
            this.yo = -1;
            this.fi = 16777215;
            this.gf = 16777215;
        }

        public kgy(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.kgy = 1;
            this.ahm = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.rz = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.uq = -1;
            this.ct = -1.0f;
            this.noq = -1;
            this.yo = -1;
            this.fi = 16777215;
            this.gf = 16777215;
        }

        public kgy(kgy kgyVar) {
            super((ViewGroup.MarginLayoutParams) kgyVar);
            this.kgy = 1;
            this.ahm = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.rz = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.uq = -1;
            this.ct = -1.0f;
            this.noq = -1;
            this.yo = -1;
            this.fi = 16777215;
            this.gf = 16777215;
            this.kgy = kgyVar.kgy;
            this.ahm = kgyVar.ahm;
            this.rz = kgyVar.rz;
            this.uq = kgyVar.uq;
            this.ct = kgyVar.ct;
            this.noq = kgyVar.noq;
            this.yo = kgyVar.yo;
            this.fi = kgyVar.fi;
            this.gf = kgyVar.gf;
            this.ra = kgyVar.ra;
        }
    }

    public ct(Context context) {
        super(context, null);
        this.noq = -1;
        this.vs = new uq(this);
        this.dg = new ArrayList();
        this.um = new uq.kgy();
    }

    private boolean ct(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View viewRz = rz(i - i3);
            if (viewRz != null && viewRz.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private boolean noq(int i) {
        if (i >= 0 && i < this.dg.size()) {
            for (int i2 = i + 1; i2 < this.dg.size(); i2++) {
                if (this.dg.get(i2).ahm() > 0) {
                    return false;
                }
            }
            if (kgy()) {
                return (this.gf & 4) != 0;
            }
            if ((this.ra & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean uq(int i) {
        if (i >= 0 && i < this.dg.size()) {
            if (ct(i)) {
                if (kgy()) {
                    return (this.gf & 1) != 0;
                }
                return (this.ra & 1) != 0;
            }
            if (kgy()) {
                return (this.gf & 2) != 0;
            }
            if ((this.ra & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00db  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:55:0x010d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0113  */
    /* JADX WARN: Code duplicated, block: B:60:0x0118  */
    /* JADX WARN: Code duplicated, block: B:62:0x013d  */
    /* JADX WARN: Code duplicated, block: B:63:0x015f  */
    /* JADX WARN: Code duplicated, block: B:65:0x016f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0187  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x01de  */
    private void kgy(boolean z, int i, int i2, int i3, int i4) {
        float measuredWidth;
        float f;
        float f2;
        float fMax;
        int i5;
        int i6;
        View viewRz;
        boolean z2;
        int i7;
        int i8;
        float f3;
        float f4;
        int i9;
        float f5;
        int i10;
        View view;
        uq uqVar;
        rz rzVar;
        uq uqVar2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i11 = i3 - i;
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.dg.size();
        for (int i12 = 0; i12 < size; i12++) {
            rz rzVar2 = this.dg.get(i12);
            if (uq(i12)) {
                int i13 = this.nu;
                paddingBottom -= i13;
                paddingTop += i13;
            }
            int i14 = paddingBottom;
            int i15 = this.rz;
            char c = 4;
            int i16 = 2;
            boolean z3 = true;
            if (i15 == 0) {
                measuredWidth = paddingLeft;
                f = i11 - paddingRight;
            } else if (i15 != 1) {
                if (i15 == 2) {
                    int i17 = rzVar2.ct;
                    measuredWidth = paddingLeft + ((i11 - i17) / 2.0f);
                    f = (i11 - paddingRight) - ((i11 - i17) / 2.0f);
                } else if (i15 == 3) {
                    measuredWidth = paddingLeft;
                    int iAhm = rzVar2.ahm();
                    f2 = (i11 - rzVar2.ct) / (iAhm != 1 ? iAhm - 1 : 1.0f);
                    f = i11 - paddingRight;
                } else if (i15 == 4) {
                    int iAhm2 = rzVar2.ahm();
                    float f6 = iAhm2 != 0 ? (i11 - rzVar2.ct) / iAhm2 : 0.0f;
                    float f7 = f6 / 2.0f;
                    measuredWidth = paddingLeft + f7;
                    float f8 = (i11 - paddingRight) - f7;
                    f2 = f6;
                    f = f8;
                } else {
                    if (i15 != 5) {
                        e.e(this.rz, "Invalid justifyContent is set: ");
                        return;
                    }
                    int iAhm3 = rzVar2.ahm();
                    f2 = iAhm3 != 0 ? (i11 - rzVar2.ct) / (iAhm3 + 1) : 0.0f;
                    measuredWidth = paddingLeft + f2;
                    f = (i11 - paddingRight) - f2;
                }
                fMax = Math.max(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                i5 = 0;
                while (i5 < rzVar2.fi) {
                    i6 = rzVar2.vs + i5;
                    viewRz = rz(i6);
                    char c2 = c;
                    if (viewRz != null) {
                        z2 = z3;
                        if (viewRz.getVisibility() != 8) {
                            kgy kgyVar = (kgy) viewRz.getLayoutParams();
                            f3 = measuredWidth + ((ViewGroup.MarginLayoutParams) kgyVar).leftMargin;
                            f4 = f - ((ViewGroup.MarginLayoutParams) kgyVar).rightMargin;
                            if (uq(i6, i5)) {
                                int i18 = this.at;
                                float f9 = i18;
                                f3 += f9;
                                f4 -= f9;
                                i9 = i18;
                            } else {
                                i9 = 0;
                            }
                            f5 = f4;
                            if (i5 == rzVar2.fi - 1 || (this.ra & 4) <= 0) {
                                i10 = 0;
                            } else {
                                i10 = this.at;
                            }
                            if (this.ahm == i16) {
                                i7 = i16;
                                uqVar2 = this.vs;
                                if (z) {
                                    view = viewRz;
                                    uqVar2.kgy(view, rzVar2, Math.round(f5) - viewRz.getMeasuredWidth(), i14 - viewRz.getMeasuredHeight(), Math.round(f5), i14);
                                } else {
                                    view = viewRz;
                                    uqVar2.kgy(view, rzVar2, Math.round(f3), i14 - view.getMeasuredHeight(), view.getMeasuredWidth() + Math.round(f3), i14);
                                }
                                i8 = i14;
                            } else {
                                i5 = i5;
                                view = viewRz;
                                z2 = z2;
                                i7 = i16;
                                i8 = i14;
                                uqVar = this.vs;
                                if (z) {
                                    uqVar.kgy(view, rzVar2, Math.round(f5) - view.getMeasuredWidth(), paddingTop, Math.round(f5), view.getMeasuredHeight() + paddingTop);
                                } else {
                                    int i19 = paddingTop;
                                    uqVar.kgy(view, rzVar2, Math.round(f3), i19, view.getMeasuredWidth() + Math.round(f3), view.getMeasuredHeight() + i19);
                                    paddingTop = i19;
                                }
                            }
                            measuredWidth = f3 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) kgyVar).rightMargin;
                            float measuredWidth2 = f5 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) kgyVar).leftMargin);
                            if (z) {
                                rzVar = rzVar2;
                                rzVar.kgy(view, i10, 0, i9, 0);
                            } else {
                                rzVar = rzVar2;
                                rzVar.kgy(view, i9, 0, i10, 0);
                            }
                            rzVar2 = rzVar;
                            f = measuredWidth2;
                        } else {
                            z2 = z2;
                        }
                        i5++;
                        c = c2;
                        i16 = i7;
                        z3 = z2;
                        i14 = i8;
                    } else {
                        z2 = z3;
                    }
                    i7 = i16;
                    i5 = i5;
                    i8 = i14;
                    i5++;
                    c = c2;
                    i16 = i7;
                    z3 = z2;
                    i14 = i8;
                }
                int i20 = rzVar2.yo;
                paddingTop += i20;
                paddingBottom = i14 - i20;
            } else {
                int i21 = rzVar2.ct;
                f = i21 - paddingLeft;
                measuredWidth = (i11 - i21) + paddingRight;
            }
            f2 = 0.0f;
            fMax = Math.max(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            i5 = 0;
            while (i5 < rzVar2.fi) {
                i6 = rzVar2.vs + i5;
                viewRz = rz(i6);
                char c3 = c;
                if (viewRz != null) {
                    z2 = z3;
                    if (viewRz.getVisibility() != 8) {
                        kgy kgyVar2 = (kgy) viewRz.getLayoutParams();
                        f3 = measuredWidth + ((ViewGroup.MarginLayoutParams) kgyVar2).leftMargin;
                        f4 = f - ((ViewGroup.MarginLayoutParams) kgyVar2).rightMargin;
                        if (uq(i6, i5)) {
                            int i110 = this.at;
                            float f10 = i110;
                            f3 += f10;
                            f4 -= f10;
                            i9 = i110;
                        } else {
                            i9 = 0;
                        }
                        f5 = f4;
                        if (i5 == rzVar2.fi - 1) {
                            i10 = 0;
                        } else {
                            i10 = 0;
                        }
                        if (this.ahm == i16) {
                            i7 = i16;
                            uqVar2 = this.vs;
                            if (z) {
                                view = viewRz;
                                uqVar2.kgy(view, rzVar2, Math.round(f5) - viewRz.getMeasuredWidth(), i14 - viewRz.getMeasuredHeight(), Math.round(f5), i14);
                            } else {
                                view = viewRz;
                                uqVar2.kgy(view, rzVar2, Math.round(f3), i14 - view.getMeasuredHeight(), view.getMeasuredWidth() + Math.round(f3), i14);
                            }
                            i8 = i14;
                        } else {
                            i5 = i5;
                            view = viewRz;
                            z2 = z2;
                            i7 = i16;
                            i8 = i14;
                            uqVar = this.vs;
                            if (z) {
                                uqVar.kgy(view, rzVar2, Math.round(f5) - view.getMeasuredWidth(), paddingTop, Math.round(f5), view.getMeasuredHeight() + paddingTop);
                            } else {
                                int i111 = paddingTop;
                                uqVar.kgy(view, rzVar2, Math.round(f3), i111, view.getMeasuredWidth() + Math.round(f3), view.getMeasuredHeight() + i111);
                                paddingTop = i111;
                            }
                        }
                        measuredWidth = f3 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) kgyVar2).rightMargin;
                        float measuredWidth3 = f5 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) kgyVar2).leftMargin);
                        if (z) {
                            rzVar = rzVar2;
                            rzVar.kgy(view, i10, 0, i9, 0);
                        } else {
                            rzVar = rzVar2;
                            rzVar.kgy(view, i9, 0, i10, 0);
                        }
                        rzVar2 = rzVar;
                        f = measuredWidth3;
                    } else {
                        z2 = z2;
                    }
                    i5++;
                    c = c3;
                    i16 = i7;
                    z3 = z2;
                    i14 = i8;
                } else {
                    z2 = z3;
                }
                i7 = i16;
                i5 = i5;
                i8 = i14;
                i5++;
                c = c3;
                i16 = i7;
                z3 = z2;
                i14 = i8;
            }
            int i22 = rzVar2.yo;
            paddingTop += i22;
            paddingBottom = i14 - i22;
        }
    }

    private void rz(int i, int i2) {
        this.dg.clear();
        this.um.kgy();
        this.vs.ahm(this.um, i, i2);
        this.dg = this.um.kgy;
        this.vs.kgy(i, i2);
        this.vs.ahm(i, i2, getPaddingRight() + getPaddingLeft());
        this.vs.kgy();
        kgy(this.kgy, i, i2, this.um.ahm);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.kus == null) {
            this.kus = new SparseIntArray(getChildCount());
        }
        this.twf = this.vs.kgy(view, i, layoutParams, this.kus);
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof kgy;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof kgy) {
            return new kgy((kgy) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new kgy((ViewGroup.MarginLayoutParams) layoutParams) : new kgy(layoutParams);
    }

    @Override // com.bytedance.adsdk.ugeno.noq.kgy
    public int getAlignContent() {
        return this.ct;
    }

    @Override // com.bytedance.adsdk.ugeno.noq.kgy
    public int getAlignItems() {
        return this.uq;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.yo;
    }

    public Drawable getDividerDrawableVertical() {
        return this.fi;
    }

    @Override // com.bytedance.adsdk.ugeno.noq.kgy
    public int getFlexDirection() {
        return this.kgy;
    }

    public List<rz> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.dg.size());
        for (rz rzVar : this.dg) {
            if (rzVar.ahm() != 0) {
                arrayList.add(rzVar);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.noq.kgy
    public List<rz> getFlexLinesInternal() {
        return this.dg;
    }

    @Override // com.bytedance.adsdk.ugeno.noq.kgy
    public int getFlexWrap() {
        return this.ahm;
    }

    public int getJustifyContent() {
        return this.rz;
    }

    @Override // com.bytedance.adsdk.ugeno.noq.kgy
    public int getLargestMainSize() {
        Iterator<rz> it = this.dg.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().ct);
        }
        return iMax;
    }

    @Override // com.bytedance.adsdk.ugeno.noq.kgy
    public int getMaxLine() {
        return this.noq;
    }

    public int getShowDividerHorizontal() {
        return this.gf;
    }

    public int getShowDividerVertical() {
        return this.ra;
    }

    @Override // com.bytedance.adsdk.ugeno.noq.kgy
    public int getSumOfCrossSize() {
        int size = this.dg.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            rz rzVar = this.dg.get(i2);
            if (uq(i2)) {
                i += kgy() ? this.nu : this.at;
            }
            if (noq(i2)) {
                i += kgy() ? this.nu : this.at;
            }
            i += rzVar.yo;
        }
        return i;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.fi == null && this.yo == null) {
            return;
        }
        if (this.gf == 0 && this.ra == 0) {
            return;
        }
        int iKgy = yo.kgy(this);
        int i = this.kgy;
        if (i == 0) {
            kgy(canvas, iKgy == 1, this.ahm == 2);
            return;
        }
        if (i == 1) {
            kgy(canvas, iKgy != 1, this.ahm == 2);
            return;
        }
        if (i == 2) {
            boolean z = iKgy == 1;
            if (this.ahm == 2) {
                z = !z;
            }
            ahm(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z2 = iKgy == 1;
        if (this.ahm == 2) {
            z2 = !z2;
        }
        ahm(canvas, z2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        com.bytedance.adsdk.ugeno.ct ctVar = this.xh;
        if (ctVar != null) {
            ctVar.noq();
        }
        int iKgy = yo.kgy(this);
        int i5 = this.kgy;
        if (i5 == 0) {
            kgy(iKgy == 1, i, i2, i3, i4);
        } else if (i5 == 1) {
            kgy(iKgy != 1, i, i2, i3, i4);
        } else if (i5 == 2) {
            z2 = iKgy == 1;
            if (this.ahm == 2) {
                z2 = !z2;
            }
            kgy(z2, false, i, i2, i3, i4);
        } else {
            if (i5 != 3) {
                e.e(this.kgy, "Invalid flex direction is set: ");
                return;
            }
            z2 = iKgy == 1;
            if (this.ahm == 2) {
                z2 = !z2;
            }
            kgy(z2, true, i, i2, i3, i4);
        }
        com.bytedance.adsdk.ugeno.ct ctVar2 = this.xh;
        if (ctVar2 != null) {
            ctVar2.kgy(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        com.bytedance.adsdk.ugeno.ct ctVar = this.xh;
        if (ctVar != null) {
            int[] iArrKgy = ctVar.kgy(i, i2);
            kgy(iArrKgy[0], iArrKgy[1]);
        } else {
            kgy(i, i2);
        }
        com.bytedance.adsdk.ugeno.ct ctVar2 = this.xh;
        if (ctVar2 != null) {
            ctVar2.ct();
        }
    }

    public void setAlignContent(int i) {
        if (this.ct != i) {
            this.ct = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.uq != i) {
            this.uq = i;
            requestLayout();
        }
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.yo) {
            return;
        }
        this.yo = drawable;
        if (drawable != null) {
            this.nu = drawable.getIntrinsicHeight();
        } else {
            this.nu = 0;
        }
        ahm();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.fi) {
            return;
        }
        this.fi = drawable;
        if (drawable != null) {
            this.at = drawable.getIntrinsicWidth();
        } else {
            this.at = 0;
        }
        ahm();
        requestLayout();
    }

    public void setFlexDirection(int i) {
        if (this.kgy != i) {
            this.kgy = i;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.noq.kgy
    public void setFlexLines(List<rz> list) {
        this.dg = list;
    }

    public void setFlexWrap(int i) {
        if (this.ahm != i) {
            this.ahm = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.rz != i) {
            this.rz = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.noq != i) {
            this.noq = i;
            requestLayout();
        }
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.gf) {
            this.gf = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.ra) {
            this.ra = i;
            requestLayout();
        }
    }

    private void ahm(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.dg.size();
        for (int i3 = 0; i3 < size; i3++) {
            rz rzVar = this.dg.get(i3);
            for (int i4 = 0; i4 < rzVar.fi; i4++) {
                int i5 = rzVar.vs + i4;
                View viewRz = rz(i5);
                if (viewRz != null && viewRz.getVisibility() != 8) {
                    kgy kgyVar = (kgy) viewRz.getLayoutParams();
                    if (uq(i5, i4)) {
                        if (z2) {
                            top = viewRz.getBottom() + ((ViewGroup.MarginLayoutParams) kgyVar).bottomMargin;
                        } else {
                            top = (viewRz.getTop() - ((ViewGroup.MarginLayoutParams) kgyVar).topMargin) - this.nu;
                        }
                        ahm(canvas, rzVar.kgy, top, rzVar.yo);
                    }
                    if (i4 == rzVar.fi - 1 && (this.gf & 4) > 0) {
                        if (z2) {
                            bottom = (viewRz.getTop() - ((ViewGroup.MarginLayoutParams) kgyVar).topMargin) - this.nu;
                        } else {
                            bottom = viewRz.getBottom() + ((ViewGroup.MarginLayoutParams) kgyVar).bottomMargin;
                        }
                        ahm(canvas, rzVar.kgy, bottom, rzVar.yo);
                    }
                }
            }
            if (uq(i3)) {
                if (z) {
                    i2 = rzVar.rz;
                } else {
                    i2 = rzVar.kgy - this.at;
                }
                kgy(canvas, i2, paddingTop, iMax);
            }
            if (noq(i3) && (this.ra & 4) > 0) {
                if (z) {
                    i = rzVar.kgy - this.at;
                } else {
                    i = rzVar.rz;
                }
                kgy(canvas, i, paddingTop, iMax);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.noq.kgy
    public int getFlexItemCount() {
        return getChildCount();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.ct ctVar = this.xh;
        if (ctVar != null) {
            ctVar.yo();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.ct ctVar = this.xh;
        if (ctVar != null) {
            ctVar.fi();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        com.bytedance.adsdk.ugeno.ct ctVar = this.xh;
        if (ctVar != null) {
            ctVar.ahm(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        com.bytedance.adsdk.ugeno.ct ctVar = this.xh;
        if (ctVar != null) {
            ctVar.kgy(z);
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    private boolean ct(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.dg.get(i2).ahm() > 0) {
                return false;
            }
        }
        return true;
    }

    public View rz(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.twf;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    private boolean uq(int i, int i2) {
        if (ct(i, i2)) {
            if (kgy()) {
                return (this.ra & 1) != 0;
            }
            return (this.gf & 1) != 0;
        }
        if (kgy()) {
            return (this.ra & 2) != 0;
        }
        return (this.gf & 2) != 0;
    }

    private void ahm(int i, int i2) {
        this.dg.clear();
        this.um.kgy();
        this.vs.kgy(this.um, i, i2);
        this.dg = this.um.kgy;
        this.vs.kgy(i, i2);
        if (this.uq == 3) {
            for (rz rzVar : this.dg) {
                int iMax = Integer.MIN_VALUE;
                for (int i3 = 0; i3 < rzVar.fi; i3++) {
                    View viewRz = rz(rzVar.vs + i3);
                    if (viewRz != null && viewRz.getVisibility() != 8) {
                        kgy kgyVar = (kgy) viewRz.getLayoutParams();
                        int i4 = this.ahm;
                        int i5 = rzVar.at;
                        if (i4 != 2) {
                            iMax = Math.max(iMax, viewRz.getMeasuredHeight() + Math.max(i5 - viewRz.getBaseline(), ((ViewGroup.MarginLayoutParams) kgyVar).topMargin) + ((ViewGroup.MarginLayoutParams) kgyVar).bottomMargin);
                        } else {
                            iMax = Math.max(iMax, viewRz.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) kgyVar).topMargin + Math.max(viewRz.getBaseline() + (i5 - viewRz.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) kgyVar).bottomMargin));
                        }
                    }
                }
                rzVar.yo = iMax;
            }
        }
        this.vs.ahm(i, i2, getPaddingBottom() + getPaddingTop());
        this.vs.kgy();
        kgy(this.kgy, i, i2, this.um.ahm);
    }

    @Override // com.bytedance.adsdk.ugeno.noq.kgy
    public View ahm(int i) {
        return rz(i);
    }

    private void ahm(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.yo;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.nu + i2);
        this.yo.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.noq.kgy
    public int ahm(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    private void ahm() {
        if (this.yo == null && this.fi == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    private void kgy(int i, int i2) {
        if (this.kus == null) {
            this.kus = new SparseIntArray(getChildCount());
        }
        if (this.vs.ahm(this.kus)) {
            this.twf = this.vs.kgy(this.kus);
        }
        int i3 = this.kgy;
        if (i3 == 0 || i3 == 1) {
            ahm(i, i2);
        } else if (i3 != 2 && i3 != 3) {
            e.e(this.kgy, "Invalid value for the flex direction is set: ");
        } else {
            rz(i, i2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.noq.kgy
    public View kgy(int i) {
        return getChildAt(i);
    }

    private void kgy(int i, int i2, int i3, int i4) {
        int paddingBottom;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        } else {
            if (i != 2 && i != 3) {
                d.r("Invalid flex direction: ".concat(String.valueOf(i)));
                return;
            }
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i2, i4);
        } else if (mode == 1073741824) {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else {
            e32.i("Unknown width mode is set: ".concat(String.valueOf(mode)));
            return;
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = paddingBottom;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i3, i4);
        } else if (mode2 == 1073741824) {
            if (size2 < paddingBottom) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else {
            e32.i("Unknown height mode is set: ".concat(String.valueOf(mode2)));
            return;
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    @Override // com.bytedance.adsdk.ugeno.noq.kgy
    public boolean kgy() {
        int i = this.kgy;
        return i == 0 || i == 1;
    }

    @Override // com.bytedance.adsdk.ugeno.noq.kgy
    public int kgy(View view) {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00db  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:55:0x0109  */
    /* JADX WARN: Code duplicated, block: B:57:0x010d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0112  */
    /* JADX WARN: Code duplicated, block: B:61:0x0133  */
    /* JADX WARN: Code duplicated, block: B:62:0x0150  */
    /* JADX WARN: Code duplicated, block: B:64:0x015a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0174  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c8  */
    private void kgy(boolean z, boolean z2, int i, int i2, int i3, int i4) {
        float measuredHeight;
        float f;
        float f2;
        float fMax;
        int i5;
        int i6;
        int i7;
        View viewRz;
        char c;
        int i8;
        int i9;
        float f3;
        float f4;
        int i10;
        float f5;
        int i11;
        uq uqVar;
        rz rzVar;
        uq uqVar2;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i12 = i4 - i2;
        int i13 = (i3 - i) - paddingRight;
        int size = this.dg.size();
        for (int i14 = 0; i14 < size; i14++) {
            rz rzVar2 = this.dg.get(i14);
            if (uq(i14)) {
                int i15 = this.at;
                paddingLeft += i15;
                i13 -= i15;
            }
            int i16 = i13;
            int i17 = this.rz;
            char c2 = 4;
            int i18 = 1;
            if (i17 == 0) {
                measuredHeight = paddingTop;
                f = i12 - paddingBottom;
            } else if (i17 == 1) {
                int i19 = rzVar2.ct;
                f = i19 - paddingTop;
                measuredHeight = (i12 - i19) + paddingBottom;
            } else {
                if (i17 == 2) {
                    int i20 = rzVar2.ct;
                    measuredHeight = paddingTop + ((i12 - i20) / 2.0f);
                    f = (i12 - paddingBottom) - ((i12 - i20) / 2.0f);
                } else if (i17 == 3) {
                    measuredHeight = paddingTop;
                    int iAhm = rzVar2.ahm();
                    f2 = (i12 - rzVar2.ct) / (iAhm != 1 ? iAhm - 1 : 1.0f);
                    f = i12 - paddingBottom;
                } else if (i17 == 4) {
                    int iAhm2 = rzVar2.ahm();
                    f2 = iAhm2 != 0 ? (i12 - rzVar2.ct) / iAhm2 : 0.0f;
                    float f6 = f2 / 2.0f;
                    measuredHeight = paddingTop + f6;
                    f = (i12 - paddingBottom) - f6;
                } else if (i17 == 5) {
                    int iAhm3 = rzVar2.ahm();
                    f2 = iAhm3 != 0 ? (i12 - rzVar2.ct) / (iAhm3 + 1) : 0.0f;
                    measuredHeight = paddingTop + f2;
                    f = (i12 - paddingBottom) - f2;
                } else {
                    e.e(this.rz, "Invalid justifyContent is set: ");
                    return;
                }
                fMax = Math.max(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                i5 = 0;
                while (i5 < rzVar2.fi) {
                    i6 = rzVar2.vs + i5;
                    i7 = i18;
                    viewRz = rz(i6);
                    if (viewRz != null) {
                        c = c2;
                        if (viewRz.getVisibility() != 8) {
                            kgy kgyVar = (kgy) viewRz.getLayoutParams();
                            f3 = measuredHeight + ((ViewGroup.MarginLayoutParams) kgyVar).topMargin;
                            f4 = f - ((ViewGroup.MarginLayoutParams) kgyVar).bottomMargin;
                            if (uq(i6, i5)) {
                                i10 = this.nu;
                                float f7 = i10;
                                f3 += f7;
                                f4 -= f7;
                            } else {
                                i10 = 0;
                            }
                            f5 = f4;
                            if (i5 == rzVar2.fi - i7 || (this.gf & 4) <= 0) {
                                i11 = 0;
                            } else {
                                i11 = this.nu;
                            }
                            if (z) {
                                i8 = i5;
                                uqVar2 = this.vs;
                                if (z2) {
                                    uqVar2.kgy(viewRz, rzVar2, true, i16 - viewRz.getMeasuredWidth(), Math.round(f5) - viewRz.getMeasuredHeight(), i16, Math.round(f5));
                                } else {
                                    uqVar2.kgy(viewRz, rzVar2, true, i16 - viewRz.getMeasuredWidth(), Math.round(f3), i16, viewRz.getMeasuredHeight() + Math.round(f3));
                                }
                                i9 = i16;
                            } else {
                                i8 = i5;
                                i7 = i7;
                                i9 = i16;
                                uqVar = this.vs;
                                if (z2) {
                                    uqVar.kgy(viewRz, rzVar2, false, paddingLeft, Math.round(f5) - viewRz.getMeasuredHeight(), viewRz.getMeasuredWidth() + paddingLeft, Math.round(f5));
                                } else {
                                    int i21 = paddingLeft;
                                    uqVar.kgy(viewRz, rzVar2, false, i21, Math.round(f3), viewRz.getMeasuredWidth() + i21, viewRz.getMeasuredHeight() + Math.round(f3));
                                    paddingLeft = i21;
                                }
                            }
                            measuredHeight = f3 + viewRz.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) kgyVar).bottomMargin;
                            float measuredHeight2 = f5 - ((viewRz.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) kgyVar).topMargin);
                            if (z2) {
                                rzVar = rzVar2;
                                rzVar.kgy(viewRz, 0, i11, 0, i10);
                            } else {
                                rzVar = rzVar2;
                                rzVar.kgy(viewRz, 0, i10, 0, i11);
                            }
                            rzVar2 = rzVar;
                            f = measuredHeight2;
                        }
                        i5 = i8 + 1;
                        c2 = c;
                        i18 = i7;
                        i16 = i9;
                    } else {
                        c = c2;
                    }
                    i8 = i5;
                    i7 = i7;
                    i9 = i16;
                    i5 = i8 + 1;
                    c2 = c;
                    i18 = i7;
                    i16 = i9;
                }
                int i22 = rzVar2.yo;
                paddingLeft += i22;
                i13 = i16 - i22;
            }
            f2 = 0.0f;
            fMax = Math.max(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            i5 = 0;
            while (i5 < rzVar2.fi) {
                i6 = rzVar2.vs + i5;
                i7 = i18;
                viewRz = rz(i6);
                if (viewRz != null) {
                    c = c2;
                    if (viewRz.getVisibility() != 8) {
                        kgy kgyVar2 = (kgy) viewRz.getLayoutParams();
                        f3 = measuredHeight + ((ViewGroup.MarginLayoutParams) kgyVar2).topMargin;
                        f4 = f - ((ViewGroup.MarginLayoutParams) kgyVar2).bottomMargin;
                        if (uq(i6, i5)) {
                            i10 = this.nu;
                            float f8 = i10;
                            f3 += f8;
                            f4 -= f8;
                        } else {
                            i10 = 0;
                        }
                        f5 = f4;
                        if (i5 == rzVar2.fi - i7) {
                            i11 = 0;
                        } else {
                            i11 = 0;
                        }
                        if (z) {
                            i8 = i5;
                            uqVar2 = this.vs;
                            if (z2) {
                                uqVar2.kgy(viewRz, rzVar2, true, i16 - viewRz.getMeasuredWidth(), Math.round(f5) - viewRz.getMeasuredHeight(), i16, Math.round(f5));
                            } else {
                                uqVar2.kgy(viewRz, rzVar2, true, i16 - viewRz.getMeasuredWidth(), Math.round(f3), i16, viewRz.getMeasuredHeight() + Math.round(f3));
                            }
                            i9 = i16;
                        } else {
                            i8 = i5;
                            i7 = i7;
                            i9 = i16;
                            uqVar = this.vs;
                            if (z2) {
                                uqVar.kgy(viewRz, rzVar2, false, paddingLeft, Math.round(f5) - viewRz.getMeasuredHeight(), viewRz.getMeasuredWidth() + paddingLeft, Math.round(f5));
                            } else {
                                int i23 = paddingLeft;
                                uqVar.kgy(viewRz, rzVar2, false, i23, Math.round(f3), viewRz.getMeasuredWidth() + i23, viewRz.getMeasuredHeight() + Math.round(f3));
                                paddingLeft = i23;
                            }
                        }
                        measuredHeight = f3 + viewRz.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) kgyVar2).bottomMargin;
                        float measuredHeight3 = f5 - ((viewRz.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) kgyVar2).topMargin);
                        if (z2) {
                            rzVar = rzVar2;
                            rzVar.kgy(viewRz, 0, i11, 0, i10);
                        } else {
                            rzVar = rzVar2;
                            rzVar.kgy(viewRz, 0, i10, 0, i11);
                        }
                        rzVar2 = rzVar;
                        f = measuredHeight3;
                    }
                    i5 = i8 + 1;
                    c2 = c;
                    i18 = i7;
                    i16 = i9;
                } else {
                    c = c2;
                }
                i8 = i5;
                i7 = i7;
                i9 = i16;
                i5 = i8 + 1;
                c2 = c;
                i18 = i7;
                i16 = i9;
            }
            int i24 = rzVar2.yo;
            paddingLeft += i24;
            i13 = i16 - i24;
        }
    }

    private void kgy(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.dg.size();
        for (int i3 = 0; i3 < size; i3++) {
            rz rzVar = this.dg.get(i3);
            for (int i4 = 0; i4 < rzVar.fi; i4++) {
                int i5 = rzVar.vs + i4;
                View viewRz = rz(i5);
                if (viewRz != null && viewRz.getVisibility() != 8) {
                    kgy kgyVar = (kgy) viewRz.getLayoutParams();
                    if (uq(i5, i4)) {
                        if (z) {
                            left = viewRz.getRight() + ((ViewGroup.MarginLayoutParams) kgyVar).rightMargin;
                        } else {
                            left = (viewRz.getLeft() - ((ViewGroup.MarginLayoutParams) kgyVar).leftMargin) - this.at;
                        }
                        kgy(canvas, left, rzVar.ahm, rzVar.yo);
                    }
                    if (i4 == rzVar.fi - 1 && (this.ra & 4) > 0) {
                        if (z) {
                            right = (viewRz.getLeft() - ((ViewGroup.MarginLayoutParams) kgyVar).leftMargin) - this.at;
                        } else {
                            right = viewRz.getRight() + ((ViewGroup.MarginLayoutParams) kgyVar).rightMargin;
                        }
                        kgy(canvas, right, rzVar.ahm, rzVar.yo);
                    }
                }
            }
            if (uq(i3)) {
                if (z2) {
                    i2 = rzVar.uq;
                } else {
                    i2 = rzVar.ahm - this.nu;
                }
                ahm(canvas, paddingLeft, i2, iMax);
            }
            if (noq(i3) && (this.gf & 4) > 0) {
                if (z2) {
                    i = rzVar.ahm - this.nu;
                } else {
                    i = rzVar.uq;
                }
                ahm(canvas, paddingLeft, i, iMax);
            }
        }
    }

    private void kgy(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.fi;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.at + i, i3 + i2);
        this.fi.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.noq.kgy
    public int kgy(View view, int i, int i2) {
        int i3;
        int i4;
        if (kgy()) {
            i3 = uq(i, i2) ? this.at : 0;
            if ((this.ra & 4) <= 0) {
                return i3;
            }
            i4 = this.at;
        } else {
            i3 = uq(i, i2) ? this.nu : 0;
            if ((this.gf & 4) <= 0) {
                return i3;
            }
            i4 = this.nu;
        }
        return i3 + i4;
    }

    @Override // com.bytedance.adsdk.ugeno.noq.kgy
    public void kgy(rz rzVar) {
        if (kgy()) {
            if ((this.ra & 4) > 0) {
                int i = rzVar.ct;
                int i2 = this.at;
                rzVar.ct = i + i2;
                rzVar.noq += i2;
                return;
            }
            return;
        }
        if ((this.gf & 4) > 0) {
            int i3 = rzVar.ct;
            int i4 = this.nu;
            rzVar.ct = i3 + i4;
            rzVar.noq += i4;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.noq.kgy
    public int kgy(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.bytedance.adsdk.ugeno.noq.kgy
    public void kgy(View view, int i, int i2, rz rzVar) {
        if (uq(i, i2)) {
            if (kgy()) {
                int i3 = rzVar.ct;
                int i4 = this.at;
                rzVar.ct = i3 + i4;
                rzVar.noq += i4;
                return;
            }
            int i5 = rzVar.ct;
            int i6 = this.nu;
            rzVar.ct = i5 + i6;
            rzVar.noq += i6;
        }
    }

    public void kgy(com.bytedance.adsdk.ugeno.ahm.rz rzVar) {
        this.xh = rzVar;
    }
}
