package io.p071bidmachine.iab.vast.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.p071bidmachine.iab.utils.q;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class e extends b {
    public String e;

    @Override // io.p071bidmachine.iab.vast.view.b, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    public void setProgress(int i) {
        setText(this.e.replace("%1.0f", String.valueOf(i)));
    }

    public void setRemaining(int i) {
        setText(this.e.replace("%1.0f", String.valueOf(i)));
    }

    public e(Context context) {
        super(context);
        this.e = "%1.0fs";
    }

    @Override // io.p071bidmachine.iab.vast.view.b, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (TextUtils.isEmpty(getText())) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // io.p071bidmachine.iab.vast.view.b, io.p071bidmachine.iab.utils.p
    public void setStyle(@NonNull q qVar) {
        super.setStyle(qVar);
        String str = qVar.r;
        if (str != null) {
            this.e = str;
        }
    }
}
