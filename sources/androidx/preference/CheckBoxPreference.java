package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.core.content.res.TypedArrayUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    public final Listener F;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class Listener implements CompoundButton.OnCheckedChangeListener {
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            CheckBoxPreference.this.m(z);
        }

        public Listener() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.A);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.F);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        int iA = TypedArrayUtils.a(com.ecffri.arrows.R.attr.checkBoxPreferenceStyle, context, android.R.attr.checkBoxPreferenceStyle);
        super(context, attributeSet, iA);
        this.F = new Listener();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.b, iA, 0);
        String string = typedArrayObtainStyledAttributes.getString(5);
        this.B = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        if (this.A) {
            d();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(4);
        this.C = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        if (!this.A) {
            d();
        }
        this.E = typedArrayObtainStyledAttributes.getBoolean(3, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void f(PreferenceViewHolder preferenceViewHolder) {
        super.f(preferenceViewHolder);
        p(preferenceViewHolder.a(android.R.id.checkbox));
        n(preferenceViewHolder.a(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void j(View view) {
        super.j(view);
        if (!((AccessibilityManager) this.a.getSystemService("accessibility")).isEnabled()) {
            return;
        }
        p(view.findViewById(android.R.id.checkbox));
        n(view.findViewById(android.R.id.summary));
    }
}
