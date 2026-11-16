package defpackage;

import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class m42 {
    public final z7 a;
    public final sy b;

    public m42(z7 z7Var, sy syVar) {
        z7Var.getClass();
        syVar.getClass();
        this.a = z7Var;
        this.b = syVar;
    }

    public static final URL a(m42 m42Var) {
        m42Var.getClass();
        Uri.Builder builderAppendPath = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        z7 z7Var = m42Var.a;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(z7Var.a).appendPath("settings");
        u5 u5Var = z7Var.b;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", u5Var.c).appendQueryParameter("display_version", u5Var.b).build().toString());
    }
}
