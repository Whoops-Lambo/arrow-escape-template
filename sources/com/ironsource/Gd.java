package com.ironsource;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.e80;
import defpackage.j52;
import defpackage.q63;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Gd {

    @NotNull
    public static final a a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        private final View a(Context context) {
            TextView textView = new TextView(context);
            textView.setText("i");
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setTextSize(15.0f);
            textView.setBackground(a());
            textView.setAlpha(0.2f);
            textView.setPadding(21, 0, 21, 0);
            textView.setTextColor(Color.parseColor("#FFFFFF"));
            return textView;
        }

        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        private a() {
        }

        @NotNull
        public final View a(@NotNull Context context, @Nullable String str, @NotNull InterfaceC4595a9 interfaceC4595a9) {
            context.getClass();
            interfaceC4595a9.getClass();
            if (str == null) {
                return a(context);
            }
            Object objA = interfaceC4595a9.a(str);
            if (objA instanceof j52) {
                objA = null;
            }
            Drawable drawable = (Drawable) objA;
            if (drawable != null) {
                ImageView imageView = new ImageView(context);
                imageView.setImageDrawable(drawable);
                return imageView;
            }
            return a(context);
        }

        private static final GradientDrawable a() {
            GradientDrawable gradientDrawableB = q63.b(1);
            gradientDrawableB.setColor(Color.parseColor("#000000"));
            return gradientDrawableB;
        }
    }
}
