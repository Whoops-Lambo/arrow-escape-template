package com.bytedance.adsdk.ahm.rz.rz;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.adsdk.ahm.sx;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class rz extends uq {
    private String at;
    private LinearLayout fi;
    private final LinearLayout.LayoutParams gf;
    private final List<TextView> nu;
    private final List<String> ra;

    private List<String> at() {
        com.bytedance.adsdk.ahm.gf gfVar;
        sx sxVarLqi;
        List<com.bytedance.adsdk.ahm.ra.kgy> listRz;
        if (((uq) this).yo == null || (gfVar = this.ahm) == null || (sxVarLqi = gfVar.lqi()) == null) {
            return null;
        }
        String strUq = ((uq) this).yo.uq();
        if ((!TextUtils.isEmpty(strUq) || !TextUtils.isEmpty(this.at)) && (listRz = ((uq) this).yo.rz()) != null) {
            String strKgy = this.at;
            if (TextUtils.isEmpty(strKgy)) {
                strKgy = sxVarLqi.kgy(strUq);
            }
            if (!TextUtils.isEmpty(strKgy)) {
                int length = strKgy.length();
                this.ra.clear();
                for (int i = 0; i < listRz.size(); i++) {
                    com.bytedance.adsdk.ahm.ra.kgy kgyVar = listRz.get(i);
                    int iMax = kgyVar.kgy;
                    int iMax2 = kgyVar.ahm;
                    if (iMax < 0) {
                        iMax = Math.max(iMax + length, 0);
                    }
                    if (iMax2 < 0) {
                        iMax2 = Math.max(iMax2 + length, 0);
                    }
                    if (iMax + iMax2 > length) {
                        this.ra.add("");
                    } else {
                        if (listRz.size() == 1 && iMax == 0 && iMax2 == 0) {
                            iMax2 = length;
                        }
                        this.ra.add(strKgy.substring(iMax, iMax2 + iMax));
                    }
                }
                return this.ra;
            }
        }
        return null;
    }

    private void rz(float f) {
        List<com.bytedance.adsdk.ahm.ra.kgy> listRz;
        com.bytedance.adsdk.ahm.ra raVar = ((uq) this).yo;
        if (raVar == null || (listRz = raVar.rz()) == null || listRz.size() <= 0) {
            return;
        }
        this.fi.setOrientation(0);
        this.fi.setGravity(17);
        if (this.fi.getChildCount() <= 0) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) this.fi.getChildAt(0);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(80);
        this.fi.removeAllViews();
        if (linearLayout.getChildCount() != listRz.size()) {
            return;
        }
        List<String> listAt = at();
        this.nu.clear();
        int i = 0;
        while (i < listRz.size()) {
            com.bytedance.adsdk.ahm.ra.kgy kgyVar = listRz.get(i);
            TextView textView = (TextView) linearLayout.getChildAt(i);
            this.nu.add(textView);
            kgy(textView, kgyVar, (listAt == null || i >= listAt.size()) ? "" : listAt.get(i));
            i++;
        }
        linearLayout.removeAllViews();
        for (int i2 = 0; i2 < listRz.size(); i2++) {
            com.bytedance.adsdk.ahm.ra.kgy kgyVar2 = listRz.get(i2);
            TextView textView2 = this.nu.get(i2);
            textView2.setAlpha(f);
            linearLayout.setAlpha(f);
            int i3 = kgyVar2.noq;
            if (i3 != 0) {
                this.gf.bottomMargin = (int) (com.bytedance.adsdk.ahm.noq.noq.kgy() * i3);
                linearLayout.addView(textView2, this.gf);
            } else {
                linearLayout.addView(textView2);
            }
        }
        this.fi.setAlpha(f);
        this.fi.addView(linearLayout);
        float fKgy = com.bytedance.adsdk.ahm.noq.noq.kgy();
        kgy(this.fi, (int) (((uq) this).yo.kgy() * fKgy), (int) (((uq) this).yo.ahm() * fKgy));
    }

    public rz(com.bytedance.adsdk.ahm.gf gfVar, ct ctVar, Context context) {
        List<com.bytedance.adsdk.ahm.ra.kgy> listRz;
        String str;
        super(gfVar, ctVar);
        this.gf = new LinearLayout.LayoutParams(-2, -2);
        this.ra = new ArrayList();
        this.nu = new ArrayList();
        com.bytedance.adsdk.ahm.ra raVar = ((uq) this).yo;
        if (raVar != null && (listRz = raVar.rz()) != null && listRz.size() > 0) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.fi = linearLayout;
            linearLayout.setOrientation(0);
            ahm(listRz.get(0).yo);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(80);
            this.fi.addView(linearLayout2);
            List<String> listAt = at();
            for (int i = 0; i < listRz.size(); i++) {
                com.bytedance.adsdk.ahm.ra.kgy kgyVar = listRz.get(i);
                TextView textView = new TextView(context);
                if (listAt != null && i < listAt.size()) {
                    str = listAt.get(i);
                } else {
                    str = "";
                }
                kgy(textView, kgyVar, str);
                int i2 = kgyVar.noq;
                if (i2 != 0) {
                    this.gf.bottomMargin = (int) (com.bytedance.adsdk.ahm.noq.noq.kgy() * i2);
                    linearLayout2.addView(textView, this.gf);
                } else {
                    linearLayout2.addView(textView);
                }
            }
            float fKgy = com.bytedance.adsdk.ahm.noq.noq.kgy();
            kgy(this.fi, (int) (((uq) this).yo.kgy() * fKgy), (int) (((uq) this).yo.ahm() * fKgy));
        }
    }

    private void ahm(String str) {
        if (TextUtils.isEmpty(str)) {
            this.fi.setGravity(17);
            return;
        }
        str.getClass();
        if (!str.equals("left")) {
            if (!str.equals("right")) {
                this.fi.setGravity(17);
                return;
            } else {
                this.fi.setGravity(5);
                return;
            }
        }
        this.fi.setGravity(3);
    }

    private void kgy(TextView textView, com.bytedance.adsdk.ahm.ra.kgy kgyVar, String str) {
        if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
        } else {
            textView.setText("");
        }
        if (!TextUtils.isEmpty(kgyVar.rz)) {
            textView.setTextColor(Color.parseColor(kgyVar.rz));
        }
        if (!TextUtils.isEmpty(kgyVar.uq)) {
            textView.setBackgroundColor(Color.parseColor(kgyVar.uq));
        }
        textView.setGravity(17);
        textView.setTextSize(kgyVar.ct);
    }

    @Override // com.bytedance.adsdk.ahm.rz.rz.uq, com.bytedance.adsdk.ahm.rz.rz.kgy
    public void ahm(Canvas canvas, Matrix matrix, int i) {
        if (this.fi != null) {
            canvas.save();
            canvas.concat(matrix);
            kgy(i);
            rz(noq());
            this.fi.draw(canvas);
            canvas.restore();
            return;
        }
        super.ahm(canvas, matrix, i);
    }

    private static void kgy(View view, int i, int i2) {
        view.layout(0, 0, i, i2);
        view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void kgy(String str) {
        this.at = str;
    }
}
