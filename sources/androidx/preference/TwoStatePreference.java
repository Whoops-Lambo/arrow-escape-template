package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class TwoStatePreference extends Preference {
    public boolean A;
    public CharSequence B;
    public CharSequence C;
    public boolean D;
    public boolean E;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // androidx.preference.Preference
    public final Object h(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public final boolean a;

        /* JADX INFO: renamed from: androidx.preference.TwoStatePreference$SavedState$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static class AnonymousClass1 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt() == 1;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
        }
    }

    @Override // androidx.preference.Preference
    public final void g() {
        m(!this.A);
    }

    @Override // androidx.preference.Preference
    public final boolean l() {
        boolean z = this.E;
        boolean z2 = this.A;
        if (!z) {
            z2 = !z2;
        }
        return z2 || super.l();
    }

    public final void m(boolean z) {
        boolean z2 = this.A != z;
        if (z2 || !this.D) {
            this.A = z;
            this.D = true;
            if (z2) {
                e(l());
                d();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    public final void n(View view) {
        boolean z;
        int i;
        CharSequence charSequenceB;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (!this.A || TextUtils.isEmpty(this.B)) {
                if (this.A || TextUtils.isEmpty(this.C)) {
                    z = true;
                } else {
                    textView.setText(this.C);
                }
                if (z) {
                    charSequenceB = b();
                    if (!TextUtils.isEmpty(charSequenceB)) {
                        textView.setText(charSequenceB);
                        z = false;
                    }
                }
                i = z ? 8 : 0;
                if (i != textView.getVisibility()) {
                    textView.setVisibility(i);
                }
            }
            textView.setText(this.B);
            z = false;
            if (z) {
                charSequenceB = b();
                if (!TextUtils.isEmpty(charSequenceB)) {
                    textView.setText(charSequenceB);
                    z = false;
                }
            }
            if (z) {
            }
            if (i != textView.getVisibility()) {
                textView.setVisibility(i);
            }
        }
    }
}
