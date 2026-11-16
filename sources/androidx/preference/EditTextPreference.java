package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.content.res.TypedArrayUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class EditTextPreference extends DialogPreference {
    public String A;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface OnBindEditTextListener {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class SimpleSummaryProvider implements Preference.SummaryProvider<EditTextPreference> {
        public static SimpleSummaryProvider a;

        @Override // androidx.preference.Preference.SummaryProvider
        public final CharSequence a(Preference preference) {
            EditTextPreference editTextPreference = (EditTextPreference) preference;
            return TextUtils.isEmpty(editTextPreference.A) ? editTextPreference.a.getString(com.ecffri.arrows.R.string.not_set) : editTextPreference.A;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public final String a;

        /* JADX INFO: renamed from: androidx.preference.EditTextPreference$SavedState$1, reason: invalid class name */
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
            this.a = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
        }
    }

    @Override // androidx.preference.Preference
    public final boolean l() {
        return TextUtils.isEmpty(this.A) || super.l();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int iA = TypedArrayUtils.a(com.ecffri.arrows.R.attr.editTextPreferenceStyle, context, android.R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iA);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.d, iA, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            if (SimpleSummaryProvider.a == null) {
                SimpleSummaryProvider.a = new SimpleSummaryProvider();
            }
            this.y = SimpleSummaryProvider.a;
            d();
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object h(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public final void m(String str) {
        boolean zL = l();
        this.A = str;
        boolean zL2 = l();
        if (zL2 != zL) {
            e(zL2);
        }
        d();
    }
}
