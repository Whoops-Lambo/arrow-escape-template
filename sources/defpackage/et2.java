package defpackage;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import com.ecffri.arrows.R;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class et2 extends FrameLayout {

    @NotNull
    private static final at2 Companion = new at2();
    public final Context a;
    public final qx2 b;
    public final ContextThemeWrapper c;
    public final boolean d;
    public final int e;
    public final ja1 f;
    public bt2 g;
    public int h;
    public String i;
    public final FrameLayout j;
    public Insets k;

    public final void a() {
        FrameLayout frameLayout = this.j;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.bottomMargin = this.h + this.k.bottom;
            frameLayout.setLayoutParams(layoutParams2);
        }
    }

    public final void b(Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            if (Build.VERSION.SDK_INT >= 35) {
                return;
            }
            Context context = this.a;
            Activity activity = context instanceof Activity ? (Activity) context : null;
            Window window = activity != null ? activity.getWindow() : null;
            if (window == null) {
                return;
            }
            window.setStatusBarColor(iIntValue);
        }
    }

    public final Context c() {
        String str = this.i;
        ContextThemeWrapper contextThemeWrapper = this.c;
        if (str == null) {
            return contextThemeWrapper;
        }
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        Configuration configuration = new Configuration(contextThemeWrapper.getResources().getConfiguration());
        configuration.setLocales(new LocaleList(localeForLanguageTag));
        return new ContextThemeWrapper(contextThemeWrapper.createConfigurationContext(configuration), R.style.BaseTheme);
    }

    public final void d(Integer num) {
        FrameLayout frameLayout = this.j;
        if (num != null) {
            frameLayout.setBackgroundColor(num.intValue());
        }
        if (this.d) {
            setTag(0);
            this.g = bt2.a;
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 0));
        } else {
            setTag(-1);
            this.g = bt2.c;
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.setPadding(frameLayout.getPaddingLeft(), this.k.top, frameLayout.getPaddingRight(), this.k.bottom);
        }
        int iIntValue = num != null ? num.intValue() : -1;
        this.f.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue));
    }

    public et2(Context context, qx2 qx2Var, ContextThemeWrapper contextThemeWrapper, boolean z, int i, ja1 ja1Var) {
        super(contextThemeWrapper);
        this.a = context;
        this.b = qx2Var;
        this.c = contextThemeWrapper;
        this.d = z;
        this.e = i;
        this.f = ja1Var;
        this.g = bt2.a;
        FrameLayout frameLayout = new FrameLayout(contextThemeWrapper);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(7);
        frameLayout.setLayoutTransition(layoutTransition);
        addView(frameLayout);
        this.j = frameLayout;
        Insets insets = Insets.NONE;
        insets.getClass();
        this.k = insets;
        ViewCompat.G(this, new hl2(this, 1));
    }

    public final void setContentLocale(@NotNull String str) {
        str.getClass();
        this.i = str;
        j7.c = Locale.forLanguageTag(str);
    }
}
