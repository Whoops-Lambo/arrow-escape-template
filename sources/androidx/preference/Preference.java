package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class Preference implements Comparable<Preference> {
    public final Context a;
    public final int b;
    public final CharSequence c;
    public final CharSequence d;
    public final int e;
    public Drawable f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final Object k;
    public boolean l;
    public boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final int u;
    public final int v;
    public PreferenceGroupAdapter w;
    public OnPreferenceCopyListener x;
    public SummaryProvider y;
    public final View.OnClickListener z;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface OnPreferenceChangeInternalListener {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface OnPreferenceChangeListener {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface OnPreferenceClickListener {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class OnPreferenceCopyListener implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
        public final Preference a;

        @Override // android.view.View.OnCreateContextMenuListener
        public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            Preference preference = this.a;
            CharSequence charSequenceB = preference.b();
            if (!preference.s || TextUtils.isEmpty(charSequenceB)) {
                return;
            }
            contextMenu.setHeaderTitle(charSequenceB);
            contextMenu.add(0, 0, 0, com.ecffri.arrows.R.string.copy).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Preference preference = this.a;
            Context context = preference.a;
            ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
            CharSequence charSequenceB = preference.b();
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", charSequenceB));
            Toast.makeText(context, context.getString(com.ecffri.arrows.R.string.preference_copied, charSequenceB), 0).show();
            return true;
        }

        public OnPreferenceCopyListener(Preference preference) {
            this.a = preference;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface SummaryProvider<T extends Preference> {
        CharSequence a(Preference preference);
    }

    public void e(boolean z) {
    }

    public void g() {
    }

    public Object h(TypedArray typedArray, int i) {
        return null;
    }

    public void i(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new AnonymousClass1();

        /* JADX INFO: renamed from: androidx.preference.Preference$BaseSavedState$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static class AnonymousClass1 implements Parcelable.Creator<BaseSavedState> {
            @Override // android.os.Parcelable.Creator
            public final BaseSavedState createFromParcel(Parcel parcel) {
                return new BaseSavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final BaseSavedState[] newArray(int i) {
                return new BaseSavedState[i];
            }
        }

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }
    }

    public long a() {
        return 0L;
    }

    public CharSequence b() {
        SummaryProvider summaryProvider = this.y;
        return summaryProvider != null ? summaryProvider.a(this) : this.d;
    }

    public boolean c() {
        return this.i && this.l && this.m;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i = preference2.b;
        int i2 = this.b;
        if (i2 != i) {
            return i2 - i;
        }
        CharSequence charSequence = preference2.c;
        CharSequence charSequence2 = this.c;
        if (charSequence2 == charSequence) {
            return 0;
        }
        if (charSequence2 == null) {
            return 1;
        }
        if (charSequence == null) {
            return -1;
        }
        return charSequence2.toString().compareToIgnoreCase(preference2.c.toString());
    }

    public void d() {
        if (this.w != null) {
            throw null;
        }
    }

    public void f(PreferenceViewHolder preferenceViewHolder) {
        Integer numValueOf;
        View view = preferenceViewHolder.itemView;
        view.setOnClickListener(this.z);
        view.setId(0);
        TextView textView = (TextView) preferenceViewHolder.a(android.R.id.summary);
        if (textView != null) {
            CharSequence charSequenceB = b();
            if (TextUtils.isEmpty(charSequenceB)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(charSequenceB);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) preferenceViewHolder.a(android.R.id.title);
        boolean z = this.j;
        if (textView2 != null) {
            CharSequence charSequence = this.c;
            if (TextUtils.isEmpty(charSequence)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequence);
                textView2.setVisibility(0);
                if (this.p) {
                    textView2.setSingleLine(this.q);
                }
                if (!z && c() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) preferenceViewHolder.a(android.R.id.icon);
        boolean z2 = this.r;
        if (imageView != null) {
            int i = this.e;
            if (i != 0 || this.f != null) {
                if (this.f == null) {
                    this.f = AppCompatResources.a(this.a, i);
                }
                Drawable drawable = this.f;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.f != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(z2 ? 4 : 8);
            }
        }
        View viewA = preferenceViewHolder.a(com.ecffri.arrows.R.id.icon_frame);
        if (viewA == null) {
            viewA = preferenceViewHolder.a(android.R.id.icon_frame);
        }
        if (viewA != null) {
            if (this.f != null) {
                viewA.setVisibility(0);
            } else {
                viewA.setVisibility(z2 ? 4 : 8);
            }
        }
        if (this.t) {
            k(view, c());
        } else {
            k(view, true);
        }
        view.setFocusable(z);
        view.setClickable(z);
        preferenceViewHolder.f = this.n;
        preferenceViewHolder.g = this.o;
        boolean z3 = this.s;
        if (z3 && this.x == null) {
            this.x = new OnPreferenceCopyListener(this);
        }
        view.setOnCreateContextMenuListener(z3 ? this.x : null);
        view.setLongClickable(z3);
        if (!z3 || z) {
            return;
        }
        WeakHashMap weakHashMap = ViewCompat.a;
        view.setBackground(null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.c;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence charSequenceB = b();
        if (!TextUtils.isEmpty(charSequenceB)) {
            sb.append(charSequenceB);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this.b = Integer.MAX_VALUE;
        this.i = true;
        this.j = true;
        this.l = true;
        this.m = true;
        this.n = true;
        this.o = true;
        this.q = true;
        this.t = true;
        this.u = com.ecffri.arrows.R.layout.preference;
        this.z = new View.OnClickListener() { // from class: androidx.preference.Preference.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Preference.this.j(view);
            }
        };
        this.a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.g, i, 0);
        this.e = typedArrayObtainStyledAttributes.getResourceId(23, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        String string = typedArrayObtainStyledAttributes.getString(26);
        this.g = string == null ? typedArrayObtainStyledAttributes.getString(6) : string;
        CharSequence text = typedArrayObtainStyledAttributes.getText(34);
        this.c = text == null ? typedArrayObtainStyledAttributes.getText(4) : text;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(33);
        this.d = text2 == null ? typedArrayObtainStyledAttributes.getText(7) : text2;
        this.b = typedArrayObtainStyledAttributes.getInt(28, typedArrayObtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        String string2 = typedArrayObtainStyledAttributes.getString(22);
        this.h = string2 == null ? typedArrayObtainStyledAttributes.getString(13) : string2;
        this.u = typedArrayObtainStyledAttributes.getResourceId(27, typedArrayObtainStyledAttributes.getResourceId(3, com.ecffri.arrows.R.layout.preference));
        this.v = typedArrayObtainStyledAttributes.getResourceId(35, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.i = typedArrayObtainStyledAttributes.getBoolean(21, typedArrayObtainStyledAttributes.getBoolean(2, true));
        boolean z = typedArrayObtainStyledAttributes.getBoolean(30, typedArrayObtainStyledAttributes.getBoolean(5, true));
        this.j = z;
        typedArrayObtainStyledAttributes.getBoolean(29, typedArrayObtainStyledAttributes.getBoolean(1, true));
        if (typedArrayObtainStyledAttributes.getString(19) == null) {
            typedArrayObtainStyledAttributes.getString(10);
        }
        this.n = typedArrayObtainStyledAttributes.getBoolean(16, typedArrayObtainStyledAttributes.getBoolean(16, z));
        this.o = typedArrayObtainStyledAttributes.getBoolean(17, typedArrayObtainStyledAttributes.getBoolean(17, z));
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.k = h(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.k = h(typedArrayObtainStyledAttributes, 11);
        }
        this.t = typedArrayObtainStyledAttributes.getBoolean(31, typedArrayObtainStyledAttributes.getBoolean(12, true));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.p = zHasValue;
        if (zHasValue) {
            this.q = typedArrayObtainStyledAttributes.getBoolean(32, typedArrayObtainStyledAttributes.getBoolean(14, true));
        }
        this.r = typedArrayObtainStyledAttributes.getBoolean(24, typedArrayObtainStyledAttributes.getBoolean(15, false));
        typedArrayObtainStyledAttributes.getBoolean(25, typedArrayObtainStyledAttributes.getBoolean(25, true));
        this.s = typedArrayObtainStyledAttributes.getBoolean(20, typedArrayObtainStyledAttributes.getBoolean(20, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void k(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                k(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public void j(View view) {
        if (c() && this.j) {
            g();
        }
    }

    public boolean l() {
        return !c();
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.a(com.ecffri.arrows.R.attr.preferenceStyle, context, android.R.attr.preferenceStyle));
    }
}
