package io.p071bidmachine.iab.mraid;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.ironsource.G5;
import com.ironsource.sdk.controller.f;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import defpackage.dk2;
import defpackage.fh1;
import defpackage.hg0;
import defpackage.sr0;
import io.p071bidmachine.rendering.model.w0;
import io.p071bidmachine.util.log.a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class u {
    public static final t a = new t("MraidLog");
    public static int b = 6;
    public static final String[] c = {"sms", "tel", "inlineVideo", "calendar", "storePicture"};
    public static String d;
    public static String e;

    public static final boolean f(List list) {
        Object obj = null;
        if (list != null) {
            for (Object obj2 : list) {
                if (((w0) obj2).a.equals("sclck")) {
                    obj = obj2;
                    break;
                }
            }
            obj = (w0) obj;
        }
        return obj != null;
    }

    public static final void b(String str, String str2, Object... objArr) {
        a(str, new s(objArr, 0, str2));
    }

    public static final void c(String str, sr0 sr0Var) {
        t tVar = a;
        tVar.getClass();
        a.f(tVar, 6, str, sr0Var, null, 8);
    }

    public static final void d(String str, Throwable th) {
        t tVar = a;
        tVar.getClass();
        a.f(tVar, 6, str, null, th, 4);
    }

    public static final View e(Context context, View view) {
        List list = z.a;
        View viewFindViewById = context instanceof Activity ? ((Activity) context).getWindow().getDecorView().findViewById(R.id.content) : null;
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        View rootView = view.getRootView();
        if (rootView == null) {
            return null;
        }
        View viewFindViewById2 = rootView.findViewById(R.id.content);
        return viewFindViewById2 == null ? rootView : viewFindViewById2;
    }

    public static final void i(String str, sr0 sr0Var) {
        t tVar = a;
        tVar.getClass();
        a.f(tVar, 5, str, sr0Var, null, 8);
    }

    public static final void a(String str, sr0 sr0Var) {
        sr0Var.getClass();
        t tVar = a;
        tVar.getClass();
        a.f(tVar, 3, str, sr0Var, null, 8);
    }

    public static final fh1 g(String str, r rVar) {
        Map mapD;
        rVar.getClass();
        a("parseCommandUrl", new j(str, 6));
        String strE = rVar.e(str);
        int iW = dk2.W(strE, '?', 0, 6);
        if (z.a(iW)) {
            String strSubstring = strE.substring(0, iW);
            fh1 fh1Var = new fh1();
            Iterator it = dk2.m0(strE.substring(iW + 1), new char[]{'&'}, 6).iterator();
            while (it.hasNext()) {
                List listM0 = dk2.m0((String) it.next(), new char[]{G5.U}, 2);
                if (listM0.size() == 2) {
                    fh1Var.put(listM0.get(0), listM0.get(1));
                }
            }
            mapD = fh1Var.d();
            strE = strSubstring;
        } else {
            mapD = hg0.a;
        }
        if (!rVar.i(strE)) {
            i(f.b.g, new j(strE, 7));
            return null;
        }
        if (!rVar.d(strE, mapD)) {
            i(f.b.g, new j(str, 8));
            return null;
        }
        fh1 fh1Var2 = new fh1();
        fh1Var2.put(f.b.g, strE);
        fh1Var2.putAll(mapD);
        return fh1Var2.d();
    }

    public static final String h(String str) {
        str.getClass();
        List listB = z.b(str);
        int iC = z.c(str, CreativeInfo.al, listB);
        boolean zA = z.a(iC);
        boolean zA2 = z.a(z.c(str, "head", listB));
        boolean zA3 = z.a(z.c(str, "body", listB));
        if ((!zA && (zA2 || zA3)) || (zA && !zA3)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (!zA) {
            sb.insert(0, "<html><head></head><body><div align=\"center\">");
            sb.append("</div></body></html>");
        } else if (!zA2) {
            sb.insert(iC, "<head></head>");
        }
        if (sb.length() != 0) {
            String string = sb.toString();
            int iC2 = z.c(string, "head", z.b(string));
            if (z.a(iC2)) {
                sb.insert(iC2, "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no\" /><style>body { margin:0; padding:0;}*:not(input) { -webkit-touch-callout:none; -webkit-user-select:none; -webkit-text-size-adjust:none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); }</style>");
            }
        }
        return sb.toString();
    }
}
