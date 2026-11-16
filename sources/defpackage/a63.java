package defpackage;

import android.text.SpannableString;
import android.text.style.LocaleSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a63 {
    public static final void a(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.getClass();
                a(childAt);
            }
        }
    }

    public static final void b(View view, String str) {
        view.getClass();
        Locale locale = j7.c;
        CharSequence charSequence = str;
        if (str != null && str.length() != 0 && locale != null) {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new LocaleSpan(locale), 0, spannableString.length(), 33);
            charSequence = spannableString;
        }
        charSequence = str;
        charSequence = str;
        view.setContentDescription(charSequence);
    }

    public static final void c(ViewGroup viewGroup, int i, int i2, boolean z) {
        viewGroup.getClass();
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
        layoutParams.setMarginStart(i);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i2;
        layoutParams.setMarginEnd(i);
        if (!z) {
            i2 = 0;
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i2;
        viewGroup.setLayoutParams(layoutParams);
    }
}
