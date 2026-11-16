package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.content.res.TypedArrayUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    public final CharSequence[] A;
    public final CharSequence[] B;
    public String C;
    public final String D;
    public boolean E;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class SimpleSummaryProvider implements Preference.SummaryProvider<ListPreference> {
        public static SimpleSummaryProvider a;

        @Override // androidx.preference.Preference.SummaryProvider
        public final CharSequence a(Preference preference) {
            ListPreference listPreference = (ListPreference) preference;
            CharSequence[] charSequenceArr = listPreference.A;
            int iM = listPreference.m(listPreference.C);
            if (TextUtils.isEmpty((iM < 0 || charSequenceArr == null) ? null : charSequenceArr[iM])) {
                return listPreference.a.getString(com.ecffri.arrows.R.string.not_set);
            }
            int iM2 = listPreference.m(listPreference.C);
            if (iM2 < 0 || charSequenceArr == null) {
                return null;
            }
            return charSequenceArr[iM2];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public final String a;

        /* JADX INFO: renamed from: androidx.preference.ListPreference$SavedState$1, reason: invalid class name */
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
    public final CharSequence b() {
        CharSequence[] charSequenceArr;
        Preference.SummaryProvider summaryProvider = this.y;
        if (summaryProvider != null) {
            return summaryProvider.a(this);
        }
        int iM = m(this.C);
        CharSequence charSequence = (iM < 0 || (charSequenceArr = this.A) == null) ? null : charSequenceArr[iM];
        CharSequence charSequenceB = super.b();
        String str = this.D;
        if (str != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            String str2 = String.format(str, charSequence);
            if (!TextUtils.equals(str2, charSequenceB)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return charSequenceB;
    }

    public final int m(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.B) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (charSequenceArr[length].equals(str)) {
                return length;
            }
        }
        return -1;
    }

    public final void n(String str) {
        boolean zEquals = TextUtils.equals(this.C, str);
        if (zEquals && this.E) {
            return;
        }
        this.C = str;
        this.E = true;
        if (zEquals) {
            return;
        }
        d();
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.e, i, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.A = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.B = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            if (SimpleSummaryProvider.a == null) {
                SimpleSummaryProvider.a = new SimpleSummaryProvider();
            }
            this.y = SimpleSummaryProvider.a;
            d();
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.g, i, 0);
        String string = typedArrayObtainStyledAttributes2.getString(33);
        this.D = string == null ? typedArrayObtainStyledAttributes2.getString(7) : string;
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object h(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.a(com.ecffri.arrows.R.attr.dialogPreferenceStyle, context, android.R.attr.dialogPreferenceStyle));
    }
}
