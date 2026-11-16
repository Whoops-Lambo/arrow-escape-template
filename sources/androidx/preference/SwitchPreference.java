package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.core.content.res.TypedArrayUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class SwitchPreference extends TwoStatePreference {
    public final Listener F;
    public final String G;
    public final String H;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class Listener implements CompoundButton.OnCheckedChangeListener {
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SwitchPreference.this.m(z);
        }

        public Listener() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.A);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.G);
            r4.setTextOff(this.H);
            r4.setOnCheckedChangeListener(this.F);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchPreference(Context context, AttributeSet attributeSet) {
        int iA = TypedArrayUtils.a(com.ecffri.arrows.R.attr.switchPreferenceStyle, context, android.R.attr.switchPreferenceStyle);
        super(context, attributeSet, iA);
        this.F = new Listener();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.m, iA, 0);
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
        p(preferenceViewHolder.a(android.R.id.switch_widget));
        n(preferenceViewHolder.a(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void j(View view) {
        super.j(view);
        if (!((AccessibilityManager) this.a.getSystemService("accessibility")).isEnabled()) {
            return;
        }
        p(view.findViewById(android.R.id.switch_widget));
        n(view.findViewById(android.R.id.summary));
    }
}
