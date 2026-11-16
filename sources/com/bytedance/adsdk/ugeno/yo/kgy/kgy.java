package com.bytedance.adsdk.ugeno.yo.kgy;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.yo.uq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class kgy extends LinearLayout {
    protected int ahm;
    private String at;
    private int ct;
    private boolean fi;
    private int gf;
    protected Context kgy;
    private int noq;
    private float nu;
    private float ra;
    protected int rz;
    private List<View> uq;
    private int yo;

    public abstract Drawable ahm(int i);

    public void ahm() {
        View view = new View(getContext());
        view.setClickable(false);
        if (this instanceof ahm) {
            this.rz = this.ahm;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.ahm, this.rz);
        int orientation = getOrientation();
        int i = this.yo;
        if (orientation == 1) {
            layoutParams.topMargin = i;
            layoutParams.bottomMargin = i;
        } else {
            layoutParams.leftMargin = i;
            layoutParams.rightMargin = i;
        }
        addView(view, layoutParams);
        view.setBackground(ahm(this.noq));
        this.uq.add(view);
    }

    public int getSize() {
        return this.uq.size();
    }

    public void kgy(int i) {
        if (this instanceof ahm) {
            this.rz = this.ahm;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.ahm, this.rz);
        int orientation = getOrientation();
        int i2 = this.yo;
        if (orientation == 1) {
            layoutParams.topMargin = i2;
            layoutParams.bottomMargin = i2;
        } else {
            layoutParams.leftMargin = i2;
            layoutParams.rightMargin = i2;
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.ahm, this.rz);
        int orientation2 = getOrientation();
        int i3 = this.yo;
        if (orientation2 == 1) {
            layoutParams2.topMargin = i3;
            layoutParams2.bottomMargin = i3;
        } else {
            layoutParams2.leftMargin = i3;
            layoutParams2.rightMargin = i3;
        }
        int iKgy = uq.kgy(this.fi, this.gf, this.uq.size());
        int iKgy2 = uq.kgy(this.fi, i, this.uq.size());
        if (this.uq.size() == 0) {
            iKgy2 = 0;
        }
        if (!this.uq.isEmpty() && uq.kgy(iKgy, this.uq) && uq.kgy(iKgy2, this.uq)) {
            this.uq.get(iKgy).setBackground(ahm(this.noq));
            this.uq.get(iKgy).setLayoutParams(layoutParams2);
            this.uq.get(iKgy2).setBackground(ahm(this.ct));
            this.uq.get(iKgy2).setLayoutParams(layoutParams);
            this.gf = i;
        }
    }

    public void rz() {
        this.uq.clear();
        removeAllViews();
    }

    public void setIndicatorDirection(String str) {
        this.at = str;
        if (TextUtils.equals(str, "column")) {
            setOrientation(1);
        } else {
            setOrientation(0);
        }
    }

    public void setIndicatorHeight(int i) {
        this.rz = i;
    }

    public void setIndicatorWidth(int i) {
        this.ahm = i;
    }

    public void setIndicatorX(float f) {
        this.ra = f;
    }

    public void setIndicatorY(float f) {
        this.nu = f;
    }

    public void setLoop(boolean z) {
        this.fi = z;
    }

    public void setSelectedColor(int i) {
        this.ct = i;
    }

    public void setUnSelectedColor(int i) {
        this.noq = i;
    }

    public kgy(Context context) {
        super(context);
        this.ct = -65536;
        this.noq = -16776961;
        this.yo = 5;
        this.ahm = 40;
        this.rz = 20;
        this.at = "row";
        this.kgy = context;
        this.uq = new ArrayList();
        setOrientation(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uq() {
        FrameLayout frameLayout = (FrameLayout) getParent();
        if (frameLayout == null) {
            return;
        }
        float width = frameLayout.getWidth();
        float height = frameLayout.getHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        float width2 = getWidth();
        float height2 = getHeight();
        float f = this.nu;
        layoutParams.topMargin = (int) (((int) ((height * f) / 100.0f)) - ((height2 * f) / 100.0f));
        float f2 = this.ra;
        layoutParams.leftMargin = (int) (((int) ((width * f2) / 100.0f)) - ((width2 * f2) / 100.0f));
        setLayoutParams(layoutParams);
    }

    public void kgy(int i, int i2) {
        Iterator<View> it = this.uq.iterator();
        while (it.hasNext()) {
            it.next().setBackground(ahm(this.noq));
        }
        if (i < 0 || i >= this.uq.size()) {
            i = 0;
        }
        if (this.uq.size() > 0) {
            this.uq.get(i).setBackground(ahm(this.ct));
            this.gf = i2;
        }
    }

    public void kgy() {
        post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.yo.kgy.kgy.1
            @Override // java.lang.Runnable
            public void run() {
                kgy.this.uq();
            }
        });
    }
}
