package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class SeekBarPreference extends Preference {
    public int A;
    public final int B;
    public final int C;
    public int D;
    public boolean E;
    public SeekBar F;
    public TextView G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final SeekBar.OnSeekBarChangeListener K;
    public final View.OnKeyListener L;

    @Override // androidx.preference.Preference
    public final Object h(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public final int a;
        public final int b;
        public final int c;

        /* JADX INFO: renamed from: androidx.preference.SeekBarPreference$SavedState$1, reason: invalid class name */
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
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.ecffri.arrows.R.attr.seekBarPreferenceStyle);
        this.K = new SeekBar.OnSeekBarChangeListener() { // from class: androidx.preference.SeekBarPreference.1
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStopTrackingTouch(SeekBar seekBar) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                seekBarPreference.E = false;
                if (seekBar.getProgress() + seekBarPreference.B != seekBarPreference.A) {
                    seekBarPreference.m(seekBar);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (z && (seekBarPreference.J || !seekBarPreference.E)) {
                    seekBarPreference.m(seekBar);
                    return;
                }
                int i2 = i + seekBarPreference.B;
                TextView textView = seekBarPreference.G;
                if (textView != null) {
                    textView.setText(String.valueOf(i2));
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStartTrackingTouch(SeekBar seekBar) {
                SeekBarPreference.this.E = true;
            }
        };
        this.L = new View.OnKeyListener() { // from class: androidx.preference.SeekBarPreference.2
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (keyEvent.getAction() == 0) {
                    SeekBarPreference seekBarPreference = SeekBarPreference.this;
                    if ((seekBarPreference.H || (i != 21 && i != 22)) && i != 23 && i != 66) {
                        SeekBar seekBar = seekBarPreference.F;
                        if (seekBar == null) {
                            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
                            return false;
                        }
                        return seekBar.onKeyDown(i, keyEvent);
                    }
                }
                return false;
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.l, com.ecffri.arrows.R.attr.seekBarPreferenceStyle, 0);
        this.B = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i = typedArrayObtainStyledAttributes.getInt(1, 100);
        int i2 = this.B;
        i = i < i2 ? i2 : i;
        if (i != this.C) {
            this.C = i;
            d();
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i3 != this.D) {
            this.D = Math.min(this.C - this.B, Math.abs(i3));
            d();
        }
        this.H = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.I = typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.J = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void f(PreferenceViewHolder preferenceViewHolder) {
        super.f(preferenceViewHolder);
        preferenceViewHolder.itemView.setOnKeyListener(this.L);
        this.F = (SeekBar) preferenceViewHolder.a(com.ecffri.arrows.R.id.seekbar);
        TextView textView = (TextView) preferenceViewHolder.a(com.ecffri.arrows.R.id.seekbar_value);
        this.G = textView;
        if (this.I) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.G = null;
        }
        SeekBar seekBar = this.F;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.K);
        SeekBar seekBar2 = this.F;
        int i = this.C;
        int i2 = this.B;
        seekBar2.setMax(i - i2);
        int i3 = this.D;
        SeekBar seekBar3 = this.F;
        if (i3 != 0) {
            seekBar3.setKeyProgressIncrement(i3);
        } else {
            this.D = seekBar3.getKeyProgressIncrement();
        }
        this.F.setProgress(this.A - i2);
        int i4 = this.A;
        TextView textView2 = this.G;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i4));
        }
        this.F.setEnabled(c());
    }

    public final void m(SeekBar seekBar) {
        int progress = seekBar.getProgress();
        int i = this.B;
        int i2 = progress + i;
        int i3 = this.A;
        if (i2 != i3) {
            if (i2 >= i) {
                i = i2;
            }
            int i4 = this.C;
            if (i > i4) {
                i = i4;
            }
            if (i != i3) {
                this.A = i;
                TextView textView = this.G;
                if (textView != null) {
                    textView.setText(String.valueOf(i));
                }
            }
        }
    }
}
