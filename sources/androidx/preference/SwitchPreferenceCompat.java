package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    public final Listener F;
    public final String G;
    public final String H;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class Listener implements CompoundButton.OnCheckedChangeListener {
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SwitchPreferenceCompat.this.m(z);
        }

        public Listener() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.A);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.G);
            switchCompat.setTextOff(this.H);
            switchCompat.setOnCheckedChangeListener(this.F);
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.ecffri.arrows.R.attr.switchPreferenceCompatStyle);
        this.F = new Listener();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.n, com.ecffri.arrows.R.attr.switchPreferenceCompatStyle, 0);
        String string = typedArrayObtainStyledAttributes.getString(7);
        this.B = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        if (this.A) {
            d();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(6);
        this.C = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        if (!this.A) {
            d();
        }
        String string3 = typedArrayObtainStyledAttributes.getString(9);
        this.G = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        d();
        String string4 = typedArrayObtainStyledAttributes.getString(8);
        this.H = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        d();
        this.E = typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void f(PreferenceViewHolder preferenceViewHolder) {
        super.f(preferenceViewHolder);
        p(preferenceViewHolder.a(com.ecffri.arrows.R.id.switchWidget));
        n(preferenceViewHolder.a(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void j(View view) {
        super.j(view);
        if (!((AccessibilityManager) this.a.getSystemService("accessibility")).isEnabled()) {
            return;
        }
        p(view.findViewById(com.ecffri.arrows.R.id.switchWidget));
        n(view.findViewById(android.R.id.summary));
    }
}
