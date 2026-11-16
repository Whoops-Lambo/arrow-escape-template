package defpackage;

import android.R;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.AppCompatRadioButton;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class mi1 extends AppCompatRadioButton {
    public static final int[][] g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList e;
    public boolean f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.e == null) {
            int iB = ki1.b(com.ecffri.arrows.R.attr.colorControlActivated, this);
            int iB2 = ki1.b(com.ecffri.arrows.R.attr.colorOnSurface, this);
            int iB3 = ki1.b(com.ecffri.arrows.R.attr.colorSurface, this);
            this.e = new ColorStateList(g, new int[]{ki1.d(1.0f, iB3, iB), ki1.d(0.54f, iB3, iB2), ki1.d(0.38f, iB3, iB2), ki1.d(0.38f, iB3, iB2)});
        }
        return this.e;
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }
}
