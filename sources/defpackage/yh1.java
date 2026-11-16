package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class yh1 extends ArrayAdapter {
    public ColorStateList a;
    public ColorStateList b;
    public final /* synthetic */ zh1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh1(zh1 zh1Var, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.c = zh1Var;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        zh1 zh1Var = this.c;
        ColorStateList colorStateList2 = zh1Var.l;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.b = colorStateList;
        if (zh1Var.k != 0 && zh1Var.l != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{ColorUtils.d(zh1Var.l.getColorForState(iArr3, 0), zh1Var.k), ColorUtils.d(zh1Var.l.getColorForState(iArr2, 0), zh1Var.k), zh1Var.k});
        }
        this.a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            zh1 zh1Var = this.c;
            Drawable rippleDrawable = null;
            if (zh1Var.getText().toString().contentEquals(textView.getText()) && zh1Var.k != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(zh1Var.k);
                if (this.b != null) {
                    colorDrawable.setTintList(this.a);
                    rippleDrawable = new RippleDrawable(this.b, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = ViewCompat.a;
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
