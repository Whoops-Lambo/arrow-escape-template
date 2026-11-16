package com.usercentrics.sdk.ui.components;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LocaleSpan;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.safedk.android.utils.Logger;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ax1;
import defpackage.bx1;
import defpackage.dk2;
import defpackage.j7;
import defpackage.ju2;
import defpackage.kk2;
import defpackage.nx2;
import defpackage.ox2;
import defpackage.qx2;
import defpackage.vv2;
import defpackage.wr0;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \r2\u00020\u0001:\u0003\u000e\u000f\u0010B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/usercentrics/sdk/ui/components/UCTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "htmlText", "Laz2;", "setHtmlTextWithNoLinks", "(Ljava/lang/String;)V", "Companion", "nx2", "ExternalLinkSpan", "ox2", "usercentrics-ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class UCTextView extends AppCompatTextView {

    @NotNull
    public static final nx2 Companion = new nx2();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/usercentrics/sdk/ui/components/UCTextView$ExternalLinkSpan;", "Landroid/text/style/URLSpan;", "usercentrics-ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ExternalLinkSpan extends URLSpan {
        public final boolean a;

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p1 == null) {
                return;
            }
            p0.startActivity(p1);
        }

        @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
        public final void onClick(View view) {
            view.getClass();
            String url = getURL();
            if (url == null || dk2.Z(url)) {
                return;
            }
            Intent intentAddFlags = new Intent("android.intent.action.VIEW", Uri.parse(getURL())).addFlags(268435456);
            intentAddFlags.getClass();
            try {
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(view.getContext(), intentAddFlags);
            } catch (ActivityNotFoundException e) {
                Log.w("ExternalLinkSpan", "No activity found to handle link: " + getURL(), e);
            } catch (SecurityException e2) {
                Log.w("ExternalLinkSpan", "Not permitted to open link: " + getURL(), e2);
            }
        }

        public ExternalLinkSpan(String str, boolean z) {
            super(str);
            this.a = z;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            textPaint.getClass();
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(this.a);
        }
    }

    public static void s(UCTextView uCTextView, qx2 qx2Var, int i) {
        Integer num;
        boolean z = (i & 2) == 0;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 8) == 0;
        uCTextView.getClass();
        qx2Var.getClass();
        ju2 ju2Var = qx2Var.a;
        Integer num2 = ju2Var.h;
        vv2 vv2Var = qx2Var.b;
        Typeface typeface = vv2Var.a;
        if (z) {
            uCTextView.setTypeface(typeface, 1);
        } else {
            uCTextView.setTypeface(typeface);
        }
        if (z2) {
            num = num2;
        } else {
            num = z3 ? ju2Var.b : ju2Var.a;
        }
        if (num != null) {
            uCTextView.setTextColor(num.intValue());
        }
        if (num2 != null) {
            uCTextView.setLinkTextColor(num2.intValue());
        }
        uCTextView.setTextSize(2, vv2Var.c.b);
        uCTextView.setPaintFlags(1);
        Float f = vv2Var.d;
        if (f != null) {
            uCTextView.setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f.floatValue());
        }
    }

    public static void t(UCTextView uCTextView, qx2 qx2Var, boolean z, int i) {
        Integer num;
        if ((i & 2) != 0) {
            z = false;
        }
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 8) == 0;
        boolean z4 = (i & 16) == 0;
        uCTextView.getClass();
        qx2Var.getClass();
        ju2 ju2Var = qx2Var.a;
        vv2 vv2Var = qx2Var.b;
        Typeface typeface = vv2Var.a;
        if (z2) {
            uCTextView.setTypeface(typeface, 1);
        } else {
            uCTextView.setTypeface(typeface);
        }
        uCTextView.setTextSize(2, vv2Var.c.c);
        if (z4) {
            num = ju2Var.h;
        } else {
            num = z3 ? ju2Var.b : ju2Var.a;
        }
        if (num != null) {
            uCTextView.setTextColor(num.intValue());
        }
        uCTextView.setPaintFlags(z ? 9 : 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UCTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
    }

    public final void q(String str, Boolean bool, wr0 wr0Var) {
        boolean zBooleanValue;
        bx1 bx1Var;
        str.getClass();
        Spanned spannedFromHtml = Html.fromHtml(str, 0);
        spannedFromHtml.getClass();
        SpannableString spannableString = new SpannableString(spannedFromHtml);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        uRLSpanArr.getClass();
        for (URLSpan uRLSpan : uRLSpanArr) {
            ax1 ax1Var = bx1.Companion;
            String url = uRLSpan.getURL();
            url.getClass();
            ax1Var.getClass();
            bx1[] bx1VarArrValues = bx1.values();
            int length = bx1VarArrValues.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    bx1Var = bx1VarArrValues[i];
                    if (bx1Var.a.equalsIgnoreCase(url)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    bx1Var = null;
                    break;
                }
            }
            if (bx1Var != null) {
                ox2 ox2Var = new ox2(bx1Var, wr0Var, zBooleanValue);
                int spanStart = spannableString.getSpanStart(uRLSpan);
                int spanEnd = spannableString.getSpanEnd(uRLSpan);
                spannableString.removeSpan(uRLSpan);
                spannableString.setSpan(ox2Var, spanStart, spanEnd, 33);
            } else {
                String url2 = uRLSpan.getURL();
                url2.getClass();
                if (kk2.L(url2, "javascript:UC_UI", false)) {
                    spannableString.removeSpan(uRLSpan);
                } else {
                    String url3 = uRLSpan.getURL();
                    url3.getClass();
                    ExternalLinkSpan externalLinkSpan = new ExternalLinkSpan(url3, zBooleanValue);
                    int spanStart2 = spannableString.getSpanStart(uRLSpan);
                    int spanEnd2 = spannableString.getSpanEnd(uRLSpan);
                    spannableString.removeSpan(uRLSpan);
                    spannableString.setSpan(externalLinkSpan, spanStart2, spanEnd2, 33);
                }
            }
        }
        setText(spannableString);
    }

    public final void setHtmlTextWithNoLinks(@NotNull String htmlText) {
        htmlText.getClass();
        Spanned spannedFromHtml = Html.fromHtml(htmlText, 0);
        spannedFromHtml.getClass();
        SpannableString spannableString = new SpannableString(spannedFromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        uRLSpanArr.getClass();
        for (URLSpan uRLSpan : uRLSpanArr) {
            spannableString.removeSpan(uRLSpan);
        }
        setText(spannableString);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        Locale locale;
        bufferType.getClass();
        if (charSequence != null) {
            if (charSequence.length() != 0 && (locale = j7.c) != null) {
                SpannableString spannableString = new SpannableString(charSequence);
                spannableString.setSpan(new LocaleSpan(locale), 0, charSequence.length(), 33);
                charSequence = spannableString;
            }
        } else {
            charSequence = null;
        }
        super.setText(charSequence, bufferType);
    }

    public final void u(qx2 qx2Var) {
        qx2Var.getClass();
        vv2 vv2Var = qx2Var.b;
        setTypeface(vv2Var.a);
        Integer num = qx2Var.a.b;
        if (num != null) {
            setTextColor(num.intValue());
        }
        setTextSize(2, vv2Var.c.d);
        setPaintFlags(1);
    }

    public final void v(qx2 qx2Var) {
        qx2Var.getClass();
        boolean z = qx2Var.t;
        vv2 vv2Var = qx2Var.b;
        setTypeface(vv2Var.a, z ? 1 : 0);
        Integer num = qx2Var.a.a;
        if (num != null) {
            setTextColor(num.intValue());
        }
        setTextSize(2, vv2Var.c.a);
        setPaintFlags(1);
        Float f = vv2Var.d;
        if (f != null) {
            setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f.floatValue());
        }
    }
}
